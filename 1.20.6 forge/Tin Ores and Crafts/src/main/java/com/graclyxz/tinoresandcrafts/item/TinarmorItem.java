package com.graclyxz.tinoresandcrafts.item;

import net.minecraft.core.Holder;

import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;

public class TinarmorItem extends ArmorItem {
    public TinarmorItem(Holder<ArmorMaterial> material, Type type, int durabilityMultiplier, Properties properties) {
        super(material, type, properties.durability(new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * durabilityMultiplier));
    }
}
