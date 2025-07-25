package com.TheTigerKillah.WeaponryArmoury.item;

import com.TheTigerKillah.WeaponryArmoury.Weaponry_Armoury;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Weaponry_Armoury.MOD_ID);

    public static final DeferredItem<Item> DiamondClusteredIngot = ITEMS.register("diamondclusteredingot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
