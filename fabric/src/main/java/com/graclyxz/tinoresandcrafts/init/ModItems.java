package com.graclyxz.tinoresandcrafts.init;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static com.graclyxz.tinoresandcrafts.Constants.MODID;
import static com.graclyxz.tinoresandcrafts.init.ModMaterials.Armor;
import static com.graclyxz.tinoresandcrafts.init.ModMaterials.Tool;


public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<>();
    public static final List<Item> BLOCKS = new ArrayList<>();

    /*-*-*-*-*-*-*-*-* Item and Blocks creation *-*-*-*-*-*-*-*-*/
    public static final List<Item> TIN_ITEMS = registerAllItems("tin", Tool.TIN, Armor.TIN, new Item.Properties());
    public static final List<Block> TIN_BLOCKS = registerAllBlocks("tin",  new float[]{4f, 6f}, SoundType.STONE);


    /*-*-*-*-*-*-*-*-* item and blocks registration *-*-*-*-*-*-*-*-*/
    public static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties blockProp, Item.Properties itemProp) {
        var blockReg = registerBlock(name, function, blockProp);
        registerItem(name, (p) -> new BlockItem(blockReg, p), itemProp.useBlockDescriptionPrefix());
        return blockReg;
    }

    public static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties blockProp) {
        return Registry.register(BuiltInRegistries.BLOCK, ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, name)), function.apply(blockProp.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
    }

    public static Item registerItem(String name, Function<Item.Properties, Item> function, Item.Properties itemProp) {
        var itemReg = Registry.register(BuiltInRegistries.ITEM, ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name)), function.apply(itemProp.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
        ITEMS.add(itemReg);
        return itemReg;
    }

    /*-*-*-*-*-*-*-*-* Items list *-*-*-*-*-*-*-*-*/
    private static List<Item> registerAllItems(String name, ToolMaterial toolmaterial, ArmorMaterial armormaterial, Item.Properties itemProp) {
        return List.of(
                registerItem( "raw_" + name, Item::new, itemProp),
                registerItem( name +"_ingot", Item::new, itemProp),
                registerItem( name +"_nugget", Item::new, itemProp),

                registerItem(name + "_sword", (p) -> new SwordItem(toolmaterial,  5, -2.4f, p), itemProp),
                registerItem(name + "_pickaxe", (p) -> new PickaxeItem(toolmaterial,  3, -2.8f, p), itemProp),
                registerItem(name + "_axe", (p) -> new AxeItem(toolmaterial,  8, -3.1f, p), itemProp),
                registerItem(name + "_hoe", (p) -> new HoeItem(toolmaterial,  0, -1f, p), itemProp),
                registerItem( name + "_shovel", (p) -> new ShovelItem(toolmaterial,  3.5f, -3f, p), itemProp),

                registerItem(name + "_helmet", (p) -> new ArmorItem(armormaterial, ArmorType.HELMET, p), itemProp),
                registerItem(name + "_chestplate", (p) -> new ArmorItem(armormaterial, ArmorType.CHESTPLATE, p), itemProp),
                registerItem(name + "_leggings", (p) -> new ArmorItem(armormaterial, ArmorType.LEGGINGS, p), itemProp),
                registerItem(name + "_boots", (p) -> new ArmorItem(armormaterial, ArmorType.BOOTS, p), itemProp)
        );
    }

    /*-*-*-*-*-*-*-*-* Blocks list *-*-*-*-*-*-*-*-*/
    private static List<Block> registerAllBlocks(String name, float[] strengthattr, SoundType soundblock) {
        return List.of(
                registerBlock(name + "_block", Block::new, BlockBehaviour.Properties.of().requiresCorrectToolForDrops()
                        .strength(4f, 6f).sound(SoundType.METAL),
                        new Item.Properties()),

                registerBlock(name + "_ore", Block::new, BlockBehaviour.Properties.of().requiresCorrectToolForDrops()
                                .strength(strengthattr[0],strengthattr[1]).sound(soundblock),
                        new Item.Properties()),

                registerBlock("raw_" + name + "_block", Block::new, BlockBehaviour.Properties.of().requiresCorrectToolForDrops()
                                .strength(4f, 6f).sound(SoundType.STONE),
                        new Item.Properties())
        );
    }

    public static void init() {
    }
}
