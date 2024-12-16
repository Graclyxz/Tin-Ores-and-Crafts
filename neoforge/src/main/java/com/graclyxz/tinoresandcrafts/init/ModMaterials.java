package com.graclyxz.tinoresandcrafts.init;

import com.graclyxz.tinoresandcrafts.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.EnumMap;

import static com.graclyxz.tinoresandcrafts.Constants.MODID;

public class ModMaterials {

    public interface Armor {
        ArmorMaterial TIN = new ArmorMaterial(15, createMap(new int[]{2, 5, 6, 2, 6}),
                9, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f,
                ModTags.Items.TIN_INGOT, ResourceLocation.fromNamespaceAndPath(MODID, "tin"));

        private static EnumMap<ArmorType, Integer> createMap(int[] values) {
            EnumMap<ArmorType, Integer> enumMap = new EnumMap<>(ArmorType.class);
            for (int i = 0; i < values.length; i++) enumMap.put(ArmorType.values()[i], values[i]);
            return enumMap;
        }
    }

    public interface Tool {
        ToolMaterial TIN = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL,
                250, 6f, 0f, 14,
                ModTags.Items.TIN_INGOT);

    }
}
