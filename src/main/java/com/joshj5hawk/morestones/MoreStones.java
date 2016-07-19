package com.joshj5hawk.morestones;


import com.joshj5hawk.morestones.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import static com.joshj5hawk.morestones.reference.Reference.*;

@Mod(modid=MOD_ID, name=MOD_NAME, version=VERSION)
public class MoreStones
{
    @Mod.Instance("moreStones")
    public static MoreStones instance;

    @SidedProxy(clientSide = "com.joshj5hawk.morestones.proxy.ClientProxy", serverSide = "com.joshj5hawk.morestones.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

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
