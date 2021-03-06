package com.exo.dingamod.items.tools;

import com.exo.dingamod.main;
import com.exo.dingamod.init.ModItems;
import com.exo.dingamod.util.IHasModel;

import net.minecraft.item.ItemHoe;
public class ToolHoe extends ItemHoe implements IHasModel
{
    public ToolHoe(String name, ToolMaterial material)
    {
        super(material);
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