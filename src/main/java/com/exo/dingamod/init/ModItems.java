package com.exo.dingamod.init;

import java.util.ArrayList;
import java.util.List;

import com.exo.dingamod.items.ItemBase;
import com.exo.dingamod.items.food.*;

import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;

public class ModItems
{
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Dingaling
    public static final Item DINGALING = new FoodEffectBase("dingaling", 2, 2.0f, true, new PotionEffect(MobEffects.SPEED, (30 * 20), 0, false, false));
    public static final Item DINGALING_COOKED = new FoodEffectBase("dingaling_cooked", 6, 6.0f, true, new PotionEffect(MobEffects.SPEED, (30 * 20), 0, false, false));
    
    //Dingalium
    public static final Item DINGALIUM_INGOT = new ItemBase("dingalium_ingot");


}