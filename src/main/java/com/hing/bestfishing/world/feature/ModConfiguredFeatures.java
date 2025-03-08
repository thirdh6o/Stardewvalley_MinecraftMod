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
    public static final RegistryKey<ConfiguredFeature<?,?>> BLACKBERRY_KEY = registerKey("blackberry");
    public static final RegistryKey<ConfiguredFeature<?,?>> CAVE_CARROT_KEY = registerKey("cave_carrot");
    public static final RegistryKey<ConfiguredFeature<?,?>> CHANTERELLE_KEY = registerKey("chanterelle");
    public static final RegistryKey<ConfiguredFeature<?,?>> COCONUT_KEY = registerKey("coconut");
    public static final RegistryKey<ConfiguredFeature<?,?>> COMMON_MUSHROOM_KEY = registerKey("common_mushroom");
    public static final RegistryKey<ConfiguredFeature<?,?>> CROCUS_KEY = registerKey("crocus");
    public static final RegistryKey<ConfiguredFeature<?,?>> CRYSTAL_FRUIT_KEY = registerKey("crystal_fruit");
    public static final RegistryKey<ConfiguredFeature<?,?>> DAFFODIL_KEY = registerKey("daffodil");
    public static final RegistryKey<ConfiguredFeature<?,?>> DANDELION_KEY = registerKey("dandelion");
    public static final RegistryKey<ConfiguredFeature<?,?>> FIDDLEHEAD_FERN_KEY = registerKey("fiddlehead_fern");
    public static final RegistryKey<ConfiguredFeature<?,?>> GINGER_KEY = registerKey("ginger");
    public static final RegistryKey<ConfiguredFeature<?,?>> HAZELNUT_KEY = registerKey("hazelnut");
    public static final RegistryKey<ConfiguredFeature<?,?>> HOLLY_KEY = registerKey("holly");
    public static final RegistryKey<ConfiguredFeature<?,?>> LEEK_KEY = registerKey("leek");
    public static final RegistryKey<ConfiguredFeature<?,?>> MOREL_KEY = registerKey("morel");
    public static final RegistryKey<ConfiguredFeature<?,?>> PURPLE_MUSHROOM_KEY = registerKey("purple_mushroom");
    public static final RegistryKey<ConfiguredFeature<?,?>> RED_MUSHROOM_KEY = registerKey("red_mushroom");
    public static final RegistryKey<ConfiguredFeature<?,?>> SALMONBERRY_KEY = registerKey("salmonberry");
    public static final RegistryKey<ConfiguredFeature<?,?>> SNOW_YAM_KEY = registerKey("snow_yam");
    public static final RegistryKey<ConfiguredFeature<?,?>> SPICE_BERRY_KEY = registerKey("spice_berry");
    public static final RegistryKey<ConfiguredFeature<?,?>> SPRING_ONION_KEY = registerKey("spring_onion");
    public static final RegistryKey<ConfiguredFeature<?,?>> SWEET_PEA_KEY = registerKey("sweet_pea");
    public static final RegistryKey<ConfiguredFeature<?,?>> WILD_HORSERADISH_KEY = registerKey("wild_horseradish");
    public static final RegistryKey<ConfiguredFeature<?,?>> WILD_PLUM_KEY = registerKey("wild_plum");
    public static final RegistryKey<ConfiguredFeature<?,?>> WINTER_ROOT_KEY = registerKey("winter_root");
    public static RegistryKey<ConfiguredFeature<?,?>> registerKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE,new Identifier(BestFishingMod.MOD_ID,name));
    }
    public static void bootstrap(Registerable<ConfiguredFeature<?,?>> context){
        register(context, BLACKBERRY_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLACKBERRY)))));
        register(context, CAVE_CARROT_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.CAVE_CARROT)))));
        register(context, CHANTERELLE_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.CHANTERELLE)))));
        register(context, COCONUT_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.COCONUT)))));
        register(context, COMMON_MUSHROOM_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.COMMON_MUSHROOM)))));
        register(context, CROCUS_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.CROCUS)))));
        register(context, CRYSTAL_FRUIT_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.CRYSTAL_FRUIT)))));
        register(context, DAFFODIL_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.DAFFODIL)))));
        register(context, DANDELION_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.DANDELION)))));
        register(context, FIDDLEHEAD_FERN_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.FIDDLEHEAD_FERN)))));
        register(context, GINGER_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GINGER)))));
        register(context, HAZELNUT_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.HAZELNUT)))));
        register(context, HOLLY_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.HOLLY)))));
        register(context, LEEK_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.LEEK)))));
        register(context, MOREL_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.MOREL)))));
        register(context, PURPLE_MUSHROOM_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PURPLE_MUSHROOM)))));
        register(context, RED_MUSHROOM_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.RED_MUSHROOM)))));
        register(context, SALMONBERRY_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SALMONBERRY)))));
        register(context, SNOW_YAM_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SNOW_YAM)))));
        register(context, SPICE_BERRY_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SPICE_BERRY)))));
        register(context, SPRING_ONION_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SPRING_ONION)))));
        register(context, SWEET_PEA_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SWEET_PEA)))));
        register(context, WILD_HORSERADISH_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WILD_HORSERADISH)))));
        register(context, WILD_PLUM_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WILD_PLUM)))));
        register(context, WINTER_ROOT_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WINTER_ROOT)))));
    }
    private static <FC extends FeatureConfig,F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?,?>> context, RegistryKey<ConfiguredFeature<?,?>> key, F feature, FC cofiguration){
        context.register(key,new ConfiguredFeature<>(feature,cofiguration));
}
}
