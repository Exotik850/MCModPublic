package com.exo.moreblocksv1.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GlassTypeBlocks extends BlockBase 
{

    public GlassTypeBlocks(String name, Material material, float hardness, float resistance) 
    {
        super(name, material, hardness, resistance);

        setSoundType(SoundType.GLASS);
        setHardness(hardness);
        setResistance(resistance);
    }
    
}