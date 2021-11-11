package com.ridebuilder5.futuremod.blocks.wood;

import com.ridebuilder5.futuremod.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class FutureLogs extends BlockBase {

	public FutureLogs(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.WOOD);
		setHardness(2.0F);
		setResistance(10.0F);
	}
}
