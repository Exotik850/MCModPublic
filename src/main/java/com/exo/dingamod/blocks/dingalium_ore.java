package com.exo.dingamod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class dingalium_ore extends BlockBase 
{

    public dingalium_ore(String name, Material material, float hardness, float resistance) 
    {
        super(name, material, hardness, resistance);

        setSoundType(SoundType.STONE);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel("pickaxe", 2);
    }
    
}