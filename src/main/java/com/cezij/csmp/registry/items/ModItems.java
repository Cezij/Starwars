package com.cezij.csmp.registry.items;

import com.cezij.csmp.SmpMod;
import com.cezij.csmp.registry.blocks.ModBlocks;
import eu.pb4.polymer.api.item.PolymerBlockItem;
import eu.pb4.polymer.api.item.PolymerItem;
import eu.pb4.polymer.api.item.SimplePolymerItem;
import eu.pb4.polymer.api.resourcepack.PolymerModelData;
import eu.pb4.polymer.api.resourcepack.PolymerRPUtils;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.Nullable;


public class ModItems implements PolymerItem {
    //item


    public static final SimplePolymerItem URANIUM_FRAGMENT = new SimplePolymerItem(new Item.Settings().group(ItemGroup.REDSTONE).food(ModFoodComponents.POISON),Items.NETHERITE_SCRAP);
    public static final SimplePolymerItem KYBER_CRYSTAL = new SimplePolymerItem(new Item.Settings().group(ItemGroup.TRANSPORTATION).fireproof(), Items.DIAMOND);




    //block

    public static final PolymerBlockItem URANIUM_ORE = new PolymerBlockItem(ModBlocks.URANIUM_ORE,new Item.Settings().group(ItemGroup.DECORATIONS).maxCount(100).food(ModFoodComponents.POISON),Items.BEDROCK);

    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player) {

        return null;
    }


    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(SmpMod.MOD_ID,"kyber_crystal"),KYBER_CRYSTAL);


        Registry.register(Registry.ITEM, new Identifier(SmpMod.MOD_ID,"uranium_ore"),URANIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(SmpMod.MOD_ID,"uranim_fragment"),URANIUM_FRAGMENT);





    }
}
