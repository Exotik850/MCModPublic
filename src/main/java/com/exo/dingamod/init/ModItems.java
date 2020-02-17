package com.exo.dingamod.init;

import java.util.ArrayList;
import java.util.List;

import com.exo.dingamod.items.ItemBase;
import com.exo.dingamod.items.food.*;
import com.exo.dingamod.items.tools.*;

import net.minecraft.init.MobEffects;
import net.minecraft.item.*;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Materials
    public static final ToolMaterial MATERIAL_DINGALIUM = EnumHelper.addToolMaterial("material_dingalium", 3, 2000, 16.0f, 4.0f, 10);

    //Dingaling
    public static final Item DINGALING = new FoodEffectBase("dingaling", 2, 2.0f, true, new PotionEffect(MobEffects.SPEED, (30 * 20), 0, false, false));
    public static final Item DINGALING_COOKED = new FoodEffectBase("dingaling_cooked", 6, 6.0f, true, new PotionEffect(MobEffects.SPEED, (30 * 20), 0, false, false));
    
    //Dingalium
    public static final Item DINGALIUM_INGOT = new ItemBase("dingalium_ingot");

    //Tools
    public static final ItemSword DINGALIUM_SWORD = new ToolSword("dingalium_sword", MATERIAL_DINGALIUM);
    public static final ItemSpade DINGALIUM_SPADE = new ToolShovel("dingalium_shovel", MATERIAL_DINGALIUM);

}