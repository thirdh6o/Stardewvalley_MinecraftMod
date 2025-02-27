package com.hing.bestfishing.sounds;

import com.hing.bestfishing.BestFishingMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {



    public static final SoundEvent CLOUD_COUNTRY = registerSoundEvents("cloud_country");
    public static final SoundEvent COUNTRY_SHOP = registerSoundEvents("country_shop");
    public static final SoundEvent FAIR_THEME = registerSoundEvents("fair_theme");
    public static final SoundEvent FALL1 = registerSoundEvents("fall1");
    public static final SoundEvent FALL2 = registerSoundEvents("fall2");
    public static final SoundEvent FALL3 = registerSoundEvents("fall3");
    public static final SoundEvent FLOWER_DANCE = registerSoundEvents("flower_dance");
    public static final SoundEvent FUN_FESTIVAL = registerSoundEvents("fun_festival");
    public static final SoundEvent GRANDPA = registerSoundEvents("grandpa");
    public static final SoundEvent OVERTURE = registerSoundEvents("overture");
    public static final SoundEvent PELICAN_TOWN = registerSoundEvents("pelican_town");
    public static final SoundEvent SPRING1 = registerSoundEvents("spring1");
    public static final SoundEvent SPRING2 = registerSoundEvents("spring2");
    public static final SoundEvent SPRING3 = registerSoundEvents("spring3");
    public static final SoundEvent SUMMER1 = registerSoundEvents("summer1");
    public static final SoundEvent SUMMER2 = registerSoundEvents("summer2");
    public static final SoundEvent SUMMER3 = registerSoundEvents("summer3");
    public static final SoundEvent WEDDING_CELEBRATION = registerSoundEvents("wedding_celebration");
    public static final SoundEvent WINTER1 = registerSoundEvents("winter1");
    public static final SoundEvent WINTER2 = registerSoundEvents("winter2");
    public static final SoundEvent WINTER3 = registerSoundEvents("winter3");
    public static final SoundEvent WINTER_FESTIVAL = registerSoundEvents("winter_festival");
    public static final SoundEvent WOOD = registerSoundEvents("wood");



    public static SoundEvent registerSoundEvents(String name){
        Identifier identifier = new Identifier(BestFishingMod.MOD_ID,name);
        return Registry.register(Registries.SOUND_EVENT,identifier,SoundEvent.of(identifier));
    }
    public static void registerSounds(){

    }
}
