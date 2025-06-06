package ru.gltexture.zpm3.utils;

import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import ru.gltexture.zpm3.system.core.ZombiePlague3;
import ru.gltexture.zpm3.system.core.datagen.GenList;
import ru.gltexture.zpm3.system.core.datagen.ZPItemModelGenerator;
import ru.gltexture.zpm3.system.objects.ZPItem;

public class RegistryUtils {
    public static void registerItem(@NotNull ZPItem item) {
        GenList.GEN_ITEMS.add(item);
        Registry.register(Registries.ITEM, new Identifier(RegistryUtils.ZP3(), item.getItemId()), item);
        ZombiePlague3.info("Registered item: " + item.getName());
    }

    public static void registerTab(@NotNull ItemGroup itemGroup) {
        String id = itemGroup.getDisplayName().getString().toLowerCase().replaceAll(" ", "_");
        Registry.register(Registries.ITEM_GROUP, new Identifier(RegistryUtils.ZP3(), id), itemGroup);
        ZombiePlague3.info("Registered creative tab: " + id);
    }

    private static String ZP3() {
        return ZombiePlague3.MOD_INFO.MOD_ID();
    }
}
