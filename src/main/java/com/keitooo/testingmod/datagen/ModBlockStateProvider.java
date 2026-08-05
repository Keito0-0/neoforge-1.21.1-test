package com.keitooo.testingmod.datagen;

import com.keitooo.testingmod.block.ModBlocks;
import com.keitooo.testingmod.block.custom.SunstoneLampBlock;
import com.keitooo.testingmod.testingmod;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
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

        stairsBlock(ModBlocks.TERRACOTTA_STAIRS.get(), blockTexture(Blocks.TERRACOTTA));
        slabBlock(ModBlocks.TERRACOTTA_SLAB.get(), blockTexture(Blocks.TERRACOTTA), blockTexture(Blocks.TERRACOTTA));
        stairsBlock(ModBlocks.WHITE_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.WHITE_TERRACOTTA));
        slabBlock(ModBlocks.WHITE_TERRACOTTA_SLAB.get(), blockTexture(Blocks.WHITE_TERRACOTTA), blockTexture(Blocks.WHITE_TERRACOTTA));
        stairsBlock(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA));
        slabBlock(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA));
        stairsBlock(ModBlocks.GRAY_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.GRAY_TERRACOTTA));
        slabBlock(ModBlocks.GRAY_TERRACOTTA_SLAB.get(), blockTexture(Blocks.GRAY_TERRACOTTA), blockTexture(Blocks.GRAY_TERRACOTTA));
        stairsBlock(ModBlocks.BLACK_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.BLACK_TERRACOTTA));
        slabBlock(ModBlocks.BLACK_TERRACOTTA_SLAB.get(), blockTexture(Blocks.BLACK_TERRACOTTA), blockTexture(Blocks.BLACK_TERRACOTTA));
        stairsBlock(ModBlocks.BROWN_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.BROWN_TERRACOTTA));
        slabBlock(ModBlocks.BROWN_TERRACOTTA_SLAB.get(), blockTexture(Blocks.BROWN_TERRACOTTA), blockTexture(Blocks.BROWN_TERRACOTTA));
        stairsBlock(ModBlocks.RED_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.RED_TERRACOTTA));
        slabBlock(ModBlocks.RED_TERRACOTTA_SLAB.get(), blockTexture(Blocks.RED_TERRACOTTA), blockTexture(Blocks.RED_TERRACOTTA));
        stairsBlock(ModBlocks.ORANGE_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.ORANGE_TERRACOTTA));
        slabBlock(ModBlocks.ORANGE_TERRACOTTA_SLAB.get(), blockTexture(Blocks.ORANGE_TERRACOTTA), blockTexture(Blocks.ORANGE_TERRACOTTA));
        stairsBlock(ModBlocks.YELLOW_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.YELLOW_TERRACOTTA));
        slabBlock(ModBlocks.YELLOW_TERRACOTTA_SLAB.get(), blockTexture(Blocks.YELLOW_TERRACOTTA), blockTexture(Blocks.YELLOW_TERRACOTTA));
        stairsBlock(ModBlocks.LIME_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.LIME_TERRACOTTA));
        slabBlock(ModBlocks.LIME_TERRACOTTA_SLAB.get(), blockTexture(Blocks.LIME_TERRACOTTA), blockTexture(Blocks.LIME_TERRACOTTA));
        stairsBlock(ModBlocks.GREEN_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.GREEN_TERRACOTTA));
        slabBlock(ModBlocks.GREEN_TERRACOTTA_SLAB.get(), blockTexture(Blocks.GREEN_TERRACOTTA), blockTexture(Blocks.GREEN_TERRACOTTA));
        stairsBlock(ModBlocks.CYAN_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.CYAN_TERRACOTTA));
        slabBlock(ModBlocks.CYAN_TERRACOTTA_SLAB.get(), blockTexture(Blocks.CYAN_TERRACOTTA), blockTexture(Blocks.CYAN_TERRACOTTA));
        stairsBlock(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA));
        slabBlock(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA));
        stairsBlock(ModBlocks.BLUE_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.BLUE_TERRACOTTA));
        slabBlock(ModBlocks.BLUE_TERRACOTTA_SLAB.get(), blockTexture(Blocks.BLUE_TERRACOTTA), blockTexture(Blocks.BLUE_TERRACOTTA));
        stairsBlock(ModBlocks.PURPLE_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.PURPLE_TERRACOTTA));
        slabBlock(ModBlocks.PURPLE_TERRACOTTA_SLAB.get(), blockTexture(Blocks.PURPLE_TERRACOTTA), blockTexture(Blocks.PURPLE_TERRACOTTA));
        stairsBlock(ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.MAGENTA_TERRACOTTA));
        slabBlock(ModBlocks.MAGENTA_TERRACOTTA_SLAB.get(), blockTexture(Blocks.MAGENTA_TERRACOTTA), blockTexture(Blocks.MAGENTA_TERRACOTTA));
        stairsBlock(ModBlocks.PINK_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.PINK_TERRACOTTA));
        slabBlock(ModBlocks.PINK_TERRACOTTA_SLAB.get(), blockTexture(Blocks.PINK_TERRACOTTA), blockTexture(Blocks.PINK_TERRACOTTA));

        buttonBlock(ModBlocks.SUNSTONE_BUTTON.get(), blockTexture(ModBlocks.SUNSTONE_BLOCK.get())); // button
        pressurePlateBlock(ModBlocks.SUNSTONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.SUNSTONE_BLOCK.get())); // pressure plate

        fenceBlock(ModBlocks.SUNSTONE_FENCE.get(), blockTexture(ModBlocks.SUNSTONE_BLOCK.get())); // fence
        fenceGateBlock(ModBlocks.SUNSTONE_FENCE_GATE.get(), blockTexture(ModBlocks.SUNSTONE_BLOCK.get())); // fence gate
        wallBlock(ModBlocks.SUNSTONE_WALL.get(), blockTexture(ModBlocks.SUNSTONE_BLOCK.get())); // wall


        doorBlockWithRenderType(ModBlocks.SUNSTONE_DOOR.get(), modLoc("block/sunstone_door_bottom"), modLoc("block/sunstone_door_top"), "cutout"); // door
        trapdoorBlockWithRenderType(ModBlocks.SUNSTONE_TRAPDOOR.get(), modLoc("block/sunstone_trapdoor"), true, "cutout"); // trapdoor


        // ====== Inventory textures ======

        blockItem(ModBlocks.SUNSTONE_STAIRS);
        blockItem(ModBlocks.SUNSTONE_SLAB);

        blockItem(ModBlocks.TERRACOTTA_STAIRS);
        blockItem(ModBlocks.TERRACOTTA_SLAB);
        blockItem(ModBlocks.WHITE_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.WHITE_TERRACOTTA_SLAB);
        blockItem(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
        blockItem(ModBlocks.GRAY_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.GRAY_TERRACOTTA_SLAB);
        blockItem(ModBlocks.BLACK_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.BLACK_TERRACOTTA_SLAB);
        blockItem(ModBlocks.BROWN_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.BROWN_TERRACOTTA_SLAB);
        blockItem(ModBlocks.RED_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.RED_TERRACOTTA_SLAB);
        blockItem(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.ORANGE_TERRACOTTA_SLAB);
        blockItem(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.YELLOW_TERRACOTTA_SLAB);
        blockItem(ModBlocks.LIME_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.LIME_TERRACOTTA_SLAB);
        blockItem(ModBlocks.GREEN_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.GREEN_TERRACOTTA_SLAB);
        blockItem(ModBlocks.CYAN_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.CYAN_TERRACOTTA_SLAB);
        blockItem(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
        blockItem(ModBlocks.BLUE_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.BLUE_TERRACOTTA_SLAB);
        blockItem(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.PURPLE_TERRACOTTA_SLAB);
        blockItem(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.MAGENTA_TERRACOTTA_SLAB);
        blockItem(ModBlocks.PINK_TERRACOTTA_STAIRS);
        blockItem(ModBlocks.PINK_TERRACOTTA_SLAB);

        blockItem(ModBlocks.SUNSTONE_PRESSURE_PLATE);
        blockItem(ModBlocks.SUNSTONE_FENCE_GATE);
        blockItem(ModBlocks.SUNSTONE_TRAPDOOR, "_bottom");


        customLamp();
    }
    private void customLamp() {
        getVariantBuilder(ModBlocks.SUNSTONE_LAMP.get()).forAllStates(state -> {
            if(state.getValue(SunstoneLampBlock.CLICKED)) {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll("sunstone_lamp_on",
                        ResourceLocation.fromNamespaceAndPath(testingmod.MODID,"block/" + "sunstone_lamp_on")))};
            } else {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll("sunstone_lamp_off",
                        ResourceLocation.fromNamespaceAndPath(testingmod.MODID,"block/" + "sunstone_lamp_off")))};
            }
        });
        simpleBlockItem(ModBlocks.SUNSTONE_LAMP.get(), models().cubeAll("sunstone_lamp_off",
                ResourceLocation.fromNamespaceAndPath(testingmod.MODID, "block/" + "sunstone_lamp_off")));
    }


    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("testingmod:block/" + deferredBlock.getId().getPath()));
    }
    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("testingmod:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
