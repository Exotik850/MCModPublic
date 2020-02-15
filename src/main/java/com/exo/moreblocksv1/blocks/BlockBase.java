package com.exo.moreblocksv1.blocks;

import com.exo.moreblocksv1.main;
import com.exo.moreblocksv1.init.ModBlocks;
import com.exo.moreblocksv1.init.ModItems;
import com.exo.moreblocksv1.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
    public BlockBase(String name, Material material, float hardness, float resistance)
    {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.REDSTONE);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() 
    {
        main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

}