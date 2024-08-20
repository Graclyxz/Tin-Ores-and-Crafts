package com.graclyxz.tinoresandcrafts.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

import com.graclyxz.tinoresandcrafts.block.TintrapdoorBlock;
import com.graclyxz.tinoresandcrafts.block.TinoreblockBlock;
import com.graclyxz.tinoresandcrafts.block.TindoorBlock;
import com.graclyxz.tinoresandcrafts.block.TinblockBlock;
import com.graclyxz.tinoresandcrafts.block.RawtinblockBlock;
import com.graclyxz.tinoresandcrafts.TinOresAndCraftsMod;

public class TinOresAndCraftsModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(TinOresAndCraftsMod.MODID);
	public static final DeferredHolder<Block, Block> RAWTINBLOCK = REGISTRY.register("rawtinblock", RawtinblockBlock::new);
	public static final DeferredHolder<Block, Block> TINOREBLOCK = REGISTRY.register("tinoreblock", TinoreblockBlock::new);
	public static final DeferredHolder<Block, Block> TINBLOCK = REGISTRY.register("tinblock", TinblockBlock::new);
	public static final DeferredHolder<Block, Block> TINTRAPDOOR = REGISTRY.register("tintrapdoor", TintrapdoorBlock::new);
	public static final DeferredHolder<Block, Block> TINDOOR = REGISTRY.register("tindoor", TindoorBlock::new);
}
