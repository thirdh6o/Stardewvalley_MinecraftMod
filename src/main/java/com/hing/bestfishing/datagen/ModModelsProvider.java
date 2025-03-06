package com.hing.bestfishing.datagen;

import com.hing.bestfishing.block.ModBlocks;
import com.hing.bestfishing.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.state.property.Properties;

public class ModModelsProvider  extends FabricModelProvider {

    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // 这个方法下写我们的方块，它会将我们的方块模型文件、方块状态文件，以及方块对应的方块物品模型文件一起生成

        // 我们之前写的方块是cube all的，那么这里我们就可以采用registerSimpleCubeAll方法来生成我们的方块模型文件
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_ETHER_BLOCK);


        /* 参考原版代码编写同类型方块的数据生成
           其中的registerCubeAllModelTexturePool方法获取的是基础方块的材质
           并将其作为同家族中所有方块的材质
         */



        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BUTTERCUPS,ModBlocks.POTTED_BUTTERCUPS,BlockStateModelGenerator.TintType.NOT_TINTED);

        // 作物的模型文件需要罗列出其所有的生长阶段
        blockStateModelGenerator.registerCrop(ModBlocks.CAULIFLOWER, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.AMARANTH, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.ARTICHOKE, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.ANCIENT_FRUIT, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.BEET, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.BLUEBERRY, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.BLUE_JAZZ, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.BOK_CHOY, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.BROCCOLI, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.CACTUS_FRUIT, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.CARROT, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.CORN, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.CRANBERRIES, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.EGGPLANT, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.FAIRY_ROSE, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.FIBER, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.GARLIC, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.GRAPE, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.GREEN_BEAN, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.HOPS, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.HOT_PEPPER, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.KALE, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.MELON, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.PARSNIP, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.PINEAPPLE, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.POPPY, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.POTATO, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.PUMPKIN, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.QI_FRUIT, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.RADISH, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.RARE, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.RED_CABBAGE, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.RHUBARB, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.RICE, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.SPANGLE, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.STARFRUIT, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.STRAWBERRY, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.SUMMER_SQUASH, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.SUNFLOWER, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.TARO, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.TEA_LEAVES, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.TOMATO, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.TULIP, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.WHEAT, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.YAM, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.POWDERMELON, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {













        //音乐唱片
        itemModelGenerator.register(ModItems.CLOUD_COUNTRY_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.COUNTRY_SHOP_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.FAIR_THEME_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.FALL1_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.FALL2_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.FALL3_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLOWER_DANCE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.FUN_FESTIVAL_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRANDPA_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.OVERTURE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.PELICAN_TOWN_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPRING1_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPRING2_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPRING3_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUMMER1_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUMMER2_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUMMER3_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.WEDDING_CELEBRATION_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.WINTER1_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.WINTER2_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.WINTER3_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.WINTER_FESTIVAL_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.WOOD_MUSIC_DISC, Models.GENERATED);






        itemModelGenerator.register(ModItems.SHENGYUPIAN, Models.GENERATED);

        //农作物模型
//        itemModelGenerator.register(ModItems.CAULIFLOWER_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMARANTH, Models.GENERATED);
       // itemModelGenerator.register(ModItems.AMARANTH_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_FRUIT, Models.GENERATED);
       // itemModelGenerator.register(ModItems.ANCIENT_FRUIT_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ARTICHOKE, Models.GENERATED);
        //itemModelGenerator.register(ModItems.ARTICHOKE_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEET, Models.GENERATED);
       // itemModelGenerator.register(ModItems.BEET_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUEBERRY, Models.GENERATED);
       // itemModelGenerator.register(ModItems.BLUEBERRY_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_JAZZ, Models.GENERATED);
      //  itemModelGenerator.register(ModItems.BLUE_JAZZ_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BOK_CHOY, Models.GENERATED);
      //  itemModelGenerator.register(ModItems.BOK_CHOY_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BROCCOLI, Models.GENERATED);
       // itemModelGenerator.register(ModItems.BROCCOLI_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CACTUS_FRUIT, Models.GENERATED);
      //  itemModelGenerator.register(ModItems.CACTUS_FRUIT_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARROT, Models.GENERATED);
    //    itemModelGenerator.register(ModItems.CARROT_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORN, Models.GENERATED);
     //   itemModelGenerator.register(ModItems.CORN_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRANBERRIES, Models.GENERATED);
     //   itemModelGenerator.register(ModItems.CRANBERRIES_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGGPLANT, Models.GENERATED);
      //  itemModelGenerator.register(ModItems.EGGPLANT_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.FAIRY_ROSE, Models.GENERATED);
     //   itemModelGenerator.register(ModItems.FAIRY_ROSE_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIBER, Models.GENERATED);
      //  itemModelGenerator.register(ModItems.FIBER_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.GARLIC, Models.GENERATED);
      //  itemModelGenerator.register(ModItems.GARLIC_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAPE, Models.GENERATED);
      //  itemModelGenerator.register(ModItems.GRAPE_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_BEAN, Models.GENERATED);
      //  itemModelGenerator.register(ModItems.GREEN_BEAN_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOPS, Models.GENERATED);
       // itemModelGenerator.register(ModItems.HOPS_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOT_PEPPER, Models.GENERATED);
      //  itemModelGenerator.register(ModItems.HOT_PEPPER_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.KALE, Models.GENERATED);
      //  itemModelGenerator.register(ModItems.KALE_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MELON, Models.GENERATED);
       // itemModelGenerator.register(ModItems.MELON_SEEDS, Models.GENERATED);
//        itemModelGenerator.register(ModItems.MIXED_FLOWER_SEEDS, Models.GENERATED);
//        itemModelGenerator.register(ModItems.MIXED_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.PARSNIP, Models.GENERATED);
      //  itemModelGenerator.register(ModItems.PARSNIP_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINEAPPLE, Models.GENERATED);
      //  itemModelGenerator.register(ModItems.PINEAPPLE_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.POPPY, Models.GENERATED);
      //  itemModelGenerator.register(ModItems.POPPY_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.POTATO, Models.GENERATED);
      //  itemModelGenerator.register(ModItems.POTATO_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.POWDERMELON, Models.GENERATED);
     //   itemModelGenerator.register(ModItems.POWDERMELON_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUMPKIN, Models.GENERATED);
     //   itemModelGenerator.register(ModItems.PUMPKIN_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.QI_FRUIT, Models.GENERATED);
    //    itemModelGenerator.register(ModItems.QI_FRUIT_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.RADISH, Models.GENERATED);
     //   itemModelGenerator.register(ModItems.RADISH_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.RARE, Models.GENERATED);
     //   itemModelGenerator.register(ModItems.RARE_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_CABBAGE, Models.GENERATED);
     //   itemModelGenerator.register(ModItems.RED_CABBAGE_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.RHUBARB, Models.GENERATED);
     //   itemModelGenerator.register(ModItems.RHUBARB_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.RICE, Models.GENERATED);
     //   itemModelGenerator.register(ModItems.RICE_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPANGLE, Models.GENERATED);
   //     itemModelGenerator.register(ModItems.SPANGLE_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STARFRUIT, Models.GENERATED);
    //    itemModelGenerator.register(ModItems.STARFRUIT_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWBERRY, Models.GENERATED);
    //    itemModelGenerator.register(ModItems.STRAWBERRY_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUMMER_SQUASH, Models.GENERATED);
    //    itemModelGenerator.register(ModItems.SUMMER_SQUASH_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUNFLOWER, Models.GENERATED);
    //    itemModelGenerator.register(ModItems.SUNFLOWER_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.TARO_ROOT, Models.GENERATED);
    //    itemModelGenerator.register(ModItems.TARO_ROOT_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.TEA_LEAVES, Models.GENERATED);
    //    itemModelGenerator.register(ModItems.TEA_LEAVES_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
    //    itemModelGenerator.register(ModItems.TOMATO_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.TULIP, Models.GENERATED);
    //    itemModelGenerator.register(ModItems.TULIP_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHEAT, Models.GENERATED);
    //    itemModelGenerator.register(ModItems.WHEAT_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.YAM, Models.GENERATED);
    //    itemModelGenerator.register(ModItems.YAM_SEEDS, Models.GENERATED);





        //钓鱼垃圾
        itemModelGenerator.register(ModItems.BROKEN_CD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BROKEN_GLASSES, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRIFTWOOD, Models.GENERATED);
        itemModelGenerator.register(ModItems.JOJA_COLA, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROTTEN_PLANT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOGGY_NEWSPAPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.TRASH, Models.GENERATED);



        //武器模型注册
        itemModelGenerator.register(ModItems.BONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CUTLASS, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DARK_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DRAGONTOOTH_CUTLASS, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DWARF_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FOREST_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GALAXY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HALEYS_IRON, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HOLY_BLADE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.INFINITY_BLADE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.INSECT_HEAD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_EDGE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LAVA_KATANA, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LEAHS_WHITTLER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MEOWMERE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NEPTUNES_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_EDGE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OSSIFIED_BLADE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PIRATES_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUSTY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVER_SABER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SMALLSWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TEMPERED_BROADSWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TEMPLARS_BLADE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.YETI_TOOTH, Models.HANDHELD);




        // 这个方法下写我们的物品，它生成我们的物品模型文件
        itemModelGenerator.register(ModItems.HETUN, Models.GENERATED);
        // 利用register方法注册我们的物品，并指定它的模型类
        itemModelGenerator.register(ModItems.TIYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.JINQIANGYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHADINGYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHOUYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.DAZUILUYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.XIAOZUILUYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.HONGZUNYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.GUIYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.DAYANYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.HELU, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.NIANYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOUYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.TAIYANGYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.HONGJIYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.FEIYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.ZHANGYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.HONGDIAOYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.YOUYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.HAISHEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.DAHAISHEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.GUI3YU, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHIYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.BINGZHUYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.YANJIANGMANYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHAYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.XIELIYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.BIMUYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.WUYELIYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.XUNYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.HUWENZUNYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.DATOUYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.LUOFEIYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIANYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAHAZHILI, Models.GENERATED);
        itemModelGenerator.register(ModItems.QINGHUAYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.XIFEI, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHECHIDANXIANYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.DABIMUYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUYUEYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.XUKONGGUIYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHILAIMU, Models.GENERATED);
        itemModelGenerator.register(ModItems.HUANGDIAOYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHIZIYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.LANTIEBINGYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.XIAHUYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.WUYEYOUYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.YOULINGYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHUIDIYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.FEIHONGYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANKANGYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHUANSHUOZHIYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.BINGCHUANYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.BIANZHONGLIYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.FEIHONGYUZHIZI, Models.GENERATED);
        itemModelGenerator.register(ModItems.CIANKANGYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHUANSHUOZHIYUERDAI, Models.GENERATED);
        itemModelGenerator.register(ModItems.XIAOBINGCHUANYU, Models.GENERATED);
        itemModelGenerator.register(ModItems.FANGSHEXINGLIYU, Models.GENERATED);
        // 盔甲物品的模型与其他物品不同，有单独的方法

    }

}
