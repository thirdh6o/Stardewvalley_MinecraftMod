
package com.hing.bestfishing.datagen.provider;
import com.hing.bestfishing.BestFishingMod;
import com.hing.bestfishing.block.ModBlocks;
import com.hing.bestfishing.item.ModItems;

import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.AdvancementRewards;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;
public class Advancements implements Consumer<Consumer<Advancement>> {

    @SuppressWarnings("unused")
    @Override
    public void accept(Consumer<Advancement> consumer) {
        // 
        // 我们将在这里创建我们的自定义进度
        //
        
            Advancement rootAdvancement = Advancement.Builder.create()
                .display(
                        Items.DIRT, // 贴图
                        Text.literal("星露谷?"), // 标题
                        Text.literal("获得了一个泥土"), // 描述
                        new Identifier("textures/gui/advancements/backgrounds/adventure.png"), // 使用的背景图片
                        AdvancementFrame.TASK, // 选项: TASK, CHALLENGE, GOAL
                        true, // 在右上角显示
                        true, // 在聊天框公告
                        false // 没有达成时，不在进度页面里显示
                )
                // Criterion 中使用的第一个字符串是其他进度在需要 'requirements' 时引用的名字
                .criterion("got_dirt", InventoryChangedCriterion.Conditions.items(Items.DIRT))
                .build(consumer, BestFishingMod.MOD_ID + "/root");

            Advancement gotFishingRod = Advancement.Builder.create().parent(rootAdvancement)
                    .display(
                    Items.FISHING_ROD,
                    Text.literal("去找威利？"),
                    Text.literal("获得一个鱼竿"),
                    null,
                    AdvancementFrame.TASK,
                    true,   
                    true,
                    false

                )
                .criterion("got_fishing_rod", InventoryChangedCriterion.Conditions.items(Items.FISHING_ROD))
                .build(consumer, BestFishingMod.MOD_ID + "/got_fishing_rod");

            
    Advancement gotFeiHongYu = Advancement.Builder.create().parent(gotFishingRod)
            .display(
             ModItems.CHUANSHUOZHIYU,
             Text.literal("传说鱼类"),
             Text.literal("获得所有传说鱼类"),
             null,
             AdvancementFrame.CHALLENGE,
             true,
             true,
             false

         )
        .criterion("got_feihongyu", InventoryChangedCriterion.Conditions.items(ModItems.FEIHONGYU))
        .criterion("got_ankangyu", InventoryChangedCriterion.Conditions.items(ModItems.ANKANGYU))
        .criterion("got_chuanshuozhiyu", InventoryChangedCriterion.Conditions.items(ModItems.CHUANSHUOZHIYU))
        .criterion("got_bingchuanyu", InventoryChangedCriterion.Conditions.items(ModItems.BINGCHUANYU))
        .criterion("got_bianzhongliyu", InventoryChangedCriterion.Conditions.items(ModItems.BIANZHONGLIYU))
        //.rewards(AdvancementRewards.Builder.loot(new Identifier(BestFishingMod.MOD_ID, "chuanshuozhiyuerdai")))   //REWARDS 尝试

        .build(consumer, BestFishingMod.MOD_ID + "/got_feihongyu");


        Advancement gotChuanshuozhiyu = Advancement.Builder.create().parent(gotFishingRod)
               .display(
                ModItems.CHUANSHUOZHIYUERDAI,
                Text.literal("传说鱼类二代"),
                Text.literal("获得传说鱼类二代"),
                null,
                AdvancementFrame.CHALLENGE,
                true,
                true,
                false

            )
         .criterion("got_chuanshuozhiyuerdai", InventoryChangedCriterion.Conditions.items(ModItems.CHUANSHUOZHIYUERDAI))
         .criterion("got_feihongyuzhizi", InventoryChangedCriterion.Conditions.items(ModItems.FEIHONGYUZHIZI))
         .criterion("got_cigankangyu", InventoryChangedCriterion.Conditions.items(ModItems.CIANKANGYU))
         .criterion("got_xiaobingchuanyu", InventoryChangedCriterion.Conditions.items(ModItems.XIAOBINGCHUANYU))
         .criterion("got_fangshexingliyu", InventoryChangedCriterion.Conditions.items(ModItems.FANGSHEXINGLIYU))
         .build(consumer, BestFishingMod.MOD_ID + "/got_chuanshuozhiyuerdai");


///////////////////////////////////
/// //收集包
    Advancement got_Spring = Advancement.Builder.create().parent(rootAdvancement)
        .display(
            ModItems.SPRING_BOOT,
            Text.literal("春季采集收集包！"),
            Text.literal("收集野山葵，韭葱，黄水仙，蒲公英"),
            null,
            AdvancementFrame.TASK,
            true,
            true,
            false

        )
     .criterion("got_wild_horseradish", InventoryChangedCriterion.Conditions.items(ModBlocks.WILD_HORSERADISH))
     .criterion("got_daffodil", InventoryChangedCriterion.Conditions.items(ModBlocks.DAFFODIL))
     .criterion("got_leek", InventoryChangedCriterion.Conditions.items(ModBlocks.LEEK))
     .criterion("got_dandelion", InventoryChangedCriterion.Conditions.items(ModBlocks.DANDELION))
     .rewards(AdvancementRewards.Builder.loot(new Identifier("minecraft", "spring_boot")))
     .build(consumer, BestFishingMod.MOD_ID + "/got_spring");


     Advancement got_Summer = Advancement.Builder.create().parent(got_Spring)
       .display(
            ModItems.SUMMER_BOOT,
            Text.literal("夏季采集收集包！"),
            Text.literal("收集葡萄，香味浆果，甜豌豆"),
            null,
            AdvancementFrame.TASK,
            true,
            true,
            false)

        .criterion("got_grape", InventoryChangedCriterion.Conditions.items(ModBlocks.GRAPE))
        .criterion("got_spice_berry", InventoryChangedCriterion.Conditions.items(ModBlocks.SPICE_BERRY))    
        .criterion("got_sweet_pea", InventoryChangedCriterion.Conditions.items(ModBlocks.SWEET_PEA))
        .rewards(AdvancementRewards.Builder.loot(new Identifier("minecraft", "summer_boot")))
        .build(consumer, BestFishingMod.MOD_ID + "/got_summer");


      Advancement got_Autumn = Advancement.Builder.create().parent(got_Summer)
       .display(
            ModItems.AUTUMN_BOOT,
            Text.literal("秋季采集收集包！"),
            Text.literal("收集普通蘑菇，野梅，榛子，黑莓"),
            null,
            AdvancementFrame.TASK,
            true,
            true,
            false
            )
        .criterion("got_common_mushrooom", InventoryChangedCriterion.Conditions.items(ModBlocks.COMMON_MUSHROOM)) 
        .criterion("got_wild_plum", InventoryChangedCriterion.Conditions.items(ModBlocks.WILD_PLUM))
        .criterion("got_hazelnut", InventoryChangedCriterion.Conditions.items(ModBlocks.HAZELNUT))
        .criterion("got_blackberry", InventoryChangedCriterion.Conditions.items(ModBlocks.BLACKBERRY))
        .rewards(AdvancementRewards.Builder.loot(new Identifier("minecraft", "autumn_boot")))
        .build(consumer, BestFishingMod.MOD_ID + "/got_autumn");


      Advancement got_Winter = Advancement.Builder.create().parent(got_Autumn)
      .display(
            ModItems.WINTER_BOOT,
            Text.literal("冬季采集收集包！"),
            Text.literal("收集冬根，水晶果，雪山药，番红花"),
            null,
            AdvancementFrame.TASK,
            true, 
            true,
            false
            )
      .criterion("got_winter_root", InventoryChangedCriterion.Conditions.items(ModBlocks.WINTER_ROOT))
      .criterion("got_crystal_fruit", InventoryChangedCriterion.Conditions.items(ModBlocks.CRYSTAL_FRUIT))
      .criterion("got_snow_yam", InventoryChangedCriterion.Conditions.items(ModBlocks.SNOW_YAM))
      .criterion("got_crocus", InventoryChangedCriterion.Conditions.items(ModBlocks.CROCUS))
      .rewards(AdvancementRewards.Builder.loot(new Identifier("minecraft", "winter_boot")))
      .build(consumer, BestFishingMod.MOD_ID + "/got_winter");

        

      Advancement farm_SPRING = Advancement.Builder.create().parent(rootAdvancement)
     .display(
         ModItems.SPRING_FARM,
         Text.literal("春季作物收集包！"),
         Text.literal("收获防风草，青豆，花椰菜，土豆"),
         null,
         AdvancementFrame.TASK,
         true,
         true,
         false
     )
     .criterion("got_parsnip", InventoryChangedCriterion.Conditions.items(ModBlocks.PARSNIP))
     .criterion("got_green_bean", InventoryChangedCriterion.Conditions.items(ModBlocks.GREEN_BEAN))
     .criterion("got_cauliflower", InventoryChangedCriterion.Conditions.items(ModBlocks.CAULIFLOWER))
     .criterion("got_potato", InventoryChangedCriterion.Conditions.items(ModBlocks.POTATO))
     .rewards(AdvancementRewards.Builder.loot(new Identifier("minecraft", "spring_farm")))
     .build(consumer, BestFishingMod.MOD_ID + "/farm_spring");

// TODO: 完成到夏季作物收集包

    Advancement farm_SUMMER = Advancement.Builder.create().parent(farm_SPRING)
    .display(
         ModItems.SUMMER_FARM,
         Text.literal("夏季作物收集包！"),
         Text.literal("收获番茄，玉米，茄子，南瓜"),
         null,
         AdvancementFrame.TASK,
         true,
         true,
         false
     )
     .build(consumer, BestFishingMod.MOD_ID + "/farm_summer");





    }
}
