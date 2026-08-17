package com.keitooo.testingmod.item;

import com.keitooo.testingmod.item.custom.ChiselItem;
import com.keitooo.testingmod.item.custom.FuelItem;
import com.keitooo.testingmod.testingmod;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
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

    // Custom Tools
    public static final DeferredItem<SwordItem> SUNSTONE_SWORD = ITEMS.register("sunstone_sword",
            () -> new SwordItem(ModToolTiers.SUNSTONE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.SUNSTONE, 5, -2.4f))));
    public static final DeferredItem<PickaxeItem> SUNSTONE_PICKAXE = ITEMS.register("sunstone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SUNSTONE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.SUNSTONE, 1.0f, -2.8f))));
    public static final DeferredItem<ShovelItem> SUNSTONE_SHOVEL = ITEMS.register("sunstone_shovel",
            () -> new ShovelItem(ModToolTiers.SUNSTONE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.SUNSTONE, 1.5f, -3.0f))));
    public static final DeferredItem<AxeItem> SUNSTONE_AXE = ITEMS.register("sunstone_axe",
            () -> new AxeItem(ModToolTiers.SUNSTONE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.SUNSTONE, 6f, -3.2f))));
    public static final DeferredItem<HoeItem> SUNSTONE_HOE = ITEMS.register("sunstone_hoe",
            () -> new HoeItem(ModToolTiers.SUNSTONE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.SUNSTONE, 0f, -3.0f))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
