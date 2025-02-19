package com.hing.bestfishing.datagen;


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

        translationBuilder.add("itemGroup.tutorial_group2", "Tutorial Group2");

    }
}
