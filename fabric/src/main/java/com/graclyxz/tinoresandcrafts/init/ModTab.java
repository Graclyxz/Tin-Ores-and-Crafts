package com.graclyxz.tinoresandcrafts.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;


import static com.graclyxz.tinoresandcrafts.Constants.MODID;

public class ModTab {
    public static final CreativeModeTab TAB_TIN_ORES_AND_CRAFTS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.TIN_ITEMS.get(1)))
            .displayItems((features, event) -> {
                for (Item item : ModItems.ITEMS)
                    event.accept(item);
            })
            .title(Component.translatable("item_group.tinoresandcrafts.tab_tinoresandcrafts"))
            .build();

    public static void init() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MODID, "tab_tinoresandcrafts"), TAB_TIN_ORES_AND_CRAFTS);
    }
}