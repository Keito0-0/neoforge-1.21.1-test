package com.keitooo.testingmod.item;

import com.keitooo.testingmod.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier SUNSTONE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_SUNSTONE_TOOL, 1400, 7f, 3f, 28, () -> Ingredient.of(ModItems.SUNSTONE));
}
