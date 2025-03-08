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
    public static final RegistryKey<PlacedFeature> BLACKBERRY_PLACED = registerKey("blackberry_placed");
    public static final RegistryKey<PlacedFeature> CAVE_CARROT_PLACED = registerKey("cave_carrot_placed");
    public static final RegistryKey<PlacedFeature> CHANTERELLE_PLACED = registerKey("chanterelle_placed");
    public static final RegistryKey<PlacedFeature> COCONUT_PLACED = registerKey("coconut_placed");
    public static final RegistryKey<PlacedFeature> COMMON_MUSHROOM_PLACED = registerKey("common_mushroom_placed");
    public static final RegistryKey<PlacedFeature> CROCUS_PLACED = registerKey("crocus_placed");
    public static final RegistryKey<PlacedFeature> CRYSTAL_FRUIT_PLACED = registerKey("crystal_fruit_placed");
    public static final RegistryKey<PlacedFeature> DAFFODIL_PLACED = registerKey("daffodil_placed");
    public static final RegistryKey<PlacedFeature> DANDELION_PLACED = registerKey("dandelion_placed");
    public static final RegistryKey<PlacedFeature> FIDDLEHEAD_FERN_PLACED = registerKey("fiddlehead_fern_placed");
    public static final RegistryKey<PlacedFeature> GINGER_PLACED = registerKey("ginger_placed");
    public static final RegistryKey<PlacedFeature> HAZELNUT_PLACED = registerKey("hazelnut_placed");
    public static final RegistryKey<PlacedFeature> HOLLY_PLACED = registerKey("holly_placed");
    public static final RegistryKey<PlacedFeature> LEEK_PLACED = registerKey("leek_placed");
    public static final RegistryKey<PlacedFeature> MOREL_PLACED = registerKey("morel_placed");
    public static final RegistryKey<PlacedFeature> PURPLE_MUSHROOM_PLACED = registerKey("purple_mushroom_placed");
    public static final RegistryKey<PlacedFeature> RED_MUSHROOM_PLACED = registerKey("red_mushroom_placed");
    public static final RegistryKey<PlacedFeature> SALMONBERRY_PLACED = registerKey("salmonberry_placed");
    public static final RegistryKey<PlacedFeature> SNOW_YAM_PLACED = registerKey("snow_yam_placed");
    public static final RegistryKey<PlacedFeature> SPICE_BERRY_PLACED = registerKey("spice_berry_placed");
    public static final RegistryKey<PlacedFeature> SPRING_ONION_PLACED = registerKey("spring_onion_placed");
    public static final RegistryKey<PlacedFeature> SWEET_PEA_PLACED = registerKey("sweet_pea_placed");
    public static final RegistryKey<PlacedFeature> WILD_HORSERADISH_PLACED = registerKey("wild_horseradish_placed");
    public static final RegistryKey<PlacedFeature> WILD_PLUM_PLACED = registerKey("wild_plum_placed");
    public static final RegistryKey<PlacedFeature> WINTER_ROOT_PLACED = registerKey("winter_root_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var registryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, BLACKBERRY_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.BLACKBERRY_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, CAVE_CARROT_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.CAVE_CARROT_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, CHANTERELLE_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.CHANTERELLE_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, COCONUT_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.COCONUT_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, COMMON_MUSHROOM_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.COMMON_MUSHROOM_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, CROCUS_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.CROCUS_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, CRYSTAL_FRUIT_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.CRYSTAL_FRUIT_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, DAFFODIL_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.DAFFODIL_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, DANDELION_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.DANDELION_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, FIDDLEHEAD_FERN_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.FIDDLEHEAD_FERN_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, GINGER_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.GINGER_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, HAZELNUT_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.HAZELNUT_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, HOLLY_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.HOLLY_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, LEEK_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.LEEK_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, MOREL_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.MOREL_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PURPLE_MUSHROOM_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.PURPLE_MUSHROOM_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, RED_MUSHROOM_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.RED_MUSHROOM_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, SALMONBERRY_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.SALMONBERRY_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, SNOW_YAM_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.SNOW_YAM_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, SPICE_BERRY_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.SPICE_BERRY_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, SPRING_ONION_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.SPRING_ONION_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, SWEET_PEA_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.SWEET_PEA_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, WILD_HORSERADISH_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.WILD_HORSERADISH_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, WILD_PLUM_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.WILD_PLUM_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, WINTER_ROOT_PLACED, registryEntryLookup.getOrThrow(ModConfiguredFeatures.WINTER_ROOT_KEY),
                RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
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
