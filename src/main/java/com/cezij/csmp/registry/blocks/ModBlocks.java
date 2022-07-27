package com.cezij.csmp.registry.blocks;

import com.cezij.csmp.SmpMod;
import eu.pb4.polymer.api.block.PolymerBlock;
import eu.pb4.polymer.api.block.SimplePolymerBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings.of;

public class ModBlocks implements PolymerBlock {
    public static final SimplePolymerBlock URANIUM_ORE = new SimplePolymerBlock(of(Material.STONE).strength(1.0f,1.0f),Blocks.BEDROCK);


    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(SmpMod.MOD_ID,"uranium_ore"),URANIUM_ORE);
    }


    @Override
    public Block getPolymerBlock(BlockState state) {
        return null;
    }
}
