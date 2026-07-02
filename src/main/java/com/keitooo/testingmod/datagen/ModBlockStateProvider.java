package com.keitooo.testingmod.datagen;

import com.keitooo.testingmod.block.ModBlocks;
import com.keitooo.testingmod.testingmod;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output,ExistingFileHelper exFileHelper) {
        super(output, testingmod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.ROSE_GOLD_BLOCK);

        blockWithItem(ModBlocks.SUNSTONE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SUNSTONE_ORE);

        blockWithItem(ModBlocks.MAGIC_BLOCK);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
