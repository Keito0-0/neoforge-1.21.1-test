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

        add(ModBlocks.SUNSTONE_DOOR.get(), // door loot table
                block -> createDoorTable(ModBlocks.SUNSTONE_DOOR.get()));

        add(ModBlocks.SUNSTONE_ORE.get(),
                block -> createOreDrop(ModBlocks.SUNSTONE_ORE.get(), ModItems.SUNSTONE.get()));
        add(ModBlocks.DEEPSLATE_SUNSTONE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_SUNSTONE_ORE.get(), ModItems.SUNSTONE.get(), 2, 5));
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
