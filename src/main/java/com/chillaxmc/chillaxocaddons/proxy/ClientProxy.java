package com.chillaxmc.chillaxocaddons.proxy;

import com.chillaxmc.chillaxocaddons.init.CHBlocks;
import com.chillaxmc.chillaxocaddons.init.CHItems;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    public void preInit(FMLPreInitializationEvent preEvent) {
        super.preInit(preEvent);
    }

    public void init(FMLInitializationEvent event) {
        super.init(event);
    }

    @Override
    public void registerRender(FMLInitializationEvent event) {
        CHItems.registerRender(event);
        CHBlocks.registerRender(event);
    }
}
