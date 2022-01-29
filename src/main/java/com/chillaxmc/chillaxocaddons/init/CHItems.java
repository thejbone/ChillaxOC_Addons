package com.chillaxmc.chillaxocaddons.init;

import com.chillaxmc.chillaxocaddons.item.CHCoins;
import com.chillaxmc.chillaxocaddons.item.CHDrugs;
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
    public static final Item joint = new CHDrugs("joint", 64);
    public static final Item cocaine_bag = new CHDrugs("cocaine_bag", 64);
    public static final Item cocaine_brick = new CHDrugs("cocaine_brick", 64);
    public static final Item shroom_1 = new CHDrugs("shroom_1", 64);
    public static final Item shroom_2 = new CHDrugs("shroom_2", 64);
    public static final Item tobacco_cigar = new CHDrugs("tobacco_cigar", 64);
    public static final Item tobacco_dip = new CHDrugs("tobacco_dip", 64);

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
