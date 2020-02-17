package com.exo.dingamod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes
{
    public static void init()
    {
        GameRegistry.addSmelting(ModItems.DINGALING, new ItemStack(ModItems.DINGALING_COOKED), 1.5f);
        GameRegistry.addSmelting(ModBlocks.DINGA_BLOCK, new ItemStack(ModBlocks.COOKED_DINGA_BLOCK), 13.5f);
        GameRegistry.addSmelting(ModBlocks.DINGALIUM_ORE, new ItemStack(ModItems.DINGALIUM_INGOT), 13.5f);

        
    }
}