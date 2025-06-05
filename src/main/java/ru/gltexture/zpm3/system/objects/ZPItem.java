package ru.gltexture.zpm3.system.objects;

import net.minecraft.item.Item;

public class ZPItem extends Item {
    private final String itemId;

    public ZPItem(Settings settings, String itemId) {
        super(settings);
        this.itemId = itemId;
    }

    public String getItemId() {
        return this.itemId;
    }
}
