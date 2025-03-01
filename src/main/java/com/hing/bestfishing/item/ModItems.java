package com.hing.bestfishing.item;

import com.hing.bestfishing.BestFishingMod;

import com.hing.bestfishing.block.ModBlocks;
import com.hing.bestfishing.sounds.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {


    //音乐盒
    public static final Item CLOUD_COUNTRY_MUSIC_DISC = registerItems("cloud_country_music_disc",
            new MusicDiscItem(7, ModSounds.CLOUD_COUNTRY, new FabricItemSettings().maxCount(1), 240));
    public static final Item COUNTRY_SHOP_MUSIC_DISC = registerItems("country_shop_music_disc",
            new MusicDiscItem(7, ModSounds.COUNTRY_SHOP, new FabricItemSettings().maxCount(1), 240));
    public static final Item FAIR_THEME_MUSIC_DISC = registerItems("fair_theme_music_disc",
            new MusicDiscItem(7, ModSounds.FAIR_THEME, new FabricItemSettings().maxCount(1), 240));
    public static final Item FALL1_MUSIC_DISC = registerItems("fall1_music_disc",
            new MusicDiscItem(7, ModSounds.FALL1, new FabricItemSettings().maxCount(1), 240));
    public static final Item FALL2_MUSIC_DISC = registerItems("fall2_music_disc",
            new MusicDiscItem(7, ModSounds.FALL2, new FabricItemSettings().maxCount(1), 240));
    public static final Item FALL3_MUSIC_DISC = registerItems("fall3_music_disc",
            new MusicDiscItem(7, ModSounds.FALL3, new FabricItemSettings().maxCount(1), 240));
    public static final Item FLOWER_DANCE_MUSIC_DISC = registerItems("flower_dance_music_disc",
            new MusicDiscItem(7, ModSounds.FLOWER_DANCE, new FabricItemSettings().maxCount(1), 240));
    public static final Item FUN_FESTIVAL_MUSIC_DISC = registerItems("fun_festival_music_disc",
            new MusicDiscItem(7, ModSounds.FUN_FESTIVAL, new FabricItemSettings().maxCount(1), 240));
    public static final Item GRANDPA_MUSIC_DISC = registerItems("grandpa_music_disc",
            new MusicDiscItem(7, ModSounds.GRANDPA, new FabricItemSettings().maxCount(1), 240));
    public static final Item OVERTURE_MUSIC_DISC = registerItems("overture_music_disc",
            new MusicDiscItem(7, ModSounds.OVERTURE, new FabricItemSettings().maxCount(1), 240));
    public static final Item PELICAN_TOWN_MUSIC_DISC = registerItems("pelican_town_music_disc",
            new MusicDiscItem(7, ModSounds.PELICAN_TOWN, new FabricItemSettings().maxCount(1), 240));
    public static final Item SPRING1_MUSIC_DISC = registerItems("spring1_music_disc",
            new MusicDiscItem(7, ModSounds.SPRING1, new FabricItemSettings().maxCount(1), 240));
    public static final Item SPRING2_MUSIC_DISC = registerItems("spring2_music_disc",
            new MusicDiscItem(7, ModSounds.SPRING2, new FabricItemSettings().maxCount(1), 240));
    public static final Item SPRING3_MUSIC_DISC = registerItems("spring3_music_disc",
            new MusicDiscItem(7, ModSounds.SPRING3, new FabricItemSettings().maxCount(1), 240));
    public static final Item SUMMER1_MUSIC_DISC = registerItems("summer1_music_disc",
            new MusicDiscItem(7, ModSounds.SUMMER1, new FabricItemSettings().maxCount(1), 240));
    public static final Item SUMMER2_MUSIC_DISC = registerItems("summer2_music_disc",
            new MusicDiscItem(7, ModSounds.SUMMER2, new FabricItemSettings().maxCount(1), 240));
    public static final Item SUMMER3_MUSIC_DISC = registerItems("summer3_music_disc",
            new MusicDiscItem(7, ModSounds.SUMMER3, new FabricItemSettings().maxCount(1), 240));
    public static final Item WEDDING_CELEBRATION_MUSIC_DISC = registerItems("wedding_celebration_music_disc",
            new MusicDiscItem(7, ModSounds.WEDDING_CELEBRATION, new FabricItemSettings().maxCount(1), 240));
    public static final Item WINTER1_MUSIC_DISC = registerItems("winter1_music_disc",
            new MusicDiscItem(7, ModSounds.WINTER1, new FabricItemSettings().maxCount(1), 240));
    public static final Item WINTER2_MUSIC_DISC = registerItems("winter2_music_disc",
            new MusicDiscItem(7, ModSounds.WINTER2, new FabricItemSettings().maxCount(1), 240));
    public static final Item WINTER3_MUSIC_DISC = registerItems("winter3_music_disc",
            new MusicDiscItem(7, ModSounds.WINTER3, new FabricItemSettings().maxCount(1), 240));
    public static final Item WINTER_FESTIVAL_MUSIC_DISC = registerItems("winter_festival_music_disc",
            new MusicDiscItem(7, ModSounds.WINTER_FESTIVAL, new FabricItemSettings().maxCount(1), 240));
    public static final Item WOOD_MUSIC_DISC = registerItems("wood_music_disc",
            new MusicDiscItem(7, ModSounds.WOOD, new FabricItemSettings().maxCount(1), 240));


    //生鱼片注册（加工产品）
    public static final Item SHENGYUPIAN = registerItem("shengyupian", new Item(new Item.Settings().food(ModFoodComponents.SHENGYUPIAN)));



    //农作物以及种子
    public static final Item CAULIFLOWER_SEEDS = registerItems("cauliflower_seeds",
            new AliasedBlockItem(ModBlocks.CAULIFLOWER, new Item.Settings()));
    public static final Item CAULIFLOWER = registerItem("cauliflower", new Item(new Item.Settings().food(ModFoodComponents.CAULIFLOWER)));

    //农作物以及种子
    public static final Item AMARANTH_SEEDS = registerItems("amaranth_seeds",
            new AliasedBlockItem(ModBlocks.AMARANTH, new Item.Settings()));
    public static final Item AMARANTH = registerItem("amaranth", new Item(new Item.Settings().food(ModFoodComponents.AMARANTH)));

    public static final Item ANCIENT_FRUIT_SEEDS = registerItems("ancient_fruit_seeds",
            new AliasedBlockItem(ModBlocks.ANCIENT_FRUIT, new Item.Settings()));
    public static final Item ANCIENT_FRUIT = registerItem("ancient_fruit", new Item(new Item.Settings().food(ModFoodComponents.ANCIENT_FRUIT)));

    public static final Item ARTICHOKE_SEEDS = registerItems("artichoke_seeds",
            new AliasedBlockItem(ModBlocks.ARTICHOKE, new Item.Settings()));
    public static final Item ARTICHOKE = registerItem("artichoke", new Item(new Item.Settings().food(ModFoodComponents.ARTICHOKE)));

    public static final Item BEET_SEEDS = registerItems("beet_seeds",
            new AliasedBlockItem(ModBlocks.BEET, new Item.Settings()));
    public static final Item BEET = registerItem("beet", new Item(new Item.Settings().food(ModFoodComponents.BEET)));

    public static final Item BLUEBERRY_SEEDS = registerItems("blueberry_seeds",
            new AliasedBlockItem(ModBlocks.BLUEBERRY, new Item.Settings()));
    public static final Item BLUEBERRY = registerItem("blueberry", new Item(new Item.Settings().food(ModFoodComponents.BLUEBERRY)));

    public static final Item BLUE_JAZZ_SEEDS = registerItems("blue_jazz_seeds",
            new AliasedBlockItem(ModBlocks.BLUE_JAZZ, new Item.Settings()));
    public static final Item BLUE_JAZZ = registerItem("blue_jazz", new Item(new Item.Settings().food(ModFoodComponents.BLUE_JAZZ)));

    public static final Item BOK_CHOY_SEEDS = registerItems("bok_choy_seeds",
            new AliasedBlockItem(ModBlocks.BOK_CHOY, new Item.Settings()));
    public static final Item BOK_CHOY = registerItem("bok_choy", new Item(new Item.Settings().food(ModFoodComponents.BOK_CHOY)));

    public static final Item BROCCOLI_SEEDS = registerItems("broccoli_seeds",
            new AliasedBlockItem(ModBlocks.BROCCOLI, new Item.Settings()));
    public static final Item BROCCOLI = registerItem("broccoli", new Item(new Item.Settings().food(ModFoodComponents.BROCCOLI)));

    public static final Item CACTUS_FRUIT_SEEDS = registerItems("cactus_fruit_seeds",
            new AliasedBlockItem(ModBlocks.CACTUS_FRUIT, new Item.Settings()));
    public static final Item CACTUS_FRUIT = registerItem("cactus_fruit", new Item(new Item.Settings().food(ModFoodComponents.CACTUS_FRUIT)));

    public static final Item CARROT_SEEDS = registerItems("carrot_seeds",
            new AliasedBlockItem(ModBlocks.CARROT, new Item.Settings()));
    public static final Item CARROT = registerItem("carrot", new Item(new Item.Settings().food(ModFoodComponents.CARROT)));

    public static final Item CORN_SEEDS = registerItems("corn_seeds",
            new AliasedBlockItem(ModBlocks.CORN, new Item.Settings()));
    public static final Item CORN = registerItem("corn", new Item(new Item.Settings().food(ModFoodComponents.CORN)));

    public static final Item CRANBERRIES_SEEDS = registerItems("cranberries_seeds",
            new AliasedBlockItem(ModBlocks.CRANBERRIES, new Item.Settings()));
    public static final Item CRANBERRIES = registerItem("cranberries", new Item(new Item.Settings().food(ModFoodComponents.CRANBERRIES)));

    public static final Item EGGPLANT_SEEDS = registerItems("eggplant_seeds",
            new AliasedBlockItem(ModBlocks.EGGPLANT, new Item.Settings()));
    public static final Item EGGPLANT = registerItem("eggplant", new Item(new Item.Settings().food(ModFoodComponents.EGGPLANT)));

    public static final Item FAIRY_ROSE_SEEDS = registerItems("fairy_rose_seeds",
            new AliasedBlockItem(ModBlocks.FAIRY_ROSE, new Item.Settings()));
    public static final Item FAIRY_ROSE = registerItem("fairy_rose", new Item(new Item.Settings().food(ModFoodComponents.FAIRY_ROSE)));

    public static final Item FIBER_SEEDS = registerItems("fiber_seeds",
            new AliasedBlockItem(ModBlocks.FIBER, new Item.Settings()));
    public static final Item FIBER = registerItem("fiber", new Item(new Item.Settings().food(ModFoodComponents.FIBER)));

    public static final Item GARLIC_SEEDS = registerItems("garlic_seeds",
            new AliasedBlockItem(ModBlocks.GARLIC, new Item.Settings()));
    public static final Item GARLIC = registerItem("garlic", new Item(new Item.Settings().food(ModFoodComponents.GARLIC)));

    public static final Item GRAPE_SEEDS = registerItems("grape_seeds",
            new AliasedBlockItem(ModBlocks.GRAPE, new Item.Settings()));
    public static final Item GRAPE = registerItem("grape", new Item(new Item.Settings().food(ModFoodComponents.GRAPE)));

    public static final Item GREEN_BEAN_SEEDS = registerItems("green_bean_seeds",
            new AliasedBlockItem(ModBlocks.GREEN_BEAN, new Item.Settings()));
    public static final Item GREEN_BEAN = registerItem("green_bean", new Item(new Item.Settings().food(ModFoodComponents.GREEN_BEAN)));

    public static final Item HOPS_SEEDS = registerItems("hops_seeds",
            new AliasedBlockItem(ModBlocks.HOPS, new Item.Settings()));
    public static final Item HOPS = registerItem("hops", new Item(new Item.Settings().food(ModFoodComponents.HOPS)));

    public static final Item HOT_PEPPER_SEEDS = registerItems("hot_pepper_seeds",
            new AliasedBlockItem(ModBlocks.HOT_PEPPER, new Item.Settings()));
    public static final Item HOT_PEPPER = registerItem("hot_pepper", new Item(new Item.Settings().food(ModFoodComponents.HOT_PEPPER)));


    public static final Item KALE_SEEDS = registerItems("kale_seeds",
            new AliasedBlockItem(ModBlocks.KALE, new Item.Settings()));
    public static final Item KALE = registerItem("kale", new Item(new Item.Settings().food(ModFoodComponents.KALE)));

    public static final Item MELON_SEEDS = registerItems("melon_seeds",
            new AliasedBlockItem(ModBlocks.MELON, new Item.Settings()));
    public static final Item MELON = registerItem("melon", new Item(new Item.Settings().food(ModFoodComponents.MELON)));



    public static final Item PARSNIP_SEEDS = registerItems("parsnip_seeds",
            new AliasedBlockItem(ModBlocks.PARSNIP, new Item.Settings()));
    public static final Item PARSNIP = registerItem("parsnip", new Item(new Item.Settings().food(ModFoodComponents.PARSNIP)));

    public static final Item PINEAPPLE_SEEDS = registerItems("pineapple_seeds",
            new AliasedBlockItem(ModBlocks.PINEAPPLE, new Item.Settings()));
    public static final Item PINEAPPLE = registerItem("pineapple", new Item(new Item.Settings().food(ModFoodComponents.PINEAPPLE)));

    public static final Item POPPY_SEEDS = registerItems("poppy_seeds",
            new AliasedBlockItem(ModBlocks.POPPY, new Item.Settings()));
    public static final Item POPPY = registerItem("poppy", new Item(new Item.Settings().food(ModFoodComponents.POPPY)));

    public static final Item POTATO_SEEDS = registerItems("potato_seeds",
            new AliasedBlockItem(ModBlocks.POTATO, new Item.Settings()));
    public static final Item POTATO = registerItem("potato", new Item(new Item.Settings().food(ModFoodComponents.POTATO)));

    public static final Item POWDERMELON_SEEDS = registerItems("powdermelon_seeds",
            new AliasedBlockItem(ModBlocks.POWDERMELON, new Item.Settings()));
    public static final Item POWDERMELON = registerItem("powdermelon", new Item(new Item.Settings().food(ModFoodComponents.POWDERMELON)));

    public static final Item PUMPKIN_SEEDS = registerItems("pumpkin_seeds",
            new AliasedBlockItem(ModBlocks.PUMPKIN, new Item.Settings()));
    public static final Item PUMPKIN = registerItem("pumpkin", new Item(new Item.Settings().food(ModFoodComponents.PUMPKIN)));

    public static final Item QI_FRUIT_SEEDS = registerItems("qi_fruit_seeds",
            new AliasedBlockItem(ModBlocks.QI_FRUIT, new Item.Settings()));
    public static final Item QI_FRUIT = registerItem("qi_fruit", new Item(new Item.Settings().food(ModFoodComponents.QI_FRUIT)));

    public static final Item RADISH_SEEDS = registerItems("radish_seeds",
            new AliasedBlockItem(ModBlocks.RADISH, new Item.Settings()));
    public static final Item RADISH = registerItem("radish", new Item(new Item.Settings().food(ModFoodComponents.RADISH)));

    public static final Item RARE_SEEDS = registerItem("rare_seeds",
            new AliasedBlockItem(ModBlocks.RARE, new Item.Settings()));
    public static final Item RARE = registerItem("sweet_gem_berry", new Item(new Item.Settings().food(ModFoodComponents.RARE)));



    public static final Item RED_CABBAGE_SEEDS = registerItems("red_cabbage_seeds",
            new AliasedBlockItem(ModBlocks.RED_CABBAGE, new Item.Settings()));
    public static final Item RED_CABBAGE = registerItem("red_cabbage", new Item(new Item.Settings().food(ModFoodComponents.RED_CABBAGE)));

    public static final Item RHUBARB_SEEDS = registerItems("rhubarb_seeds",
            new AliasedBlockItem(ModBlocks.RHUBARB, new Item.Settings()));
    public static final Item RHUBARB = registerItem("rhubarb", new Item(new Item.Settings().food(ModFoodComponents.RHUBARB)));

    public static final Item RICE_SEEDS = registerItem("rice_seeds",
            new AliasedBlockItem(ModBlocks.RICE, new Item.Settings()));
    public static final Item RICE = registerItem("rice", new Item(new Item.Settings().food(ModFoodComponents.RICE)));

    public static final Item SPANGLE_SEEDS = registerItems("spangle_seeds",
            new AliasedBlockItem(ModBlocks.SPANGLE, new Item.Settings()));
    public static final Item SPANGLE = registerItem("spangle", new Item(new Item.Settings().food(ModFoodComponents.SPANGLE)));

    public static final Item STARFRUIT_SEEDS = registerItems("starfruit_seeds",
            new AliasedBlockItem(ModBlocks.STARFRUIT, new Item.Settings()));
    public static final Item STARFRUIT = registerItem("starfruit", new Item(new Item.Settings().food(ModFoodComponents.STARFRUIT)));

    public static final Item STRAWBERRY_SEEDS = registerItems("strawberry_seeds",
            new AliasedBlockItem(ModBlocks.STRAWBERRY, new Item.Settings()));
    public static final Item STRAWBERRY = registerItem("strawberry", new Item(new Item.Settings().food(ModFoodComponents.STRAWBERRY)));



    public static final Item SUMMER_SQUASH_SEEDS = registerItems("summer_squash_seeds",
            new AliasedBlockItem(ModBlocks.SUMMER_SQUASH, new Item.Settings()));
    public static final Item SUMMER_SQUASH = registerItem("summer_squash", new Item(new Item.Settings().food(ModFoodComponents.SUMMER_SQUASH)));

    public static final Item SUNFLOWER_SEEDS = registerItems("sunflower_seeds",
            new AliasedBlockItem(ModBlocks.SUNFLOWER, new Item.Settings()));
    public static final Item SUNFLOWER = registerItem("sunflower", new Item(new Item.Settings().food(ModFoodComponents.SUNFLOWER)));


    public static final Item TARO_ROOT = registerItem("taro_root", new Item(new Item.Settings().food(ModFoodComponents.TARO_ROOT)));
    public static final Item TARO_ROOT_SEEDS = registerItem("taro_root_seeds",
            new AliasedBlockItem(ModBlocks.TARO, new Item.Settings()));

    public static final Item TEA_LEAVES = registerItem("tea", new Item(new Item.Settings()));
    public static final Item TEA_LEAVES_SEEDS = registerItem("tea_leaves_seeds",
            new AliasedBlockItem(ModBlocks.TEA_LEAVES, new Item.Settings()));

    public static final Item TOMATO_SEEDS = registerItems("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO, new Item.Settings()));
    public static final Item TOMATO = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.TOMATO)));

    public static final Item TULIP_SEEDS = registerItems("tulip_seeds",
            new AliasedBlockItem(ModBlocks.TULIP, new Item.Settings()));
    public static final Item TULIP = registerItem("tulip", new Item(new Item.Settings().food(ModFoodComponents.TULIP)));


    public static final Item WHEAT_SEEDS = registerItems("wheat_seeds",
            new AliasedBlockItem(ModBlocks.WHEAT, new Item.Settings()));
    public static final Item WHEAT = registerItem("wheat", new Item(new Item.Settings().food(ModFoodComponents.WHEAT)));

    public static final Item YAM_SEEDS = registerItems("yam_seeds",
            new AliasedBlockItem(ModBlocks.YAM, new Item.Settings()));
    public static final Item YAM = registerItem("yam", new Item(new Item.Settings().food(ModFoodComponents.YAM)));















    //钓鱼垃圾注册
    public static final Item BROKEN_CD = registerItem("broken_cd", new Item(new Item.Settings()));
    public static final Item BROKEN_GLASSES = registerItem("broken_glasses", new Item(new Item.Settings()));
    public static final Item DRIFTWOOD = registerItem("driftwood", new Item(new Item.Settings()));
    public static final Item JOJA_COLA = registerItem("joja_cola", new Item(new Item.Settings().food(ModFoodComponents.JOJACOLA)));
    public static final Item ROTTEN_PLANT = registerItem("rotten_plant", new Item(new Item.Settings()));
    public static final Item SOGGY_NEWSPAPER = registerItem("soggy_newspaper", new Item(new Item.Settings()));
    public static final Item TRASH = registerItem("trash", new Item(new Item.Settings()));



    //武器注册
    //该物品为隐藏物品，用于模组剑类武器的注册，无贴图也不显示在物品栏中，匕首类武器的注册在下
    public  static final Item BASIC_SWORD = registerItem("basic_sword", new Item(new Item.Settings()));
    //正式注册
    public static final Item BONE_SWORD = registerItems("bone_sword", new SwordItem(ModToolMaterials.BASIC_SWORD, 3, -2.0f, new Item.Settings()));
    public static final Item CLAYMORE = registerItems("claymore", new SwordItem(ModToolMaterials.BASIC_SWORD, 2, -2.0f, new Item.Settings()));
    public static final Item CUTLASS = registerItems("cutlass", new SwordItem(ModToolMaterials.BASIC_SWORD, 2, -2.0f, new Item.Settings()));
    public static final Item DARK_SWORD = registerItems("dark_sword", new SwordItem(ModToolMaterials.BASIC_SWORD, 4, -2.0f, new Item.Settings()));
    public static final Item DRAGONTOOTH_CUTLASS = registerItems("dragontooth_cutlass", new SwordItem(ModToolMaterials.BASIC_SWORD, 9, -2.0f, new Item.Settings()));
    public static final Item DWARF_SWORD = registerItems("dwarf_sword", new SwordItem(ModToolMaterials.BASIC_SWORD, 7, -2.0f, new Item.Settings()));
    public static final Item FOREST_SWORD = registerItems("forest_sword", new SwordItem(ModToolMaterials.BASIC_SWORD, 2, -2.0f, new Item.Settings()));
    public static final Item GALAXY_SWORD = registerItems("galaxy_sword", new SwordItem(ModToolMaterials.BASIC_SWORD, 8, -2.0f, new Item.Settings()));
    public static final Item HALEYS_IRON = registerItems("haleys_iron", new SwordItem(ModToolMaterials.BASIC_SWORD, 5, -2.0f, new Item.Settings()));
    public static final Item HOLY_BLADE = registerItems("holy_blade", new SwordItem(ModToolMaterials.BASIC_SWORD, 3, -2.0f, new Item.Settings()));
    public static final Item INFINITY_BLADE = registerItems("infinity_blade", new SwordItem(ModToolMaterials.BASIC_SWORD, 10, -2.0f, new Item.Settings()));
    public static final Item INSECT_HEAD = registerItems("insect_head", new SwordItem(ModToolMaterials.BASIC_SWORD, 3, -2.0f, new Item.Settings()));
    public static final Item IRON_EDGE = registerItems("iron_edge", new SwordItem(ModToolMaterials.BASIC_SWORD, 2, -2.0f, new Item.Settings()));
    public static final Item LAVA_KATANA = registerItems("lava_katana", new SwordItem(ModToolMaterials.BASIC_SWORD, 7, -2.0f, new Item.Settings().fireproof()));
    public static final Item LEAHS_WHITTLER = registerItems("leahs_whittler", new SwordItem(ModToolMaterials.BASIC_SWORD, 5, -2.0f, new Item.Settings()));
    public static final Item MEOWMERE = registerItems("meowmere", new SwordItem(ModToolMaterials.BASIC_SWORD, 10, -2.0f, new Item.Settings()));
    public static final Item NEPTUNES_GLAIVE = registerItems("neptunes_glaive", new SwordItem(ModToolMaterials.BASIC_SWORD, 3, -2.0f, new Item.Settings()));
    public static final Item OBSIDIAN_EDGE = registerItems("obsidian_edge", new SwordItem(ModToolMaterials.BASIC_SWORD, 5, -2.0f, new Item.Settings()));
    public static final Item OSSIFIED_BLADE = registerItems("ossified_blade", new SwordItem(ModToolMaterials.BASIC_SWORD, 4, -2.0f, new Item.Settings()));
    public static final Item PIRATES_SWORD = registerItems("pirates_sword", new SwordItem(ModToolMaterials.BASIC_SWORD, 1, -2.0f, new Item.Settings()));
    public static final Item RUSTY_SWORD = registerItems("rusty_sword", new SwordItem(ModToolMaterials.BASIC_SWORD, 0, -2.0f, new Item.Settings()));
    public static final Item SILVER_SABER = registerItems("silver_saber", new SwordItem(ModToolMaterials.BASIC_SWORD, 1, -2.0f, new Item.Settings()));
    public static final Item STEEL_FALCHION = registerItems("steel_falchion", new SwordItem(ModToolMaterials.BASIC_SWORD, 2, -2.0f, new Item.Settings()));
    public static final Item STEEL_SMALLSWORD = registerItems("steel_smallsword", new SwordItem(ModToolMaterials.BASIC_SWORD, 0, -2.0f, new Item.Settings()));
    public static final Item TEMPERED_BROADSWORD = registerItems("tempered_broadsword", new SwordItem(ModToolMaterials.BASIC_SWORD, 4, -2.0f, new Item.Settings()));
    public static final Item TEMPLARS_BLADE = registerItems("templars_blade", new SwordItem(ModToolMaterials.BASIC_SWORD, 3, -2.0f, new Item.Settings()));
    public static final Item YETI_TOOTH = registerItems("yeti_tooth", new SwordItem(ModToolMaterials.BASIC_SWORD, 4, -2.0f, new Item.Settings()));







    //鱼类注册（钓鱼所得）
    public static final Item HETUN = registerItem("hetun", new Item(new Item.Settings().food(ModFoodComponents.HETUN)));
    public static final Item TIYU = registerItem("tiyu", new Item(new Item.Settings().food(ModFoodComponents.TIYU)));
    public static final Item JINQIANGYU = registerItem("jinqiangyu", new Item(new Item.Settings().food(ModFoodComponents.JINQIANGYU)));
    public static final Item SHADINGYU = registerItem("shadingyu", new Item(new Item.Settings().food(ModFoodComponents.SHADINGYU)));
    public static final Item CHOUYU = registerItem("chouyu", new Item(new Item.Settings().food(ModFoodComponents.CHOUYU)));
    public static final Item DAZUILUYU = registerItem("dazuiluyu", new Item(new Item.Settings().food(ModFoodComponents.DAZUILUYU)));
    public static final Item XIAOZUILUYU = registerItem("xiaozuiluyu", new Item(new Item.Settings().food(ModFoodComponents.XIAOZUILUYU)));
    public static final Item HONGZUNYU = registerItem("hongzunyu", new Item(new Item.Settings().food(ModFoodComponents.HONGZUNYU)));
    public static final Item GUIYU = registerItem("guiyu", new Item(new Item.Settings().food(ModFoodComponents.GUIYU)));
    public static final Item DAYANYU = registerItem("dayanyu", new Item(new Item.Settings().food(ModFoodComponents.DAYANYU)));
    public static final Item HELU = registerItem("helu", new Item(new Item.Settings().food(ModFoodComponents.HELU)));
    public static final Item LIYU = registerItem("liyu", new Item(new Item.Settings().food(ModFoodComponents.LIYU)));
    public static final Item NIANYU = registerItem("nianyu", new Item(new Item.Settings().food(ModFoodComponents.NIANYU)));
    public static final Item GOUYU = registerItem("gouyu", new Item(new Item.Settings().food(ModFoodComponents.GOUYU)));
    public static final Item TAIYANGYU = registerItem("taiyangyu", new Item(new Item.Settings().food(ModFoodComponents.TAIYANGYU)));
    public static final Item HONGJIYU = registerItem("hongjiyu", new Item(new Item.Settings().food(ModFoodComponents.HONGJIYU)));
    public static final Item FEIYU = registerItem("feiyu", new Item(new Item.Settings().food(ModFoodComponents.FEIYU)));
    public static final Item MANYU = registerItem("manyu", new Item(new Item.Settings().food(ModFoodComponents.MANYU)));
    public static final Item ZHANGYU = registerItem("zhangyu", new Item(new Item.Settings().food(ModFoodComponents.ZHANGYU)));
    public static final Item HONGDIAOYU = registerItem("hongdiaoyu", new Item(new Item.Settings().food(ModFoodComponents.HONGDIAOYU)));
    public static final Item YOUYU = registerItem("youyu", new Item(new Item.Settings().food(ModFoodComponents.YOUYU)));
    public static final Item HAISHEN = registerItem("haishen", new Item(new Item.Settings().food(ModFoodComponents.HAISHEN)));
    public static final Item DAHAISHEN = registerItem("dahaishen", new Item(new Item.Settings().food(ModFoodComponents.DAHAISHEN)));
    public static final Item GUI3YU = registerItem("gui3yu", new Item(new Item.Settings().food(ModFoodComponents.GUI3YU)));
    public static final Item SHIYU = registerItem("shiyu", new Item(new Item.Settings().food(ModFoodComponents.SHIYU)));
    public static final Item BINGZHUYU = registerItem("bingzhuyu", new Item(new Item.Settings().food(ModFoodComponents.BINGZHUYU)));
    public static final Item YANJIANGMANYU = registerItem("yanjiangmanyu", new Item(new Item.Settings().food(ModFoodComponents.YANJIANGMANYU)));
    public static final Item SHAYU = registerItem("shayu", new Item(new Item.Settings().food(ModFoodComponents.SHAYU)));
    public static final Item XIELIYU = registerItem("xieliyu", new Item(new Item.Settings().food(ModFoodComponents.XIELIYU)));
    public static final Item BIMUYU = registerItem("bimuyu", new Item(new Item.Settings().food(ModFoodComponents.BIMUYU)));
    public static final Item WUYELIYU = registerItem("wuyeliyu", new Item(new Item.Settings().food(ModFoodComponents.WUYELIYU)));
    public static final Item XUNYU = registerItem("xunyu", new Item(new Item.Settings().food(ModFoodComponents.XUNYU)));
    public static final Item HUWENZUNYU = registerItem("huwenzunyu", new Item(new Item.Settings().food(ModFoodComponents.HUWENZUNYU)));
    public static final Item DATOUYU = registerItem("datouyu", new Item(new Item.Settings().food(ModFoodComponents.DATOUYU)));
    public static final Item LUOFEIYU = registerItem("luofeiyu", new Item(new Item.Settings().food(ModFoodComponents.LUOFEIYU)));
    public static final Item LIANYU = registerItem("lianyu", new Item(new Item.Settings().food(ModFoodComponents.LIANYU)));
    public static final Item MAHAZHILI = registerItem("mahazhili", new Item(new Item.Settings().food(ModFoodComponents.MAHAZHILI)));
    public static final Item QINGHUAYU = registerItem("qinghuayu", new Item(new Item.Settings().food(ModFoodComponents.QINGHUAYU)));
    public static final Item XIFEI = registerItem("xifei", new Item(new Item.Settings().food(ModFoodComponents.XIFEI)));
    public static final Item SHECHIDANXIANYU = registerItem("shechidanxianyu", new Item(new Item.Settings().food(ModFoodComponents.SHECHIDANXIANYU)));
    public static final Item DABIMUYU = registerItem("dabimuyu", new Item(new Item.Settings().food(ModFoodComponents.DABIMUYU)));
    public static final Item MUYUEYU = registerItem("muyueyu", new Item(new Item.Settings().food(ModFoodComponents.MUYUEYU)));
    public static final Item XUKONGGUIYU = registerItem("xukongguiyu", new Item(new Item.Settings().food(ModFoodComponents.XUKONGGUIYU)));
    public static final Item SHILAIMU = registerItem("shilaimu", new Item(new Item.Settings().food(ModFoodComponents.SHILAIMU)));
    public static final Item HUANGDIAOYU = registerItem("huangdiaoyu", new Item(new Item.Settings().food(ModFoodComponents.HUANGDIAOYU)));
    public static final Item SHIZIYU = registerItem("shiziyu", new Item(new Item.Settings().food(ModFoodComponents.SHIZIYU)));
    public static final Item LANTIEBINGYU = registerItem("lantiebingyu", new Item(new Item.Settings().food(ModFoodComponents.LANTIEBINGYU)));
    public static final Item XIAHUYU = registerItem("xiahuyu", new Item(new Item.Settings().food(ModFoodComponents.XIAHUYU)));
    public static final Item WUYEYOUYU = registerItem("wuyeyouyu", new Item(new Item.Settings().food(ModFoodComponents.WUYEYOUYU)));
    public static final Item YOULINGYU = registerItem("youlingyu", new Item(new Item.Settings().food(ModFoodComponents.YOULINGYU)));
    public static final Item SHUIDIYU = registerItem("shuidiyu", new Item(new Item.Settings().food(ModFoodComponents.SHUIDIYU)));
    public static final Item FEIHONGYU = registerItem("feihongyu", new Item(new Item.Settings().food(ModFoodComponents.FEIHONGYU)));
    public static final Item ANKANGYU = registerItem("ankangyu", new Item(new Item.Settings().food(ModFoodComponents.ANKANGYU)));
    public static final Item CHUANSHUOZHIYU = registerItem("chuanshuozhiyu", new Item(new Item.Settings().food(ModFoodComponents.CHUANSHUOZHIYU)));
    public static final Item BINGCHUANYU = registerItem("bingchuanyu", new Item(new Item.Settings().food(ModFoodComponents.BINGCHUANYU)));
    public static final Item BIANZHONGLIYU = registerItem("bianzhongliyu", new Item(new Item.Settings().food(ModFoodComponents.BIANZHONGLIYU)));
    public static final Item FEIHONGYUZHIZI = registerItem("feihongyuzhizi", new Item(new Item.Settings().food(ModFoodComponents.FEIHONGYUZHIZI)));
    public static final Item CIANKANGYU = registerItem("ciankangyu", new Item(new Item.Settings().food(ModFoodComponents.CIANKANGYU)));
    public static final Item CHUANSHUOZHIYUERDAI = registerItem("chuanshuozhiyuerdai", new Item(new Item.Settings().food(ModFoodComponents.CHUANSHUOZHIYUERDAI)));
    public static final Item XIAOBINGCHUANYU = registerItem("xiaobingchuanyu", new Item(new Item.Settings().food(ModFoodComponents.XIAOBINGCHUANYU)));
    public static final Item FANGSHEXINGLIYU = registerItem("fangshexingliyu", new Item(new Item.Settings().food(ModFoodComponents.FANGSHEXINGLIYU)));




    public static Item registerItems(String id, Item item) {
        // 整合起来就一句话，当然这里的命名空间得改成你自己的
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), new Identifier(BestFishingMod.MOD_ID, id)), item);
    }

    public static Item registerItem(String id, Item item) {
        /* 这里就要用到Registry.register的另一个方法了
           这个方法接受三个参数，第一个是注册表，第二个是物品的命名空间，第三个是物品本身（其实调用的是上面的那个方法，两者本质上是一样的）
         */
        return Registry.register(Registries.ITEM, new Identifier(BestFishingMod.MOD_ID, id), item);
    }



   private static void addItemToItemGroup1(FabricItemGroupEntries entries) {
        entries.add(HETUN);
    }



   public static Item register(Identifier id, Item item) {
       return register(RegistryKey.of(Registries.ITEM.getKey(), id), item);
   }

    public static Item register(RegistryKey<Item> key, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
        /* 其实最核心的方法在这里，就是这里的return语句
           Registry是原版的注册表系统，包括静态注册表和动态注册表，这里的Item就是静态注册表，未来我们还会用到动态注册表
           Registry.register方法的作用是将一个物品注册到注册表中，返回值是注册的物品
           Registries类定义了Minecraft中所有的注册表，包括物品、方块、方块实体等等，使用getKey方法可以获取注册表的键
         */
        return Registry.register(Registries.ITEM, key, item);
    }


    public static void registerModItems() {
        /* 这里其实啥也不用写，就直接在模组主类中调用这个方法即可
           因为在Java中，调用该方法的时候，所在类的所有静态代码块和静态变量都会被初始化
           我们上面写的物品是static final修饰的，所以在这个方法被调用的时候，物品也就被注册了
         */
        // 利用ItemGroupEvents的modifyEntriesEvent方法，将物品加入原版对应的物品栏，并调用上面的方法


        // 这里是加入原版物品栏的两个例子，模组自制物品栏在ModItemGroups中
       ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemToItemGroup1);



    }







}
