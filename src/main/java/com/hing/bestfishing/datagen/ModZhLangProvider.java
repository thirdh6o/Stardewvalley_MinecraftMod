package com.hing.bestfishing.datagen;

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
        translationBuilder.add("itemGroup.bestfishing_group", "最佳钓鱼模组");

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

