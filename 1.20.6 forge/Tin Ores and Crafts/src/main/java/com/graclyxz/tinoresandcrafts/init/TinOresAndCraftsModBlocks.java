package com.graclyxz.tinoresandcrafts.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.graclyxz.tinoresandcrafts.block.TintrapdoorBlock;
import com.graclyxz.tinoresandcrafts.block.TinoreblockBlock;
import com.graclyxz.tinoresandcrafts.block.TindoorBlock;
import com.graclyxz.tinoresandcrafts.block.TinblockBlock;
import com.graclyxz.tinoresandcrafts.block.RawtinblockBlock;
import com.graclyxz.tinoresandcrafts.TinOresAndCraftsMod;

public class TinOresAndCraftsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TinOresAndCraftsMod.MODID);
	public static final RegistryObject<Block> RAWTINBLOCK = REGISTRY.register("rawtinblock", () -> new RawtinblockBlock());
	public static final RegistryObject<Block> TINOREBLOCK = REGISTRY.register("tinoreblock", () -> new TinoreblockBlock());
	public static final RegistryObject<Block> TINBLOCK = REGISTRY.register("tinblock", () -> new TinblockBlock());
	public static final RegistryObject<Block> TINTRAPDOOR = REGISTRY.register("tintrapdoor", () -> new TintrapdoorBlock());
	public static final RegistryObject<Block> TINDOOR = REGISTRY.register("tindoor", () -> new TindoorBlock());
}
