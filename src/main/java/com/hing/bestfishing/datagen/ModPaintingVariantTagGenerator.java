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
                .add(ModPaintings.ABIGAIL)
                .add(ModPaintings.ALEX)
                .add(ModPaintings.CAROLINE)
                .add(ModPaintings.CLINT)
                .add(ModPaintings.DEMETRIUS)
                .add(ModPaintings.DWARF)
                .add(ModPaintings.ELLIOTT)
                .add(ModPaintings.EMILY)
                .add(ModPaintings.EVELYN)
                .add(ModPaintings.GEORGE)
                .add(ModPaintings.GUS)
                .add(ModPaintings.HALEY)
                .add(ModPaintings.HARVEY)
                .add(ModPaintings.JAS)
                .add(ModPaintings.JODI)
                .add(ModPaintings.KENT)
                .add(ModPaintings.KROBUS)
                .add(ModPaintings.LEAH)
                .add(ModPaintings.LEO)
                .add(ModPaintings.LEWIS)
                .add(ModPaintings.LINUS)
                .add(ModPaintings.MARNIE)
                .add(ModPaintings.MARU)
                .add(ModPaintings.PAM)
                .add(ModPaintings.PENNY)
                .add(ModPaintings.PIERRE)
                .add(ModPaintings.ROBIN)
                .add(ModPaintings.SAM)
                .add(ModPaintings.SANDY)
                .add(ModPaintings.SEBASTIAN)
                .add(ModPaintings.SHANE)
                .add(ModPaintings.VINCENT)
                .add(ModPaintings.WILLY)
                .add(ModPaintings.WIZARD);
    }
}
