package goldensun;

import goldensun.network.PacketHandler;
import goldensun.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = BasicModInformation.ID, name = BasicModInformation.NAME, version = BasicModInformation.VERSION)
@NetworkMod(channels = {BasicModInformation.CHANNEL}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class GoldenSun
{
	
	@Instance(BasicModInformation.ID)
	public static GoldenSun instance;
	
	@SidedProxy(clientSide = "goldensun.proxies.ClientProxy", serverSide = "goldensun.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void modsLoaded(FMLPostInitializationEvent event)
	{
		
	}
}
