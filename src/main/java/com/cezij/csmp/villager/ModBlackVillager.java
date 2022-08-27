package com.cezij.csmp.villager;

import com.cezij.csmp.SmpMod;
import com.cezij.csmp.registry.blocks.ModBlocks;
import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModBlackVillager {

    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType>type){
        return Registry.register(Registry.VILLAGER_PROFESSION,new Identifier(SmpMod.MOD_ID, name), VillagerProfessionBuilder.create().id(new Identifier(SmpMod.MOD_ID, name)).workstation(type).workSound(SoundEvents.ENTITY_VILLAGER_WORK_FARMER).build());

    }

    public static final PointOfInterestType JUMPY_POI = registerPOI("jumpy_poi", Blocks.ANCIENT_DEBRIS);
    public static VillagerProfession BLACK_VILLAGER = registerProfession("blackvillager",RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(SmpMod.MOD_ID, "jumpy_poi")));

    public static PointOfInterestType registerPOI(String name, Block block){
        return PointOfInterestHelper.register(new Identifier(SmpMod.MOD_ID,name),1,10, ImmutableSet.copyOf(block.getStateManager().getStates()));

    }

    public static void registerTrades(){
        TradeOfferHelper.registerVillagerOffers(BLACK_VILLAGER,1,
                factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.COBBLESTONE,1),
                    new ItemStack(Items.DIAMOND_BLOCK,10),
                    6,2,0.001f

            ));
        });

    }



    public  static void registerVillagers(){
        SmpMod.LOGGER.debug("Registring villagers");
    }



}
