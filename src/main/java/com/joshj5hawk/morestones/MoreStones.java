package com.joshj5hawk.morestones;


import com.joshj5hawk.morestones.configuration.ConfigurationHandler;
import com.joshj5hawk.morestones.proxy.IProxy;
import com.joshj5hawk.morestones.utility.LogHelper;
import com.joshj5hawk.morestones.reference.Reference;
import ibxm.Player;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class MoreStones
{
    @Mod.Instance(Reference.MOD_ID)
    public static MoreStones instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        LogHelper.info("Prepairing " + Reference.MOD_NAME);
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initializing " + Reference.MOD_NAME);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info(Reference.MOD_NAME + " Initializing Complete - Thank you for choosing" + Reference.MOD_NAME);
    }
}
