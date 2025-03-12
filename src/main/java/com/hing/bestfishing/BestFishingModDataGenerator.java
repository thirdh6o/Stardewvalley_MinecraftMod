package com.hing.bestfishing;

import com.hing.bestfishing.datagen.*;
import com.hing.bestfishing.world.feature.ModConfiguredFeatures;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import com.hing.bestfishing.world.feature.ModPlaceFeatures;

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
		pack.addProvider(ModWorldGenerator::new);
		pack.addProvider(ModAdvancementProvider::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlaceFeatures::bootstrap);
	//	registryBuilder.addRegistry(RegistryKeys.DIMENSION_TYPE, ModDimensionTypeRegistrar::bootstrap);
	}
}
