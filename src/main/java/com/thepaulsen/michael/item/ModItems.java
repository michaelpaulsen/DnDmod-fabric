/*
    SKCAM  Copyright (C) 2022  Skeleton_craft
    This program comes with ABSOLUTELY NO WARRANTY.
    This is free software, and you are welcome to redistribute it
    under certain conditions; see license
*/
package com.thepaulsen.michael.item;

import com.thepaulsen.michael.SkcamEntry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item MYTHRAIL_INGOT = registerItem("mythrail_ingot",
            new Item(new FabricItemSettings().maxCount(64).group(ModItemGroup.ITEM_GROUP)));
    public static final Item MYTHRAIL_NUGGIES = registerItem("mythrail_nugget",
            new Item(new FabricItemSettings().maxCount(81).group(ModItemGroup.ITEM_GROUP)));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(SkcamEntry.MODID,name), item);
    }
    public static void registerModItems(){
        SkcamEntry.LOGGER.info("loading mod items for " + SkcamEntry.MODID);

    }
}
