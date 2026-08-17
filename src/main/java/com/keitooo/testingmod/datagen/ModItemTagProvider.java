package com.keitooo.testingmod.datagen;

import com.keitooo.testingmod.item.ModItems;
import com.keitooo.testingmod.testingmod;
import com.keitooo.testingmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, testingmod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.SUNSTONE.get())
                .add(ModItems.CARDBOARD.get())
                .add(ModItems.POCKET_SUN.get())
                .add(ModItems.RADISH.get())
                .add(Items.EMERALD)
                .add(Items.REDSTONE)
        ;

        tag(ItemTags.SWORDS)
                .add(ModItems.SUNSTONE_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.SUNSTONE_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.SUNSTONE_SHOVEL.get());
        tag(ItemTags.AXES)
                .add(ModItems.SUNSTONE_AXE.get());
        tag(ItemTags.HOES)
                .add(ModItems.SUNSTONE_HOE.get());

    }
}
