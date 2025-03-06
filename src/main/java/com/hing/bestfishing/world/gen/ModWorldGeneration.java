package com.hing.bestfishing.world.gen;

public class ModWorldGeneration {

    public static void generateModWorldGen(){
        ModOreGeneration.generateOres();
        ModTreeGeneration.generateTrees();
        ModGeodeGeneration.generateGeode();
        ModFlowerGeneration.generateFlower();

        ModEntitySpawn.addEntitySpawn();
    }
}