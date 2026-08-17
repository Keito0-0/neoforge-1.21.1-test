package com.keitooo.testingmod.datagen;

import com.keitooo.testingmod.block.ModBlocks;
import com.keitooo.testingmod.item.ModItems;
import com.keitooo.testingmod.testingmod;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, testingmod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.SUNSTONE.get());
        basicItem(ModItems.CHISEL.get());
        basicItem(ModItems.ROSE_GOLD.get());
        basicItem(ModItems.CARDBOARD.get());
        basicItem(ModItems.POCKET_SUN.get());
        basicItem(ModItems.RADISH.get());

        buttonItem(ModBlocks.SUNSTONE_BUTTON, ModBlocks.SUNSTONE_BLOCK);
        fenceItem(ModBlocks.SUNSTONE_FENCE, ModBlocks.SUNSTONE_BLOCK);
        wallItem(ModBlocks.SUNSTONE_WALL, ModBlocks.SUNSTONE_BLOCK);

//        wallItemVanilla(ModBlocks.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS);
//        wallItemVanilla(ModBlocks.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);

        basicItem(ModBlocks.SUNSTONE_DOOR.asItem());

        handheldItem(ModItems.SUNSTONE_SWORD);
        handheldItem(ModItems.SUNSTONE_PICKAXE);
        handheldItem(ModItems.SUNSTONE_SHOVEL);
        handheldItem(ModItems.SUNSTONE_AXE);
        handheldItem(ModItems.SUNSTONE_HOE);
    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(testingmod.MODID,
                "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(testingmod.MODID,
                "block/" + baseBlock.getId().getPath()));
    }

    public void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", ResourceLocation.fromNamespaceAndPath(testingmod.MODID,
                "block/" + baseBlock.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(testingmod.MODID,"item/" + item.getId().getPath()));
    }
//    public void wallItemVanilla(DeferredBlock<?> block, Block baseBlock) {
//        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
//                .texture("wall", ResourceLocation.fromNamespaceAndPath(testingmod.MODID,
//                "block/" + baseBlock));
//    }
}
