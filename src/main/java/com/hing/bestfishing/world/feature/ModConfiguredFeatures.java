package com.hing.bestfishing.world.feature;
import com.hing.bestfishing.BestFishingMod;
import com.hing.bestfishing.block.ModBlocks;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

import net.minecraft.util.Identifier;

import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?,?>> BUTTERCUPS_KEY = registerKey("flower_buttercups");

    public static RegistryKey<ConfiguredFeature<?,?>> registerKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE,new Identifier(BestFishingMod.MOD_ID,name));
    }

    public static void bootstrap(Registerable<ConfiguredFeature<?,?>> context){

        register(context,BUTTERCUPS_KEY,Feature.FLOWER,
        ConfiguredFeatures.createRandomPatchFeatureConfig(64,PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BUTTERCUPS)))));



    }


    private static <FC extends FeatureConfig,F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?,?>> context,
    RegistryKey<ConfiguredFeature<?,?>> key, F feature, FC cofiguration){
context.register(key,new ConfiguredFeature<>(feature,cofiguration));
}
}
