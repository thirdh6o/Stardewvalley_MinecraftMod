package com.hing.bestfishing.item;

import com.hing.bestfishing.BestFishingMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    //生鱼片注册（加工产品）
    public static final Item SHENGYUPIAN = registerItem("shengyupian", new Item(new Item.Settings().food(ModFoodComponents.SHENGYUPIAN)));














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
