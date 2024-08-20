package com.graclyxz.tinoresandcrafts.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.graclyxz.tinoresandcrafts.TinOresAndCraftsMod;

/*public class TinOresAndCraftsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TinOresAndCraftsMod.MODID);
	public static final RegistryObject<CreativeModeTab> MODTAP = REGISTRY.register("modtap",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.tin_ores_and_crafts.modtap")).icon(() -> new ItemStack(TinOresAndCraftsModItems.TININGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TinOresAndCraftsModItems.TININGOT.get());
				tabData.accept(TinOresAndCraftsModItems.TINARMOR_HELMET.get());
				tabData.accept(TinOresAndCraftsModItems.TINARMOR_CHESTPLATE.get());
				tabData.accept(TinOresAndCraftsModItems.TINARMOR_LEGGINGS.get());
				tabData.accept(TinOresAndCraftsModItems.TINARMOR_BOOTS.get());
				tabData.accept(TinOresAndCraftsModItems.TINSWORD.get());
				tabData.accept(TinOresAndCraftsModItems.TINPICKAXE.get());
				tabData.accept(TinOresAndCraftsModItems.TINAXE.get());
				tabData.accept(TinOresAndCraftsModItems.TINHOE.get());
				tabData.accept(TinOresAndCraftsModItems.TINSHOVEL.get());
				tabData.accept(TinOresAndCraftsModItems.RAWTIN.get());
				tabData.accept(TinOresAndCraftsModItems.TINNUGGET.get());
				tabData.accept(TinOresAndCraftsModBlocks.RAWTINBLOCK.get().asItem());
				tabData.accept(TinOresAndCraftsModBlocks.TINOREBLOCK.get().asItem());
				tabData.accept(TinOresAndCraftsModBlocks.TINBLOCK.get().asItem());
				tabData.accept(TinOresAndCraftsModBlocks.TINTRAPDOOR.get().asItem());
				tabData.accept(TinOresAndCraftsModBlocks.TINDOOR.get().asItem());
			}).withSearchBar().build());
}*/

public class TinOresAndCraftsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TinOresAndCraftsMod.MODID);

	public static final RegistryObject<CreativeModeTab> MODTAP = REGISTRY.register("modtap", () -> CreativeModeTab.builder()
			.icon(() -> new ItemStack(TinOresAndCraftsModItems.TININGOT.get()))
			.displayItems((features, event) -> {
				for (RegistryObject<Item> item : TinOresAndCraftsModItems.ITEMS.getEntries())
					event.accept(item.get());
			})
			.title(Component.translatable("item_group.tin_ores_and_crafts.modtap"))
			.build());

	public static void init(IEventBus bus) {
		REGISTRY.register(bus);
	}
}

