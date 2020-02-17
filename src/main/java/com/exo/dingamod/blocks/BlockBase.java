package com.exo.dingamod.blocks;
import com.exo.dingamod.main;
import com.exo.dingamod.init.ModBlocks;
import com.exo.dingamod.init.ModItems;
import com.exo.dingamod.util.IHasModel;
import com.exo.dingamod.util.reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
    public BlockBase(String name, Material material, float hardness, float resistance)
    {
        super(material);
        setRegistryName(reference.MOD_ID + ":" + name);
        setUnlocalizedName(name);
        setCreativeTab(main.dingamod);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() 
    {
        main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

}