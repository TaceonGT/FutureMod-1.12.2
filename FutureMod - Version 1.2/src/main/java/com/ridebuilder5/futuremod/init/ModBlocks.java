package com.ridebuilder5.futuremod.init;

import java.util.ArrayList;
import java.util.List;

import com.ridebuilder5.futuremod.blocks.FranciumBlock;
import com.ridebuilder5.futuremod.blocks.NuclearBlocks;
import com.ridebuilder5.futuremod.blocks.SteelBlock;
import com.ridebuilder5.futuremod.blocks.atomic.AtomicBlock;
import com.ridebuilder5.futuremod.blocks.atomic.AtomicOre;
import com.ridebuilder5.futuremod.blocks.future.FutureBlock;
import com.ridebuilder5.futuremod.blocks.future.FutureOre;
import com.ridebuilder5.futuremod.blocks.tellurium.TelluriumBlock;
import com.ridebuilder5.futuremod.blocks.tellurium.TelluriumOre;
import com.ridebuilder5.futuremod.blocks.titanium.TitaniumBlock;
import com.ridebuilder5.futuremod.blocks.titanium.TitaniumOre;
import com.ridebuilder5.futuremod.blocks.uranium.UraniumBlock;
import com.ridebuilder5.futuremod.blocks.uranium.UraniumOre;
import com.ridebuilder5.futuremod.blocks.wood.FutureLogs;
import com.ridebuilder5.futuremod.blocks.wood.FuturePlanks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block FUTURE_ORE = new FutureOre("future_ore", Material.ROCK);
	public static final Block FUTURE_BLOCK = new FutureBlock("future_block", Material.IRON);
	
	public static final Block ATOMIC_ORE = new AtomicOre("atomic_ore", Material.ROCK);
	public static final Block ATOMIC_BLOCK = new AtomicBlock("atomic_block", Material.ROCK);
	
	public static final Block STEEL_BLOCK = new SteelBlock("steel_block", Material.IRON);
	
	public static final Block TELLURIUM_ORE = new TelluriumOre("tellurium_ore", Material.ROCK);
	public static final Block TELLURIUM_BLOCK = new TelluriumBlock("tellurium_block", Material.IRON);
	
	public static final Block TITANIUM_ORE = new TitaniumOre("titanium_ore", Material.ROCK);
	public static final Block TITANIUM_BLOCK = new TitaniumBlock("titanium_block", Material.IRON);
	
	public static final Block FRANCIUM_BLOCK = new FranciumBlock("francium_block", Material.SAND);
	
	public static final Block URANIUM_ORE = new UraniumOre("uranium_ore", Material.ROCK);
	public static final Block URANIUM_BLOCK = new UraniumBlock("uranium_block", Material.ROCK);
	
	public static final Block NEPTUNIUM_BLOCK = new NuclearBlocks("neptunium_block", Material.IRON);
	public static final Block PLUTONIUM_BLOCK = new NuclearBlocks("plutonium_block", Material.IRON);
	public static final Block AMERICIUM_BLOCK = new NuclearBlocks("americium_block", Material.IRON);
	public static final Block CURIUM_BLOCK = new NuclearBlocks("curium_block", Material.IRON);
	
	public static final Block FUTURE_LOG = new FutureLogs("future_log", Material.WOOD);
	public static final Block ATOMIC_LOG = new FutureLogs("atomic_log", Material.WOOD);
	public static final Block NUCLEAR_LOG = new FutureLogs("nuclear_log", Material.WOOD);
	
	public static final Block FUTURE_PLANKS = new FuturePlanks("future_planks", Material.WOOD);
	public static final Block ATOMIC_PLANKS = new FuturePlanks("atomic_planks", Material.WOOD);
	public static final Block NUCLEAR_PLANKS = new FuturePlanks("nuclear_planks", Material.WOOD);
}
