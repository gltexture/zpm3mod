package ru.gltexture.zpm3.assets.listing;

import ru.gltexture.zpm3.assets.items.AcidBottleItem;
import ru.gltexture.zpm3.system.core.registry.sections.Section;
import ru.gltexture.zpm3.system.core.registry.sections.ZPSection;
import ru.gltexture.zpm3.system.objects.ZPItem;

@ZPSection(name = "zp_items", section = Section.ITEMS, priority = 0)
public abstract class ZPItemsList {
    public static final ZPItem acid_bottle = new AcidBottleItem("acid_bottle").setZpTab(ZPTabsList.itemsTab);
}
