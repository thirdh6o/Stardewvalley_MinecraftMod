package com.hing.bestfishing.block;

import com.hing.bestfishing.BestFishingMod;
import com.hing.bestfishing.block.custom.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {


    public static final Block CAULIFLOWER = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "cauliflower"),
            new CauliFlower(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block AMARANTH = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "amaranth"),
            new Amaranth(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ANCIENT_FRUIT = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "ancient_fruit"),
            new Ancient_fruit(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ARTICHOKE = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "artichoke"),
            new Artichoke(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BEET = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "beet"),
            new Beet(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLUEBERRY = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "blueberry"),
            new Blueberry(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BOK_CHOY = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "bok_choy"),
            new Bok_choy (AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BROCCOLI = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "broccoli"),
            new Broccoli(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CACTUS_FRUIT = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "cactus_fruit"),
            new Cactus_fruit(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CARROT = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "carrot"),
            new Carrot(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CORN = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "corn"),
            new Corn(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CRANBERRIES = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "cranberries"),
            new Cranberries(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block EGGPLANT = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "eggplant"),
            new Eggplant(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block FAIRY_ROSE = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "fairy_rose"),
            new Fairy_rose(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block FIBER = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "fiber"),
            new Fiber(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GARLIC = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "garlic"),
            new Garlic(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GRAPE = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "grape"),
            new Grape(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GREEN_BEAN = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "green_bean"),
            new Green_bean(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block HOPS= Registry.register( Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "hops"),
            new Hops(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block HOT_PEPPER = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "hot_pepper"),
            new Hot_pepper(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLUE_JAZZ = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "blue_jazz"),
            new Blue_Jazz_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block KALE = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "kale"),
            new Kale_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MELON = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "melon"),
            new Melon_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PARSNIP = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "parsnip"),
            new Parsnip_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block PINEAPPLE = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "pineapple"),
            new Pineapple_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block POPPY = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "poppy"),
            new Poppy_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block POWDERMELON = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "powdermelon"),
            new Powdermelon_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PUMPKIN = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "pumpkin"),
            new Pumpkin_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block QI_FRUIT = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "qi_fruit"),
            new Qi_Fruit_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block RADISH = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "radish"),
            new Radish_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block RED_CABBAGE = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "red_cabbage"),
            new Red_Cabbage_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block RHUBARB = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "rhubarb"),
            new Rhubarb_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SPANGLE = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "spangle"),
            new Spangle_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block STARFRUIT = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "starfruit"),
            new Starfruit_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block STRAWBERRY = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "strawberry"),
            new Strawberry_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SUMMER_SQUASH = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "summer_squash"),
            new Summer_Squash_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SUNFLOWER = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "sunflower"),
            new Sunflower_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block TEA_LEAVES = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "tea"),
            new Tea_Leaves_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block TOMATO = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "tomato"),
            new Tomato_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block WHEAT = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "wheat"),
            new Wheat_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block YAM = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "yam"),
            new Yam_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block POTATO = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "potato"),
            new Potato_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block RARE = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "sweet_gem_berry"),
            new Rare_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block TULIP = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "tulip"),
            new Tulip_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block TARO = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "taro_root"),
            new Taro_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block RICE = Registry.register(Registries.BLOCK,
            new Identifier(BestFishingMod.MOD_ID, "unmilled_rice"),
            new Rice_Block(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));



    // 方块注册方法
    public static Block register(String id, Block block) {
        // 在注册方块的同时也将方块物品一起注册了
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, new Identifier(BestFishingMod.MOD_ID, id), block);
    }

    /* 但这并没有结束
       在我们写物品的时候，或许你已经注意到了
       有一类物品是实例化BlockItem的，它们是方块物品
       因为方块在物品栏中，它是物品，而方块放在世界中的时候才是方块
       而这里我们回到Items中，还是以STONE为例，其实实例化的是BlockItem，然后最终又回到了最后一个方法
       注册方块物品你可以在ModItems中实现，不过在这里，方便起见，我们就直接在这个类中进行注册了
     */
    public static void registerBlockItems(String id, Block block) {
        Registry.register(Registries.ITEM, new Identifier(BestFishingMod.MOD_ID, id),
                new BlockItem(block, new Item.Settings()));
    }

    // 不要忘了初始化注册方法
    public static void registerModBlocks() {

    }
}
