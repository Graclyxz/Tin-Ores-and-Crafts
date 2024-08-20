package com.graclyxz.tinoresandcrafts;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import com.graclyxz.tinoresandcrafts.init.TinOresAndCraftsModTabs;
import com.graclyxz.tinoresandcrafts.init.TinOresAndCraftsModItems;
import com.graclyxz.tinoresandcrafts.init.TinOresAndCraftsModBlocks;

@Mod("tin_ores_and_crafts")
public class TinOresAndCraftsMod {
	public static final String MODID = "tin_ores_and_crafts";

	public TinOresAndCraftsMod() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		TinOresAndCraftsModBlocks.REGISTRY.register(bus);

		TinOresAndCraftsModItems.REGISTRY.register(bus);

		TinOresAndCraftsModTabs.REGISTRY.register(bus);
	}

}
