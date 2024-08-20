package com.graclyxz.tinoresandcrafts.init;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.graclyxz.tinoresandcrafts.TinOresAndCraftsMod;

public class TinOresAndCraftsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TinOresAndCraftsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MODTAP = REGISTRY.register("modtap",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.tin_ores_and_crafts.modtap")).icon(() -> new ItemStack(TinOresAndCraftsModItems.TININGOT.get())).displayItems((parameters, tabData) -> {
				for (DeferredHolder<Item, ? extends Item> item : TinOresAndCraftsModItems.REGISTRY.getEntries())
					tabData.accept(item.get());
			}).withSearchBar().build());
}
