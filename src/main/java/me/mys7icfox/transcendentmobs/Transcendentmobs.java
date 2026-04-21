package me.mys7icfox.transcendentmobs;

import me.mys7icfox.transcendentmobs.block.ModBlocks;
import me.mys7icfox.transcendentmobs.item.ModItemGroup;
import me.mys7icfox.transcendentmobs.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Transcendentmobs implements ModInitializer {
    public static final String MOD_ID = "transcendentmobs";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();

        ModItemGroup.registerItemGroups();
        ModBlocks.registerModBlocks();
    }
}
