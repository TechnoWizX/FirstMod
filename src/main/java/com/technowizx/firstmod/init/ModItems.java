package com.technowizx.firstmod.init;

import com.technowizx.firstmod.item.ItemFirstMod;
import com.technowizx.firstmod.item.ItemMapleLeaf;
import com.technowizx.firstmod.item.ItemMapleLeafPurple;
import com.technowizx.firstmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemFirstMod mapleLeaf = new ItemMapleLeaf();
    public static final ItemFirstMod mapleLeafPurple = new ItemMapleLeafPurple();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        GameRegistry.registerItem(mapleLeafPurple, "mapleLeafPurple");
    }
}
