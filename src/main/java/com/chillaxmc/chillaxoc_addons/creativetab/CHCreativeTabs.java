package com.chillaxmc.chillaxoc_addons.creativetab;


import com.chillaxmc.chillaxoc_addons.init.CHItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CHCreativeTabs extends CreativeTabs {

    public CHCreativeTabs(String label) {
        super(label);
    }

    public static final CHCreativeTabs ChillaxOC_Addons = new CHCreativeTabs("ChillaxOCAddons") {
        @SideOnly(Side.CLIENT)
        public ItemStack getIcon() {
            return new ItemStack(CHItems.gold_coin);
        }
    };

    @Override
    public ItemStack getIcon() {
        return new ItemStack(CHItems.gold_coin);
    }

    @Override
    public ItemStack createIcon() {
        return null;
    }

}

