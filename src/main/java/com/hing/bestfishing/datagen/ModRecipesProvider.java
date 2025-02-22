package com.hing.bestfishing.datagen;

import com.hing.bestfishing.BestFishingMod;
import com.hing.bestfishing.item.ModItems;
import com.hing.bestfishing.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SHENGYUPIAN,3)
                .input(ModItemTags.MOD_FISH)
                .criterion(hasItem(Items.FISHING_ROD),conditionsFromTag(ModItemTags.MOD_FISH))
                .offerTo(exporter,new Identifier(BestFishingMod.MOD_ID,"shengyupian"));
    }
}
