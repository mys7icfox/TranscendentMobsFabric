package me.mys7icfox.transcendentmobs.item;

import me.mys7icfox.transcendentmobs.Transcendentmobs;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup AttunementsGroup = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Transcendentmobs.MOD_ID, "aquagem"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.aquagem"))
                    .icon(() -> new ItemStack(ModItems.AQUAGEM)).entries((displayContext, entries) -> {
                    entries.add(ModItems.AQUAGEM);
                    entries.add(ModItems.RUBYGEM);
            }).build());

    public static void registerItemGroups(){
        Transcendentmobs.LOGGER.info("Registering ItemGroups for " + Transcendentmobs.MOD_ID);
    }
}
