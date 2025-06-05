package ru.gltexture.zpm3.utils;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ru.gltexture.zpm3.system.core.ZombiePlague3;
import ru.gltexture.zpm3.system.core.datagen.ZPItemModelGenerator;
import ru.gltexture.zpm3.system.objects.ZPItem;

public class RegistryUtils {
    public static void registerItem(ZPItem item) {
        ZPItemModelGenerator.ITEMS_TO_GEN.add(item);
        Registry.register(Registries.ITEM, new Identifier(RegistryUtils.ZP3(), item.getItemId()), item);
        ZombiePlague3.info("Registered item: " + item.getName());
    }

    private static String ZP3() {
        return ZombiePlague3.MOD_INFO.MOD_ID();
    }
}
