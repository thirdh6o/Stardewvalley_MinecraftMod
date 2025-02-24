package com.hing.bestfishing.datagen;

import com.hing.bestfishing.block.ModBlocks;
import com.hing.bestfishing.block.custom.CauliFlower;
import com.hing.bestfishing.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }
    //TODO: Add loot tables
    @Override
    public void generate() {





 /* 这里的作物掉落物是通过LootCondition来判断的
           倘若作物的生长阶段为5，那么掉落的物品为ModItems.STRAWBERRY，否则掉落的物品为ModItems.STRAWBERRY_SEEDS
           不带种子的作物可以参考POTATO、CARROT等作物的掉落物
         */
        BlockStatePropertyLootCondition.Builder builder =
                BlockStatePropertyLootCondition.builder(ModBlocks.CAULIFLOWER)
                        .properties(StatePredicate.Builder.create().exactMatch(CauliFlower.AGE, 5));
        addDrop(ModBlocks.CAULIFLOWER, cropDrops(ModBlocks.CAULIFLOWER, ModItems.CAULIFLOWER, ModItems.CAULIFLOWER_SEEDS, builder));



    }


}
