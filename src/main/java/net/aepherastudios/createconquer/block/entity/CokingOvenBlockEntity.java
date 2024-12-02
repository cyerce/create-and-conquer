package net.aepherastudios.createconquer.block.entity;

import net.aepherastudios.createconquer.recipe.CCRecipes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.FurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class CokingOvenBlockEntity extends FurnaceBlockEntity {
    public CokingOvenBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(CCBlockEntities.COKING_OVEN_BE, pPos, pBlockState, CCRecipes.);
    }
}
