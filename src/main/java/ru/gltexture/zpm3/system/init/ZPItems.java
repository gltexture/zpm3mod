package ru.gltexture.zpm3.system.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import ru.gltexture.zpm3.assets.items.AcidBottleItem;
import ru.gltexture.zpm3.system.ZPSectionsLoader;
import ru.gltexture.zpm3.utils.RegistryUtils;

public class ZPItems implements IZPSection {
    public static final ZPItems INSTANCE = new ZPItems();

    static {
        AcidBottleItem item = new AcidBottleItem(new FabricItemSettings(), "homemade_rocket");
    }

    @Override
    public void initSection() {
        ZPSectionsLoader.toRegisterItems.forEach(RegistryUtils::registerItem);
    }

    @Override
    public String sectionName() {
        return "SRF Items";
    }

    @Override
    public int priority() {
        return 0;
    }
}
