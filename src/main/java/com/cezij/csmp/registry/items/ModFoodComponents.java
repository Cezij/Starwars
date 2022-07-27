package com.cezij.csmp.registry.items;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents extends FoodComponents {
   // public static final FoodComponent GRABAS = new FoodComponent.Builder().hunger(1000).saturationModifier(1000.0F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 40000, 50), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 60000, 50), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 600000, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600000, 50), 1.0F).alwaysEdible().build();
    public static final FoodComponent POISON = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f).statusEffect(new StatusEffectInstance(StatusEffects.POISON,5000,50),0.9f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE,20,20000000),0.9f).alwaysEdible().build();
//ismon is the worts cus he s bad nobody likkes him idk what to say abt him
}
