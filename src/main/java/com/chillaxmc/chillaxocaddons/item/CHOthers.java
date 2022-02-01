package com.chillaxmc.chillaxocaddons.item;

import com.chillaxmc.chillaxocaddons.creativetab.CHCreativeTabs;
import com.chillaxmc.chillaxocaddons.init.CHItems;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CHOthers extends Item {
    public CHOthers(String name, int maxStack) {
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
