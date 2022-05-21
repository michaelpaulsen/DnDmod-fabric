package com.thepaulsen.michael;

import com.thepaulsen.michael.block.ModBlocks;
import com.thepaulsen.michael.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class SkcamEntry implements ModInitializer{
    public static final String MODID = "skcam";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        LOGGER.info("SKAM LOADED!!! [look mom I made a mod that does something]");
        LOGGER.info("skcam is not a scam skcam is skeleton_craft's adveture mod");
        LOGGER.info("SKeleton_craft's Adveture Mod");
        LOGGER.warn("[note to self when upgrading to 1.19 run the vanilla version first]");
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}