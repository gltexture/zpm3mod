package ru.gltexture.zpm3.assets.items;

import org.jetbrains.annotations.Nullable;
import ru.gltexture.zpm3.assets.listing.ZPTabsList;
import ru.gltexture.zpm3.system.objects.ZPItem;

public class AcidBottleItem extends ZPItem {
    public AcidBottleItem(String itemId) {
        super(new Settings().maxCount(1), itemId);
    }
}
