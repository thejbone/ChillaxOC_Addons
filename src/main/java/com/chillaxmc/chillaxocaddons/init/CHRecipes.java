package com.chillaxmc.chillaxocaddons.init;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CHRecipes {
    @SubscribeEvent
    public static void FurnaceRegister(FMLPreInitializationEvent event) {
        FurnaceRecipes.instance().addSmelting(CHItems.tobacco_leaf, new ItemStack(CHItems.dried_tobacco_leaf), 0.1F);
    }
}
