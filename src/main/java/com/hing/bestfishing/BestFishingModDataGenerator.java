package com.hing.bestfishing;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import com.hing.bestfishing.datagen.ModEnLangProvider;
import com.hing.bestfishing.datagen.ModItemTagsProvider;
import com.hing.bestfishing.datagen.ModLootTableProvider;
import com.hing.bestfishing.datagen.ModZhLangProvider;

public class BestFishingModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {


		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModEnLangProvider::new);
		pack.addProvider(ModItemTagsProvider::new);
		pack.addProvider(ModZhLangProvider::new);
	}
}
