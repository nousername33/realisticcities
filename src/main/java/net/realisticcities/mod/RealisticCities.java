package net.realisticcities.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.realisticcities.mod.block.*;

public class RealisticCities implements ModInitializer {
	
	public static final Block ROAD = new Block
		(FabricBlockSettings.of(Material.STONE,MapColor.BLACK).sounds(BlockSoundGroup.STONE).strength(1.5f,6f));
	
	@Override

	//REALISTICCITIES ROADS ↓

	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities", "road"), ROAD);
		Registry.register(Registry.ITEM, new Identifier("realisticcities", "road"), new BlockItem(ROAD, new Item.Settings()));
	}

	public static final DirBlock ROAD_WITH_STRAIGHT_YELLOW_LINE = new DirBlock
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","road_with_straight_yellow_line"), ROAD_WITH_STRAIGHT_YELLOW_LINE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","road_with_straight_yellow_line"), new BlockItem(ROAD_WITH_STRAIGHT_YELLOW_LINE, new Item.Settings()));
	}

	public static final DirBlock ROAD_WITH_STRAIGHT_WHITE_LINE = new DirBlock
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","road_with_straight_white_line"), ROAD_WITH_STRAIGHT_WHITE_LINE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","road_with_straight_white_line"), new BlockItem(ROAD_WITH_STRAIGHT_WHITE_LINE, new Item.Settings()));
	}

	public static final DirBlock ROAD_WITH_STRAIGHT_YELLOW_LINE_SIDE = new DirBlock
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","road_with_straight_yellow_line_side"), ROAD_WITH_STRAIGHT_YELLOW_LINE_SIDE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","road_with_straight_yellow_line_side"), new BlockItem(ROAD_WITH_STRAIGHT_YELLOW_LINE_SIDE, new Item.Settings()));
	}

	public static final DirBlock ROAD_WITH_STRAIGHT_WHITE_LINE_SIDE = new DirBlock
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","road_with_straight_white_line_side"), ROAD_WITH_STRAIGHT_WHITE_LINE_SIDE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","road_with_straight_white_line_side"), new BlockItem(ROAD_WITH_STRAIGHT_WHITE_LINE_SIDE, new Item.Settings()));
	}

	public static final DirBlock ROAD_WITH_DOUBLE_STRAIGHT_YELLOW_LINE = new DirBlock
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","road_with_double_straight_yellow_line"), ROAD_WITH_DOUBLE_STRAIGHT_YELLOW_LINE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","road_with_double_straight_yellow_line"), new BlockItem(ROAD_WITH_DOUBLE_STRAIGHT_YELLOW_LINE, new Item.Settings()));
	}

	public static final DirBlock ROAD_WITH_DOUBLE_STRAIGHT_WHITE_LINE = new DirBlock
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","road_with_double_straight_white_line"), ROAD_WITH_DOUBLE_STRAIGHT_WHITE_LINE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","road_with_double_straight_white_line"), new BlockItem(ROAD_WITH_DOUBLE_STRAIGHT_WHITE_LINE, new Item.Settings()));
	}

	public static final DirBlock MEDIAN_YELLOW = new DirBlock
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","median_yellow"), MEDIAN_YELLOW);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","median_yellow"), new BlockItem(MEDIAN_YELLOW, new Item.Settings()));
	}

	public static final DirBlock MEDIAN_WHITE = new DirBlock
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","median_white"), MEDIAN_WHITE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","median_white"), new BlockItem(MEDIAN_WHITE, new Item.Settings()));
	}

	public static final DirBlock BIKE_MEDIAN = new DirBlock
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","bike_median"), BIKE_MEDIAN);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","bike_median"), new BlockItem(BIKE_MEDIAN, new Item.Settings()));
	}

	public static final Block BIKE_LANE = new Block
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","bike_lane"), BIKE_LANE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","bike_lane"), new BlockItem(BIKE_LANE, new Item.Settings()));
	}

	public static final DirBlock BIKE_LANE_SIDE = new DirBlock
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","bike_lane_side"), BIKE_LANE_SIDE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","bike_lane_side"), new BlockItem(BIKE_LANE_SIDE, new Item.Settings()));
	}

	public static final DirBlock BIKE_LANE_CORNER = new DirBlock
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","bike_lane_corner"), BIKE_LANE_CORNER);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","bike_lane_corner"), new BlockItem(BIKE_LANE_CORNER, new Item.Settings()));
	}

	public static final RoadSticker BIKE_LANE_IND = new RoadSticker
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","bike_lane_ind"), BIKE_LANE_IND);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","bike_lane_ind"), new BlockItem(BIKE_LANE_IND, new Item.Settings()));
	}

	//REALISTICCITIES ROAD DECORATIONS ↓
	
	public static final Cone TRAFFIC_CONE = new Cone
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1f,5f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","traffic_cone"), TRAFFIC_CONE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","traffic_cone"), new BlockItem(TRAFFIC_CONE, new Item.Settings()));
	}
	
	public static final Cone BIKE_CONE = new Cone
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1f,5f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","bike_cone"), BIKE_CONE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","bike_cone"), new BlockItem(BIKE_CONE, new Item.Settings()));
	}

	public static final FireHydrant FIRE_HYDRANT = new FireHydrant
		(FabricBlockSettings.of(Material.METAL).sounds(BlockSoundGroup.METAL).strength(3f,5f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","fire_hydrant"), FIRE_HYDRANT);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","fire_hydrant"), new BlockItem(FIRE_HYDRANT, new Item.Settings()));
	}

	//REALISTICCITIES BLOCKS ↓

	public static final Block CONCRETE = new Block
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","concrete"), CONCRETE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","concrete"), new BlockItem(CONCRETE, new Item.Settings()));
	}
	
	public static final Slab CONCRETE_SLAB = new Slab
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","concrete_slab"), CONCRETE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","concrete_slab"), new BlockItem(CONCRETE_SLAB, new Item.Settings()));
	}

	public static final VerticalSlab VERTICAL_CONCRETE_SLAB = new VerticalSlab
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","vertical_concrete_slab"), VERTICAL_CONCRETE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","vertical_concrete_slab"), new BlockItem(VERTICAL_CONCRETE_SLAB, new Item.Settings()));
	}

	public static final Stair CONCRETE_STAIRS = new Stair
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","concrete_stairs"), CONCRETE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","concrete_stairs"), new BlockItem(CONCRETE_STAIRS, new Item.Settings()));
	}

	public static final Wall CONCRETE_WALL = new Wall
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","concrete_wall"), CONCRETE_WALL);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","concrete_wall"), new BlockItem(CONCRETE_WALL, new Item.Settings()));
	}

	public static final Block WHITE_BRICKS = new Block
		(FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_GRAY).sounds(BlockSoundGroup.STONE).strength(2f, 6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","white_bricks"), WHITE_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","white_bricks"), new BlockItem(WHITE_BRICKS, new Item.Settings()));
	}

	public static final Slab WHITE_BRICKS_SLAB = new Slab
		(FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_GRAY).sounds(BlockSoundGroup.STONE).strength(2f, 6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","white_bricks_slab"), WHITE_BRICKS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","white_bricks_slab"), new BlockItem(WHITE_BRICKS_SLAB, new Item.Settings()));
	}
	
	public static final ThinTree THIN_TREE = new ThinTree
		(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(0.5f, 3f));
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","thin_tree"), THIN_TREE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","thin_tree"), new BlockItem(THIN_TREE, new Item.Settings()));
	}

	//Tried to add a bench, failed miserably, may finish in the future ↓

	//public static final net.realisticcities.mod.block.bench BENCH = new bench
	//	(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(0.5f, 3f));
	//static {
	//	Registry.register(Registry.BLOCK, new Identifier("realisticcities","bench"), BENCH);
	//	Registry.register(Registry.ITEM, new Identifier("realisticcities","bench"), new BlockItem(BENCH, new Item.Settings()));
	//}

	//ITEMGROUPS ↓
	
	public static final ItemGroup REALISTICCITIES_ROADS = FabricItemGroupBuilder.create(
		new Identifier("realisticcities", "realisticcities_roads"))
		.icon(() -> new ItemStack(RealisticCities.ROAD))
		.appendItems(stacks -> {
			stacks.add(new ItemStack(RealisticCities.ROAD));
			stacks.add(new ItemStack(RealisticCities.ROAD_WITH_STRAIGHT_YELLOW_LINE));
			stacks.add(new ItemStack(RealisticCities.ROAD_WITH_STRAIGHT_WHITE_LINE));
			stacks.add(new ItemStack(RealisticCities.ROAD_WITH_STRAIGHT_YELLOW_LINE_SIDE));
			stacks.add(new ItemStack(RealisticCities.ROAD_WITH_STRAIGHT_WHITE_LINE_SIDE));
			stacks.add(new ItemStack(RealisticCities.ROAD_WITH_DOUBLE_STRAIGHT_YELLOW_LINE));
			stacks.add(new ItemStack(RealisticCities.ROAD_WITH_DOUBLE_STRAIGHT_WHITE_LINE));
			stacks.add(new ItemStack(RealisticCities.MEDIAN_YELLOW));
			stacks.add(new ItemStack(RealisticCities.MEDIAN_WHITE));
			stacks.add(new ItemStack(RealisticCities.BIKE_MEDIAN));
			stacks.add(new ItemStack(RealisticCities.BIKE_LANE));
			stacks.add(new ItemStack(RealisticCities.BIKE_LANE_IND));
			stacks.add(new ItemStack(RealisticCities.BIKE_LANE_SIDE));
			stacks.add(new ItemStack(RealisticCities.BIKE_LANE_CORNER));
		})
		.build();

		public static final ItemGroup REALISTICCITIES_ROAD_DECORATIONS = FabricItemGroupBuilder.create(
		new Identifier("realisticcities", "realisticcities_road_decorations"))
		.icon(() -> new ItemStack(RealisticCities.TRAFFIC_CONE))
		.appendItems(stacks -> {
			stacks.add(new ItemStack(RealisticCities.TRAFFIC_CONE));
			stacks.add(new ItemStack(RealisticCities.FIRE_HYDRANT));
			stacks.add(new ItemStack(RealisticCities.BIKE_CONE));
		})
		.build();

		public static final ItemGroup REALISTICCITIES_BLOCKS = FabricItemGroupBuilder.create(
		new Identifier("realisticcities", "realisticcities_blocks"))
		.icon(() -> new ItemStack(RealisticCities.CONCRETE))
		.appendItems(stacks -> {
			stacks.add(new ItemStack(RealisticCities.CONCRETE));
			stacks.add(new ItemStack(RealisticCities.CONCRETE_SLAB));
			stacks.add(new ItemStack(RealisticCities.VERTICAL_CONCRETE_SLAB));
			stacks.add(new ItemStack(RealisticCities.CONCRETE_STAIRS));
			stacks.add(new ItemStack(RealisticCities.CONCRETE_WALL));
			stacks.add(new ItemStack(RealisticCities.WHITE_BRICKS));
			stacks.add(new ItemStack(RealisticCities.WHITE_BRICKS_SLAB));
			stacks.add(new ItemStack(RealisticCities.THIN_TREE));
			//stacks.add(new ItemStack(RealisticCities.BENCH));
		})
		.build();

	public static final Logger LOGGER = LoggerFactory.getLogger("realisticcities");
}
