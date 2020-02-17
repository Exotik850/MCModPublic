package com.exo.dingamod.tabs;

import com.exo.dingamod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class DingaModTab extends CreativeTabs {

    public DingaModTab(String label)
    {
        super("dingamod");
    }

    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.DINGALING);
    }

}