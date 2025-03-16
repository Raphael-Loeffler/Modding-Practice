package de.raphael.moddingpractice.item;

import de.raphael.moddingpractice.ModdingPractice;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModFuelItems {
    public static void registerFuelItems() {
        ModdingPractice.LOGGER.info("Registering fuel items for " + ModdingPractice.MOD_ID);
        FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 1000);
    }
}
