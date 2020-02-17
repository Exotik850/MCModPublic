package com.exo.dingamod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.exo.dingamod.init.ModRecipes;
import com.exo.dingamod.proxy.CommonProxy;
import com.exo.dingamod.tabs.DingaModTab;
import com.exo.dingamod.util.reference;
import com.exo.dingamod.world.ModWorldGen;

@Mod(modid = reference.MOD_ID, name = reference.NAME, version = reference.VERSION)
public class main
{
   public static final CreativeTabs dingamod = new DingaModTab("dingamod");

   @Instance
   public static main instance; 

   @SidedProxy(clientSide = reference.CLIENT_PROXY_CLASS, serverSide = reference.COMMON_PROXY_CLASS)
   public static CommonProxy proxy;

   @EventHandler
   public static void PreInit(FMLPreInitializationEvent event)
   {
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
   }

   @EventHandler
   public static void Init(FMLInitializationEvent event)
   {
      ModRecipes.init();
   }

   @EventHandler
   public static void PostInit(FMLPostInitializationEvent event)
   {
       
   }
}
