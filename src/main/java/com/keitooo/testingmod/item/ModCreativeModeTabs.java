package com.keitooo.testingmod.item;

import com.keitooo.testingmod.block.ModBlocks;
import com.keitooo.testingmod.testingmod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, testingmod.MODID);

    public static final Supplier<CreativeModeTab> CUSTOM_ITEMS_TAB = CREATIVE_MODE_TAB.register("custom_items_tab", // registers a new tab
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SUNSTONE.get())) // tab icon
                    .title(Component.translatable("creativetab.testingmod.custom_items")) // translation key
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SUNSTONE); // adds items to the tab
                        output.accept(ModItems.ROSE_GOLD);
                        output.accept(ModItems.CHISEL);
                        output.accept(ModItems.RADISH);

                        output.accept(ModItems.POCKET_SUN);
                        output.accept(ModItems.CARDBOARD);
                    }).build());

    public static final Supplier<CreativeModeTab> CUSTOM_BLOCKS_TAB = CREATIVE_MODE_TAB.register("custom_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ROSE_GOLD_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(testingmod.MODID, "custom_items_tab")) // makes it so that the tab displays after the items one
                    .title(Component.translatable("creativetab.testingmod.custom_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ROSE_GOLD_BLOCK);
                        output.accept(ModBlocks.SUNSTONE_ORE);
                        output.accept(ModBlocks.DEEPSLATE_SUNSTONE_ORE);
                        output.accept(ModBlocks.MAGIC_BLOCK);

                        output.accept(ModBlocks.SUNSTONE_BLOCK);
                        output.accept(ModBlocks.SUNSTONE_STAIRS);
                        output.accept(ModBlocks.SUNSTONE_SLAB);
                        output.accept(ModBlocks.SUNSTONE_PRESSURE_PLATE);
                        output.accept(ModBlocks.SUNSTONE_BUTTON);
                        output.accept(ModBlocks.SUNSTONE_FENCE);
                        output.accept(ModBlocks.SUNSTONE_FENCE_GATE);
                        output.accept(ModBlocks.SUNSTONE_WALL);
                        output.accept(ModBlocks.SUNSTONE_DOOR);
                        output.accept(ModBlocks.SUNSTONE_TRAPDOOR);
                        output.accept(ModBlocks.SUNSTONE_LAMP);
                        output.accept(ModBlocks.CUSTOM_FLOWER);

                        output.accept(ModBlocks.TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.TERRACOTTA_SLAB);
                        output.accept(ModBlocks.WHITE_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.WHITE_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.GRAY_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.GRAY_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.BLACK_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.BLACK_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.BROWN_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.BROWN_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.RED_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.RED_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.ORANGE_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.YELLOW_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.LIME_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.LIME_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.GREEN_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.GREEN_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.CYAN_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.CYAN_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.BLUE_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.BLUE_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.PURPLE_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.MAGENTA_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.PINK_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.PINK_TERRACOTTA_SLAB);

                        output.accept(ModBlocks.WHITE_CONCRETE_STAIRS);
                        output.accept(ModBlocks.WHITE_CONCRETE_SLAB);
                        output.accept(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
                        output.accept(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
                        output.accept(ModBlocks.GRAY_CONCRETE_STAIRS);
                        output.accept(ModBlocks.GRAY_CONCRETE_SLAB);
                        output.accept(ModBlocks.BLACK_CONCRETE_STAIRS);
                        output.accept(ModBlocks.BLACK_CONCRETE_SLAB);
                        output.accept(ModBlocks.BROWN_CONCRETE_STAIRS);
                        output.accept(ModBlocks.BROWN_CONCRETE_SLAB);
                        output.accept(ModBlocks.RED_CONCRETE_STAIRS);
                        output.accept(ModBlocks.RED_CONCRETE_SLAB);
                        output.accept(ModBlocks.ORANGE_CONCRETE_STAIRS);
                        output.accept(ModBlocks.ORANGE_CONCRETE_SLAB);
                        output.accept(ModBlocks.YELLOW_CONCRETE_STAIRS);
                        output.accept(ModBlocks.YELLOW_CONCRETE_SLAB);
                        output.accept(ModBlocks.LIME_CONCRETE_STAIRS);
                        output.accept(ModBlocks.LIME_CONCRETE_SLAB);
                        output.accept(ModBlocks.GREEN_CONCRETE_STAIRS);
                        output.accept(ModBlocks.GREEN_CONCRETE_SLAB);
                        output.accept(ModBlocks.CYAN_CONCRETE_STAIRS);
                        output.accept(ModBlocks.CYAN_CONCRETE_SLAB);
                        output.accept(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
                        output.accept(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
                        output.accept(ModBlocks.BLUE_CONCRETE_STAIRS);
                        output.accept(ModBlocks.BLUE_CONCRETE_SLAB);
                        output.accept(ModBlocks.PURPLE_CONCRETE_STAIRS);
                        output.accept(ModBlocks.PURPLE_CONCRETE_SLAB);
                        output.accept(ModBlocks.MAGENTA_CONCRETE_STAIRS);
                        output.accept(ModBlocks.MAGENTA_CONCRETE_SLAB);
                        output.accept(ModBlocks.PINK_CONCRETE_STAIRS);
                        output.accept(ModBlocks.PINK_CONCRETE_SLAB);

                        output.accept(ModBlocks.PRISMARINE_BRICK_WALL);
                        output.accept(ModBlocks.DARK_PRISMARINE_WALL);

                        output.accept(ModBlocks.CALCITE_STAIRS);
                        output.accept(ModBlocks.CALCITE_SLAB);
                        output.accept(ModBlocks.CALCITE_WALL);
                        output.accept(ModBlocks.DRIPSTONE_STAIRS);
                        output.accept(ModBlocks.DRIPSTONE_SLAB);
                        output.accept(ModBlocks.DRIPSTONE_WALL);
                        output.accept(ModBlocks.PACKED_MUD_STAIRS);
                        output.accept(ModBlocks.PACKED_MUD_SLAB);
                        output.accept(ModBlocks.PACKED_MUD_WALL);
                        output.accept(ModBlocks.ICE_STAIRS);
                        output.accept(ModBlocks.ICE_SLAB);
                        output.accept(ModBlocks.ICE_WALL);
                        output.accept(ModBlocks.PACKED_ICE_STAIRS);
                        output.accept(ModBlocks.PACKED_ICE_SLAB);
                        output.accept(ModBlocks.PACKED_ICE_WALL);
                        output.accept(ModBlocks.BLUE_ICE_STAIRS);
                        output.accept(ModBlocks.BLUE_ICE_SLAB);
                        output.accept(ModBlocks.BLUE_ICE_WALL);
                        output.accept(ModBlocks.MUD_STAIRS);
                        output.accept(ModBlocks.MUD_SLAB);
                        output.accept(ModBlocks.MUD_WALL);
                        output.accept(ModBlocks.CLAY_STAIRS);
                        output.accept(ModBlocks.CLAY_SLAB);
                        output.accept(ModBlocks.CLAY_WALL);
                        output.accept(ModBlocks.MOSS_STAIRS);
                        output.accept(ModBlocks.MOSS_SLAB);
                        output.accept(ModBlocks.MOSS_WALL);
                        output.accept(ModBlocks.NETHERRACK_STAIRS);
                        output.accept(ModBlocks.NETHERRACK_SLAB);
                        output.accept(ModBlocks.NETHERRACK_WALL);
//                        output.accept(ModBlocks.BASALT_STAIRS);
//                        output.accept(ModBlocks.BASALT_SLAB);
//                        output.accept(ModBlocks.BASALT_WALL);
                        output.accept(ModBlocks.SMOOTH_BASALT_STAIRS);
                        output.accept(ModBlocks.SMOOTH_BASALT_SLAB);
                        output.accept(ModBlocks.SMOOTH_BASALT_WALL);
//                        output.accept(ModBlocks.POLISHED_BASALT_STAIRS);
//                        output.accept(ModBlocks.POLISHED_BASALT_SLAB);
//                        output.accept(ModBlocks.POLISHED_BASALT_WALL);
                        output.accept(ModBlocks.QUARTZ_BRICK_STAIRS);
                        output.accept(ModBlocks.QUARTZ_BRICK_SLAB);
                        output.accept(ModBlocks.QUARTZ_BRICK_WALL);
                        output.accept(ModBlocks.QUARTZ_WALL);
                        output.accept(ModBlocks.SMOOTH_QUARTZ_WALL);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
