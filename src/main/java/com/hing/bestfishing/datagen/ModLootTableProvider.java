package com.hing.bestfishing.datagen;

import com.hing.bestfishing.block.ModBlocks;
import com.hing.bestfishing.block.custom.CauliFlower;
import com.hing.bestfishing.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import com.hing.bestfishing.block.custom.*;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }
    @Override
    public void generate() {



        /* 这里的作物掉落物是通过LootCondition来判断的
           倘若作物的生长阶段为5，那么掉落的物品为ModItems.STRAWBERRY，否则掉落的物品为ModItems.STRAWBERRY_SEEDS
           不带种子的作物可以参考POTATO、CARROT等作物的掉落物
         */

        BlockStatePropertyLootCondition.Builder builder0 =
                BlockStatePropertyLootCondition.builder(ModBlocks.POWDERMELON)
                        .properties(StatePredicate.Builder.create().exactMatch(CauliFlower.AGE, 5));
        addDrop(ModBlocks.POWDERMELON, cropDrops(ModBlocks.POWDERMELON, ModItems.POWDERMELON, ModItems.POWDERMELON_SEEDS, builder0));



        BlockStatePropertyLootCondition.Builder builder =
                BlockStatePropertyLootCondition.builder(ModBlocks.CAULIFLOWER)
                        .properties(StatePredicate.Builder.create().exactMatch(CauliFlower.AGE, 5));
        addDrop(ModBlocks.CAULIFLOWER, cropDrops(ModBlocks.CAULIFLOWER, ModItems.CAULIFLOWER, ModItems.CAULIFLOWER_SEEDS, builder));

        BlockStatePropertyLootCondition.Builder builder1 =
                BlockStatePropertyLootCondition.builder(ModBlocks.AMARANTH)
                        .properties(StatePredicate.Builder.create().exactMatch(Amaranth.AGE, 5));
        addDrop(ModBlocks.AMARANTH, cropDrops(ModBlocks.AMARANTH, ModItems.AMARANTH, ModItems.AMARANTH_SEEDS, builder1));

        BlockStatePropertyLootCondition.Builder builder2 =
                BlockStatePropertyLootCondition.builder(ModBlocks.ARTICHOKE)
                        .properties(StatePredicate.Builder.create().exactMatch(Artichoke.AGE, 5));
        addDrop(ModBlocks.ARTICHOKE, cropDrops(ModBlocks.ARTICHOKE, ModItems.ARTICHOKE, ModItems.ARTICHOKE_SEEDS, builder2));

        BlockStatePropertyLootCondition.Builder builder3 =
                BlockStatePropertyLootCondition.builder(ModBlocks.BEET)
                        .properties(StatePredicate.Builder.create().exactMatch(Beet.AGE, 5));
        addDrop(ModBlocks.BEET, cropDrops(ModBlocks.BEET, ModItems.BEET, ModItems.BEET_SEEDS, builder3));

        BlockStatePropertyLootCondition.Builder builder4 =
                BlockStatePropertyLootCondition.builder(ModBlocks.BLUEBERRY)
                        .properties(StatePredicate.Builder.create().exactMatch(Blueberry.AGE, 5));
        addDrop(ModBlocks.BLUEBERRY, cropDrops(ModBlocks.BLUEBERRY, ModItems.BLUEBERRY, ModItems.BLUEBERRY_SEEDS, builder4));

        BlockStatePropertyLootCondition.Builder builder5 =
                BlockStatePropertyLootCondition.builder(ModBlocks.BLUE_JAZZ)
                        .properties(StatePredicate.Builder.create().exactMatch(Blue_Jazz_Block.AGE, 5));
        addDrop(ModBlocks.BLUE_JAZZ, cropDrops(ModBlocks.BLUE_JAZZ, ModItems.BLUE_JAZZ, ModItems.BLUE_JAZZ_SEEDS, builder5));

        BlockStatePropertyLootCondition.Builder builder6 =
                BlockStatePropertyLootCondition.builder(ModBlocks.BOK_CHOY)
                        .properties(StatePredicate.Builder.create().exactMatch(Bok_choy.AGE, 5));
        addDrop(ModBlocks.BOK_CHOY, cropDrops(ModBlocks.BOK_CHOY, ModItems.BOK_CHOY, ModItems.BOK_CHOY_SEEDS, builder6));

        BlockStatePropertyLootCondition.Builder builder7 =
                BlockStatePropertyLootCondition.builder(ModBlocks.BROCCOLI)
                        .properties(StatePredicate.Builder.create().exactMatch(Broccoli.AGE, 5));
        addDrop(ModBlocks.BROCCOLI, cropDrops(ModBlocks.BROCCOLI, ModItems.BROCCOLI, ModItems.BROCCOLI_SEEDS, builder7));

        BlockStatePropertyLootCondition.Builder builder8 =
                BlockStatePropertyLootCondition.builder(ModBlocks.CACTUS_FRUIT)
                        .properties(StatePredicate.Builder.create().exactMatch(Cactus_fruit.AGE, 5));
        addDrop(ModBlocks.CACTUS_FRUIT, cropDrops(ModBlocks.CACTUS_FRUIT, ModItems.CACTUS_FRUIT, ModItems.CACTUS_FRUIT_SEEDS, builder8));

        BlockStatePropertyLootCondition.Builder builder9 =
                BlockStatePropertyLootCondition.builder(ModBlocks.CARROT)
                        .properties(StatePredicate.Builder.create().exactMatch(Carrot.AGE, 5));
        addDrop(ModBlocks.CARROT, cropDrops(ModBlocks.CARROT, ModItems.CARROT, ModItems.CARROT_SEEDS, builder9));

        BlockStatePropertyLootCondition.Builder builder11 =
                BlockStatePropertyLootCondition.builder(ModBlocks.CORN)
                        .properties(StatePredicate.Builder.create().exactMatch(Corn.AGE, 5));
        addDrop(ModBlocks.CORN, cropDrops(ModBlocks.CORN, ModItems.CORN, ModItems.CORN_SEEDS, builder11));

        BlockStatePropertyLootCondition.Builder builder12 =
                BlockStatePropertyLootCondition.builder(ModBlocks.CRANBERRIES)
                        .properties(StatePredicate.Builder.create().exactMatch(Cranberries.AGE, 5));
        addDrop(ModBlocks.CRANBERRIES, cropDrops(ModBlocks.CRANBERRIES, ModItems.CRANBERRIES, ModItems.CRANBERRIES_SEEDS, builder12));

        BlockStatePropertyLootCondition.Builder builder13 =
                BlockStatePropertyLootCondition.builder(ModBlocks.EGGPLANT)
                        .properties(StatePredicate.Builder.create().exactMatch(Eggplant.AGE, 5));
        addDrop(ModBlocks.EGGPLANT, cropDrops(ModBlocks.EGGPLANT, ModItems.EGGPLANT, ModItems.EGGPLANT_SEEDS, builder13));

        BlockStatePropertyLootCondition.Builder builder14 =
                BlockStatePropertyLootCondition.builder(ModBlocks.FAIRY_ROSE)
                        .properties(StatePredicate.Builder.create().exactMatch(Fairy_rose.AGE, 5));
        addDrop(ModBlocks.FAIRY_ROSE, cropDrops(ModBlocks.FAIRY_ROSE, ModItems.FAIRY_ROSE, ModItems.FAIRY_ROSE_SEEDS, builder14));

        BlockStatePropertyLootCondition.Builder builder15 =
                BlockStatePropertyLootCondition.builder(ModBlocks.FIBER)
                        .properties(StatePredicate.Builder.create().exactMatch(Fiber.AGE, 5));
        addDrop(ModBlocks.FIBER, cropDrops(ModBlocks.FIBER, ModItems.FIBER, ModItems.FIBER_SEEDS, builder15));

        BlockStatePropertyLootCondition.Builder builder16 =
                BlockStatePropertyLootCondition.builder(ModBlocks.GARLIC)
                        .properties(StatePredicate.Builder.create().exactMatch(Garlic.AGE, 5));
        addDrop(ModBlocks.GARLIC, cropDrops(ModBlocks.GARLIC, ModItems.GARLIC, ModItems.GARLIC_SEEDS, builder16));

        BlockStatePropertyLootCondition.Builder builder17 =
                BlockStatePropertyLootCondition.builder(ModBlocks.GRAPE)
                        .properties(StatePredicate.Builder.create().exactMatch(Grape.AGE, 5));
        addDrop(ModBlocks.GRAPE, cropDrops(ModBlocks.GRAPE, ModItems.GRAPE, ModItems.GRAPE_SEEDS, builder17));

        BlockStatePropertyLootCondition.Builder builder18 =
                BlockStatePropertyLootCondition.builder(ModBlocks.GREEN_BEAN)
                        .properties(StatePredicate.Builder.create().exactMatch(Green_bean.AGE, 5));
        addDrop(ModBlocks.GREEN_BEAN, cropDrops(ModBlocks.GREEN_BEAN, ModItems.GREEN_BEAN, ModItems.GREEN_BEAN_SEEDS, builder18));

        BlockStatePropertyLootCondition.Builder builder19 =
                BlockStatePropertyLootCondition.builder(ModBlocks.HOPS)
                        .properties(StatePredicate.Builder.create().exactMatch(Hops.AGE, 5));
        addDrop(ModBlocks.HOPS, cropDrops(ModBlocks.HOPS, ModItems.HOPS, ModItems.HOPS_SEEDS, builder19));

        BlockStatePropertyLootCondition.Builder builder20 =
                BlockStatePropertyLootCondition.builder(ModBlocks.HOT_PEPPER)
                        .properties(StatePredicate.Builder.create().exactMatch(Hot_pepper.AGE, 5));
        addDrop(ModBlocks.HOT_PEPPER, cropDrops(ModBlocks.HOT_PEPPER, ModItems.HOT_PEPPER, ModItems.HOT_PEPPER_SEEDS, builder20));

        BlockStatePropertyLootCondition.Builder builder21 =
                BlockStatePropertyLootCondition.builder(ModBlocks.KALE)
                        .properties(StatePredicate.Builder.create().exactMatch(Kale_Block.AGE, 5));
        addDrop(ModBlocks.KALE, cropDrops(ModBlocks.KALE, ModItems.KALE, ModItems.KALE_SEEDS, builder21));

        BlockStatePropertyLootCondition.Builder builder22 =
                BlockStatePropertyLootCondition.builder(ModBlocks.MELON)
                        .properties(StatePredicate.Builder.create().exactMatch(Melon_Block.AGE, 5));
        addDrop(ModBlocks.MELON, cropDrops(ModBlocks.MELON, ModItems.MELON, ModItems.MELON_SEEDS, builder22));

        BlockStatePropertyLootCondition.Builder builder23 =
                BlockStatePropertyLootCondition.builder(ModBlocks.PARSNIP)
                        .properties(StatePredicate.Builder.create().exactMatch(Parsnip_Block.AGE, 5));
        addDrop(ModBlocks.PARSNIP, cropDrops(ModBlocks.PARSNIP, ModItems.PARSNIP, ModItems.PARSNIP_SEEDS, builder23));

        BlockStatePropertyLootCondition.Builder builder24 =
                BlockStatePropertyLootCondition.builder(ModBlocks.PINEAPPLE)
                        .properties(StatePredicate.Builder.create().exactMatch(Pineapple_Block.AGE, 5));
        addDrop(ModBlocks.PINEAPPLE, cropDrops(ModBlocks.PINEAPPLE, ModItems.PINEAPPLE, ModItems.PINEAPPLE_SEEDS, builder24));

        BlockStatePropertyLootCondition.Builder builder25 =
                BlockStatePropertyLootCondition.builder(ModBlocks.POPPY)
                        .properties(StatePredicate.Builder.create().exactMatch(Poppy_Block.AGE, 5));
        addDrop(ModBlocks.POPPY, cropDrops(ModBlocks.POPPY, ModItems.POPPY, ModItems.POPPY_SEEDS, builder25));

        BlockStatePropertyLootCondition.Builder builder26 =
                BlockStatePropertyLootCondition.builder(ModBlocks.POTATO)
                        .properties(StatePredicate.Builder.create().exactMatch(Potato_Block.AGE, 5));
        addDrop(ModBlocks.POTATO, cropDrops(ModBlocks.POTATO, ModItems.POTATO, ModItems.POTATO_SEEDS, builder26));

        BlockStatePropertyLootCondition.Builder builder27 =
                BlockStatePropertyLootCondition.builder(ModBlocks.PUMPKIN)
                        .properties(StatePredicate.Builder.create().exactMatch(Pumpkin_Block.AGE, 5));
        addDrop(ModBlocks.PUMPKIN, cropDrops(ModBlocks.PUMPKIN, ModItems.PUMPKIN, ModItems.PUMPKIN_SEEDS, builder27));

        BlockStatePropertyLootCondition.Builder builder28 =
                BlockStatePropertyLootCondition.builder(ModBlocks.QI_FRUIT)
                        .properties(StatePredicate.Builder.create().exactMatch(Qi_Fruit_Block.AGE, 5));
        addDrop(ModBlocks.QI_FRUIT, cropDrops(ModBlocks.QI_FRUIT, ModItems.QI_FRUIT, ModItems.QI_FRUIT_SEEDS, builder28));

        BlockStatePropertyLootCondition.Builder builder29 =
                BlockStatePropertyLootCondition.builder(ModBlocks.RADISH)
                        .properties(StatePredicate.Builder.create().exactMatch(Radish_Block.AGE, 5));
        addDrop(ModBlocks.RADISH, cropDrops(ModBlocks.RADISH, ModItems.RADISH, ModItems.RADISH_SEEDS, builder29));

        BlockStatePropertyLootCondition.Builder builder30 =
                BlockStatePropertyLootCondition.builder(ModBlocks.RARE)
                        .properties(StatePredicate.Builder.create().exactMatch(Rare_Block.AGE, 5));
        addDrop(ModBlocks.RARE, cropDrops(ModBlocks.RARE, ModItems.RARE, ModItems.RARE_SEEDS, builder30));

        BlockStatePropertyLootCondition.Builder builder31 =
                BlockStatePropertyLootCondition.builder(ModBlocks.RED_CABBAGE)
                        .properties(StatePredicate.Builder.create().exactMatch(Red_Cabbage_Block.AGE, 5));
        addDrop(ModBlocks.RED_CABBAGE, cropDrops(ModBlocks.RED_CABBAGE, ModItems.RED_CABBAGE, ModItems.RED_CABBAGE_SEEDS, builder31));

        BlockStatePropertyLootCondition.Builder builder32 =
                BlockStatePropertyLootCondition.builder(ModBlocks.RHUBARB)
                        .properties(StatePredicate.Builder.create().exactMatch(Rhubarb_Block.AGE, 5));
        addDrop(ModBlocks.RHUBARB, cropDrops(ModBlocks.RHUBARB, ModItems.RHUBARB, ModItems.RHUBARB_SEEDS, builder32));

        BlockStatePropertyLootCondition.Builder builder33 =
                BlockStatePropertyLootCondition.builder(ModBlocks.RICE)
                        .properties(StatePredicate.Builder.create().exactMatch(Rice_Block.AGE, 5));
        addDrop(ModBlocks.RICE, cropDrops(ModBlocks.RICE, ModItems.RICE, ModItems.RICE_SEEDS, builder33));

        BlockStatePropertyLootCondition.Builder builder34 =
                BlockStatePropertyLootCondition.builder(ModBlocks.SPANGLE)
                        .properties(StatePredicate.Builder.create().exactMatch(Spangle_Block.AGE, 5));
        addDrop(ModBlocks.SPANGLE, cropDrops(ModBlocks.SPANGLE, ModItems.SPANGLE, ModItems.SPANGLE_SEEDS, builder34));

        BlockStatePropertyLootCondition.Builder builder35 =
                BlockStatePropertyLootCondition.builder(ModBlocks.STARFRUIT)
                        .properties(StatePredicate.Builder.create().exactMatch(Starfruit_Block.AGE, 5));
        addDrop(ModBlocks.STARFRUIT, cropDrops(ModBlocks.STARFRUIT, ModItems.STARFRUIT, ModItems.STARFRUIT_SEEDS, builder35));

        BlockStatePropertyLootCondition.Builder builder36 =
                BlockStatePropertyLootCondition.builder(ModBlocks.STRAWBERRY)
                        .properties(StatePredicate.Builder.create().exactMatch(Strawberry_Block.AGE, 5));
        addDrop(ModBlocks.STRAWBERRY, cropDrops(ModBlocks.STRAWBERRY, ModItems.STRAWBERRY, ModItems.STRAWBERRY_SEEDS, builder36));

        BlockStatePropertyLootCondition.Builder builder37 =
                BlockStatePropertyLootCondition.builder(ModBlocks.SUMMER_SQUASH)
                        .properties(StatePredicate.Builder.create().exactMatch(Summer_Squash_Block.AGE, 5));
        addDrop(ModBlocks.SUMMER_SQUASH, cropDrops(ModBlocks.SUMMER_SQUASH, ModItems.SUMMER_SQUASH, ModItems.SUMMER_SQUASH_SEEDS, builder37));

        BlockStatePropertyLootCondition.Builder builder38 =
                BlockStatePropertyLootCondition.builder(ModBlocks.SUNFLOWER)
                        .properties(StatePredicate.Builder.create().exactMatch(Sunflower_Block.AGE, 5));
        addDrop(ModBlocks.SUNFLOWER, cropDrops(ModBlocks.SUNFLOWER, ModItems.SUNFLOWER, ModItems.SUNFLOWER_SEEDS, builder38));

        BlockStatePropertyLootCondition.Builder builder39 =
                BlockStatePropertyLootCondition.builder(ModBlocks.TARO)
                        .properties(StatePredicate.Builder.create().exactMatch(Taro_Block.AGE, 5));
        addDrop(ModBlocks.TARO, cropDrops(ModBlocks.TARO, ModItems.TARO_ROOT, ModItems.TARO_ROOT_SEEDS, builder39));

        BlockStatePropertyLootCondition.Builder builder40 =
                BlockStatePropertyLootCondition.builder(ModBlocks.TEA_LEAVES)
                        .properties(StatePredicate.Builder.create().exactMatch(Tea_Leaves_Block.AGE, 5));
        addDrop(ModBlocks.TEA_LEAVES, cropDrops(ModBlocks.TEA_LEAVES, ModItems.TEA_LEAVES, ModItems.TEA_LEAVES_SEEDS, builder40));

        BlockStatePropertyLootCondition.Builder builder41 =
                BlockStatePropertyLootCondition.builder(ModBlocks.TOMATO)
                        .properties(StatePredicate.Builder.create().exactMatch(Tomato_Block.AGE, 5));
        addDrop(ModBlocks.TOMATO, cropDrops(ModBlocks.TOMATO, ModItems.TOMATO, ModItems.TOMATO_SEEDS, builder41));

        BlockStatePropertyLootCondition.Builder builder42 =
                BlockStatePropertyLootCondition.builder(ModBlocks.TULIP)
                        .properties(StatePredicate.Builder.create().exactMatch(Tulip_Block.AGE, 5));
        addDrop(ModBlocks.TULIP, cropDrops(ModBlocks.TULIP, ModItems.TULIP, ModItems.TULIP_SEEDS, builder42));

        BlockStatePropertyLootCondition.Builder builder43 =
                BlockStatePropertyLootCondition.builder(ModBlocks.WHEAT)
                        .properties(StatePredicate.Builder.create().exactMatch(Wheat_Block.AGE, 5));
        addDrop(ModBlocks.WHEAT, cropDrops(ModBlocks.WHEAT, ModItems.WHEAT, ModItems.WHEAT_SEEDS, builder43));

        BlockStatePropertyLootCondition.Builder builder44 =
                BlockStatePropertyLootCondition.builder(ModBlocks.YAM)
                        .properties(StatePredicate.Builder.create().exactMatch(Yam_Block.AGE, 5));
        addDrop(ModBlocks.YAM, cropDrops(ModBlocks.YAM, ModItems.YAM, ModItems.YAM_SEEDS, builder44));



    }


}
