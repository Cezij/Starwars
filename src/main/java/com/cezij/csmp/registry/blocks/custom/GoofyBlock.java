package com.cezij.csmp.registry.blocks.custom;

import com.cezij.csmp.SmpMod;

import eu.pb4.polymer.ext.blocks.api.BlockModelType;
import eu.pb4.polymer.ext.blocks.api.PolymerBlockModel;
import eu.pb4.polymer.ext.blocks.api.PolymerBlockResourceUtils;
import eu.pb4.polymer.ext.blocks.api.PolymerTexturedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GoofyBlock extends Block implements PolymerTexturedBlock {

    public GoofyBlock(Settings settings) {
        super(settings);
    }



    /**
     * Returns main/default block used on client
     *
     * @param state
     * @return Vanilla (or other) Block instance
     */
    @Override
    public Block getPolymerBlock(BlockState state) {
        return Blocks.NOTE_BLOCK;
    }

    /**
     * Returns block used on client for player
     *
     * @param player
     * @param state
     * @return Vanilla (or other) Block instance
     */
    @Override
    public Block getPolymerBlock(ServerPlayerEntity player, BlockState state) {
        return PolymerTexturedBlock.super.getPolymerBlock(player, state);
    }

    /**
     * Generic method used for replacing BlockStates in case of no player context
     * It also controls some server side things like collisions
     *
     * @param state Server side/real BlockState
     * @return BlockState visible on client
     */
    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return PolymerTexturedBlock.super.getPolymerBlockState(state);
    }

    /**
     * Main method used for replacing BlockStates for players
     * Keep in mind you should ideally use blocks with the same hitbox as generic/non-player ones!
     *
     * @param player Player viewing it
     * @param state  Server side BlocksState
     * @return Client side BlockState
     */
    @Override
    public BlockState getPolymerBlockState(ServerPlayerEntity player, BlockState state) {
        return PolymerTexturedBlock.super.getPolymerBlockState(player, state);

    }
    public static void registerBlocks(){
        Registry.register(Registry.BLOCK,new Identifier(SmpMod.MOD_ID,"goofy_block"),new GoofyBlock(Settings.of(Material.SCULK).strength(1.0f,1.0f)));

        PolymerBlockResourceUtils.requestBlock(BlockModelType.FULL_BLOCK, PolymerBlockModel.of(new Identifier("block/goofy_block")));
        PolymerBlockModel.of(new Identifier("block/goofy_block"));



    }
}
