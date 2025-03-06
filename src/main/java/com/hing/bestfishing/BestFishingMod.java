package com.hing.bestfishing;

import com.hing.bestfishing.block.ModBlocks;
import com.hing.bestfishing.item.ModItemGroups;
import com.hing.bestfishing.item.ModItems;
import com.hing.bestfishing.paintings.ModPaintings;
import com.hing.bestfishing.sounds.ModSounds;
import com.hing.bestfishing.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BestFishingMod implements ModInitializer {
	public static final String MOD_ID = "bestfishing-mod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.registerModItems();
		ModItemGroups.registerModItemGroups();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();
		ModPaintings.registerPaintings();
		ModWorldGeneration.generateModWorldGen();
		LOGGER.info("Hello Fabric world!");
	}
}