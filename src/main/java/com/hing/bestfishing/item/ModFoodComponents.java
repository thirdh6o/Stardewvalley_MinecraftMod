package com.hing.bestfishing.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    //From Besson
    /* 编写食物之前我们得先写食物组件，即FoodComponent
       原版的食物组件类为FoodComponents
       在那定义了原版所有食物的属性，包括回复的饥饿值，饱和度，效果等等
     */

    /* hunger定义回复的饥饿值，saturationModifier定义饱和度，statusEffect定义效果
       另外还有像alwaysEdible，这是不管你的饥饿值是否为满，都可以继续吃
       snack为小吃，吃的速度比一般食物快
       meat为肉类食物，可以喂给你的狗吃
       etc.

       关于饱和度，在Wiki上也有解释，饱和度是在消耗饥饿值之前被消耗的东西（最高不超过20），也就是当我们的饥饿值HUD跳动的时候，它就正在被消耗
       我们也可以在原版的HungerManager中看到其计算方法，即hunger * saturationModifier * 2.0F，拿金胡萝卜核算一下6*1.2*2.0=14.4，所以金胡萝卜的饱和度是14.4
     */


    public static  final FoodComponent SHENGYUPIAN = new FoodComponent.Builder()
            .hunger(4).saturationModifier(2.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 2400), 1.0F)
            .build();





    public static final FoodComponent HETUN = new FoodComponent.Builder()
            .hunger(3).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 60), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .snack()
            .build();

    public static final FoodComponent TIYU = new FoodComponent.Builder()
            .hunger(3).saturationModifier(0.7F)
            .snack()
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent JINQIANGYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent SHADINGYU = new FoodComponent.Builder()
            .hunger(3).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent CHOUYU = new FoodComponent.Builder()
            .hunger(4).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

        public static final FoodComponent DAZUILUYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent XIAOZUILUYU = new FoodComponent.Builder()
            .hunger(3).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();



    public static final FoodComponent HONGZUNYU = new FoodComponent.Builder()
            .hunger(4).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();


    public static final FoodComponent GUIYU = new FoodComponent.Builder()
            .hunger(3).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent DAYANYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent HELU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent LIYU = new FoodComponent.Builder()
            .hunger(4).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();


    public static final FoodComponent NIANYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent GOUYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent TAIYANGYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent HONGJIYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent FEIYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();


    public static final FoodComponent MANYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent ZHANGYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();


    public static final FoodComponent HONGDIAOYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent YOUYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent HAISHEN = new FoodComponent.Builder()
            .hunger(7).saturationModifier(2.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent DAHAISHEN = new FoodComponent.Builder()
            .hunger(10).saturationModifier(2.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent GUI3YU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent SHIYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent BINGZHUYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent YANJIANGMANYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1200), 1.0F)
            .build();

    public static final FoodComponent SHAYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent XIELIYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent BIMUYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent WUYELIYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1200), 1.0F)
            .build();

    public static final FoodComponent XUNYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent HUWENZUNYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent DATOUYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent LUOFEIYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();
    public static final FoodComponent LIANYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent MAHAZHILI = new FoodComponent.Builder()
            .hunger(10).saturationModifier(1.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent QINGHUAYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent XIFEI = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent SHECHIDANXIANYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent DABIMUYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent MUYUEYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();


    public static final FoodComponent XUKONGGUIYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 1200), 1.0F)
            .build();


    public static final FoodComponent SHILAIMU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent HUANGDIAOYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent SHIZIYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent LANTIEBINGYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();

    public static final FoodComponent XIAHUYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0F)
            .build();



    //以下为高级鱼类
    public static final FoodComponent WUYEYOUYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,12000), 1.0F)
                    .build();

    public static final FoodComponent YOULINGYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 12000), 1.0F)

            .build();

    public static final FoodComponent SHUIDIYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 12000), 1.0F)


                    .build();

    public static final FoodComponent  FEIHONGYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 12000), 1.0F)
            .build();

    public static final FoodComponent ANKANGYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 12000), 1.0F)
            .build();


    public static final FoodComponent CHUANSHUOZHIYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 12000), 1.0F)
            .build();


    public static final FoodComponent BINGCHUANYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 12000), 1.0F)
            .build();


    public static final FoodComponent BIANZHONGLIYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 12000), 1.0F)
            .build();


    public static final FoodComponent FEIHONGYUZHIZI = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 12000), 1.0F)
            .build();


    public static final FoodComponent CIANKANGYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 12000), 1.0F)
            .build();

    public static final FoodComponent  CHUANSHUOZHIYUERDAI = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 12000), 1.0F)
            .build();


    public static final FoodComponent XIAOBINGCHUANYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 12000), 1.0F)
            .build();

    public static final FoodComponent FANGSHEXINGLIYU = new FoodComponent.Builder()
            .hunger(5).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 12000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 12000), 1.0F)
            .build();
}