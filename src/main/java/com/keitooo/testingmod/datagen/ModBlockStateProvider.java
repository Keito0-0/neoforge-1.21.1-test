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

        wallBlock(ModBlocks.PRISMARINE_BRICK_WALL.get(), blockTexture(Blocks.PRISMARINE_BRICKS));
        wallBlock(ModBlocks.DARK_PRISMARINE_WALL.get(), blockTexture(Blocks.DARK_PRISMARINE));

        stairsBlock(ModBlocks.CALCITE_STAIRS.get(), blockTexture(Blocks.CALCITE));
        slabBlock(ModBlocks.CALCITE_SLAB.get(), blockTexture(Blocks.CALCITE), blockTexture(Blocks.CALCITE));
        wallBlock(ModBlocks.CALCITE_WALL.get(), blockTexture(Blocks.CALCITE));

        stairsBlock(ModBlocks.DRIPSTONE_STAIRS.get(), blockTexture(Blocks.DRIPSTONE_BLOCK));
        slabBlock(ModBlocks.DRIPSTONE_SLAB.get(), blockTexture(Blocks.DRIPSTONE_BLOCK), blockTexture(Blocks.DRIPSTONE_BLOCK));
        wallBlock(ModBlocks.DRIPSTONE_WALL.get(), blockTexture(Blocks.DRIPSTONE_BLOCK));

        stairsBlock(ModBlocks.PACKED_MUD_STAIRS.get(), blockTexture(Blocks.PACKED_MUD));
        slabBlock(ModBlocks.PACKED_MUD_SLAB.get(), blockTexture(Blocks.PACKED_MUD), blockTexture(Blocks.PACKED_MUD));
        wallBlock(ModBlocks.PACKED_MUD_WALL.get(), blockTexture(Blocks.PACKED_MUD));

        stairsBlock(ModBlocks.ICE_STAIRS.get(), blockTexture(Blocks.ICE));
        slabBlock(ModBlocks.ICE_SLAB.get(), blockTexture(Blocks.ICE), blockTexture(Blocks.ICE));
        wallBlock(ModBlocks.ICE_WALL.get(), blockTexture(Blocks.ICE));

        stairsBlock(ModBlocks.PACKED_ICE_STAIRS.get(), blockTexture(Blocks.PACKED_ICE));
        slabBlock(ModBlocks.PACKED_ICE_SLAB.get(), blockTexture(Blocks.PACKED_ICE), blockTexture(Blocks.PACKED_ICE));
        wallBlock(ModBlocks.PACKED_ICE_WALL.get(), blockTexture(Blocks.PACKED_ICE));

        stairsBlock(ModBlocks.BLUE_ICE_STAIRS.get(), blockTexture(Blocks.BLUE_ICE));
        slabBlock(ModBlocks.BLUE_ICE_SLAB.get(), blockTexture(Blocks.BLUE_ICE), blockTexture(Blocks.BLUE_ICE));
        wallBlock(ModBlocks.BLUE_ICE_WALL.get(), blockTexture(Blocks.BLUE_ICE));

        stairsBlock(ModBlocks.MUD_STAIRS.get(), blockTexture(Blocks.MUD));
        slabBlock(ModBlocks.MUD_SLAB.get(), blockTexture(Blocks.MUD), blockTexture(Blocks.MUD));
        wallBlock(ModBlocks.MUD_WALL.get(), blockTexture(Blocks.MUD));

        stairsBlock(ModBlocks.CLAY_STAIRS.get(), blockTexture(Blocks.CLAY));
        slabBlock(ModBlocks.CLAY_SLAB.get(), blockTexture(Blocks.CLAY), blockTexture(Blocks.CLAY));
        wallBlock(ModBlocks.CLAY_WALL.get(), blockTexture(Blocks.CLAY));

        stairsBlock(ModBlocks.MOSS_STAIRS.get(), blockTexture(Blocks.MOSS_BLOCK));
        slabBlock(ModBlocks.MOSS_SLAB.get(), blockTexture(Blocks.MOSS_BLOCK), blockTexture(Blocks.MOSS_BLOCK));
        wallBlock(ModBlocks.MOSS_WALL.get(), blockTexture(Blocks.MOSS_BLOCK));

        stairsBlock(ModBlocks.NETHERRACK_STAIRS.get(), blockTexture(Blocks.NETHERRACK));
        slabBlock(ModBlocks.NETHERRACK_SLAB.get(), blockTexture(Blocks.NETHERRACK), blockTexture(Blocks.NETHERRACK));
        wallBlock(ModBlocks.NETHERRACK_WALL.get(), blockTexture(Blocks.NETHERRACK));

