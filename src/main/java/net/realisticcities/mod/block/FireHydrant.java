package net.realisticcities.mod.block;

import java.util.stream.Stream;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class FireHydrant extends HorizontalFacingBlock {
	public FireHydrant(Settings settings) {
		super(settings);
		setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
	}
 
	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(Properties.HORIZONTAL_FACING);
	}
 
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
		Direction dir = state.get(FACING);
		switch(dir) {
			case NORTH:
				return Stream.of(
					Block.createCuboidShape(4, 0, 4, 12, 1, 12),
					Block.createCuboidShape(4, 13, 4, 12, 14, 12),
					Block.createCuboidShape(5, 1, 5, 11, 13, 11),
					Block.createCuboidShape(5, 14, 5, 11, 15, 11),
					Block.createCuboidShape(6, 15, 6, 10, 16, 10),
					Block.createCuboidShape(6, 7, 2, 10, 11, 5),
					Block.createCuboidShape(11, 7.5, 6.5, 13, 10.5, 9.5)
					).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
			case SOUTH:
				return Stream.of(
					Block.createCuboidShape(4, 0, 4, 12, 1, 12),
					Block.createCuboidShape(4, 13, 4, 12, 14, 12),
					Block.createCuboidShape(5, 1, 5, 11, 13, 11),
					Block.createCuboidShape(5, 14, 5, 11, 15, 11),
					Block.createCuboidShape(6, 15, 6, 10, 16, 10),
					Block.createCuboidShape(6, 7, 11, 10, 11, 14),
					Block.createCuboidShape(3, 7.5, 6.5, 5, 10.5, 9.5)
					).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
			case EAST:
				return Stream.of(
					Block.createCuboidShape(4, 0, 4, 12, 1, 12),
					Block.createCuboidShape(4, 13, 4, 12, 14, 12),
					Block.createCuboidShape(5, 1, 5, 11, 13, 11),
					Block.createCuboidShape(5, 14, 5, 11, 15, 11),
					Block.createCuboidShape(6, 15, 6, 10, 16, 10),
					Block.createCuboidShape(11, 7, 6, 14, 11, 10),
					Block.createCuboidShape(6.5, 7.5, 11, 9.5, 10.5, 13)
					).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
			case WEST:
				return Stream.of(
					Block.createCuboidShape(4, 0, 4, 12, 1, 12),
					Block.createCuboidShape(4, 13, 4, 12, 14, 12),
					Block.createCuboidShape(5, 1, 5, 11, 13, 11),
					Block.createCuboidShape(5, 14, 5, 11, 15, 11),
					Block.createCuboidShape(6, 15, 6, 10, 16, 10),
					Block.createCuboidShape(2, 7, 6, 5, 11, 10),
					Block.createCuboidShape(6.5, 7.5, 3, 9.5, 10.5, 5)
					).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
			default:
				return VoxelShapes.fullCube();
		}
	}
 
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing().getOpposite());
	}
}
