package com.hing.bestfishing.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipesProvider extends FabricRecipeProvider {


    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }
  //  public static final List<ItemConvertible> ICE_ETHER = List.of(ModItems.RAW_ICE_ETHER);

    public void generate(Consumer<RecipeJsonProvider> exporter) {
        // 这里可以添加我们的配方
        //ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,ModBlocks.ICE_ETHER_ORE,1)

    }


}
