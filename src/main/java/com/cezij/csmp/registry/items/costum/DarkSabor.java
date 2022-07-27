package com.cezij.csmp.registry.items.costum;

import com.cezij.csmp.SmpMod;
import com.cezij.csmp.registry.items.ModToolMaterial;
import eu.pb4.polymer.api.item.PolymerItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class DarkSabor extends SwordItem implements PolymerItem {



    public DarkSabor(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    public UseAction getUseAction(ItemStack stack) { return UseAction.BLOCK; }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        user.setCurrentHand(hand);
        return TypedActionResult.consume(itemStack);
    }


    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return Items.NETHERITE_SWORD;
    }
    public static void registerItems(){
        Registry.register(Registry.ITEM,new Identifier(SmpMod.MOD_ID,"dark_saber"),new DarkSabor(ModToolMaterial.KYBER_CRYSTAL,100000,1.0f,new Settings().group(ItemGroup.COMBAT).fireproof()));

    }
}
