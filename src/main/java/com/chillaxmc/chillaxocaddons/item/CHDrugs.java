package com.chillaxmc.chillaxocaddons.item;

import com.chillaxmc.chillaxocaddons.creativetab.CHCreativeTabs;
import com.chillaxmc.chillaxocaddons.init.CHItems;
import net.minecraft.item.Item;

public class CHDrugs extends Item {

    public CHDrugs(String name, int maxStack) {
        this.setMaxStackSize(maxStack);
        this.setRegistryName(name);
        this.setTranslationKey(name);
        this.setCreativeTab(CHCreativeTabs.ChillaxOCAddons);
        addToItems(this);
    }

    private void addToItems(Item item) {
        CHItems.items.add(item);
    }
}