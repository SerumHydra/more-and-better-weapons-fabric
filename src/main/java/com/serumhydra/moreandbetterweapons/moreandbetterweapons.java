package com.serumhydra.moreandbetterweapons;

import com.serumhydra.moreandbetterweapons.registery.ModBlocks;
import com.serumhydra.moreandbetterweapons.registery.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

//Mod ID
public class moreandbetterweapons implements ModInitializer {
    public static final String MOD_ID = "moreandbetterweapons";

    public static final ItemGroup ORE_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "ore"), () -> new ItemStack(ModItems.STEEL_INGOT));
    public static final ItemGroup WEAPON_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "weapons"), () -> new ItemStack(ModItems.STEEL_SWORD));

    //Initialize
    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
