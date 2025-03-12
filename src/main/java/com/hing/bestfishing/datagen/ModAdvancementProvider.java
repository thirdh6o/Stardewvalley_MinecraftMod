package com.hing.bestfishing.datagen;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.advancement.Advancement;
import com.hing.bestfishing.datagen.provider.Advancements;
 
import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider{

    public ModAdvancementProvider (FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }
    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        new Advancements().accept(consumer);
}
}
