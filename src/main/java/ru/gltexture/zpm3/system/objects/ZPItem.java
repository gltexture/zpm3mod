package ru.gltexture.zpm3.system.objects;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.gltexture.zpm3.assets.listing.ZPTabsList;

public class ZPItem extends Item implements ZPTabsList.TabEntry {
    private final String itemId;
    private ZPTabsList.ZpTab zpTab;

    public ZPItem(Settings settings, String itemId) {
        super(settings);
        this.itemId = itemId;
    }

    public String getItemId() {
        return this.itemId;
    }

    public ZPItem setZpTab(@NotNull ZPTabsList.ZpTab zpTab) {
        this.zpTab = zpTab;
        return this;
    }

    @Override
    public ZPTabsList.@Nullable ZpTab getZpTab() {
        return this.zpTab;
    }

    @Override
    public @NotNull ItemStack constructItemStack() {
        return new ItemStack(this);
    }
}
