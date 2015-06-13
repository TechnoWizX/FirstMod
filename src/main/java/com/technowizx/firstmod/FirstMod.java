package com.technowizx.firstmod;

import com.technowizx.firstmod.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="FirstMod", name="First Mod", version="1.7.10-1.0")
public class FirstMod
{
    @Mod.Instance("FirstMod")
    public static FirstMod instance;

    @SidedProxy(clientSide = "com.technowizx.firstmod.proxy.ClientProxy", serverSide = "com.technowizx.firstmod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
