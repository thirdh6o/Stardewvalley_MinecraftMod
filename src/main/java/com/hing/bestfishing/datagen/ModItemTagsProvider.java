package com.hing.bestfishing.datagen;

import com.hing.bestfishing.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.render.entity.feature.IronGolemCrackFeatureRenderer;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;


public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModItemTags.SUGAR_INGREDIENTS)
                .add(Items.SUGAR);
        getOrCreateTagBuilder(ModItemTags.METAL)
                .add(Items.IRON_INGOT)
                .add(Items.GOLD_INGOT)
                .add(Items.COPPER_INGOT)
                .add(Items.NETHERITE_INGOT);
    }
}
