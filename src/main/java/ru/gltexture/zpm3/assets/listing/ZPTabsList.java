package ru.gltexture.zpm3.assets.listing;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.gltexture.zpm3.system.core.registry.sections.Section;
import ru.gltexture.zpm3.system.core.registry.sections.ZPSection;

import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Supplier;

@ZPSection(name = "zp_tabs", section = Section.TABS, priority = 1)
public abstract class ZPTabsList {
    public static final ZpTab itemsTab = new ZpTab("zpm3.tab.items", () -> new ItemStack(ZPItemsList.acid_bottle));

    public interface TabEntry {
        @Nullable ZpTab getZpTab();
        @NotNull ItemStack constructItemStack();
    }

    public static class ZpTab {
        private static final int MAX_PER_ROW = 10;

        private static int globalId;
        private final String i18nName;
        private final Supplier<ItemStack> stackSupplier;
        private ItemGroup linkedItemGroup;

        public ZpTab(@NotNull String i18nName, @NotNull Supplier<ItemStack> stackSupplier) {
            this.i18nName = i18nName;
            this.stackSupplier = stackSupplier;
            this.linkedItemGroup = null;
        }

        public ZpTab create(@NotNull Collection<TabEntry> zpItems) {
            this.linkedItemGroup = ZpTab.nextBuilder().displayName(Text.translatable(this.getI18nName())).icon(() -> this.getStackSupplier().get()).entries((displayContext, entries) -> {
                zpItems.forEach(e -> entries.add(e.constructItemStack()));
            }).build();
            return this;
        }

        public static ItemGroup.Builder nextBuilder() {
            int id = globalId++;
            ItemGroup.Row row = (((id % 10) / 5) == 0) ? ItemGroup.Row.TOP : ItemGroup.Row.BOTTOM;
            int column = id % MAX_PER_ROW;
            return new ItemGroup.Builder(row, column);
        }

        public @Nullable ItemGroup getLinkedItemGroup() {
            return this.linkedItemGroup;
        }

        public String getI18nName() {
            return this.i18nName;
        }

        public Supplier<ItemStack> getStackSupplier() {
            return this.stackSupplier;
        }
    }
}
