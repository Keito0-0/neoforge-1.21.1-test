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
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
