package com.hing.bestfishing.datagen;

import com.hing.bestfishing.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelsProvider  extends FabricModelProvider {

    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // 这个方法下写我们的方块，它会将我们的方块模型文件、方块状态文件，以及方块对应的方块物品模型文件一起生成

        // 我们之前写的方块是cube all的，那么这里我们就可以采用registerSimpleCubeAll方法来生成我们的方块模型文件
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_ETHER_BLOCK);
    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SHENGYUPIAN, Models.GENERATED);


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
