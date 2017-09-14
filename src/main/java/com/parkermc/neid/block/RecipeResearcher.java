package com.parkermc.neid.block;

import com.parkermc.neid.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;

public class RecipeResearcher extends Block {
	public IIcon[] icons = new IIcon[6];

	public RecipeResearcher(String unlocalizedName, Material p_i45394_1_) {
		super(p_i45394_1_);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(2.0F);
        this.setResistance(6.0F);
        this.setLightLevel(0.0F);
        this.setHarvestLevel("pickaxe", 3);
        this.setStepSound(Block.soundTypeAnvil);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
	  this.icons[0] = Blocks.iron_block.getBlockTextureFromSide(0);
	  this.icons[1] = reg.registerIcon(this.textureName + "_top");
	  this.icons[2] = reg.registerIcon(this.textureName + "_front");
	  this.icons[3] = reg.registerIcon(this.textureName + "_side");
	  this.icons[4] = reg.registerIcon(this.textureName + "_side");
	  this.icons[5] = reg.registerIcon(this.textureName + "_side");
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
	    return this.icons[side];
	}

}
