package com.graclyxz.tinoresandcrafts;


import com.graclyxz.tinoresandcrafts.init.ModItems;
import com.graclyxz.tinoresandcrafts.init.ModTab;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

import static com.graclyxz.tinoresandcrafts.Constants.MODID;

@Mod(MODID)
public class TinOresMod {
    private static final Logger LOGGER = LogUtils.getLogger();
    public TinOresMod(IEventBus eventBus) {

        NeoForge.EVENT_BUS.register(this);
        Constants.LOG.info("Hello NeoForge world!");
        CommonClass.init();
        ModItems.init(eventBus);
        ModTab.init(eventBus);

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}