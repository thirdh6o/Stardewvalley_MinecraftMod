package com.hing.bestfishing.world.gen;

import com.hing.bestfishing.world.feature.ModPlaceFeatures;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModFlowerGeneration {
    public static void generateFlower(){
   
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
        GenerationStep.Feature.VEGETAL_DECORATION, ModPlaceFeatures.BUTTERCUPS_PLACED);
}
    

}
