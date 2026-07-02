package com.keitooo.testingmod.item;

import com.keitooo.testingmod.item.custom.ChiselItem;
import com.keitooo.testingmod.item.custom.FuelItem;
import com.keitooo.testingmod.testingmod;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(testingmod.MODID);

    public static final DeferredItem<Item> SUNSTONE = ITEMS.register("sunstone", // Registers a new item
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSE_GOLD = ITEMS.register("rose_gold",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CHISEL = ITEMS.register("chisel", // new custom item
            () -> new ChiselItem(new Item.Properties().durability(32)));

    public static final DeferredItem<Item> RADISH = ITEMS.register("radish",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RADISH)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.testingmod.radish.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> POCKET_SUN = ITEMS.register("pocket_sun", // new fuel
            () -> new FuelItem(new Item.Properties(), 800));
    public static final DeferredItem<Item> CARDBOARD = ITEMS.register("cardboard", // new fuel using neoforge data_maps
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
