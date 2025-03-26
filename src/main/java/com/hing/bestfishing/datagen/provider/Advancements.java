
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
            Text.literal("收集柠檬，柠檬草，柠檬花，柠檬片"),
            null,
            AdvancementFrame.TASK,
            true,
            true,
            false)

        .criterion("got_wild_horseradish", InventoryChangedCriterion.Conditions.items(ModBlocks.WILD_HORSERADISH))
        .rewards(AdvancementRewards.Builder.loot(new Identifier("minecraft", "summer_boot")))
        .build(consumer, BestFishingMod.MOD_ID + "/got_summer");


      Advancement got_Autumn = Advancement.Builder.create().parent(got_Summer)
       .display(
            ModItems.AUTUMN_BOOT,
            Text.literal("秋季采集收集包！"),
            Text.literal("收集柠檬片，柠檬草，柠檬花，柠檬片"),
            null,
            AdvancementFrame.TASK,
            true,
            true,
            false
            )
        .criterion("got_wild_horseradish", InventoryChangedCriterion.Conditions.items(ModBlocks.WILD_HORSERADISH)) 
        .rewards(AdvancementRewards.Builder.loot(new Identifier("minecraft", "autumn_boot")))
        .build(consumer, BestFishingMod.MOD_ID + "/got_autumn");


      Advancement got_Winter = Advancement.Builder.create().parent(got_Autumn)
      .display(
            ModItems.WINTER_BOOT,
            Text.literal("冬季采集收集包！"),
            Text.literal("收集柠檬片，柠檬草，柠檬花，柠檬片"),
            null,
            AdvancementFrame.TASK,
            true, 
            true,
            false
            )
      .criterion("got_wild_horseradish", InventoryChangedCriterion.Conditions.items(ModBlocks.WILD_HORSERADISH))
      .rewards(AdvancementRewards.Builder.loot(new Identifier("minecraft", "winter_boot")))
      .build(consumer, BestFishingMod.MOD_ID + "/got_winter");













    }
}
