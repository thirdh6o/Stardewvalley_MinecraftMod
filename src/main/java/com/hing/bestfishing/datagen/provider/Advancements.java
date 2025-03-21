
package com.hing.bestfishing.datagen.provider;
import com.hing.bestfishing.BestFishingMod;
import com.hing.bestfishing.block.ModBlocks;
import com.hing.bestfishing.item.ModItems;

import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
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
             Text.literal("传说之鱼"),
             Text.literal("获得所有传说之鱼以及其二代"),
             null,
             AdvancementFrame.CHALLENGE,
             true,
             true,
             false

         )
        .criterion("got_feihongyu", InventoryChangedCriterion.Conditions.items(ModItems.FEIHONGYU))
        .build(consumer, BestFishingMod.MOD_ID + "/got_feihongyu");


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
     .build(consumer, BestFishingMod.MOD_ID + "/got_spring");





















    }
}
