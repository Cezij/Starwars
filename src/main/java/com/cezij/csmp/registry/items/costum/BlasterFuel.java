package com.cezij.csmp.registry.items.costum;

import com.cezij.csmp.SmpMod;
import com.cezij.csmp.registry.items.ModFoodComponents;
import eu.pb4.polymer.api.item.PolymerItem;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.Nullable;

public class BlasterFuel extends ArrowItem implements PolymerItem {
    public BlasterFuel(Settings settings) {
        super(settings);
    }


    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return Items.ARROW;
    }
    public static void registerItems(){
        Registry.register(Registry.ITEM,new Identifier(SmpMod.MOD_ID,"blaster_fuel"),new BlasterFuel(new Item.Settings().group(ItemGroup.COMBAT).food(ModFoodComponents.POISON)));
    }
}
