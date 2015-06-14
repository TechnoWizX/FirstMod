package com.technowizx.firstmod.init;

import com.technowizx.firstmod.block.BlockFirstMod;
import com.technowizx.firstmod.block.BlockPurple;
import com.technowizx.firstmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockFirstMod purpleBlock = new BlockPurple();

    public static void init()
    {
        GameRegistry.registerBlock(purpleBlock, "purpleBlock");
    }
}
