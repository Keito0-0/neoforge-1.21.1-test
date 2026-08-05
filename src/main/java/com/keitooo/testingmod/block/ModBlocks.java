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
