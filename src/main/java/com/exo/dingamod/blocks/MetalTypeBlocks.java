package com.exo.dingamod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MetalTypeBlocks extends BlockBase 
{

    public MetalTypeBlocks(String name, Material material, float hardness, float resistance) 
    {
        super(name, material, hardness, resistance);

        setSoundType(SoundType.METAL);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel("pickaxe", 2);
    }
    
}