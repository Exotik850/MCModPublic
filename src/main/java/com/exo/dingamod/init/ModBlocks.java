package com.exo.dingamod.init;

import java.util.ArrayList;
import java.util.List;

import com.exo.dingamod.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block DINGA_BLOCK = new Dinga_Block("dinga_block", Material.SPONGE, 1.0f, 18000000.0f);
    public static final Block COOKED_DINGA_BLOCK = new Dinga_Block("cooked_dinga_block", Material.SPONGE, 5.0f, 18000000.0f);
    public static final Block DINGALIUM_BLOCK = new MetalTypeBlocks("dingalium_block", Material.IRON, 5.0f, 30.0f);
    public static final Block DINGALIUM_ORE = new dingalium_ore("dingalium_ore", Material.ROCK, 3.0f, 15.0f);

}