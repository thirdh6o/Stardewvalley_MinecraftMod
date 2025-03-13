
package com.hing.bestfishing.datagen.provider;
import com.hing.bestfishing.BestFishingMod;
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
                        Text.literal("星露谷之魂"), // 标题
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

                
        
    }






    
}
