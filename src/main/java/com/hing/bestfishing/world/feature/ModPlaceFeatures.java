package com.hing.bestfishing.world.feature;

import com.hing.bestfishing.BestFishingMod;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlaceFeatures {


    public static final RegistryKey<PlacedFeature> BUTTERCUPS_PLACED = registerKey("buttercups_placed");


    public static void bootstrap(Registerable<PlacedFeature> context) {
        var registryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);


        register(context,BUTTERCUPS_PLACED,registryEntryLookup.getOrThrow(ModConfiguredFeatures.BUTTERCUPS_KEY),
        RarityFilterPlacementModifier.of(4),
        SquarePlacementModifier.of(),
        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,BiomePlacementModifier.of());
    }
    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BestFishingMod.MOD_ID,name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, java.util.List.of(modifiers));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 java.util.List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
