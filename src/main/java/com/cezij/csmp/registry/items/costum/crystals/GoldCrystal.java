package com.cezij.csmp.registry.items.costum.crystals;

import com.cezij.csmp.SmpMod;
import eu.pb4.polymer.api.item.PolymerItem;
import eu.pb4.polymer.api.item.SimplePolymerItem;
import eu.pb4.polymer.api.resourcepack.PolymerModelData;
import eu.pb4.polymer.api.resourcepack.PolymerRPUtils;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.Nullable;

import static net.minecraft.item.Items.DIAMOND;

public class GoldCrystal extends Item implements PolymerItem{


    public GoldCrystal(Settings settings) {
        super(settings);
    }

    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return Items.DIAMOND;
    }


    @Override
    public int getPolymerCustomModelData(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return 2;
    }

    public static void registerItems(){
        Registry.register(Registry.ITEM,new Identifier(SmpMod.MOD_ID,"gold_kyber_crystal"),new GoldCrystal(new Item.Settings().group(ItemGroup.COMBAT).fireproof()));
        PolymerModelData modelData = PolymerRPUtils.requestModel(Items.DIAMOND, new Identifier(SmpMod.MOD_ID, "item/gold_kyber_crystal"));
    }
}
