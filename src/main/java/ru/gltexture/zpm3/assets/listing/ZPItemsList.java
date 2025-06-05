package ru.gltexture.zpm3.assets.listing;

import net.minecraft.item.Item;
import ru.gltexture.zpm3.assets.items.AcidBottleItem;
import ru.gltexture.zpm3.system.core.sections.Section;
import ru.gltexture.zpm3.system.core.sections.ZPSection;
import ru.gltexture.zpm3.system.objects.ZPItem;

@ZPSection(name = "zp_items", section = Section.ITEMS, priority = 0)
public abstract class ZPItemsList {
    public static ZPItem acid_bottle = new AcidBottleItem(new Item.Settings(), "acid_bottle");
}
