package com.exo.dingamod.tabs;

import com.exo.dingamod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MoreBlockModTab extends CreativeTabs {

    public MoreBlockModTab(String label)
    {
        super("moreblockmod");
    }

    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.DINGALING);
    }

}