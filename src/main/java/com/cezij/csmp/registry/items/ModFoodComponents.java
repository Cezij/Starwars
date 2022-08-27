package com.cezij.csmp.registry.items;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents extends FoodComponents {
   // public static final FoodComponent GRABAS = new FoodComponent.Builder().hunger(1000).saturationModifier(1000.0F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 40000, 50), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 60000, 50), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 600000, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600000, 50), 1.0F).alwaysEdible().build();
    public static final FoodComponent POISON = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f).statusEffect(new StatusEffectInstance(StatusEffects.POISON,5000,50),0.9f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE,20,20000000),0.9f).alwaysEdible().build();
    public static final FoodComponent DRUGS = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,1800,255),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,1200,5),0.9f).statusEffect(new StatusEffectInstance(StatusEffects.POISON,200,2555),0.01f).alwaysEdible().build(); //nothing sus
    public static final FoodComponent CRYSTAL_METH = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,3600,510),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,2400,20),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.POISON,400,10000),0.2f).alwaysEdible().build(); //nothing sus
    public static final FoodComponent BEER = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f).statusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN,3984639,40),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,5000,100),1.0f).build();

//ismon is the worts cus he s bad nobody likkes him idk what to say abt him
}
