package com.keitooo.testingmod.block;

import com.keitooo.testingmod.block.custom.MagicBlock;
import com.keitooo.testingmod.block.custom.SunstoneLampBlock;
import com.keitooo.testingmod.item.ModItems;
import com.keitooo.testingmod.testingmod;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(testingmod.MODID);

    public static final DeferredBlock<Block> ROSE_GOLD_BLOCK = registerBlock("rose_gold_block", // new block
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL))); // properties
    public static final DeferredBlock<Block> SUNSTONE_ORE = registerBlock("sunstone_ore",
            () -> new DropExperienceBlock(UniformInt.of(2,4), // xp amount
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_SUNSTONE_ORE = registerBlock("deepslate_sunstone_ore",
            () -> new DropExperienceBlock(UniformInt.of(3,6),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> MAGIC_BLOCK = registerBlock("magic_block",
            () -> new MagicBlock(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));


    public static final DeferredBlock<Block> SUNSTONE_BLOCK = registerBlock("sunstone_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(5f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> SUNSTONE_STAIRS = registerBlock("sunstone_stairs",
            () -> new StairBlock(ModBlocks.SUNSTONE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(5f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<SlabBlock> SUNSTONE_SLAB = registerBlock("sunstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(5f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<PressurePlateBlock> SUNSTONE_PRESSURE_PLATE = registerBlock("sunstone_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(0.5f).sound(SoundType.METAL).noCollission()));
    public static final DeferredBlock<ButtonBlock> SUNSTONE_BUTTON = registerBlock("sunstone_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(0.5f).sound(SoundType.METAL).noCollission()));

    public static final DeferredBlock<FenceBlock> SUNSTONE_FENCE = registerBlock("sunstone_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(5f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<FenceGateBlock> SUNSTONE_FENCE_GATE = registerBlock("sunstone_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().strength(5f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> SUNSTONE_WALL = registerBlock("sunstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(5f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<DoorBlock> SUNSTONE_DOOR = registerBlock("sunstone_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(5f).requiresCorrectToolForDrops().noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> SUNSTONE_TRAPDOOR = registerBlock("sunstone_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON,BlockBehaviour.Properties.of().strength(5f).requiresCorrectToolForDrops().noOcclusion()));

    public static final DeferredBlock<Block> SUNSTONE_LAMP = registerBlock("sunstone_lamp", // custom lamp block
            () -> new SunstoneLampBlock(BlockBehaviour.Properties.of().strength(2f)
                    .requiresCorrectToolForDrops().lightLevel(state -> state.getValue(SunstoneLampBlock.CLICKED) ? 15 : 0)));

    public static final DeferredBlock<Block> CUSTOM_FLOWER = registerBlock("custom_flower",
            () -> new FlowerBlock(MobEffects.SATURATION, 0.35F, BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT).noCollission().noOcclusion().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));

    // Terracotta stairs and slabs!
    public static final DeferredBlock<StairBlock> TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            () -> new StairBlock(Blocks.TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            () -> new StairBlock(Blocks.WHITE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            () -> new StairBlock(Blocks.LIGHT_GRAY_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            () -> new StairBlock(Blocks.GRAY_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            () -> new StairBlock(Blocks.BLACK_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            () -> new StairBlock(Blocks.BROWN_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            () -> new StairBlock(Blocks.RED_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            () -> new StairBlock(Blocks.ORANGE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            () -> new StairBlock(Blocks.YELLOW_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            () -> new StairBlock(Blocks.LIME_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            () -> new StairBlock(Blocks.GREEN_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            () -> new StairBlock(Blocks.CYAN_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            () -> new StairBlock(Blocks.LIGHT_BLUE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            () -> new StairBlock(Blocks.BLUE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            () -> new StairBlock(Blocks.PURPLE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            () -> new StairBlock(Blocks.MAGENTA_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            () -> new StairBlock(Blocks.PINK_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.25f,4.2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<WallBlock> PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(1.5f, 6.0f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(1.5f,6.0f).requiresCorrectToolForDrops()));

    // Calcite
    public static final DeferredBlock<StairBlock> CALCITE_STAIRS = registerBlock("calcite_stairs",
            () -> new StairBlock(Blocks.CALCITE.defaultBlockState(), BlockBehaviour.Properties.of().strength(0.75f).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final DeferredBlock<SlabBlock> CALCITE_SLAB = registerBlock("calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(0.75f).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final DeferredBlock<WallBlock> CALCITE_WALL = registerBlock("calcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(0.75f).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));

    // Dripstone
    public static final DeferredBlock<StairBlock> DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            () -> new StairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of().strength(1.5f, 1.0f).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final DeferredBlock<SlabBlock> DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.5f, 1.0f).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final DeferredBlock<WallBlock> DRIPSTONE_WALL = registerBlock("dripstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(1.5f, 1.0f).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));

    // Packed mud
    public static final DeferredBlock<StairBlock> PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            () -> new StairBlock(Blocks.PACKED_MUD.defaultBlockState(), BlockBehaviour.Properties.of().strength(1.0f, 3.0f).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));
    public static final DeferredBlock<SlabBlock> PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.0f, 3.0f).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));
    public static final DeferredBlock<WallBlock> PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(1.0f, 3.0f).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));

    // Ice
    public static final DeferredBlock<StairBlock> ICE_STAIRS = registerBlock("ice_stairs",
            () -> new StairBlock(Blocks.ICE.defaultBlockState(), BlockBehaviour.Properties.of().strength(0.5f).friction(0.98F).requiresCorrectToolForDrops().noOcclusion().sound(SoundType.GLASS)));
    public static final DeferredBlock<SlabBlock> ICE_SLAB = registerBlock("ice_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(0.5f).friction(0.98F).requiresCorrectToolForDrops().noOcclusion().sound(SoundType.GLASS)));
    public static final DeferredBlock<WallBlock> ICE_WALL = registerBlock("ice_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(0.5f).friction(0.98F).requiresCorrectToolForDrops().noOcclusion().sound(SoundType.GLASS)));

    // Packed ice
    public static final DeferredBlock<StairBlock> PACKED_ICE_STAIRS = registerBlock("packed_ice_stairs",
            () -> new StairBlock(Blocks.PACKED_ICE.defaultBlockState(), BlockBehaviour.Properties.of().strength(0.5f).friction(0.98F).requiresCorrectToolForDrops().sound(SoundType.GLASS)));
    public static final DeferredBlock<SlabBlock> PACKED_ICE_SLAB = registerBlock("packed_ice_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(0.5f).friction(0.98F).requiresCorrectToolForDrops().sound(SoundType.GLASS)));
    public static final DeferredBlock<WallBlock> PACKED_ICE_WALL = registerBlock("packed_ice_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(0.5f).friction(0.98F).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    // Blue ice
    public static final DeferredBlock<StairBlock> BLUE_ICE_STAIRS = registerBlock("blue_ice_stairs",
            () -> new StairBlock(Blocks.BLUE_ICE.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.8f).friction(0.989F).requiresCorrectToolForDrops().sound(SoundType.GLASS)));
    public static final DeferredBlock<SlabBlock> BLUE_ICE_SLAB = registerBlock("blue_ice_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2.8f).friction(0.989F).requiresCorrectToolForDrops().sound(SoundType.GLASS)));
    public static final DeferredBlock<WallBlock> BLUE_ICE_WALL = registerBlock("blue_ice_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2.8f).friction(0.989F).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    // Mud
    public static final DeferredBlock<StairBlock> MUD_STAIRS = registerBlock("mud_stairs",
            () -> new StairBlock(Blocks.MUD.defaultBlockState(), BlockBehaviour.Properties.of().strength(0.5f).requiresCorrectToolForDrops().sound(SoundType.MUD)));
    public static final DeferredBlock<SlabBlock> MUD_SLAB = registerBlock("mud_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(0.5f).requiresCorrectToolForDrops().sound(SoundType.MUD)));
    public static final DeferredBlock<WallBlock> MUD_WALL = registerBlock("mud_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(0.5f).requiresCorrectToolForDrops().sound(SoundType.MUD)));

    // Clay
    public static final DeferredBlock<StairBlock> CLAY_STAIRS = registerBlock("clay_stairs",
            () -> new StairBlock(Blocks.CLAY.defaultBlockState(), BlockBehaviour.Properties.of().strength(0.6f).requiresCorrectToolForDrops().sound(SoundType.GRAVEL)));
    public static final DeferredBlock<SlabBlock> CLAY_SLAB = registerBlock("clay_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(0.6f).requiresCorrectToolForDrops().sound(SoundType.GRAVEL)));
    public static final DeferredBlock<WallBlock> CLAY_WALL = registerBlock("clay_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(0.6f).requiresCorrectToolForDrops().sound(SoundType.GRAVEL)));

    // Moss
    public static final DeferredBlock<StairBlock> MOSS_STAIRS = registerBlock("moss_stairs",
            () -> new StairBlock(Blocks.MOSS_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of().strength(0.1f).requiresCorrectToolForDrops().sound(SoundType.MOSS)));
    public static final DeferredBlock<SlabBlock> MOSS_SLAB = registerBlock("moss_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(0.1f).requiresCorrectToolForDrops().sound(SoundType.MOSS)));
    public static final DeferredBlock<WallBlock> MOSS_WALL = registerBlock("moss_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(0.1f).requiresCorrectToolForDrops().sound(SoundType.MOSS)));

    // Netherrack
    public static final DeferredBlock<StairBlock> NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            () -> new StairBlock(Blocks.NETHERRACK.defaultBlockState(), BlockBehaviour.Properties.of().strength(0.4f).requiresCorrectToolForDrops().sound(SoundType.NETHERRACK)));
    public static final DeferredBlock<SlabBlock> NETHERRACK_SLAB = registerBlock("netherrack_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(0.4f).requiresCorrectToolForDrops().sound(SoundType.NETHERRACK)));
    public static final DeferredBlock<WallBlock> NETHERRACK_WALL = registerBlock("netherrack_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(0.4f).requiresCorrectToolForDrops().sound(SoundType.NETHERRACK)));

    // Basalt
//    public static final DeferredBlock<StairBlock> BASALT_STAIRS = registerBlock("basalt_stairs",
//            () -> new StairBlock(Blocks.BASALT.defaultBlockState(), BlockBehaviour.Properties.of().strength(0.1f).requiresCorrectToolForDrops().sound(SoundType.BASALT)));
//    public static final DeferredBlock<SlabBlock> BASALT_SLAB = registerBlock("basalt_slab",
//            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(0.1f).requiresCorrectToolForDrops().sound(SoundType.BASALT)));
//    public static final DeferredBlock<WallBlock> BASALT_WALL = registerBlock("basalt_wall",
//            () -> new WallBlock(BlockBehaviour.Properties.of().strength(0.1f).requiresCorrectToolForDrops().sound(SoundType.BASALT)));

    // Smooth basalt
    public static final DeferredBlock<StairBlock> SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            () -> new StairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(), BlockBehaviour.Properties.of().strength(0.1f).requiresCorrectToolForDrops().sound(SoundType.BASALT)));
    public static final DeferredBlock<SlabBlock> SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(0.1f).requiresCorrectToolForDrops().sound(SoundType.BASALT)));
    public static final DeferredBlock<WallBlock> SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(0.1f).requiresCorrectToolForDrops().sound(SoundType.BASALT)));

    // Polished basalt
//    public static final DeferredBlock<StairBlock> POLISHED_BASALT_STAIRS = registerBlock("polished_basalt_stairs",
//            () -> new StairBlock(Blocks.POLISHED_BASALT.defaultBlockState(), BlockBehaviour.Properties.of().strength(0.1f).requiresCorrectToolForDrops().sound(SoundType.BASALT)));
//    public static final DeferredBlock<SlabBlock> POLISHED_BASALT_SLAB = registerBlock("polished_basalt_slab",
//            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(0.1f).requiresCorrectToolForDrops().sound(SoundType.BASALT)));
//    public static final DeferredBlock<WallBlock> POLISHED_BASALT_WALL = registerBlock("polished_basalt_wall",
//            () -> new WallBlock(BlockBehaviour.Properties.of().strength(0.1f).requiresCorrectToolForDrops().sound(SoundType.BASALT)));

    // Quartz
    public static final DeferredBlock<WallBlock> QUARTZ_WALL = registerBlock("quartz_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(0.8f).requiresCorrectToolForDrops()));

    // Quartz bricks
    public static final DeferredBlock<StairBlock> QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            () -> new StairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(0.8f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(0.8f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(0.8f).requiresCorrectToolForDrops()));

    // Smooth quartz
    public static final DeferredBlock<WallBlock> SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(0.8f).requiresCorrectToolForDrops()));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
