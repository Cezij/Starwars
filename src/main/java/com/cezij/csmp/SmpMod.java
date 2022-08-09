package com.cezij.csmp;

import com.cezij.csmp.registry.blocks.ModBlocks;
//import com.cezij.csmp.registry.items.costum.BlueSabor;
import com.cezij.csmp.registry.blocks.custom.GoofyBlock;
import com.cezij.csmp.registry.items.costum.*;
import com.cezij.csmp.registry.items.ModItems;
import com.cezij.csmp.registry.items.costum.crystals.*;
import com.cezij.csmp.registry.items.costum.drugs.Cocaine;
import com.cezij.csmp.registry.items.costum.drugs.CrystalMeth;
import com.cezij.csmp.registry.items.costum.drugs.Meth;
import com.cezij.csmp.registry.items.costum.twosided.*;
import com.cezij.csmp.registry.structures.ModStructures;
import com.cezij.csmp.villager.ModBlackVillager;
import eu.pb4.polymer.api.resourcepack.PolymerModelData;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import eu.pb4.polymer.api.resourcepack.PolymerRPUtils;



public class SmpMod implements ModInitializer {
	public static final String MOD_ID = "csmp";
	public static final Logger LOGGER = LoggerFactory.getLogger("StarCraftSMP");

	@Override
	public void onInitialize() {
		LOGGER.info("GLaDOS.jar loading [===========50%          ]");
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		PolymerRPUtils.addAssetSource(MOD_ID);
		//statt
		BlueSabor.registerItems();
		GoldSabor.registerItems();
		GreenSabor.registerItems();
		OrangeSabor.registerItems();
		PurpleSabor.registerItems();
		RedSabor.registerItems();



		TwoSidedBlueSabor.registerItems();
		TwoSidedGoldSabor.registerItems();
		TwoSidedGreenSabor.registerItems();
		TwoSidedOrangeSabor.registerItems();
		TwoSidedPurpleSabor.registerItems();
		TwoSidedRedSabor.registerItems();

		BlueCrystal.registerItems();
		GoldCrystal.registerItems();
		GreenCrystal.registerItems();
		OrangeCrystal.registerItems();
		PurpleCrystal.registerItems();
		RedCrystal.registerItems();

		DarkSabor.registerItems();

		BlasterFuel.registerItems();
		ModBlaster.registerItems();

		ModCrossGuard.registerItems();

		ModBlackVillager.registerVillagers();
		ModBlackVillager.registerTrades();

		//drugs
		Cocaine.registerItems();
		Meth.registerItems();
		CrystalMeth.registerItems();
		//--

		//blocks
		GoofyBlock.registerBlocks();
		//--


		ModStructures.registerStructureFeatures();


		LOGGER.info("GLaDOS.jar loading [===========100%=========]");
	}
}
