package com.graclyxz.tinoresandcrafts.item;

import com.graclyxz.tinoresandcrafts.init.TinOresAndCraftsModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import net.minecraft.world.item.ArmorItem.Type;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

import static com.graclyxz.tinoresandcrafts.TinOresAndCraftsMod.MODID;

public class ModArmorMaterials {

    public static final DeferredRegister<ArmorMaterial> MATERIALS = DeferredRegister.create(Registries.ARMOR_MATERIAL, MODID);

    public static final RegistryObject<ArmorMaterial> TIM = register("tin", createMap(new int[]{2, 5, 6, 2, 5}),
            9, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(TinOresAndCraftsModItems.TININGOT.get()));

    private static EnumMap<ArmorItem.Type, Integer> createMap(int[] values) {
        EnumMap<ArmorItem.Type, Integer> enumMap = new EnumMap<>(ArmorItem.Type.class);
        for (int i = 0; i < values.length; i++) enumMap.put(ArmorItem.Type.values()[i], values[i]);
        return enumMap;
    }

    private static RegistryObject<ArmorMaterial> register(String name, EnumMap<Type, Integer> defense, int i, Holder<SoundEvent> holder, float f, float g, Supplier<Ingredient> supplier) {
        return MATERIALS.register(name, () -> new ArmorMaterial(defense, i, holder, supplier, List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(MODID, name))), f, g));
    }

    public static void init(IEventBus bus) {
        MATERIALS.register(bus);
    }

}