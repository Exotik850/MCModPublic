package com.exo.moreblocksv1.init;

import java.util.ArrayList;
import java.util.List;

import com.exo.moreblocksv1.blocks.Dinga_Block;
import com.exo.moreblocksv1.blocks.GlassTypeBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block DINGA_BLOCK = new Dinga_Block("dinga_block", Material.SPONGE, 1.0f, 18000000.0f);
    public static final Block REINFORCED_GLASS = new GlassTypeBlocks("reinforced_glass", Material.GLASS, 0.1f, 15.0f);


}