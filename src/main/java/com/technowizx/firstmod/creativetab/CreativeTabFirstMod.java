package com.technowizx.firstmod.creativetab;

import com.technowizx.firstmod.init.ModItems;
import com.technowizx.firstmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabFirstMod
{
    public static final CreativeTabs FirstMod_Tab = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.mapleLeafPurple;
        }

        @Override
    public String getTranslatedTabLabel()
        {
          return "First Mod";
        };
    };
}
