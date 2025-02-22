package com.hing.bestfishing.datagen;


import com.hing.bestfishing.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModEnLangProvider extends FabricLanguageProvider {


    public ModEnLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    // 在创建完构造函数之后，我们可以在super方法中再加入一个参数，这个参数就是我们要翻译的语言
    // 在这里我们使用的是英文，所以传入的是"en_us"（当然不写默认就是en_us）

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add("itemGroup.bestfishing_group", "StardewValley Fishing Group");
        translationBuilder.add("itemGroup.farm_group","StardewValley Farming Group");
        translationBuilder.add("itemGroup.combat_group","StardewValley Combat Group");
        translationBuilder.add(ModItems.SHENGYUPIAN, "Sashimi");
        //Sword
        translationBuilder.add(ModItems.BONE_SWORD, "Bone Sword");
        translationBuilder.add(ModItems.CLAYMORE, "Claymore");
        translationBuilder.add(ModItems.CUTLASS, "Cutlass");
        translationBuilder.add(ModItems.DARK_SWORD, "Dark Sword");
        translationBuilder.add(ModItems.DRAGONTOOTH_CUTLASS, "Dragontooth Cutlass");
        translationBuilder.add(ModItems.DWARF_SWORD, "Dwarf Sword");
        translationBuilder.add(ModItems.FOREST_SWORD, "Forest Sword");
        translationBuilder.add(ModItems.GALAXY_SWORD, "Galaxy Sword");
        translationBuilder.add(ModItems.HALEYS_IRON, "Haley's Iron");
        translationBuilder.add(ModItems.HOLY_BLADE, "Holy Blade");
        translationBuilder.add(ModItems.INFINITY_BLADE, "Infinity Blade");
        translationBuilder.add(ModItems.INSECT_HEAD, "Insect Head");
        translationBuilder.add(ModItems.IRON_EDGE, "Iron Edge");
        translationBuilder.add(ModItems.LAVA_KATANA, "Lava Katana");
        translationBuilder.add(ModItems.LEAHS_WHITTLER, "Leah's Whittler");
        translationBuilder.add(ModItems.MEOWMERE, "Meowmere");
        translationBuilder.add(ModItems.NEPTUNES_GLAIVE, "Neptune's Glaive");
        translationBuilder.add(ModItems.OBSIDIAN_EDGE, "Obsidian Edge");
        translationBuilder.add(ModItems.OSSIFIED_BLADE, "Ossified Blade");
        translationBuilder.add(ModItems.PIRATES_SWORD, "Pirate's Sword");
        translationBuilder.add(ModItems.RUSTY_SWORD, "Rusty Sword");
        translationBuilder.add(ModItems.SILVER_SABER, "Silver Saber");
        translationBuilder.add(ModItems.STEEL_FALCHION, "Steel Falchion");
        translationBuilder.add(ModItems.STEEL_SMALLSWORD, "Steel Smallsword");
        translationBuilder.add(ModItems.TEMPERED_BROADSWORD, "Tempered Broadsword");
        translationBuilder.add(ModItems.TEMPLARS_BLADE, "Templar's Blade");
        translationBuilder.add(ModItems.YETI_TOOTH, "Yeti Tooth");
        translationBuilder.add(ModItems.BROKEN_CD, "Broken CD");
        translationBuilder.add(ModItems.BROKEN_GLASSES, "Broken Glasses");
        translationBuilder.add(ModItems.DRIFTWOOD, "Driftwood");
        translationBuilder.add(ModItems.JOJA_COLA, "Joja Cola");
        translationBuilder.add(ModItems.ROTTEN_PLANT, "Rotten Plant");
        translationBuilder.add(ModItems.SOGGY_NEWSPAPER, "Soggy Newspaper");
        translationBuilder.add(ModItems.TRASH, "Trash");







        // Add translations for each item
        translationBuilder.add(ModItems.HETUN, "Pufferfish");
        translationBuilder.add(ModItems.TIYU, "Carp");
        translationBuilder.add(ModItems.JINQIANGYU, "Golden Pomfret");
        translationBuilder.add(ModItems.SHADINGYU, "Sandfish");
        translationBuilder.add(ModItems.CHOUYU, "Stinky Fish");
        translationBuilder.add(ModItems.DAZUILUYU, "Bigmouth Lu Fish");
        translationBuilder.add(ModItems.XIAOZUILUYU, "Smallmouth Lu Fish");
        translationBuilder.add(ModItems.HONGZUNYU, "Red Snapper");
        translationBuilder.add(ModItems.GUIYU, "Ghost Fish");
        translationBuilder.add(ModItems.DAYANYU, "Bigeye Fish");
        translationBuilder.add(ModItems.HELU, "Herring");
        translationBuilder.add(ModItems.LIYU, "Carp");
        translationBuilder.add(ModItems.NIANYU, "Catfish");
        translationBuilder.add(ModItems.GOUYU, "Dogfish");
        translationBuilder.add(ModItems.TAIYANGYU, "Sunfish");
        translationBuilder.add(ModItems.HONGJIYU, "Redfin Fish");
        translationBuilder.add(ModItems.FEIYU, "Flying Fish");
        translationBuilder.add(ModItems.MANYU, "Eel");
        translationBuilder.add(ModItems.ZHANGYU, "Squid");
        translationBuilder.add(ModItems.HONGDIAOYU, "Red Grouper");
        translationBuilder.add(ModItems.YOUYU, "Cuttlefish");
        translationBuilder.add(ModItems.HAISHEN, "Sea Cucumber");
        translationBuilder.add(ModItems.DAHAISHEN, "Giant Sea Cucumber");
        translationBuilder.add(ModItems.GUI3YU, "Ghost Fish");
        translationBuilder.add(ModItems.SHIYU, "Stonefish");
        translationBuilder.add(ModItems.BINGZHUYU, "Icefish");
        translationBuilder.add(ModItems.YANJIANGMANYU, "Saltwater Eel");
        translationBuilder.add(ModItems.SHAYU, "Shark");
        translationBuilder.add(ModItems.XIELIYU, "Xieli Fish");
        translationBuilder.add(ModItems.BIMUYU, "Bimu Fish");
        translationBuilder.add(ModItems.WUYELIYU, "Wuye Fish");
        translationBuilder.add(ModItems.XUNYU, "Mackerel");
        translationBuilder.add(ModItems.HUWENZUNYU, "Tigerfish");
        translationBuilder.add(ModItems.DATOUYU, "Bighead Fish");
        translationBuilder.add(ModItems.LUOFEIYU, "Luofei Fish");
        translationBuilder.add(ModItems.LIANYU, "Lian Fish");
        translationBuilder.add(ModItems.MAHAZHILI, "Mahazhili Fish");
        translationBuilder.add(ModItems.QINGHUAYU, "Qinghua Fish");
        translationBuilder.add(ModItems.XIFEI, "Xifei Fish");
        translationBuilder.add(ModItems.SHECHIDANXIANYU, "Shechidanxian Fish");
        translationBuilder.add(ModItems.DABIMUYU, "Giant Bimu Fish");
        translationBuilder.add(ModItems.MUYUEYU, "Muyue Fish");
        translationBuilder.add(ModItems.XUKONGGUIYU, "Void Ghost Fish");
        translationBuilder.add(ModItems.SHILAIMU, "Shilaimu Fish");
        translationBuilder.add(ModItems.HUANGDIAOYU, "Yellow Grouper");
        translationBuilder.add(ModItems.SHIZIYU, "Lionfish");
        translationBuilder.add(ModItems.LANTIEBINGYU, "Blue Icefish");
        translationBuilder.add(ModItems.XIAHUYU, "Xiahu Fish");
        translationBuilder.add(ModItems.WUYEYOUYU, "Wuye Cuttlefish");
        translationBuilder.add(ModItems.YOULINGYU, "Ghostling Fish");
        translationBuilder.add(ModItems.SHUIDIYU, "Waterdrop Fish");
        translationBuilder.add(ModItems.FEIHONGYU, "Flying Red Fish");
        translationBuilder.add(ModItems.ANKANGYU, "Ankang Fish");
        translationBuilder.add(ModItems.CHUANSHUOZHIYU, "Legendary Fish");
        translationBuilder.add(ModItems.BINGCHUANYU, "Icefish");
        translationBuilder.add(ModItems.BIANZHONGLIYU, "Bianzhong Fish");
        translationBuilder.add(ModItems.FEIHONGYUZHIZI, "Flying Red Fish Juvenile");
        translationBuilder.add(ModItems.CIANKANGYU, "Ciankang Fish");
        translationBuilder.add(ModItems.CHUANSHUOZHIYUERDAI, "Legendary Fish II");
        translationBuilder.add(ModItems.XIAOBINGCHUANYU, "Small Icefish");
        translationBuilder.add(ModItems.FANGSHEXINGLIYU, "Radiant Fish");
    }
}