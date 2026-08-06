package com.keitooo.testingmod.datagen;

import com.keitooo.testingmod.block.ModBlocks;
import com.keitooo.testingmod.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        // datagen fails without loot tables
        dropSelf(ModBlocks.ROSE_GOLD_BLOCK.get());
        dropSelf(ModBlocks.MAGIC_BLOCK.get());

        dropSelf(ModBlocks.SUNSTONE_BLOCK.get());
        dropSelf(ModBlocks.SUNSTONE_STAIRS.get());

        add(ModBlocks.SUNSTONE_SLAB.get(), // slab loot table
                block -> createSlabItemTable(ModBlocks.SUNSTONE_SLAB.get()));

        dropSelf(ModBlocks.SUNSTONE_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.SUNSTONE_BUTTON.get());
        dropSelf(ModBlocks.SUNSTONE_FENCE.get());
        dropSelf(ModBlocks.SUNSTONE_FENCE_GATE.get());
        dropSelf(ModBlocks.SUNSTONE_WALL.get());
        dropSelf(ModBlocks.SUNSTONE_TRAPDOOR.get());

        dropSelf(ModBlocks.PRISMARINE_BRICK_WALL.get());
        dropSelf(ModBlocks.DARK_PRISMARINE_WALL.get());

        dropSelf(ModBlocks.TERRACOTTA_STAIRS.get());
        add(ModBlocks.TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.WHITE_TERRACOTTA_STAIRS.get());
        add(ModBlocks.WHITE_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WHITE_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get());
        add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.GRAY_TERRACOTTA_STAIRS.get());
        add(ModBlocks.GRAY_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GRAY_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.BLACK_TERRACOTTA_STAIRS.get());
        add(ModBlocks.BLACK_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BLACK_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.BROWN_TERRACOTTA_STAIRS.get());
        add(ModBlocks.BROWN_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BROWN_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.RED_TERRACOTTA_STAIRS.get());
        add(ModBlocks.RED_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.RED_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.ORANGE_TERRACOTTA_STAIRS.get());
        add(ModBlocks.ORANGE_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ORANGE_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.YELLOW_TERRACOTTA_STAIRS.get());
        add(ModBlocks.YELLOW_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.YELLOW_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.LIME_TERRACOTTA_STAIRS.get());
        add(ModBlocks.LIME_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIME_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.GREEN_TERRACOTTA_STAIRS.get());
        add(ModBlocks.GREEN_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GREEN_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.CYAN_TERRACOTTA_STAIRS.get());
        add(ModBlocks.CYAN_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CYAN_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get());
        add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.BLUE_TERRACOTTA_STAIRS.get());
        add(ModBlocks.BLUE_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BLUE_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.PURPLE_TERRACOTTA_STAIRS.get());
        add(ModBlocks.PURPLE_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PURPLE_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get());
        add(ModBlocks.MAGENTA_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MAGENTA_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.PINK_TERRACOTTA_STAIRS.get());
        add(ModBlocks.PINK_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PINK_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.WHITE_CONCRETE_STAIRS.get());
        add(ModBlocks.WHITE_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WHITE_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get());
        add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.GRAY_CONCRETE_STAIRS.get());
        add(ModBlocks.GRAY_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GRAY_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.BLACK_CONCRETE_STAIRS.get());
        add(ModBlocks.BLACK_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BLACK_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.BROWN_CONCRETE_STAIRS.get());
        add(ModBlocks.BROWN_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BROWN_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.RED_CONCRETE_STAIRS.get());
        add(ModBlocks.RED_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.RED_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.ORANGE_CONCRETE_STAIRS.get());
        add(ModBlocks.ORANGE_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ORANGE_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.YELLOW_CONCRETE_STAIRS.get());
        add(ModBlocks.YELLOW_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.YELLOW_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.LIME_CONCRETE_STAIRS.get());
        add(ModBlocks.LIME_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIME_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.GREEN_CONCRETE_STAIRS.get());
        add(ModBlocks.GREEN_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GREEN_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.CYAN_CONCRETE_STAIRS.get());
        add(ModBlocks.CYAN_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CYAN_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get());
        add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.BLUE_CONCRETE_STAIRS.get());
        add(ModBlocks.BLUE_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BLUE_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.PURPLE_CONCRETE_STAIRS.get());
        add(ModBlocks.PURPLE_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PURPLE_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.MAGENTA_CONCRETE_STAIRS.get());
        add(ModBlocks.MAGENTA_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MAGENTA_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.PINK_CONCRETE_STAIRS.get());
        add(ModBlocks.PINK_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PINK_CONCRETE_SLAB.get()));


        dropSelf(ModBlocks.CALCITE_STAIRS.get());
        add(ModBlocks.CALCITE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CALCITE_SLAB.get()));
        dropSelf(ModBlocks.CALCITE_WALL.get());

        dropSelf(ModBlocks.DRIPSTONE_STAIRS.get());
        add(ModBlocks.DRIPSTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DRIPSTONE_SLAB.get()));
        dropSelf(ModBlocks.DRIPSTONE_WALL.get());

        dropSelf(ModBlocks.PACKED_MUD_STAIRS.get());
        add(ModBlocks.PACKED_MUD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PACKED_MUD_SLAB.get()));
        dropSelf(ModBlocks.PACKED_MUD_WALL.get());

        dropSelf(ModBlocks.ICE_STAIRS.get());
        add(ModBlocks.ICE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ICE_SLAB.get()));
        dropSelf(ModBlocks.ICE_WALL.get());

        dropSelf(ModBlocks.PACKED_ICE_STAIRS.get());
        add(ModBlocks.PACKED_ICE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PACKED_ICE_SLAB.get()));
        dropSelf(ModBlocks.PACKED_ICE_WALL.get());

        dropSelf(ModBlocks.BLUE_ICE_STAIRS.get());
        add(ModBlocks.BLUE_ICE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BLUE_ICE_SLAB.get()));
        dropSelf(ModBlocks.BLUE_ICE_WALL.get());

        dropSelf(ModBlocks.MUD_STAIRS.get());
        add(ModBlocks.MUD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MUD_SLAB.get()));
        dropSelf(ModBlocks.MUD_WALL.get());

        dropSelf(ModBlocks.CLAY_STAIRS.get());
        add(ModBlocks.CLAY_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CLAY_SLAB.get()));
        dropSelf(ModBlocks.CLAY_WALL.get());

        dropSelf(ModBlocks.MOSS_STAIRS.get());
        add(ModBlocks.MOSS_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MOSS_SLAB.get()));
        dropSelf(ModBlocks.MOSS_WALL.get());

        dropSelf(ModBlocks.NETHERRACK_STAIRS.get());
        add(ModBlocks.NETHERRACK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.NETHERRACK_SLAB.get()));
        dropSelf(ModBlocks.NETHERRACK_WALL.get());

