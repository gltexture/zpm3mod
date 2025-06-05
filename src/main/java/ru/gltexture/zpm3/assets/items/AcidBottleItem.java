package ru.gltexture.zpm3.assets.items;

import net.minecraft.item.Item;
import ru.gltexture.zpm3.system.ZPSectionsLoader;

public class AcidBottleItem extends Item {
    private final String itemId;

    public AcidBottleItem(Settings settings, String itemId) {
        super(settings);
        this.itemId = itemId;
        ZPSectionsLoader.toRegisterItems.add(this);
    }

    public String getItemId() {
        return this.itemId;
    }
}
