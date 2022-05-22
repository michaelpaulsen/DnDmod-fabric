package com.thepaulsen.michael.item;

import com.thepaulsen.michael.SkcamEntry;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup  ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(SkcamEntry.MODID,"adventurers_items"),
            ()-> new ItemStack(ModItems.MYTHRAIL_NUGGIES));
    public static final ItemGroup  BLOCK_GROUP = FabricItemGroupBuilder.build(new Identifier(SkcamEntry.MODID,"adventurers_blocks"),
            ()-> new ItemStack(ModItems.MYTHRAIL_INGOT));
    public static final ItemGroup  MINERAL_GROUP = FabricItemGroupBuilder.build(new Identifier(SkcamEntry.MODID,"skc_minerals"),
            ()-> new ItemStack(ModItems.MYTHRAIL_INGOT));
}
