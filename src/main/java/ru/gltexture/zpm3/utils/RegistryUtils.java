package ru.gltexture.zpm3.utils;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ru.gltexture.zpm3.assets.items.AcidBottleItem;
import ru.gltexture.zpm3.system.core.ZombiePlague3;

public class RegistryUtils {
    public static void registerItem(AcidBottleItem acidBottleItem) {
        Registry.register(Registries.ITEM, new Identifier(RegistryUtils.ZP3(), acidBottleItem.getItemId()), acidBottleItem);
        ZombiePlague3.printConsole("Registered item: " + acidBottleItem.getName());
    }

    private static String ZP3() {
        return ZombiePlague3.MOD_INFO.MOD_ID();
    }
}
