package com.exo.dingamod.items;

import com.exo.dingamod.main;
import com.exo.dingamod.util.IHasModel;
import com.exo.dingamod.init.ModItems;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(main.dingamod);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        main.proxy.registerItemRenderer(this, 0 ,"inventory");
    }
    


}