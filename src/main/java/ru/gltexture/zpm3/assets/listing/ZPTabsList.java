package ru.gltexture.zpm3.assets.listing;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import ru.gltexture.zpm3.system.core.datagen.GenList;
import ru.gltexture.zpm3.system.core.sections.Section;
import ru.gltexture.zpm3.system.core.sections.ZPSection;

@ZPSection(name = "zp_tabs", section = Section.TABS, priority = 1)
public abstract class ZPTabsList {
    public static final ItemGroup zpItemsGroup = new ItemGroup.Builder(ItemGroup.Row.TOP, 0).displayName(Text.translatable("zpm3.tab.items")).icon(() -> new ItemStack(ZPItemsList.acid_bottle)).entries((displayContext, entries) -> {
        GenList.GEN_ITEMS.forEach(entries::add);
    }).build();
}
