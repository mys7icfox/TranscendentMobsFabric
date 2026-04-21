package me.mys7icfox.transcendentmobs.item;

import me.mys7icfox.transcendentmobs.Transcendentmobs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // items
    public static final Item AQUAGEM = registerItem("aquagem", new Item(new FabricItemSettings()));
    public static final Item RUBYGEM = registerItem("rubygem", new Item(new FabricItemSettings()));

    // NO LONGER NEED THIS SINCE THERE IS NOW A MOD ITEM GROUP
   /* private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(AQUAGEM);
        entries.add(RUBYGEM);
    }*/


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Transcendentmobs.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Transcendentmobs.LOGGER.info("Registering ModItems for " + Transcendentmobs.MOD_ID);

        // NO LONGER NEED THIS SINCE THERE IS NOW A MOD ITEM GROUP
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
