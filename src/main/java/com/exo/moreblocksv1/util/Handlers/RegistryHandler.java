package com.exo.moreblocksv1.util.Handlers;

import com.exo.moreblocksv1.init.IHasModel;
import com.exo.moreblocksv1.init.ModItems;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler
{
    @SubscribeEvent
    public static void onItemRgister(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onModelRgister(ModelRegistryEvent event)
    {
        for (Item item : ModItems.ITEMS)
        {
            if(item instanceof IHasModel)
            {
                ((IHasModel)item).registerModels();
            }
        }
    }
}