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
    }
}
