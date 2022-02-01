package com.chillaxmc.chillaxocaddons.item;

import com.chillaxmc.chillaxocaddons.creativetab.CHCreativeTabs;
import com.chillaxmc.chillaxocaddons.init.CHItems;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CHSeeds extends ItemSeeds implements net.minecraftforge.common.IPlantable {

    private Block crops;

    public CHSeeds(String name, Block crop) {
        super(crop, Blocks.FARMLAND);
        this.crops = crop;
        this.setRegistryName(name);
        this.setTranslationKey(name);
        this.setCreativeTab(CHCreativeTabs.ChillaxOCAddons);
        addToItems(this);
    }

    private void addToItems(Item item) {
        CHItems.items.add(item);

    }

    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        net.minecraft.block.state.IBlockState state = worldIn.getBlockState(pos);
        if (facing == EnumFacing.UP && playerIn.canPlayerEdit(pos.offset(facing), facing, stack) && state.getBlock().canSustainPlant(state, worldIn, pos, EnumFacing.UP, this) && worldIn.isAirBlock(pos.up())) {
            worldIn.setBlockState(pos.up(), this.crops.getDefaultState());
            stack.shrink(1);
            return EnumActionResult.SUCCESS;
        }
        else {
            return EnumActionResult.FAIL;
        }
    }

    @Override
    public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos) {
        return net.minecraftforge.common.EnumPlantType.Crop;
    }

    @Override
    public net.minecraft.block.state.IBlockState getPlant(net.minecraft.world.IBlockAccess world, BlockPos pos) {
        return this.crops.getDefaultState();
    }

}
