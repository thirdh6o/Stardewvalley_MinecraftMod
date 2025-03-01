package com.hing.bestfishing.datagen;


import com.hing.bestfishing.block.ModBlocks;
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
        translationBuilder.add("itemGroup.music_disc_group","StardewValley Music Disc Group");
        translationBuilder.add(ModItems.SHENGYUPIAN, "Sashimi");


        //种植
        translationBuilder.add(ModItems.CAULIFLOWER_SEEDS, "Cauliflower Seeds");
        translationBuilder.add(ModItems.CAULIFLOWER, "Cauliflower");
        translationBuilder.add(ModBlocks.CAULIFLOWER, "Cauliflower");
        translationBuilder.add(ModItems.AMARANTH_SEEDS, "Amaranth Seeds");
        translationBuilder.add(ModItems.AMARANTH, "Amaranth");

        translationBuilder.add(ModItems.ANCIENT_FRUIT_SEEDS, "Ancient Fruit Seeds");
        translationBuilder.add(ModItems.ANCIENT_FRUIT, "Ancient Fruit");

        translationBuilder.add(ModItems.ARTICHOKE_SEEDS, "Artichoke Seeds");
        translationBuilder.add(ModItems.ARTICHOKE, "Artichoke");

        translationBuilder.add(ModItems.BEET_SEEDS, "Beet Seeds");
        translationBuilder.add(ModItems.BEET, "Beet");

        translationBuilder.add(ModItems.BLUEBERRY_SEEDS, "Blueberry Seeds");
        translationBuilder.add(ModItems.BLUEBERRY, "Blueberry");

        translationBuilder.add(ModItems.BLUE_JAZZ_SEEDS, "Blue Jazz Seeds");
        translationBuilder.add(ModItems.BLUE_JAZZ, "Blue Jazz");

        translationBuilder.add(ModItems.BOK_CHOY_SEEDS, "Bok Choy Seeds");
        translationBuilder.add(ModItems.BOK_CHOY, "Bok Choy");

        translationBuilder.add(ModItems.BROCCOLI_SEEDS, "Broccoli Seeds");
        translationBuilder.add(ModItems.BROCCOLI, "Broccoli");

        translationBuilder.add(ModItems.CACTUS_FRUIT_SEEDS, "Cactus Fruit Seeds");
        translationBuilder.add(ModItems.CACTUS_FRUIT, "Cactus Fruit");

        translationBuilder.add(ModItems.CARROT_SEEDS, "Carrot Seeds");
        translationBuilder.add(ModItems.CARROT, "Carrot");

        translationBuilder.add(ModItems.CORN_SEEDS, "Corn Seeds");
        translationBuilder.add(ModItems.CORN, "Corn");

        translationBuilder.add(ModItems.CRANBERRIES_SEEDS, "Cranberries Seeds");
        translationBuilder.add(ModItems.CRANBERRIES, "Cranberries");

        translationBuilder.add(ModItems.EGGPLANT_SEEDS, "Eggplant Seeds");
        translationBuilder.add(ModItems.EGGPLANT, "Eggplant");

        translationBuilder.add(ModItems.FAIRY_ROSE_SEEDS, "Fairy Rose Seeds");
        translationBuilder.add(ModItems.FAIRY_ROSE, "Fairy Rose");

        translationBuilder.add(ModItems.FIBER_SEEDS, "Fiber Seeds");
        translationBuilder.add(ModItems.FIBER, "Fiber");

        translationBuilder.add(ModItems.GARLIC_SEEDS, "Garlic Seeds");
        translationBuilder.add(ModItems.GARLIC, "Garlic");

        translationBuilder.add(ModItems.GRAPE_SEEDS, "Grape Seeds");
        translationBuilder.add(ModItems.GRAPE, "Grape");

        translationBuilder.add(ModItems.GREEN_BEAN_SEEDS, "Green Bean Seeds");
        translationBuilder.add(ModItems.GREEN_BEAN, "Green Bean");

        translationBuilder.add(ModItems.HOPS_SEEDS, "Hops Seeds");
        translationBuilder.add(ModItems.HOPS, "Hops");

        translationBuilder.add(ModItems.HOT_PEPPER_SEEDS, "Hot Pepper Seeds");
        translationBuilder.add(ModItems.HOT_PEPPER, "Hot Pepper");

        translationBuilder.add(ModItems.KALE_SEEDS, "Kale Seeds");
        translationBuilder.add(ModItems.KALE, "Kale");

        translationBuilder.add(ModItems.MELON_SEEDS, "Melon Seeds");
        translationBuilder.add(ModItems.MELON, "Melon");

        translationBuilder.add(ModItems.PARSNIP_SEEDS, "Parsnip Seeds");
        translationBuilder.add(ModItems.PARSNIP, "Parsnip");

        translationBuilder.add(ModItems.PINEAPPLE_SEEDS, "Pineapple Seeds");
        translationBuilder.add(ModItems.PINEAPPLE, "Pineapple");

        translationBuilder.add(ModItems.POPPY_SEEDS, "Poppy Seeds");
        translationBuilder.add(ModItems.POPPY, "Poppy");

        translationBuilder.add(ModItems.POTATO_SEEDS, "Potato Seeds");
        translationBuilder.add(ModItems.POTATO, "Potato");

        translationBuilder.add(ModItems.POWDERMELON_SEEDS, "Powdermelon Seeds");
        translationBuilder.add(ModItems.POWDERMELON, "Powdermelon");

        translationBuilder.add(ModItems.PUMPKIN_SEEDS, "Pumpkin Seeds");
        translationBuilder.add(ModItems.PUMPKIN, "Pumpkin");

        translationBuilder.add(ModItems.QI_FRUIT_SEEDS, "Qi Fruit Seeds");
        translationBuilder.add(ModItems.QI_FRUIT, "Qi Fruit");

        translationBuilder.add(ModItems.RADISH_SEEDS, "Radish Seeds");
        translationBuilder.add(ModItems.RADISH, "Radish");

        translationBuilder.add(ModItems.RARE_SEEDS, "Rare Seeds");
        translationBuilder.add(ModItems.RARE, "Sweet Gem Berry");

        translationBuilder.add(ModItems.RED_CABBAGE_SEEDS, "Red Cabbage Seeds");
        translationBuilder.add(ModItems.RED_CABBAGE, "Red Cabbage");

        translationBuilder.add(ModItems.RHUBARB_SEEDS, "Rhubarb Seeds");
        translationBuilder.add(ModItems.RHUBARB, "Rhubarb");

        translationBuilder.add(ModItems.RICE_SEEDS, "Rice Seeds");
        translationBuilder.add(ModItems.RICE, "Rice");

        translationBuilder.add(ModItems.SPANGLE_SEEDS, "Spangle Seeds");
        translationBuilder.add(ModItems.SPANGLE, "Spangle");

        translationBuilder.add(ModItems.STARFRUIT_SEEDS, "Starfruit Seeds");
        translationBuilder.add(ModItems.STARFRUIT, "Starfruit");

        translationBuilder.add(ModItems.STRAWBERRY_SEEDS, "Strawberry Seeds");
        translationBuilder.add(ModItems.STRAWBERRY, "Strawberry");

        translationBuilder.add(ModItems.SUMMER_SQUASH_SEEDS, "Summer Squash Seeds");
        translationBuilder.add(ModItems.SUMMER_SQUASH, "Summer Squash");

        translationBuilder.add(ModItems.SUNFLOWER_SEEDS, "Sunflower Seeds");
        translationBuilder.add(ModItems.SUNFLOWER, "Sunflower");

        translationBuilder.add(ModItems.TARO_ROOT, "Taro Root");
        translationBuilder.add(ModItems.TARO_ROOT_SEEDS, "Taro Root Seeds");

        translationBuilder.add(ModItems.TEA_LEAVES, "Tea Leaves");
        translationBuilder.add(ModItems.TEA_LEAVES_SEEDS, "Tea Leaves Seeds");

        translationBuilder.add(ModItems.TOMATO_SEEDS, "Tomato Seeds");
        translationBuilder.add(ModItems.TOMATO, "Tomato");

        translationBuilder.add(ModItems.TULIP_SEEDS, "Tulip Seeds");
        translationBuilder.add(ModItems.TULIP, "Tulip");

        translationBuilder.add(ModItems.WHEAT_SEEDS, "Wheat Seeds");
        translationBuilder.add(ModItems.WHEAT, "Wheat");

        translationBuilder.add(ModItems.YAM_SEEDS, "Yam Seeds");
        translationBuilder.add(ModItems.YAM, "Yam");







        //音乐唱片
        translationBuilder.add(ModItems.CLOUD_COUNTRY_MUSIC_DISC, "Cloud Country Music Disc");
        translationBuilder.add(ModItems.COUNTRY_SHOP_MUSIC_DISC, "Country Shop Music Disc");
        translationBuilder.add(ModItems.FAIR_THEME_MUSIC_DISC, "Fair Theme Music Disc");
        translationBuilder.add(ModItems.FALL1_MUSIC_DISC, "Fall 1 Music Disc");
        translationBuilder.add(ModItems.FALL2_MUSIC_DISC, "Fall 2 Music Disc");
        translationBuilder.add(ModItems.FALL3_MUSIC_DISC, "Fall 3 Music Disc");
        translationBuilder.add(ModItems.FLOWER_DANCE_MUSIC_DISC, "Flower Dance Music Disc");
        translationBuilder.add(ModItems.FUN_FESTIVAL_MUSIC_DISC, "Fun Festival Music Disc");
        translationBuilder.add(ModItems.GRANDPA_MUSIC_DISC, "Grandpa's Music Disc");
        translationBuilder.add(ModItems.OVERTURE_MUSIC_DISC, "Overture Music Disc");
        translationBuilder.add(ModItems.PELICAN_TOWN_MUSIC_DISC, "Pelican Town Music Disc");
        translationBuilder.add(ModItems.SPRING1_MUSIC_DISC, "Spring 1 Music Disc");
        translationBuilder.add(ModItems.SPRING2_MUSIC_DISC, "Spring 2 Music Disc");
        translationBuilder.add(ModItems.SPRING3_MUSIC_DISC, "Spring 3 Music Disc");
        translationBuilder.add(ModItems.SUMMER1_MUSIC_DISC, "Summer 1 Music Disc");
        translationBuilder.add(ModItems.SUMMER2_MUSIC_DISC, "Summer 2 Music Disc");
        translationBuilder.add(ModItems.SUMMER3_MUSIC_DISC, "Summer 3 Music Disc");
        translationBuilder.add(ModItems.WEDDING_CELEBRATION_MUSIC_DISC, "Wedding Celebration Music Disc");
        translationBuilder.add(ModItems.WINTER1_MUSIC_DISC, "Winter 1 Music Disc");
        translationBuilder.add(ModItems.WINTER2_MUSIC_DISC, "Winter 2 Music Disc");
        translationBuilder.add(ModItems.WINTER3_MUSIC_DISC, "Winter 3 Music Disc");
        translationBuilder.add(ModItems.WINTER_FESTIVAL_MUSIC_DISC, "Winter Festival Music Disc");
        translationBuilder.add(ModItems.WOOD_MUSIC_DISC, "Wood Music Disc");



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