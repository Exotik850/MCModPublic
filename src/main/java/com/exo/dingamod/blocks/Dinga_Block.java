package com.exo.dingamod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Dinga_Block extends BlockBase 
{

    public Dinga_Block(String name, Material material, float hardness, float resistance) 
    {
        super(name, material, hardness, resistance);

        setSoundType(SoundType.PLANT);
        setHardness(0.1f);
        setResistance(18000000.0f);
        setHarvestLevel("shovel", 3);
    }
    
}