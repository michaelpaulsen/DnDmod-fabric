/*
    SKCAM  Copyright (C) 2022  Skeleton_craft
    This program comes with ABSOLUTELY NO WARRANTY.
    This is free software, and you are welcome to redistribute it
    under certain conditions; see license
*/
package com.thepaulsen.michael.item;

import com.thepaulsen.michael.SkcamEntry;
import com.thepaulsen.michael.item.custom.*;
import com.thepaulsen.michael.toolMaterals.ModMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item MYTHRAIL_INGOT = registerItem("mythrail_ingot",
            new Item(new FabricItemSettings().maxCount(64).group(ModItemGroup.MINERAL_GROUP))
    );
    public static final Item MYTHRAIL_NUGGIES = registerItem("mythrail_nugget",
            new Item(new FabricItemSettings().maxCount(81).group(ModItemGroup.MINERAL_GROUP))
    );
    public static final Item HOD = registerItem("hod",
        new HoeOfDestruction(ModMaterials.HOD_MAT,1,10,new FabricItemSettings().group(ModItemGroup.ITEM_GROUP))
    );
    public static final Item MYTHRAIL_SWORD = registerItem("mythrail_sword",
            new SwordItem(ModMaterials.MYTHRIAL_MAT,3,10,new FabricItemSettings().group(ModItemGroup.ITEM_GROUP))
    );
    public static final Item MYTHRAIL_HOE = registerItem("mythrail_hoe",
            new ModHoeItem(ModMaterials.MYTHRIAL_MAT, 1,0.0f, new FabricItemSettings().group(ModItemGroup.ITEM_GROUP))
    );
    public static final Item MYTHRAIL_SHOVEL = registerItem("mythrail_shovel",
            new ModShovelItem(ModMaterials.MYTHRIAL_MAT, 1,0.0f, new FabricItemSettings().group(ModItemGroup.ITEM_GROUP))
    );
    public static final Item MYTHRAIL_PICKAXE = registerItem("mythrail_pickaxe",
            new ModPickAxeItem(ModMaterials.MYTHRIAL_MAT, 1,0.0f, new FabricItemSettings().group(ModItemGroup.ITEM_GROUP))
    );
    public static final Item MYTHRAIL_AXE = registerItem("mythrail_axe",
            new ModAxeItem(ModMaterials.MYTHRIAL_MAT, 1,0.0f, new FabricItemSettings().group(ModItemGroup.ITEM_GROUP))
    );
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(SkcamEntry.MODID,name), item);
    }
    public static void registerModItems(){
        SkcamEntry.LOGGER.info("loading mod items for " + SkcamEntry.MODID);
    }
}