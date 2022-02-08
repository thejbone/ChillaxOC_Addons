package com.chillaxmc.chillaxocaddons.proxy;

import com.chillaxmc.chillaxocaddons.ChillaxOCAddons;
import com.chillaxmc.chillaxocaddons.init.CHBlocks;
import com.chillaxmc.chillaxocaddons.init.CHItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent preEvent) {
        MinecraftForge.EVENT_BUS.register(ChillaxOCAddons.INSTANCE);
        CHBlocks.register(preEvent);
        CHItems.register(preEvent);
    }

    public void init(FMLInitializationEvent event) {
        registerRender(event);
    }

    public void registerRender(FMLInitializationEvent event) {
    }
}
