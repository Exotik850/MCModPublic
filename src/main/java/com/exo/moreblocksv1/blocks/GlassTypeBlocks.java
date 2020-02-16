package com.exo.moreblocksv1.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;

public class GlassTypeBlocks extends BlockBase {

    public GlassTypeBlocks(String name, Material material, float hardness, float resistance) {
        super(name, material, hardness, resistance);

        setSoundType(SoundType.GLASS);
        setHardness(hardness);
        setResistance(resistance);
        setLightOpacity(1);
    }

    @Override
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
}