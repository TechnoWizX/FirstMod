package com.technowizx.firstmod.init;

import com.technowizx.firstmod.block.BlockFirstMod;
import com.technowizx.firstmod.block.BlockPurple;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static final BlockFirstMod purple = new BlockPurple();

    public static void init()
    {
        GameRegistry.registerBlock(purple, "purple");
    }
}
