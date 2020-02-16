package com.exo.moreblocksv1;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.exo.moreblocksv1.init.ModRecipes;
import com.exo.moreblocksv1.proxy.CommonProxy;
import com.exo.moreblocksv1.util.reference;

@Mod(modid = reference.MOD_ID, name = reference.NAME, version = reference.VERSION)
public class main
{
   @Instance
   public static main instance; 

   @SidedProxy(clientSide = reference.CLIENT_PROXY_CLASS, serverSide = reference.COMMON_PROXY_CLASS)
   public static CommonProxy proxy;

   @EventHandler
   public static void PreInit(FMLPreInitializationEvent event)
   {
        
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
