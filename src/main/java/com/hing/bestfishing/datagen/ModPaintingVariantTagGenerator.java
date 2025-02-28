package com.hing.bestfishing.datagen;

import com.hing.bestfishing.datagen.provider.PaintingTagProvider;
import com.hing.bestfishing.paintings.ModPaintings;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.PaintingVariantTags;

import java.util.concurrent.CompletableFuture;

public class ModPaintingVariantTagGenerator extends PaintingTagProvider {
    public ModPaintingVariantTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(PaintingVariantTags.PLACEABLE)
                .add(ModPaintings.PLANT)
                .add(ModPaintings.SUNSET)
                .add(ModPaintings.WANDERER);
    }
}
