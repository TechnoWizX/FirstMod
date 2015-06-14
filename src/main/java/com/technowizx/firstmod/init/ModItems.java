package com.technowizx.firstmod.init;

import com.technowizx.firstmod.item.ItemFirstMod;
import com.technowizx.firstmod.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemFirstMod mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
