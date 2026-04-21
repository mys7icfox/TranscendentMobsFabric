package me.mys7icfox.transcendentmobs.block;

import me.mys7icfox.transcendentmobs.Transcendentmobs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {


    public static final Block ATTUNEMENT_BENCH = registerBlock("attunement_bench",
            new Block(FabricBlockSettings.copyOf(Blocks.ANVIL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Transcendentmobs.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Transcendentmobs.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Transcendentmobs.LOGGER.info("Registering ItemGroups for " + Transcendentmobs.MOD_ID);
    }
}
