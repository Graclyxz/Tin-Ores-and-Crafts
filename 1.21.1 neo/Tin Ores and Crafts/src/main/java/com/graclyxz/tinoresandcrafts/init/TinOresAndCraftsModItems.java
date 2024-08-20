package com.graclyxz.tinoresandcrafts.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import com.graclyxz.tinoresandcrafts.item.TinswordItem;
import com.graclyxz.tinoresandcrafts.item.TinshovelItem;
import com.graclyxz.tinoresandcrafts.item.TinpickaxeItem;
import com.graclyxz.tinoresandcrafts.item.TinnuggetItem;
import com.graclyxz.tinoresandcrafts.item.TiningotItem;
import com.graclyxz.tinoresandcrafts.item.TinhoeItem;
import com.graclyxz.tinoresandcrafts.item.TinaxeItem;
import com.graclyxz.tinoresandcrafts.item.TinarmorItem;
import com.graclyxz.tinoresandcrafts.item.RawtinItem;
import com.graclyxz.tinoresandcrafts.TinOresAndCraftsMod;

public class TinOresAndCraftsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TinOresAndCraftsMod.MODID);
	public static final DeferredHolder<Item, Item> TININGOT = REGISTRY.register("tiningot", TiningotItem::new);
	public static final DeferredHolder<Item, Item> TINARMOR_HELMET = REGISTRY.register("tinarmor_helmet", TinarmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> TINARMOR_CHESTPLATE = REGISTRY.register("tinarmor_chestplate", TinarmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> TINARMOR_LEGGINGS = REGISTRY.register("tinarmor_leggings", TinarmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> TINARMOR_BOOTS = REGISTRY.register("tinarmor_boots", TinarmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> TINSWORD = REGISTRY.register("tinsword", TinswordItem::new);
	public static final DeferredHolder<Item, Item> TINPICKAXE = REGISTRY.register("tinpickaxe", TinpickaxeItem::new);
	public static final DeferredHolder<Item, Item> TINAXE = REGISTRY.register("tinaxe", TinaxeItem::new);
	public static final DeferredHolder<Item, Item> TINHOE = REGISTRY.register("tinhoe", TinhoeItem::new);
	public static final DeferredHolder<Item, Item> TINSHOVEL = REGISTRY.register("tinshovel", TinshovelItem::new);
	public static final DeferredHolder<Item, Item> RAWTIN = REGISTRY.register("rawtin", RawtinItem::new);
	public static final DeferredHolder<Item, Item> TINNUGGET = REGISTRY.register("tinnugget", TinnuggetItem::new);
	public static final DeferredHolder<Item, Item> RAWTINBLOCK = block(TinOresAndCraftsModBlocks.RAWTINBLOCK);
	public static final DeferredHolder<Item, Item> TINOREBLOCK = block(TinOresAndCraftsModBlocks.TINOREBLOCK);
	public static final DeferredHolder<Item, Item> TINBLOCK = block(TinOresAndCraftsModBlocks.TINBLOCK);
	public static final DeferredHolder<Item, Item> TINTRAPDOOR = block(TinOresAndCraftsModBlocks.TINTRAPDOOR);
	public static final DeferredHolder<Item, Item> TINDOOR = doubleBlock(TinOresAndCraftsModBlocks.TINDOOR);

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static DeferredHolder<Item, Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
