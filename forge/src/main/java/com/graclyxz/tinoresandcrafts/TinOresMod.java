package com.graclyxz.tinoresandcrafts;

import com.graclyxz.tinoresandcrafts.init.ModItems;
import com.graclyxz.tinoresandcrafts.init.ModTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MODID)
public class TinOresMod {

    public TinOresMod(FMLJavaModLoadingContext context) {

        IEventBus bus = context.getModEventBus();
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.

        // Use Forge to bootstrap the Common mod.
        Constants.LOG.info("Hello Forge world!");
        CommonClass.init();
        ModItems.init(bus);
        ModTab.init(bus);

    }
}