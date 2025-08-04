package com.TheTigerKillah.WeaponryArmoury.item;

import com.TheTigerKillah.WeaponryArmoury.Weaponry_Armoury;
import com.TheTigerKillah.WeaponryArmoury.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Weaponry_Armoury.MOD_ID);

    public static final Supplier<CreativeModeTab> WeaponryArmouryTab = CREATIVE_MODE_TAB.register("weaponry_armoury_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GildedNetheriteIngot.get()))
                    .title(Component.translatable("creativetab.weaponryarmourymod.weaponry_armoury_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.DiamondClusteredIngot);
                        output.accept(ModItems.DiamondIronIngot);
                        output.accept(ModBlocks.DiamondIronBlock);
                        output.accept(ModItems.GildedNetheriteIngot);
                        output.accept(ModBlocks.GildedNetheriteBlock);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
