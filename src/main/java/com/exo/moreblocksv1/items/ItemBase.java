package com.exo.moreblocksv1.items;

import com.exo.moreblocksv1.main;
import com.exo.moreblocksv1.init.IHasModel;
import com.exo.moreblocksv1.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        main.proxy.registerItemRenderer(this, 0 ,"inventory");
    }
    


}