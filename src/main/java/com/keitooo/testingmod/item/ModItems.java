package com.keitooo.testingmod.item;

import com.keitooo.testingmod.testingmod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(testingmod.MODID);

    public static final DeferredItem<Item> SUNSTONE = ITEMS.register("sunstone", // Registers a new item
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSE_GOLD = ITEMS.register("rose_gold",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
