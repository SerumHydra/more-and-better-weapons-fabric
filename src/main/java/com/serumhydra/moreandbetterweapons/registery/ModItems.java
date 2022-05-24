package com.serumhydra.moreandbetterweapons.registery;

import com.serumhydra.moreandbetterweapons.moreandbetterweapons;
import com.serumhydra.moreandbetterweapons.toolitems.SteelSwordItem;
import com.serumhydra.moreandbetterweapons.toolitems.SteelTools;
import net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //items
    public static final Item STEEL_INGOT = new Item(new Item.Settings().group(moreandbetterweapons.ORE_GROUP));
    public static final Item RAW_STEEL = new Item(new Item.Settings().group(moreandbetterweapons.ORE_GROUP));
    //tools
    public static ToolItem STEEL_SWORD = new SteelSwordItem(SteelTools.INSTANCE, 1, -2F, new Item.Settings().group(moreandbetterweapons.WEAPON_GROUP));
    //block items
    public static final BlockItem STEEL_ORE = new BlockItem(ModBlocks.STEEL_ORE, new Item.Settings().group(moreandbetterweapons.ORE_GROUP));

    public static void registerItems() {
        //register items
        Registry.register(Registry.ITEM, new Identifier(moreandbetterweapons.MOD_ID, "steel_ingot"), STEEL_INGOT);
        Registry.register(Registry.ITEM, new Identifier(moreandbetterweapons.MOD_ID, "raw_steel"), RAW_STEEL);
        Registry.register(Registry.ITEM, new Identifier(moreandbetterweapons.MOD_ID, "steel_sword"), STEEL_SWORD);
        //register block items
        Registry.register(Registry.ITEM, new Identifier(moreandbetterweapons.MOD_ID, "steel_ore"), STEEL_ORE);
    }
}
