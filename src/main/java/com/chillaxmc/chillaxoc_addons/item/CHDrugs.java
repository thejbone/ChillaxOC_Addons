package com.chillaxmc.chillaxoc_addons.item;

import com.chillaxmc.chillaxoc_addons.creativetab.CHCreativeTabs;
import com.chillaxmc.chillaxoc_addons.init.CHItems;
import net.minecraft.item.Item;

public class CHDrugs extends Item {

    public CHDrugs(String name, int maxStack) {
        this.setMaxStackSize(maxStack);
        this.setRegistryName(name);
        this.setTranslationKey(name);
        this.setCreativeTab(CHCreativeTabs.ChillaxOC_Addons);
        addToItems(this);
    }

    private void addToItems(Item item) {
        CHItems.items.add(item);
    }
}