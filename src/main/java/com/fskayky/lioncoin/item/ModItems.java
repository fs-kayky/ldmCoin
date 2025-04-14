package com.fskayky.lioncoin.item;

import com.fskayky.lioncoin.LionCoin;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LionCoin.MOD_ID);

    public static final DeferredItem<Item> COIN = ITEMS.register("lioncoin", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NIOBIO = ITEMS.register("niobio", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NIOBIO_RAW = ITEMS.register("niobio_raw", () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
