package com.serumhydra.moreandbetterweapons;

import com.serumhydra.moreandbetterweapons.registery.ModBlocks;
import com.serumhydra.moreandbetterweapons.registery.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;

@SuppressWarnings("unused")

public class moreandbetterweapons implements ModInitializer {
    public static final String MOD_ID="moreandbetterweapons";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
