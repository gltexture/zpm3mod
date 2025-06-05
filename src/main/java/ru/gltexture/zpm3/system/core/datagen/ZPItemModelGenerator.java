package ru.gltexture.zpm3.system.core.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

import java.util.HashSet;
import java.util.Set;

public final class ZPItemModelGenerator extends FabricModelProvider {
    public static final Set<Item> ITEMS_TO_GEN = new HashSet<>();

    public ZPItemModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        for (Item item : ZPItemModelGenerator.ITEMS_TO_GEN) {
            itemModelGenerator.register(item, Models.GENERATED);
        }
    }
}