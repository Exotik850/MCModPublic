package com.exo.moreblocksv1.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Dinga_Block extends BlockBase 
{

    public Dinga_Block(String name, Material material) 
    {
        super(name, material);

        setSoundType(SoundType.SLIME);
        setHardness(1.0f);
        setResistance(18000000.0f);
        setHarvestLevel("shovel", 3);
    }
    
}