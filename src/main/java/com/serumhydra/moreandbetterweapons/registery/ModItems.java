package com.serumhydra.moreandbetterweapons.registery;

import com.serumhydra.moreandbetterweapons.moreandbetterweapons;
import net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //items
    public static final Item STEEL_INGOT = new Item(new Item.Settings());
    public static final Item RAW_STEEL = new Item(new Item.Settings());
    //tools

    //block items
    public static final BlockItem STEEL_ORE = new BlockItem(ModBlocks.STEEL_ORE, new Item.Settings());

    public static void registerItems() {
        //register items
        Registry.register(Registry.ITEM, new Identifier(moreandbetterweapons.MOD_ID, "steel_ingot"), STEEL_INGOT);
        Registry.register(Registry.ITEM, new Identifier(moreandbetterweapons.MOD_ID, "raw_steel"), RAW_STEEL);
        //register block items
        Registry.register(Registry.ITEM, new Identifier(moreandbetterweapons.MOD_ID, "steel_ore"), STEEL_ORE);
    }
}
