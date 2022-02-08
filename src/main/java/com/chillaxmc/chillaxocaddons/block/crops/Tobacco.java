package com.chillaxmc.chillaxocaddons.block.crops;

import com.chillaxmc.chillaxocaddons.ChillaxOCAddons;
import com.chillaxmc.chillaxocaddons.ChillaxOCConfig;
import com.chillaxmc.chillaxocaddons.creativetab.CHCreativeTabs;
import com.chillaxmc.chillaxocaddons.init.CHBlocks;
import com.chillaxmc.chillaxocaddons.init.CHItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

public class Tobacco extends BlockCrops {
    public static final AxisAlignedBB[] TOBACCO_AABB = new AxisAlignedBB[] {
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.1328125D, 1.0D),
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.265625D, 1.0D),
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.3984375D, 1.0D),
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.53125D, 1.0D),
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.6640625D, 1.0D),
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.796875D, 1.0D),
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.9296875D, 1.0D),
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0625, 1.0D)
    };

    public Tobacco() {

        this.setRegistryName("tobacco_crop");
        this.setTranslationKey("tobacco_crop");
        this.setCreativeTab(CHCreativeTabs.ChillaxOCAddons);
        CHBlocks.blocks.add(this);

    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return TOBACCO_AABB[((Integer) state.getValue(this.getAgeProperty())).intValue()];
    }

    @Override
    protected Item getSeed() {
        return CHItems.tobacco_seeds;
    }

    @Override
    protected Item getCrop() {
        return CHItems.tobacco_leaf;
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        int i;

        if (getAge(state) >= getMaxAge()) {
            Item crop = getCrop();
            i = new Random().nextInt(ChillaxOCConfig.tobaccoLeafCropAmount);
            if (i > 0)
                drops.add(new ItemStack(crop, i));

            i = new Random().nextInt(ChillaxOCConfig.tobaccoSeedsCropAmount);
            if(i > 0)
                drops.add(new ItemStack(getSeed(), i));
        }

    }



}
