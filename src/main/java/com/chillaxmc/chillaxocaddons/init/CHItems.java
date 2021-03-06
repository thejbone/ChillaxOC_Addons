package com.chillaxmc.chillaxocaddons.init;

import com.chillaxmc.chillaxocaddons.item.CHCoins;
import com.chillaxmc.chillaxocaddons.item.CHHerbs;
import com.chillaxmc.chillaxocaddons.item.CHSeeds;
import com.chillaxmc.chillaxocaddons.item.smokables.TobaccoCigar;
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
    public static final Item joint = new CHHerbs("joint", 64);
    public static final Item small_joint = new CHHerbs("small_joint", 64);
    public static final Item cocaine_bag = new CHHerbs("cocaine_bag", 16);
    public static final Item cocaine_brick = new CHHerbs("cocaine_brick", 16);
    public static final Item shroom_1 = new CHHerbs("shroom_1", 64);
    public static final Item shroom_2 = new CHHerbs("shroom_2", 64);
    public static final Item tobacco_cigar = new TobaccoCigar("tobacco_cigar", 24);
    public static final Item tobacco_dip = new CHHerbs("tobacco_dip", 16);
    public static final Item tobacco_seeds = new CHSeeds("tobacco_seeds", CHBlocks.tobacco_crop);
    public static final Item tobacco_leaf = new CHHerbs("tobacco_leaf", 64);
    public static final Item rolling_paper = new CHHerbs("rolling_paper", 64);
    public static final Item paper_filter = new CHHerbs("paper_filter", 64);
    public static final Item dried_tobacco_leaf = new CHHerbs("dried_tobacco_leaf", 64);
    public static final Item heroin_bag = new CHHerbs("heroin_bag", 32);
    public static final Item acid_tablet = new CHHerbs("acid_tablet", 64);
    public static final Item blue_perc_30 = new CHHerbs("blue_perc_30", 64);
    public static final Item white_perc_30 = new CHHerbs("white_perc_30", 64);
    public static final Item cig_pack = new CHHerbs("cig_pack", 16);
    public static final Item meth_baggie = new CHHerbs("meth_baggie", 32);
    public static final Item meth_cubes = new CHHerbs("meth_cubes", 64);
    public static final Item tobacco_grinds = new CHHerbs("tobacco_grinds", 64);
    public static final Item dried_coca = new CHHerbs("dried_coca", 64);
    public static final Item coca_powder = new CHHerbs("coca_powder", 64);
    public static final Item crack_cocaine = new CHHerbs("crack_cocaine", 64);
    public static final Item mushroom_mix = new CHHerbs("mushroom_mix", 64);
    public static final Item hash_muffin = new CHHerbs("hash_muffin", 16);

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
