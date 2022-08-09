package com.cezij.csmp.registry.items.costum.drugs;

import com.cezij.csmp.SmpMod;
import com.cezij.csmp.registry.items.ModFoodComponents;
import eu.pb4.polymer.api.item.PolymerItem;
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

public class Meth extends Item implements PolymerItem{

    public Meth(Settings settings) {
        super(settings);
    }

    /**
     * Returns main/default item used on client for specific player
     *
     * @param itemStack ItemStack of virtual item
     * @param player    Player for which it's send
     * @return Vanilla (or other) Item instance
     */
    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return Items.PORKCHOP;
    }

    /**
     * Method used for getting custom model data of items
     *
     * @param itemStack Server-side ItemStack
     * @param player    Player for which it's send
     * @return Custom model data or -1 if not present
     */
    @Override
    public int getPolymerCustomModelData(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return 2;
    }


    public static void registerItems(){
        Registry.register(Registry.ITEM,new Identifier(SmpMod.MOD_ID,"meth"),new Meth(new Settings().group(ItemGroup.FOOD).food(ModFoodComponents.DRUGS)));
        PolymerModelData modelData = PolymerRPUtils.requestModel(Items.PORKCHOP, new Identifier(SmpMod.MOD_ID, "item/meth"));
    }
}
