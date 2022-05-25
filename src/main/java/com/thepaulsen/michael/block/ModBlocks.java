/*
    SKCAM  Copyright (C) 2022  Skeleton_craft
    This program comes with ABSOLUTELY NO WARRANTY.
    This is free software, and you are welcome to redistribute it
    under certain conditions; see license
*/
package com.thepaulsen.michael.block;

import com.thepaulsen.michael.SkcamEntry;
import com.thepaulsen.michael.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    private static Block registerBlockWithItem(String name, Block block, ItemGroup group){
        registerBlockItem(name,block,group);
        return Registry.register(Registry.BLOCK,new Identifier(SkcamEntry.MODID,name), block);
    }
    private static Block registerBlock(String name, Block block, ItemGroup group){
        return Registry.register(Registry.BLOCK,new Identifier(SkcamEntry.MODID,name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM,new Identifier(SkcamEntry.MODID,name),
                new BlockItem(block, new FabricItemSettings().group(group))
                );
    }
    private static final Block MYTHRAIL_BLOCK = registerBlockWithItem("mythrail_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.4f).requiresTool().luminance(8)),
            ModItemGroup.BLOCK_GROUP);
    private static final Block MYTHRAIL_ORE = registerBlockWithItem("mythrail_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.2f).requiresTool().luminance(5)),
            ModItemGroup.BLOCK_GROUP);
    //the nice thing about starting dev in 1.18.2 is that if you want your ore to only spawn in deepslate
    // you don't have to make a stone variant because it will never be used
    private static final Block COMPRESSED_COBBLESTONE = registerBlockWithItem("commpressed_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()),
            ModItemGroup.BLOCK_GROUP);
    private static final Block DOUBLE_COMPRESSED_COBBLESTONE = registerBlockWithItem("double_commpressed_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()),
            ModItemGroup.BLOCK_GROUP);
    private static final Block TRIPLE_COMPRESSED_COBBLESTONE = registerBlockWithItem("triple_commpressed_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()),
            ModItemGroup.BLOCK_GROUP);


    public static void registerModBlocks(){
        SkcamEntry.LOGGER.info("loading mod blocks for " + SkcamEntry.MODID);

    }
}
