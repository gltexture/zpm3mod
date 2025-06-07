package ru.gltexture.zpm3.system.core.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;
import ru.gltexture.zpm3.system.core.registry.GenList;

public final class ZPItemModelGenerator extends FabricModelProvider {

    public ZPItemModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        for (Item item : GenList.GEN_ITEMS) {
            itemModelGenerator.register(item, Models.GENERATED);
        }
    }
}