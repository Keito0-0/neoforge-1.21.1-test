package com.keitooo.testingmod.datagen;

import com.keitooo.testingmod.block.ModBlocks;
import com.keitooo.testingmod.item.ModItems;
import com.keitooo.testingmod.testingmod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> SUNSTONE_SMELTABLES = List.of(ModBlocks.SUNSTONE_ORE, ModBlocks.DEEPSLATE_SUNSTONE_ORE);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROSE_GOLD_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.ROSE_GOLD.get())
                .unlockedBy("has_rose_gold", has(ModItems.ROSE_GOLD)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD.get(), 9)
                .requires(ModBlocks.ROSE_GOLD_BLOCK)
                .unlockedBy("has_rose_gold_block", has(ModBlocks.ROSE_GOLD_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SUNSTONE.get(), 8)
                .requires(ModBlocks.MAGIC_BLOCK)
                .unlockedBy("has_magic_block", has(ModBlocks.MAGIC_BLOCK))
                .save(recipeOutput, "testingmod:sunstone_from_magic_block");

        oreSmelting(recipeOutput, SUNSTONE_SMELTABLES, RecipeCategory.MISC, ModItems.SUNSTONE.get(), 0.25f, 200, "sunstone");
        oreBlasting(recipeOutput, SUNSTONE_SMELTABLES, RecipeCategory.MISC, ModItems.SUNSTONE.get(), 0.25f, 100, "sunstone");

        nineBlockStorageRecipes(
            recipeOutput, RecipeCategory.MISC, ModItems.SUNSTONE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUNSTONE_BLOCK);

        stairBuilder(ModBlocks.SUNSTONE_STAIRS.get(), Ingredient.of(ModBlocks.SUNSTONE_BLOCK)).group("sunstone")
                .unlockedBy("has_sunstone", has(ModBlocks.SUNSTONE_BLOCK)).save(recipeOutput);

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUNSTONE_SLAB.get(), ModBlocks.SUNSTONE_BLOCK.get());

        buttonBuilder(ModBlocks.SUNSTONE_BUTTON.get(), Ingredient.of(ModItems.SUNSTONE)).group("sunstone")
                .unlockedBy("has_sunstone", has(ModItems.SUNSTONE)).save(recipeOutput);

        pressurePlate(recipeOutput, ModBlocks.SUNSTONE_PRESSURE_PLATE.get(), ModItems.SUNSTONE.get());

        fenceBuilder(ModBlocks.SUNSTONE_FENCE.get(), Ingredient.of(ModItems.SUNSTONE)).group("sunstone")
                .unlockedBy("has_sunstone", has(ModItems.SUNSTONE)).save(recipeOutput);
        fenceGateBuilder(ModBlocks.SUNSTONE_FENCE_GATE.get(), Ingredient.of(ModItems.SUNSTONE)).group("sunstone")
                .unlockedBy("has_sunstone", has(ModItems.SUNSTONE)).save(recipeOutput);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUNSTONE_WALL.get(), ModBlocks.SUNSTONE_BLOCK.get());

        doorBuilder(ModBlocks.SUNSTONE_DOOR.get(), Ingredient.of(ModItems.SUNSTONE)).group("sunstone")
                .unlockedBy("has_sunstone", has(ModItems.SUNSTONE)).save(recipeOutput);
        trapdoorBuilder(ModBlocks.SUNSTONE_TRAPDOOR.get(), Ingredient.of(ModItems.SUNSTONE)).group("sunstone")
                .unlockedBy("has_sunstone", has(ModItems.SUNSTONE)).save(recipeOutput);

        stairBuilder(ModBlocks.TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.TERRACOTTA)).group("terracotta")
                .unlockedBy("has_terracotta", has(Blocks.TERRACOTTA)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_SLAB.get(), Blocks.TERRACOTTA);
        stairBuilder(ModBlocks.WHITE_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.WHITE_TERRACOTTA)).group("terracotta")
                .unlockedBy("has_terracotta", has(Blocks.WHITE_TERRACOTTA)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_SLAB.get(), Blocks.WHITE_TERRACOTTA);
        stairBuilder(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.LIGHT_GRAY_TERRACOTTA)).group("terracotta")
                .unlockedBy("has_terracotta", has(Blocks.LIGHT_GRAY_TERRACOTTA)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), Blocks.LIGHT_GRAY_TERRACOTTA);
        stairBuilder(ModBlocks.GRAY_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.GRAY_TERRACOTTA)).group("terracotta")
                .unlockedBy("has_terracotta", has(Blocks.GRAY_TERRACOTTA)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_SLAB.get(), Blocks.GRAY_TERRACOTTA);
        stairBuilder(ModBlocks.BLACK_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.BLACK_TERRACOTTA)).group("terracotta")
                .unlockedBy("has_terracotta", has(Blocks.BLACK_TERRACOTTA)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_SLAB.get(), Blocks.BLACK_TERRACOTTA);
        stairBuilder(ModBlocks.BROWN_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.BROWN_TERRACOTTA)).group("terracotta")
                .unlockedBy("has_terracotta", has(Blocks.BROWN_TERRACOTTA)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_SLAB.get(), Blocks.BROWN_TERRACOTTA);
        stairBuilder(ModBlocks.RED_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.RED_TERRACOTTA)).group("terracotta")
                .unlockedBy("has_terracotta", has(Blocks.RED_TERRACOTTA)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_SLAB.get(), Blocks.RED_TERRACOTTA);
        stairBuilder(ModBlocks.ORANGE_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.ORANGE_TERRACOTTA)).group("terracotta")
                .unlockedBy("has_terracotta", has(Blocks.ORANGE_TERRACOTTA)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_SLAB.get(), Blocks.ORANGE_TERRACOTTA);
        stairBuilder(ModBlocks.YELLOW_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.YELLOW_TERRACOTTA)).group("terracotta")
                .unlockedBy("has_terracotta", has(Blocks.YELLOW_TERRACOTTA)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_SLAB.get(), Blocks.YELLOW_TERRACOTTA);
        stairBuilder(ModBlocks.LIME_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.LIME_TERRACOTTA)).group("terracotta")
                .unlockedBy("has_terracotta", has(Blocks.LIME_TERRACOTTA)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_SLAB.get(), Blocks.LIME_TERRACOTTA);
        stairBuilder(ModBlocks.GREEN_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.GREEN_TERRACOTTA)).group("terracotta")
                .unlockedBy("has_terracotta", has(Blocks.GREEN_TERRACOTTA)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_SLAB.get(), Blocks.GREEN_TERRACOTTA);
        stairBuilder(ModBlocks.CYAN_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.CYAN_TERRACOTTA)).group("terracotta")
                .unlockedBy("has_terracotta", has(Blocks.CYAN_TERRACOTTA)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_SLAB.get(), Blocks.CYAN_TERRACOTTA);
        stairBuilder(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.LIGHT_BLUE_TERRACOTTA)).group("terracotta")
                .unlockedBy("has_terracotta", has(Blocks.LIGHT_BLUE_TERRACOTTA)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), Blocks.LIGHT_BLUE_TERRACOTTA);
        stairBuilder(ModBlocks.BLUE_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.BLUE_TERRACOTTA)).group("terracotta")
                .unlockedBy("has_terracotta", has(Blocks.BLUE_TERRACOTTA)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_SLAB.get(), Blocks.BLUE_TERRACOTTA);
        stairBuilder(ModBlocks.PURPLE_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.PURPLE_TERRACOTTA)).group("terracotta")
                .unlockedBy("has_terracotta", has(Blocks.PURPLE_TERRACOTTA)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_SLAB.get(), Blocks.PURPLE_TERRACOTTA);
        stairBuilder(ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.MAGENTA_TERRACOTTA)).group("terracotta")
                .unlockedBy("has_terracotta", has(Blocks.MAGENTA_TERRACOTTA)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_SLAB.get(), Blocks.MAGENTA_TERRACOTTA);
        stairBuilder(ModBlocks.PINK_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.PINK_TERRACOTTA)).group("terracotta")
                .unlockedBy("has_terracotta", has(Blocks.PINK_TERRACOTTA)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_SLAB.get(), Blocks.PINK_TERRACOTTA);


        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_WALL.get(), Blocks.PRISMARINE_BRICKS);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_WALL.get(), Blocks.DARK_PRISMARINE);
    }


    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, testingmod.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
