package com.thepaulsen.michael.block;

import com.thepaulsen.michael.SkcamEntry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
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
    public static void registerModBlocks(){
        SkcamEntry.LOGGER.info("loading mod blocks for " + SkcamEntry.MODID);

    }
}
