package com.parkermc.neid;

import com.parkermc.neid.block.*;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

public final class ModBlocks {

    public static RecipeResearcher recipeResearcher;

    public static final void init() {
    	GameRegistry.registerBlock(recipeResearcher = new RecipeResearcher("recipeResearcher", Material.iron), "recipeResearcher");
    }

}
