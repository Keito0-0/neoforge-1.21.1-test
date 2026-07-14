package com.keitooo.testingmod.datagen;

import com.keitooo.testingmod.block.ModBlocks;
import com.keitooo.testingmod.testingmod;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
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

        blockWithItem(ModBlocks.SUNSTONE_BLOCK);
        stairsBlock(ModBlocks.SUNSTONE_STAIRS.get(), blockTexture(ModBlocks.SUNSTONE_BLOCK.get())); // stairs
        slabBlock(ModBlocks.SUNSTONE_SLAB.get(), blockTexture(ModBlocks.SUNSTONE_BLOCK.get()), blockTexture(ModBlocks.SUNSTONE_BLOCK.get())); // slab

        buttonBlock(ModBlocks.SUNSTONE_BUTTON.get(), blockTexture(ModBlocks.SUNSTONE_BLOCK.get())); // button
        pressurePlateBlock(ModBlocks.SUNSTONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.SUNSTONE_BLOCK.get())); // pressure plate

        fenceBlock(ModBlocks.SUNSTONE_FENCE.get(), blockTexture(ModBlocks.SUNSTONE_BLOCK.get())); // fence
        fenceGateBlock(ModBlocks.SUNSTONE_FENCE_GATE.get(), blockTexture(ModBlocks.SUNSTONE_BLOCK.get())); // fence gate
        wallBlock(ModBlocks.SUNSTONE_WALL.get(), blockTexture(ModBlocks.SUNSTONE_BLOCK.get())); // wall

        doorBlockWithRenderType(ModBlocks.SUNSTONE_DOOR.get(), modLoc("block/sunstone_door_bottom"), modLoc("block/sunstone_door_top"), "output"); // door
        trapdoorBlockWithRenderType(ModBlocks.SUNSTONE_TRAPDOOR.get(), modLoc("block/sunstone_trapdoor"), true, "output"); // trapdoor

        blockItem(ModBlocks.SUNSTONE_STAIRS);
        blockItem(ModBlocks.SUNSTONE_SLAB);
        blockItem(ModBlocks.SUNSTONE_PRESSURE_PLATE);
        blockItem(ModBlocks.SUNSTONE_FENCE_GATE);
        blockItem(ModBlocks.SUNSTONE_TRAPDOOR, "_bottom");
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("testingmod:block/" + deferredBlock.getId().getPath()));
    }
    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("testingmod:block/" + deferredBlock.getId().getPath()));
    }
}
