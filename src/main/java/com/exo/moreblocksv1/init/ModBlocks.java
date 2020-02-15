package com.exo.moreblocksv1.init;

import java.util.ArrayList;
import java.util.List;

import com.exo.moreblocksv1.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block DINGA_BLOCK = new BlockBase("dinga_block", Material.SPONGE);
    public static final Block REINFORCED_GLASS = new BlockBase("reinforced_glass", Material.GLASS);


}