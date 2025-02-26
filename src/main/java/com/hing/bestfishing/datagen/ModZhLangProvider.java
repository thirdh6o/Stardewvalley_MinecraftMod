package com.hing.bestfishing.datagen;

import com.hing.bestfishing.block.ModBlocks;
import com.hing.bestfishing.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModZhLangProvider extends FabricLanguageProvider {


    // 在这里我们使用的是简体中文，所以传入的是"zh_cn"
    public ModZhLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        // Add translations for the item group
        translationBuilder.add("itemGroup.bestfishing_group", "星露谷物语钓鱼");
        translationBuilder.add("itemGroup.farm_group","星露谷物语种植");
        translationBuilder.add("itemGroup.combat_group","星露谷物语战斗");
        translationBuilder.add(ModItems.SHENGYUPIAN, "生鱼片");

        //种植
        translationBuilder.add(ModItems.CAULIFLOWER, "花椰菜");
        translationBuilder.add(ModItems.CAULIFLOWER_SEEDS, "花椰菜种子");
        translationBuilder.add(ModBlocks.CAULIFLOWER, "花椰菜");









        //SWORD
        translationBuilder.add(ModItems.BONE_SWORD, "骨剑");
        translationBuilder.add(ModItems.CLAYMORE, "大剑");
        translationBuilder.add(ModItems.CUTLASS, "弯刀");
        translationBuilder.add(ModItems.DARK_SWORD, "黑暗之剑");
        translationBuilder.add(ModItems.DRAGONTOOTH_CUTLASS, "龙牙弯刀");
        translationBuilder.add(ModItems.DWARF_SWORD, "矮人之剑");
        translationBuilder.add(ModItems.FOREST_SWORD, "森林之剑");
        translationBuilder.add(ModItems.GALAXY_SWORD, "银河之剑");
        translationBuilder.add(ModItems.HALEYS_IRON, "海莉的烫发棒");
        translationBuilder.add(ModItems.HOLY_BLADE, "圣光之刃");
        translationBuilder.add(ModItems.INFINITY_BLADE, "无限之刃");
        translationBuilder.add(ModItems.INSECT_HEAD, "昆虫头部");
        translationBuilder.add(ModItems.IRON_EDGE, "铁刃");
        translationBuilder.add(ModItems.LAVA_KATANA, "岩浆武士刀");
        translationBuilder.add(ModItems.LEAHS_WHITTLER, "莉亚的刻刀");
        translationBuilder.add(ModItems.MEOWMERE, "彩虹猫之刃");
        translationBuilder.add(ModItems.NEPTUNES_GLAIVE, "海王之戟");
        translationBuilder.add(ModItems.OBSIDIAN_EDGE, "黑曜刃");
        translationBuilder.add(ModItems.OSSIFIED_BLADE, "化石之刃");
        translationBuilder.add(ModItems.PIRATES_SWORD, "海盗之剑");
        translationBuilder.add(ModItems.RUSTY_SWORD, "生锈之剑");
        translationBuilder.add(ModItems.SILVER_SABER, "银色军刀");
        translationBuilder.add(ModItems.STEEL_FALCHION, "钢铁弯刀");
        translationBuilder.add(ModItems.STEEL_SMALLSWORD, "钢铁小剑");
        translationBuilder.add(ModItems.TEMPERED_BROADSWORD, "调制大剑");
        translationBuilder.add(ModItems.TEMPLARS_BLADE, "圣剑");
        translationBuilder.add(ModItems.YETI_TOOTH, "雪怪之牙");
        translationBuilder.add(ModItems.BROKEN_CD, "破损的CD");
        translationBuilder.add(ModItems.BROKEN_GLASSES, "破损的眼镜");
        translationBuilder.add(ModItems.DRIFTWOOD, "浮木");
        translationBuilder.add(ModItems.JOJA_COLA, "Joja可乐");
        translationBuilder.add(ModItems.ROTTEN_PLANT, "腐烂的植物");
        translationBuilder.add(ModItems.SOGGY_NEWSPAPER, "湿透的报纸");
        translationBuilder.add(ModItems.TRASH, "垃圾");




        // Add translations for each item
        translationBuilder.add(ModItems.HETUN, "河豚");
        translationBuilder.add(ModItems.TIYU, "鳀鱼");
        translationBuilder.add(ModItems.JINQIANGYU, "金枪鱼");
        translationBuilder.add(ModItems.SHADINGYU, "沙丁鱼");
        translationBuilder.add(ModItems.CHOUYU, "鲷鱼");
        translationBuilder.add(ModItems.DAZUILUYU, "大嘴鲈鱼");
        translationBuilder.add(ModItems.XIAOZUILUYU, "小嘴鲈鱼");
        translationBuilder.add(ModItems.HONGZUNYU, "虹鳟鱼");
        translationBuilder.add(ModItems.GUIYU, "鲑鱼");
        translationBuilder.add(ModItems.DAYANYU, "大眼鱼");
        translationBuilder.add(ModItems.HELU, "河鲈");
        translationBuilder.add(ModItems.LIYU, "鲤鱼");
        translationBuilder.add(ModItems.NIANYU, "鲶鱼");
        translationBuilder.add(ModItems.GOUYU, "狗鱼");
        translationBuilder.add(ModItems.TAIYANGYU, "太阳鱼");
        translationBuilder.add(ModItems.HONGJIYU, "红鲻鱼");
        translationBuilder.add(ModItems.FEIYU, "鲱鱼");
        translationBuilder.add(ModItems.MANYU, "鳗鱼");
        translationBuilder.add(ModItems.ZHANGYU, "章鱼");
        translationBuilder.add(ModItems.HONGDIAOYU, "红鲷鱼");
        translationBuilder.add(ModItems.YOUYU, "鱿鱼");
        translationBuilder.add(ModItems.HAISHEN, "海参");
        translationBuilder.add(ModItems.DAHAISHEN, "大海参");
        translationBuilder.add(ModItems.GUI3YU, "鬼鱼");
        translationBuilder.add(ModItems.SHIYU, "石鱼");
        translationBuilder.add(ModItems.BINGZHUYU, "冰柱鱼");
        translationBuilder.add(ModItems.YANJIANGMANYU, "岩浆鳗鱼");
        translationBuilder.add(ModItems.SHAYU, "沙鱼");
        translationBuilder.add(ModItems.XIELIYU, "蝎鲤鱼");
        translationBuilder.add(ModItems.BIMUYU, "比目鱼");
        translationBuilder.add(ModItems.WUYELIYU, "午夜鲤鱼");
        translationBuilder.add(ModItems.XUNYU, "鲟鱼");
        translationBuilder.add(ModItems.HUWENZUNYU, "虎纹鳟鱼");
        translationBuilder.add(ModItems.DATOUYU, "大头鱼");
        translationBuilder.add(ModItems.LUOFEIYU, "罗非鱼");
        translationBuilder.add(ModItems.LIANYU, "鲢鱼");
        translationBuilder.add(ModItems.MAHAZHILI, "麻哈脂鲤");
        translationBuilder.add(ModItems.QINGHUAYU, "青花鱼");
        translationBuilder.add(ModItems.XIFEI, "西鲱");
        translationBuilder.add(ModItems.SHECHIDANXIANYU, "蛇齿单线鱼");
        translationBuilder.add(ModItems.DABIMUYU, "大比目鱼");
        translationBuilder.add(ModItems.MUYUEYU, "木跃鱼");
        translationBuilder.add(ModItems.XUKONGGUIYU, "虚空鲑鱼");
        translationBuilder.add(ModItems.SHILAIMU, "史莱姆鱼");
        translationBuilder.add(ModItems.HUANGDIAOYU, "黄貂鱼");
        translationBuilder.add(ModItems.SHIZIYU, "狮子鱼");
        translationBuilder.add(ModItems.LANTIEBINGYU, "蓝铁饼鱼");
        translationBuilder.add(ModItems.XIAHUYU, "虾虎鱼");
        translationBuilder.add(ModItems.WUYEYOUYU, "午夜鱿鱼");
        translationBuilder.add(ModItems.YOULINGYU, "幽灵鱼");
        translationBuilder.add(ModItems.SHUIDIYU, "水滴鱼");
        translationBuilder.add(ModItems.FEIHONGYU, "绯红鱼");
        translationBuilder.add(ModItems.ANKANGYU, "鮟鱇鱼");
        translationBuilder.add(ModItems.CHUANSHUOZHIYU, "传说之鱼");
        translationBuilder.add(ModItems.BINGCHUANYU, "冰川鱼");
        translationBuilder.add(ModItems.BIANZHONGLIYU, "变种鲤鱼");
        translationBuilder.add(ModItems.FEIHONGYUZHIZI, "绯红鱼之子");
        translationBuilder.add(ModItems.CIANKANGYU, "雌安康鱼");
        translationBuilder.add(ModItems.CHUANSHUOZHIYUERDAI, "传说之鱼二代目");
        translationBuilder.add(ModItems.XIAOBINGCHUANYU, "小冰川鱼");
        translationBuilder.add(ModItems.FANGSHEXINGLIYU, "放射性鲤鱼");
    }
}

