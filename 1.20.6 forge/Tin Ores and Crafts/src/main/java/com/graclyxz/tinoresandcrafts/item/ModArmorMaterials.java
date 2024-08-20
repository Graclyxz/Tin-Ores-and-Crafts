package com.graclyxz.tinoresandcrafts.item;

import com.graclyxz.tinoresandcrafts.init.TinOresAndCraftsModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import net.minecraft.world.item.ArmorItem.Type;
import net.minecraftforge.registries.RegistryObject;

import java.util.EnumMap;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

import static com.graclyxz.tinoresandcrafts.TinOresAndCraftsMod.MODID;

public class ModArmorMaterials {

    /*public static final Holder<ArmorMaterial> TIM;

    static {
        TIM = register("tim", createMap(new int[]{2, 6, 5, 2, 5}),
                9, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(TinOresAndCraftsModItems.TININGOT.get()));
    }

    private static EnumMap<ArmorItem.Type, Integer> createMap(int[] values) {
        EnumMap<ArmorItem.Type, Integer> enumMap = new EnumMap<>(ArmorItem.Type.class);
        for (int i = 0; i < values.length; i++) enumMap.put(ArmorItem.Type.values()[i], values[i]);
        return enumMap;
    }

    private static Holder<ArmorMaterial> register(String string, EnumMap<ArmorItem.Type, Integer> defense, int i, Holder<SoundEvent> holder, float f, float g, Supplier<Ingredient> supplier) {
        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, ResourceLocation.tryParse(string), new ArmorMaterial(defense, i, holder, supplier, List.of(new ArmorMaterial.Layer(ResourceLocation.tryParse(string))), f, g));
    }*/


    public static final Holder<ArmorMaterial> TIM = register("tim", createMap(new int[]{2, 6, 5, 2, 5}),
            9, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(TinOresAndCraftsModItems.TININGOT.get()));

    private static EnumMap<Type, Integer> createMap(int[] values) {
        EnumMap<Type, Integer> enumMap = new EnumMap<>(Type.class);
        for (int i = 0; i < values.length; i++) enumMap.put(Type.values()[i], values[i]);
        return enumMap;
    }

    private static Holder<ArmorMaterial> register(String name, EnumMap<Type, Integer> defense, int i, Holder<SoundEvent> holder, float f, float g, Supplier<Ingredient> supplier) {
        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, Objects.requireNonNull(ResourceLocation.tryParse(MODID)), new ArmorMaterial(defense, i, holder, supplier, List.of(new ArmorMaterial.Layer(Objects.requireNonNull(ResourceLocation.tryParse(MODID)))), f, g));
    }

    public static void init() {
    }

}