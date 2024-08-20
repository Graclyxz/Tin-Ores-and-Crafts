package com.graclyxz.tinoresandcrafts;

import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.IEventBus;



import com.graclyxz.tinoresandcrafts.init.TinOresAndCraftsModTabs;
import com.graclyxz.tinoresandcrafts.init.TinOresAndCraftsModItems;
import com.graclyxz.tinoresandcrafts.init.TinOresAndCraftsModBlocks;

@Mod("tin_ores_and_crafts")
public class TinOresAndCraftsMod {
	public static final String MODID = "tin_ores_and_crafts";

	public TinOresAndCraftsMod(IEventBus modEventBus) {

		TinOresAndCraftsModBlocks.REGISTRY.register(modEventBus);

		TinOresAndCraftsModItems.REGISTRY.register(modEventBus);

		TinOresAndCraftsModTabs.REGISTRY.register(modEventBus);
	}

}
