package com.hing.bestfishing;

import com.hing.bestfishing.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class BestFishingModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
		/* 对于有着透明通道材质的方块，我们要为其设置渲染层，否则透明的区域会变成黑色
		   getCutout为全透明材质使用，如玻璃，玻璃板
		   getTranslucent为半透明材质使用，如各类染色玻璃及玻璃板
		   另外，这个也可以通过Mixin原版的RenderLayer类实现
		 */

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CAULIFLOWER, RenderLayer.getCutout());
    }
}
