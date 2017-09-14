package com.parkermc.neid;

import com.parkermc.neid.item.*;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {
	
	public static Item scroll;
	
	public static final void init() {
		scroll = new itemScroll().setUnlocalizedName("scroll").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Main.MODID + ":scroll");
		GameRegistry.registerItem(scroll, "scroll");
	}

}