//        stairsBlock(ModBlocks.BASALT_STAIRS.get(), blockTexture(Blocks.BASALT));
//        slabBlock(ModBlocks.BASALT_SLAB.get(), blockTexture(Blocks.BASALT), blockTexture(Blocks.BASALT));
//        wallBlock(ModBlocks.BASALT_WALL.get(), blockTexture(Blocks.BASALT));

        stairsBlock(ModBlocks.SMOOTH_BASALT_STAIRS.get(), blockTexture(Blocks.SMOOTH_BASALT));
        slabBlock(ModBlocks.SMOOTH_BASALT_SLAB.get(), blockTexture(Blocks.SMOOTH_BASALT), blockTexture(Blocks.SMOOTH_BASALT));
        wallBlock(ModBlocks.SMOOTH_BASALT_WALL.get(), blockTexture(Blocks.SMOOTH_BASALT));

//        stairsBlock(ModBlocks.POLISHED_BASALT_STAIRS.get(), blockTexture(Blocks.POLISHED_BASALT));
//        slabBlock(ModBlocks.POLISHED_BASALT_SLAB.get(), blockTexture(Blocks.POLISHED_BASALT), blockTexture(Blocks.POLISHED_BASALT));
//        wallBlock(ModBlocks.POLISHED_BASALT_WALL.get(), blockTexture(Blocks.POLISHED_BASALT));

        stairsBlock(ModBlocks.QUARTZ_BRICK_STAIRS.get(), blockTexture(Blocks.QUARTZ_BRICKS));
        slabBlock(ModBlocks.QUARTZ_BRICK_SLAB.get(), blockTexture(Blocks.QUARTZ_BRICKS), blockTexture(Blocks.QUARTZ_BRICKS));
        wallBlock(ModBlocks.QUARTZ_BRICK_WALL.get(), blockTexture(Blocks.QUARTZ_BRICKS));

//        wallBlock(ModBlocks.QUARTZ_WALL.get(), blockTexture(Blocks.QUARTZ_BLOCK));
//        wallBlock(ModBlocks.SMOOTH_QUARTZ_WALL.get(), blockTexture(Blocks.SMOOTH_QUARTZ));


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

        blockItem(ModBlocks.CALCITE_STAIRS);
        blockItem(ModBlocks.CALCITE_SLAB);
        blockItem(ModBlocks.DRIPSTONE_STAIRS);
        blockItem(ModBlocks.DRIPSTONE_SLAB);
        blockItem(ModBlocks.PACKED_MUD_STAIRS);
        blockItem(ModBlocks.PACKED_MUD_SLAB);
        blockItem(ModBlocks.ICE_STAIRS);
        blockItem(ModBlocks.ICE_SLAB);
        blockItem(ModBlocks.PACKED_ICE_STAIRS);
        blockItem(ModBlocks.PACKED_ICE_SLAB);
        blockItem(ModBlocks.BLUE_ICE_STAIRS);
        blockItem(ModBlocks.BLUE_ICE_SLAB);
        blockItem(ModBlocks.MUD_STAIRS);
        blockItem(ModBlocks.MUD_SLAB);
        blockItem(ModBlocks.CLAY_STAIRS);
        blockItem(ModBlocks.CLAY_SLAB);
        blockItem(ModBlocks.MOSS_STAIRS);
        blockItem(ModBlocks.MOSS_SLAB);
        blockItem(ModBlocks.NETHERRACK_STAIRS);
        blockItem(ModBlocks.NETHERRACK_SLAB);
//        blockItem(ModBlocks.BASALT_STAIRS);
//        blockItem(ModBlocks.BASALT_SLAB);
        blockItem(ModBlocks.SMOOTH_BASALT_STAIRS);
        blockItem(ModBlocks.SMOOTH_BASALT_SLAB);
//        blockItem(ModBlocks.POLISHED_BASALT_STAIRS);
//        blockItem(ModBlocks.POLISHED_BASALT_SLAB);
        blockItem(ModBlocks.QUARTZ_BRICK_STAIRS);
        blockItem(ModBlocks.QUARTZ_BRICK_SLAB);

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
