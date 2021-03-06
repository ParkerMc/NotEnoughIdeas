package com.parkermc.neid;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)

public class Main
{
    public static final String MODID = "neid";
    public static final String MODNAME = "Not Enough Ideas";
    public static final String VERSION = "1.0";
    @SidedProxy(clientSide="com.parkermc.neid.ClientProxy", serverSide="com.parkermc.neid.ServerProxy")
    public static CommonProxy proxy;
    
    @Instance
    public static Main instance = new Main();
        
     
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	proxy.preInit(e);
    }
        
    @EventHandler
    public void init(FMLInitializationEvent e) {
    	proxy.init(e);
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	proxy.postInit(e);
    }
}
