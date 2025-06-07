package ru.gltexture.zpm3.utils;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import ru.gltexture.zpm3.assets.listing.ZPTabsList;
import ru.gltexture.zpm3.system.core.ZombiePlague3;
import ru.gltexture.zpm3.system.objects.ZPItem;

import java.util.Collection;

public class RegistryUtils {
    public static void registerItem(@NotNull ZPItem item) {
        Registry.register(Registries.ITEM, new Identifier(RegistryUtils.ZP3(), item.getItemId()), item);
        ZombiePlague3.info("Registered item: " + item.getName());
    }

    public static void registerTab(@NotNull ZPTabsList.ZpTab zpTab, @NotNull Collection<ZPTabsList.TabEntry> tabEntries) {
        String id = zpTab.getI18nName().toLowerCase();
        Registry.register(Registries.ITEM_GROUP, new Identifier(RegistryUtils.ZP3(), id), zpTab.create(tabEntries).getLinkedItemGroup());
        ZombiePlague3.info("Registered creative tab: " + id);
    }

    private static String ZP3() {
        return ZombiePlague3.MOD_INFO.MOD_ID();
    }
}
