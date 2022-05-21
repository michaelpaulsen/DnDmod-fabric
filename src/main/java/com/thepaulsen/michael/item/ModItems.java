package com.thepaulsen.michael.item;

import com.thepaulsen.michael.SkcamEntry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item MYTHRAIL_INGOT = registerItem("mythrail_ingot",
            new Item(new FabricItemSettings().maxCount(4).group(ItemGroup.MISC)));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(SkcamEntry.MODID,name), item);
    }
    public static void registerModItems(){
        SkcamEntry.LOGGER.info("loading mod items for " + SkcamEntry.MODID);

    }
}
