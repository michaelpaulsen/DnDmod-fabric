/*
    SKCAM  Copyright (C) 2022  Skeleton_craft
    This program comes with ABSOLUTELY NO WARRANTY.
    This is free software, and you are welcome to redistribute it
    under certain conditions; see license
*/

package com.thepaulsen.michael.item;

import com.thepaulsen.michael.SkcamEntry;
import com.thepaulsen.michael.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup  ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(SkcamEntry.MODID,"adventurers_items"),
            ()-> new ItemStack(ModItems.MYTHRAIL_NUGGIES));
    public static final ItemGroup  BLOCK_GROUP = FabricItemGroupBuilder.build(new Identifier(SkcamEntry.MODID,"adventurers_blocks"),
            ()-> new ItemStack(Item.fromBlock(ModBlocks.TRIPLE_COMPRESSED_COBBLESTONE)));
    public static final ItemGroup  MINERAL_GROUP = FabricItemGroupBuilder.build(new Identifier(SkcamEntry.MODID,"skc_minerals"),
            ()-> new ItemStack(ModItems.MYTHRAIL_INGOT));
}
