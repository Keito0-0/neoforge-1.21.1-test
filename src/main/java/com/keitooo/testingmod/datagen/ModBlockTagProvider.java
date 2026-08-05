package com.keitooo.testingmod.datagen;

import com.keitooo.testingmod.block.ModBlocks;
import com.keitooo.testingmod.testingmod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, testingmod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ROSE_GOLD_BLOCK.get())
                .add(ModBlocks.SUNSTONE_ORE.get())
                .add(ModBlocks.DEEPSLATE_SUNSTONE_ORE.get())
                .add(ModBlocks.MAGIC_BLOCK.get())
                .add(ModBlocks.SUNSTONE_BLOCK.get())
                .add(ModBlocks.SUNSTONE_STAIRS.get())
                .add(ModBlocks.SUNSTONE_SLAB.get())
                .add(ModBlocks.SUNSTONE_FENCE.get())
                .add(ModBlocks.SUNSTONE_TRAPDOOR.get())
                .add(ModBlocks.SUNSTONE_DOOR.get())
                .add(ModBlocks.SUNSTONE_LAMP.get())

                .add(ModBlocks.TERRACOTTA_SLAB.get())
                .add(ModBlocks.TERRACOTTA_STAIRS.get())
                .add(ModBlocks.WHITE_TERRACOTTA_SLAB.get())
                .add(ModBlocks.WHITE_TERRACOTTA_STAIRS.get())
                .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get())
                .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get())
                .add(ModBlocks.GRAY_TERRACOTTA_SLAB.get())
                .add(ModBlocks.GRAY_TERRACOTTA_STAIRS.get())
                .add(ModBlocks.BLACK_TERRACOTTA_SLAB.get())
                .add(ModBlocks.BLACK_TERRACOTTA_STAIRS.get())
                .add(ModBlocks.BROWN_TERRACOTTA_SLAB.get())
                .add(ModBlocks.BROWN_TERRACOTTA_STAIRS.get())
                .add(ModBlocks.RED_TERRACOTTA_SLAB.get())
                .add(ModBlocks.RED_TERRACOTTA_STAIRS.get())
                .add(ModBlocks.ORANGE_TERRACOTTA_SLAB.get())
                .add(ModBlocks.ORANGE_TERRACOTTA_STAIRS.get())
                .add(ModBlocks.YELLOW_TERRACOTTA_SLAB.get())
                .add(ModBlocks.YELLOW_TERRACOTTA_STAIRS.get())
                .add(ModBlocks.LIME_TERRACOTTA_SLAB.get())
                .add(ModBlocks.LIME_TERRACOTTA_STAIRS.get())
                .add(ModBlocks.GREEN_TERRACOTTA_SLAB.get())
                .add(ModBlocks.GREEN_TERRACOTTA_STAIRS.get())
                .add(ModBlocks.CYAN_TERRACOTTA_SLAB.get())
                .add(ModBlocks.CYAN_TERRACOTTA_STAIRS.get())
                .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get())
                .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get())
                .add(ModBlocks.BLUE_TERRACOTTA_SLAB.get())
                .add(ModBlocks.BLUE_TERRACOTTA_STAIRS.get())
                .add(ModBlocks.PURPLE_TERRACOTTA_SLAB.get())
                .add(ModBlocks.PURPLE_TERRACOTTA_STAIRS.get())
                .add(ModBlocks.MAGENTA_TERRACOTTA_SLAB.get())
                .add(ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get())
                .add(ModBlocks.PINK_TERRACOTTA_SLAB.get())
                .add(ModBlocks.PINK_TERRACOTTA_STAIRS.get())
                ;

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SUNSTONE_ORE.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.DEEPSLATE_SUNSTONE_ORE.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.MAGIC_BLOCK.get());

        tag(BlockTags.FENCES)
                .add(ModBlocks.SUNSTONE_FENCE.get());
        tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.SUNSTONE_FENCE_GATE.get());
        tag(BlockTags.WALLS)
                .add(ModBlocks.SUNSTONE_WALL.get());

        tag(BlockTags.STAIRS)
                .add(ModBlocks.TERRACOTTA_STAIRS.get());
        tag(BlockTags.SLABS)
                .add(ModBlocks.TERRACOTTA_SLAB.get());
    }
}
