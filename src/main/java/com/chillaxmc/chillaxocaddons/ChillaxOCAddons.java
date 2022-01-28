package com.chillaxmc.chillaxocaddons;

import com.chillaxmc.chillaxocaddons.init.CHItems;
import com.chillaxmc.chillaxocaddons.init.CHRecipes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(
        modid = ChillaxOCAddons.MOD_ID,
        name = ChillaxOCAddons.MOD_NAME,
        version = ChillaxOCAddons.VERSION
)
public class ChillaxOCAddons {

    public static final String MOD_ID = "chillaxocaddons";
    public static final String MOD_NAME = "ChillaxOC Addons";
    public static final String VERSION = "1.0.0";

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(MOD_ID)
    public static ChillaxOCAddons INSTANCE;

    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(ChillaxOCAddons.INSTANCE);
        CHItems.register(event);
        CHRecipes.FurnaceRegister(event);
    }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }

    /**
     * This is the final initialization event. Register actions from other mods here
     */
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }
}
