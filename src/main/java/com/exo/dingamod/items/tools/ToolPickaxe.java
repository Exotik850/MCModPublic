package com.exo.dingamod.items.tools;

import com.exo.dingamod.main;
import com.exo.dingamod.init.ModItems;
import com.exo.dingamod.util.IHasModel;

import net.minecraft.item.ItemPickaxe;
public class ToolPickaxe extends ItemPickaxe implements IHasModel
{
    public ToolPickaxe(String name, ToolMaterial material)
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