package com.cezij.csmp;

import com.cezij.csmp.registry.blocks.ModBlocks;
//import com.cezij.csmp.registry.items.costum.BlueSabor;
import com.cezij.csmp.registry.items.costum.*;
import com.cezij.csmp.registry.items.ModItems;
import com.cezij.csmp.registry.items.costum.twosided.*;
import com.cezij.csmp.registry.structures.ModStructures;
import com.cezij.csmp.villager.ModBlackVillager;
import net.fabricmc.api.ModInitializer;
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
		BlueSabor.registerItems();
		GreenSabor.registerItems();
		GoldSabor.registerItems();
		OrangeSabor.registerItems();
		PurpleSabor.registerItems();
		ModBlackVillager.registerVillagers();
		ModBlackVillager.registerTrades();
		BlasterFuel.registerItems();
		ModBlaster.registerItems();
		DarkSabor.registerItems();
		ModStructures.registerStructureFeatures();
		RedSabor.registerItems();
		TwoSidedBlueSabor.registerItems();
		TwoSidedGoldSabor.registerItems();
		TwoSidedGreenSabor.registerItems();
		TwoSidedOrangeSabor.registerItems();
		TwoSidedPurpleSabor.registerItems();
		TwoSidedRedSabor.registerItems();



		LOGGER.info("GLaDOS.jar loading [===========100%=========]");
	}
}
