package com.chillaxmc.chillaxocaddons.item.smokables;

import com.chillaxmc.chillaxocaddons.item.CHHerbs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TobaccoCigar extends CHHerbs {

    public TobaccoCigar(String name, int maxStack) {
        super(name, maxStack);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
                                      EnumFacing facing, float hitX, float hitY, float hitZ) {
        return EnumActionResult.SUCCESS;
    }
    /**
     * How long it takes to use or consume an item
     */@Override
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 32;
    }
    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.DRINK;

    }

    @Override
    public EnumActionResult onItemUseFirst(EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX,
                                           float hitY, float hitZ, EnumHand hand) {
        return EnumActionResult.SUCCESS;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        playerIn.setActiveHand(handIn);
        return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World world, EntityLivingBase entityLiving) {
        EntityPlayer entity = entityLiving instanceof EntityPlayer ? (EntityPlayer) entityLiving : null;

        if (entity == null || !entity.capabilities.isCreativeMode) {
            stack.shrink(1);
        }

        if (!world.isRemote) {

        }
        return stack;

    }
}
