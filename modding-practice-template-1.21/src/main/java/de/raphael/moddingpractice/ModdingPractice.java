package de.raphael.moddingpractice;

import de.raphael.moddingpractice.block.ModBlocks;
import de.raphael.moddingpractice.item.ModItemGroups;
import de.raphael.moddingpractice.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModdingPractice implements ModInitializer {
	public static final String MOD_ID = "modding-practice";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		registerFuelItems();
	}

	private void registerFuelItems() {
		LOGGER.info("Registering fuel items for" + ModdingPractice.MOD_ID);
		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 2000);
	}
}