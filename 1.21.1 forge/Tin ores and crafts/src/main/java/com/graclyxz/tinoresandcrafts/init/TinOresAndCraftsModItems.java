package com.graclyxz.tinoresandcrafts.init;

import com.graclyxz.tinoresandcrafts.item.*;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import static com.graclyxz.tinoresandcrafts.TinOresAndCraftsMod.MODID;

public class TinOresAndCraftsModItems {

	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

	public static final RegistryObject<Item> TININGOT = REGISTRY.register("tiningot", () -> new TiningotItem());

	public static final RegistryObject<Item> TINARMOR_HELMET = REGISTRY.register("tinarmor_helmet", () -> new TinarmorItem(
			ModArmorMaterials.TIM.getHolder().get(), ArmorItem.Type.HELMET, 25, new Item.Properties()));
	public static final RegistryObject<Item> TINARMOR_CHESTPLATE = REGISTRY.register("tinarmor_chestplate", () -> new TinarmorItem(
			ModArmorMaterials.TIM.getHolder().get(), ArmorItem.Type.CHESTPLATE, 25, new Item.Properties()));
	public static final RegistryObject<Item> TINARMOR_LEGGINGS = REGISTRY.register("tinarmor_leggings", () -> new TinarmorItem(
			ModArmorMaterials.TIM.getHolder().get(), ArmorItem.Type.LEGGINGS, 25, new Item.Properties()));
	public static final RegistryObject<Item> TINARMOR_BOOTS = REGISTRY.register("tinarmor_boots", () -> new TinarmorItem(
			ModArmorMaterials.TIM.getHolder().get(), ArmorItem.Type.BOOTS, 25, new Item.Properties()));

	public static final RegistryObject<Item> TINSWORD = REGISTRY.register("tinsword", () -> new TinswordItem());
	public static final RegistryObject<Item> TINPICKAXE = REGISTRY.register("tinpickaxe", () -> new TinpickaxeItem());
	public static final RegistryObject<Item> TINAXE = REGISTRY.register("tinaxe", () -> new TinaxeItem());
	public static final RegistryObject<Item> TINHOE = REGISTRY.register("tinhoe", () -> new TinhoeItem());
	public static final RegistryObject<Item> TINSHOVEL = REGISTRY.register("tinshovel", () -> new TinshovelItem());
	public static final RegistryObject<Item> RAWTIN = REGISTRY.register("rawtin", () -> new RawtinItem());
	public static final RegistryObject<Item> TINNUGGET = REGISTRY.register("tinnugget", () -> new TinnuggetItem());

	public static final RegistryObject<Item> RAWTINBLOCK = block(TinOresAndCraftsModBlocks.RAWTINBLOCK);
	public static final RegistryObject<Item> TINOREBLOCK = block(TinOresAndCraftsModBlocks.TINOREBLOCK);
	public static final RegistryObject<Item> TINBLOCK = block(TinOresAndCraftsModBlocks.TINBLOCK);
	public static final RegistryObject<Item> TINTRAPDOOR = block(TinOresAndCraftsModBlocks.TINTRAPDOOR);
	public static final RegistryObject<Item> TINDOOR = doubleBlock(TinOresAndCraftsModBlocks.TINDOOR);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}

}
