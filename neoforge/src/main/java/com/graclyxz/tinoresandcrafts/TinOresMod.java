package com.graclyxz.tinoresandcrafts;


import com.graclyxz.tinoresandcrafts.init.ModItems;
import com.graclyxz.tinoresandcrafts.init.ModTab;
import com.graclyxz.tinoresandcrafts.worldgen.ModBiomeModifiers;
import com.graclyxz.tinoresandcrafts.worldgen.ModConfiguredFeatures;
import com.graclyxz.tinoresandcrafts.worldgen.ModPlacedFeatures;
import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

@Mod(Constants.MODID)
public class TinOresMod {

    public TinOresMod(IEventBus eventBus) {

        // This method is invoked by the NeoForge mod loader when it is ready
        // to load your mod. You can access NeoForge and Common code in this
        // project.

        // Use NeoForge to bootstrap the Common mod.
        Constants.LOG.info("Hello NeoForge world!");
        CommonClass.init();
        ModItems.init(eventBus);
        ModTab.init(eventBus);

    }
}