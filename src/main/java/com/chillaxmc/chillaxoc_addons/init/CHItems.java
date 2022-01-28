package com.chillaxmc.chillaxoc_addons.init;

import com.chillaxmc.chillaxoc_addons.item.CHCoins;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public class CHItems {
    public static final List<Item> items = new ArrayList<Item>();

    public static final Item iron_coin = new CHCoins("iron_coin", 8);
    public static final Item gold_coin = new CHCoins("gold_coin", 8);
    public static final Item diamond_coin = new CHCoins("diamond_coin", 8);
    public static final Item emerald_coin = new CHCoins("emerald_coin", 8);
    public static final Item platinum_coin = new CHCoins("platinum_coin", 8);

    private static List<Item> getItems() {
        return items;
    }

    public static void register(FMLPreInitializationEvent preEvent) {
        for (Item item : getItems()) {
            if (item != null) {
                ForgeRegistries.ITEMS.register(item);
            }
        }
    }

    public static void registerRender(FMLInitializationEvent event) {
        RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
        for (Item item : getItems()) {
            renderItem.getItemModelMesher().register(item, 0,
                    new ModelResourceLocation(item.getRegistryName().toString(), "inventory"));
        }
    }
}
