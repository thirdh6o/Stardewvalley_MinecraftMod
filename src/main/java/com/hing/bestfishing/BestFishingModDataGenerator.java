package com.hing.bestfishing;

import com.hing.bestfishing.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BestFishingModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {


		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModEnLangProvider::new);
		pack.addProvider(ModItemTagsProvider::new);
		pack.addProvider(ModZhLangProvider::new);
		pack.addProvider(ModModelsProvider::new);
		pack.addProvider(ModRecipesProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModPaintingVariantTagGenerator::new);
	}
}
