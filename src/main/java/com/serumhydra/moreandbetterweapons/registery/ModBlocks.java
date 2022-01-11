package com.serumhydra.moreandbetterweapons.registery;

import com.serumhydra.moreandbetterweapons.moreandbetterweapons;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block STEEL_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES).strength(5f, 15f).sounds(BlockSoundGroup.STONE));

    //register blocks
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(moreandbetterweapons.MOD_ID, "steel_ore"), STEEL_ORE);
    }
}
