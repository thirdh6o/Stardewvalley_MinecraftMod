package com.hing.bestfishing.block;

import com.hing.bestfishing.BestFishingMod;
import com.hing.bestfishing.block.custom.CauliFlower;
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