//        dropSelf(ModBlocks.BASALT_STAIRS.get());
//        add(ModBlocks.BASALT_SLAB.get(),
//                block -> createSlabItemTable(ModBlocks.BASALT_SLAB.get()));
//        dropSelf(ModBlocks.BASALT_WALL.get());

        dropSelf(ModBlocks.SMOOTH_BASALT_STAIRS.get());
        add(ModBlocks.SMOOTH_BASALT_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SMOOTH_BASALT_SLAB.get()));
        dropSelf(ModBlocks.SMOOTH_BASALT_WALL.get());

//        dropSelf(ModBlocks.POLISHED_BASALT_STAIRS.get());
//        add(ModBlocks.POLISHED_BASALT_SLAB.get(),
//                block -> createSlabItemTable(ModBlocks.POLISHED_BASALT_SLAB.get()));
//        dropSelf(ModBlocks.POLISHED_BASALT_WALL.get());

        dropSelf(ModBlocks.QUARTZ_BRICK_STAIRS.get());
        add(ModBlocks.QUARTZ_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.QUARTZ_BRICK_SLAB.get()));
        dropSelf(ModBlocks.QUARTZ_BRICK_WALL.get());

        dropSelf(ModBlocks.QUARTZ_WALL.get());
        dropSelf(ModBlocks.SMOOTH_QUARTZ_WALL.get());

        dropSelf(ModBlocks.CUSTOM_FLOWER.get());

        add(ModBlocks.SUNSTONE_DOOR.get(), // door loot table
                block -> createDoorTable(ModBlocks.SUNSTONE_DOOR.get()));

        add(ModBlocks.SUNSTONE_ORE.get(),
                block -> createOreDrop(ModBlocks.SUNSTONE_ORE.get(), ModItems.SUNSTONE.get()));
        add(ModBlocks.DEEPSLATE_SUNSTONE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_SUNSTONE_ORE.get(), ModItems.SUNSTONE.get(), 2, 5));

        dropSelf(ModBlocks.SUNSTONE_LAMP.get());
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
