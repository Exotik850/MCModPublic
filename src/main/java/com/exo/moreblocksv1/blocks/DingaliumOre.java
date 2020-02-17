package com.exo.moreblocksv1.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DingaliumOre extends BlockBase 
{

    public DingaliumOre(String name, Material material, float hardness, float resistance) 
    {
        super(name, material, hardness, resistance);

        setSoundType(SoundType.STONE);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel("pickaxe", 2);
    }
    
}