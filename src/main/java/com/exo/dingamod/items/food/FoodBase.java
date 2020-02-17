package com.exo.dingamod.items.food;

import com.exo.dingamod.main;
import com.exo.dingamod.init.ModItems;
import com.exo.dingamod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel
{

    public FoodBase(String name, int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.REDSTONE);

        ModItems.ITEMS.add(this);
    }


    @Override
    public void registerModels() 
    {
        main.proxy.registerItemRenderer(this, 0 ,"inventory");
    }
    
}
