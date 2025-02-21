package com.hing.bestfishing.datagen;

import com.hing.bestfishing.item.ModItems;
import com.hing.bestfishing.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.render.entity.feature.IronGolemCrackFeatureRenderer;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModItemTags.SUGAR_INGREDIENTS)
                .add(Items.SUGAR);
        getOrCreateTagBuilder(ModItemTags.METAL)
                .add(Items.IRON_INGOT)
                .add(Items.GOLD_INGOT)
                .add(Items.COPPER_INGOT)
                .add(Items.NETHERITE_INGOT);
        getOrCreateTagBuilder(ModItemTags.MOD_FISH)
                .add(ModItems.HETUN)
                .add(ModItems.TIYU)
                .add(ModItems.JINQIANGYU)
                .add(ModItems.SHADINGYU)
                .add(ModItems.CHOUYU)
                .add(ModItems.DAZUILUYU)
                .add(ModItems.XIAOZUILUYU)
                .add(ModItems.HONGZUNYU)
                .add(ModItems.GUIYU)
                .add(ModItems.DAYANYU)
                .add(ModItems.HELU)
                .add(ModItems.LIYU)
                .add(ModItems.NIANYU)
                .add(ModItems.GOUYU)
                .add(ModItems.TAIYANGYU)
                .add(ModItems.HONGJIYU)
                .add(ModItems.FEIYU)
                .add(ModItems.MANYU)
                .add(ModItems.ZHANGYU)
                .add(ModItems.HONGDIAOYU)
                .add(ModItems.YOUYU)
                .add(ModItems.HAISHEN)
                .add(ModItems.DAHAISHEN)
                .add(ModItems.GUI3YU)
                .add(ModItems.SHIYU)
                .add(ModItems.BINGZHUYU)
                .add(ModItems.YANJIANGMANYU)
                .add(ModItems.SHAYU)
                .add(ModItems.XIELIYU)
                .add(ModItems.BIMUYU)
                .add(ModItems.WUYELIYU)
                .add(ModItems.XUNYU)
                .add(ModItems.HUWENZUNYU)
                .add(ModItems.DATOUYU)
                .add(ModItems.LUOFEIYU)
                .add(ModItems.LIANYU)
                .add(ModItems.MAHAZHILI)
                .add(ModItems.QINGHUAYU)
                .add(ModItems.XIFEI)
                .add(ModItems.SHECHIDANXIANYU)
                .add(ModItems.DABIMUYU)
                .add(ModItems.MUYUEYU)
                .add(ModItems.XUKONGGUIYU)
                .add(ModItems.SHILAIMU)
                .add(ModItems.HUANGDIAOYU)
                .add(ModItems.SHIZIYU)
                .add(ModItems.LANTIEBINGYU)
                .add(ModItems.XIAHUYU)
                .add(ModItems.WUYEYOUYU)
                .add(ModItems.YOULINGYU)
                .add(ModItems.SHUIDIYU)
                .add(ModItems.FEIHONGYU)
                .add(ModItems.ANKANGYU)
                .add(ModItems.CHUANSHUOZHIYU)
                .add(ModItems.BINGCHUANYU)
                .add(ModItems.BIANZHONGLIYU)
                .add(ModItems.FEIHONGYUZHIZI)
                .add(ModItems.CIANKANGYU)
                .add(ModItems.CHUANSHUOZHIYUERDAI)
                .add(ModItems.XIAOBINGCHUANYU)
                .add(ModItems.FANGSHEXINGLIYU);
    }


}

