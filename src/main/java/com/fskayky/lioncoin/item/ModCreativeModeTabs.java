package com.fskayky.lioncoin.item;

import com.fskayky.lioncoin.LionCoin;
import com.fskayky.lioncoin.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LionCoin.MOD_ID);


    public static final Supplier<CreativeModeTab> LIONCOIN_ITEMS_TAB = CREATIVE_MODE_TAB.register("lioncoin_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COIN.get()))
                    .title(Component.translatable("creativetab.lioncoin.lioncoin_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.COIN);
                        output.accept(ModItems.NIOBIO);
                        output.accept(ModItems.NIOBIO_RAW);
                        output.accept(ModBlocks.NIOBIO_BLOCK);
                        output.accept(ModBlocks.NIOBIO_ORE);
                        output.accept(ModBlocks.DEEPSLATE_NIOBIO_ORE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
