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
        translationBuilder.add("itemGroup.music_disc_group","星露谷物语音乐唱片");
        translationBuilder.add(ModItems.SHENGYUPIAN, "生鱼片");

        //种植
        translationBuilder.add(ModItems.CAULIFLOWER, "花椰菜");
        translationBuilder.add(ModItems.CAULIFLOWER_SEEDS, "花椰菜种子");
        translationBuilder.add(ModBlocks.CAULIFLOWER, "花椰菜");

        translationBuilder.add(ModItems.AMARANTH_SEEDS, "苋菜种子");
        translationBuilder.add(ModItems.AMARANTH, "苋菜");

        translationBuilder.add(ModItems.ANCIENT_FRUIT_SEEDS, "古老果实种子");
        translationBuilder.add(ModItems.ANCIENT_FRUIT, "古老果实");

        translationBuilder.add(ModItems.ARTICHOKE_SEEDS, "洋蓟种子");
        translationBuilder.add(ModItems.ARTICHOKE, "洋蓟");

        translationBuilder.add(ModItems.BEET_SEEDS, "甜菜种子");
        translationBuilder.add(ModItems.BEET, "甜菜");

        translationBuilder.add(ModItems.BLUEBERRY_SEEDS, "蓝莓种子");
        translationBuilder.add(ModItems.BLUEBERRY, "蓝莓");

        translationBuilder.add(ModItems.BLUE_JAZZ_SEEDS, "蓝爵种子");
        translationBuilder.add(ModItems.BLUE_JAZZ, "蓝爵");

        translationBuilder.add(ModItems.BOK_CHOY_SEEDS, "小白菜种子");
        translationBuilder.add(ModItems.BOK_CHOY, "小白菜");

        translationBuilder.add(ModItems.BROCCOLI_SEEDS, "西兰花种子");
        translationBuilder.add(ModItems.BROCCOLI, "西兰花");

        translationBuilder.add(ModItems.CACTUS_FRUIT_SEEDS, "仙人掌种子");
        translationBuilder.add(ModItems.CACTUS_FRUIT, "仙人掌果实");

        translationBuilder.add(ModItems.CARROT_SEEDS, "胡萝卜种子");
        translationBuilder.add(ModItems.CARROT, "胡萝卜");

        translationBuilder.add(ModItems.CORN_SEEDS, "玉米种子");
        translationBuilder.add(ModItems.CORN, "玉米");

        translationBuilder.add(ModItems.CRANBERRIES_SEEDS, "蔓越莓种子");
        translationBuilder.add(ModItems.CRANBERRIES, "蔓越莓");

        translationBuilder.add(ModItems.EGGPLANT_SEEDS, "茄子种子");
        translationBuilder.add(ModItems.EGGPLANT, "茄子");

        translationBuilder.add(ModItems.FAIRY_ROSE_SEEDS, "仙人玫瑰种子");
        translationBuilder.add(ModItems.FAIRY_ROSE, "仙人玫瑰");

        translationBuilder.add(ModItems.FIBER_SEEDS, "纤维种子");
        translationBuilder.add(ModItems.FIBER, "纤维");

        translationBuilder.add(ModItems.GARLIC_SEEDS, "大蒜种子");
        translationBuilder.add(ModItems.GARLIC, "大蒜");

        translationBuilder.add(ModItems.GRAPE_SEEDS, "葡萄种子");
        translationBuilder.add(ModItems.GRAPE, "葡萄");

        translationBuilder.add(ModItems.GREEN_BEAN_SEEDS, "青豆种子");
        translationBuilder.add(ModItems.GREEN_BEAN, "青豆");

        translationBuilder.add(ModItems.HOPS_SEEDS, "啤酒花种子");
        translationBuilder.add(ModItems.HOPS, "啤酒花");

        translationBuilder.add(ModItems.HOT_PEPPER_SEEDS, "辣椒种子");
        translationBuilder.add(ModItems.HOT_PEPPER, "辣椒");

        translationBuilder.add(ModItems.KALE_SEEDS, "甘蓝种子");
        translationBuilder.add(ModItems.KALE, "甘蓝");

        translationBuilder.add(ModItems.MELON_SEEDS, "哈密瓜种子");
        translationBuilder.add(ModItems.MELON, "哈密瓜");

        translationBuilder.add(ModItems.PARSNIP_SEEDS, "防风草种子");
        translationBuilder.add(ModItems.PARSNIP, "防风草");

        translationBuilder.add(ModItems.PINEAPPLE_SEEDS, "菠萝种子");
        translationBuilder.add(ModItems.PINEAPPLE, "菠萝");

        translationBuilder.add(ModItems.POPPY_SEEDS, "虞美人种子");
        translationBuilder.add(ModItems.POPPY, "虞美人");

        translationBuilder.add(ModItems.POTATO_SEEDS, "土豆种子");
        translationBuilder.add(ModItems.POTATO, "土豆");

        translationBuilder.add(ModItems.POWDERMELON_SEEDS, "霜瓜种子");
        translationBuilder.add(ModItems.POWDERMELON, "霜瓜");

        translationBuilder.add(ModItems.PUMPKIN_SEEDS, "南瓜种子");
        translationBuilder.add(ModItems.PUMPKIN, "南瓜");

        translationBuilder.add(ModItems.QI_FRUIT_SEEDS, "齐瓜种子");
        translationBuilder.add(ModItems.QI_FRUIT, "齐瓜");

        translationBuilder.add(ModItems.RADISH_SEEDS, "萝卜种子");
        translationBuilder.add(ModItems.RADISH, "萝卜");

        translationBuilder.add(ModItems.RARE_SEEDS, "稀有种子");
        translationBuilder.add(ModItems.RARE, "宝石甜梅");

        translationBuilder.add(ModItems.RED_CABBAGE_SEEDS, "红甘蓝种子");
        translationBuilder.add(ModItems.RED_CABBAGE, "红甘蓝");

        translationBuilder.add(ModItems.RHUBARB_SEEDS, "大黄种子");
        translationBuilder.add(ModItems.RHUBARB, "大黄");

        translationBuilder.add(ModItems.RICE_SEEDS, "稻米种子");
        translationBuilder.add(ModItems.RICE, "稻米");

        translationBuilder.add(ModItems.SPANGLE_SEEDS, "夏季亮片种子");
        translationBuilder.add(ModItems.SPANGLE, "夏季亮片");

        translationBuilder.add(ModItems.STARFRUIT_SEEDS, "杨桃种子");
        translationBuilder.add(ModItems.STARFRUIT, "杨桃");

        translationBuilder.add(ModItems.STRAWBERRY_SEEDS, "草莓种子");
        translationBuilder.add(ModItems.STRAWBERRY, "草莓");

        translationBuilder.add(ModItems.SUMMER_SQUASH_SEEDS, "夏季南瓜种子");
        translationBuilder.add(ModItems.SUMMER_SQUASH, "夏季南瓜");

        translationBuilder.add(ModItems.SUNFLOWER_SEEDS, "向日葵种子");
        translationBuilder.add(ModItems.SUNFLOWER, "向日葵");

        translationBuilder.add(ModItems.TARO_ROOT, "芋头");
        translationBuilder.add(ModItems.TARO_ROOT_SEEDS, "芋头种子");

        translationBuilder.add(ModItems.TEA_LEAVES, "茶叶");
        translationBuilder.add(ModItems.TEA_LEAVES_SEEDS, "茶叶种子");

        translationBuilder.add(ModItems.TOMATO_SEEDS, "番茄种子");
        translationBuilder.add(ModItems.TOMATO, "番茄");

        translationBuilder.add(ModItems.TULIP_SEEDS, "郁金香种子");
        translationBuilder.add(ModItems.TULIP, "郁金香");

        translationBuilder.add(ModItems.WHEAT_SEEDS, "小麦种子");
        translationBuilder.add(ModItems.WHEAT, "小麦");

        translationBuilder.add(ModItems.YAM_SEEDS, "山药种子");
        translationBuilder.add(ModItems.YAM, "山药");



        //音乐唱片
        translationBuilder.add(ModItems.CLOUD_COUNTRY_MUSIC_DISC, "云乡音乐唱片");
        translationBuilder.add(ModItems.COUNTRY_SHOP_MUSIC_DISC, "乡村商店音乐唱片");
        translationBuilder.add(ModItems.FAIR_THEME_MUSIC_DISC, "集市主题音乐唱片");
        translationBuilder.add(ModItems.FALL1_MUSIC_DISC, "秋天1号音乐唱片");
        translationBuilder.add(ModItems.FALL2_MUSIC_DISC, "秋天2号音乐唱片");
        translationBuilder.add(ModItems.FALL3_MUSIC_DISC, "秋天3号音乐唱片");
        translationBuilder.add(ModItems.FLOWER_DANCE_MUSIC_DISC, "花舞节音乐唱片");
        translationBuilder.add(ModItems.FUN_FESTIVAL_MUSIC_DISC, "有趣节日音乐唱片");
        translationBuilder.add(ModItems.GRANDPA_MUSIC_DISC, "爷爷的音乐唱片");
        translationBuilder.add(ModItems.OVERTURE_MUSIC_DISC, "序曲音乐唱片");
        translationBuilder.add(ModItems.PELICAN_TOWN_MUSIC_DISC, "鹈鹕镇音乐唱片");
        translationBuilder.add(ModItems.SPRING1_MUSIC_DISC, "春天1号音乐唱片");
        translationBuilder.add(ModItems.SPRING2_MUSIC_DISC, "春天2号音乐唱片");
        translationBuilder.add(ModItems.SPRING3_MUSIC_DISC, "春天3号音乐唱片");
        translationBuilder.add(ModItems.SUMMER1_MUSIC_DISC, "夏天1号音乐唱片");
        translationBuilder.add(ModItems.SUMMER2_MUSIC_DISC, "夏天2号音乐唱片");
        translationBuilder.add(ModItems.SUMMER3_MUSIC_DISC, "夏天3号音乐唱片");
        translationBuilder.add(ModItems.WEDDING_CELEBRATION_MUSIC_DISC, "婚礼音乐唱片");
        translationBuilder.add(ModItems.WINTER1_MUSIC_DISC, "冬天1号音乐唱片");
        translationBuilder.add(ModItems.WINTER2_MUSIC_DISC, "冬天2号音乐唱片");
        translationBuilder.add(ModItems.WINTER3_MUSIC_DISC, "冬天3号音乐唱片");
        translationBuilder.add(ModItems.WINTER_FESTIVAL_MUSIC_DISC, "冬季节日音乐唱片");
        translationBuilder.add(ModItems.WOOD_MUSIC_DISC, "木头音乐唱片");





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

