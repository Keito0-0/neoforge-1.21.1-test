package com.keitooo.testingmod.datagen;

import com.keitooo.testingmod.item.ModItems;
import com.keitooo.testingmod.testingmod;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, testingmod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.SUNSTONE.get());
        basicItem(ModItems.CHISEL.get());
        basicItem(ModItems.ROSE_GOLD.get());
        basicItem(ModItems.CARDBOARD.get());
        basicItem(ModItems.POCKET_SUN.get());
        basicItem(ModItems.RADISH.get());
    }
}
