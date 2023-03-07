package net.realisticcities.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.realisticcities.mod.block.bike_cone;
import net.realisticcities.mod.block.bike_lane;
import net.realisticcities.mod.block.bike_lane_corner;
import net.realisticcities.mod.block.bike_lane_ind;
import net.realisticcities.mod.block.bike_lane_side;
import net.realisticcities.mod.block.bike_median;
import net.realisticcities.mod.block.road;
import net.realisticcities.mod.block.road_with_double_straight_white_line;
import net.realisticcities.mod.block.road_with_double_straight_yellow_line;
import net.realisticcities.mod.block.road_with_straight_white_line;
import net.realisticcities.mod.block.road_with_straight_white_line_side;
import net.realisticcities.mod.block.road_with_straight_yellow_line;
import net.realisticcities.mod.block.road_with_straight_yellow_line_side;
import net.realisticcities.mod.block.thin_tree;
import net.realisticcities.mod.block.traffic_cone;
import net.realisticcities.mod.block.vertical_concrete_slab;
import net.realisticcities.mod.block.concrete;
import net.realisticcities.mod.block.concrete_slab;
import net.realisticcities.mod.block.concrete_stairs;
import net.realisticcities.mod.block.concrete_wall;
import net.realisticcities.mod.block.fire_hydrant;
import net.realisticcities.mod.block.median_white;
import net.realisticcities.mod.block.median_yellow;


public class RealisticCities implements ModInitializer {
	
	public static final Item MUD_BALL = new Item(new Item.Settings().group(ItemGroup.MISC));
	
	//REALISTICCITIES ROADS
	
	public static final road ROAD = new road
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","road"), ROAD);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","road"), new BlockItem(ROAD, new Item.Settings()));
	}

	public static final road_with_straight_yellow_line ROAD_WITH_STRAIGHT_YELLOW_LINE = new road_with_straight_yellow_line
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","road_with_straight_yellow_line"), ROAD_WITH_STRAIGHT_YELLOW_LINE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","road_with_straight_yellow_line"), new BlockItem(ROAD_WITH_STRAIGHT_YELLOW_LINE, new Item.Settings()));
	}

	public static final road_with_straight_white_line ROAD_WITH_STRAIGHT_WHITE_LINE = new road_with_straight_white_line
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","road_with_straight_white_line"), ROAD_WITH_STRAIGHT_WHITE_LINE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","road_with_straight_white_line"), new BlockItem(ROAD_WITH_STRAIGHT_WHITE_LINE, new Item.Settings()));
	}

	public static final road_with_straight_yellow_line_side ROAD_WITH_STRAIGHT_YELLOW_LINE_SIDE = new road_with_straight_yellow_line_side
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","road_with_straight_yellow_line_side"), ROAD_WITH_STRAIGHT_YELLOW_LINE_SIDE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","road_with_straight_yellow_line_side"), new BlockItem(ROAD_WITH_STRAIGHT_YELLOW_LINE_SIDE, new Item.Settings()));
	}

	public static final road_with_straight_white_line_side ROAD_WITH_STRAIGHT_WHITE_LINE_SIDE = new road_with_straight_white_line_side
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","road_with_straight_white_line_side"), ROAD_WITH_STRAIGHT_WHITE_LINE_SIDE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","road_with_straight_white_line_side"), new BlockItem(ROAD_WITH_STRAIGHT_WHITE_LINE_SIDE, new Item.Settings()));
	}

	public static final road_with_double_straight_yellow_line ROAD_WITH_DOUBLE_STRAIGHT_YELLOW_LINE = new road_with_double_straight_yellow_line
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","road_with_double_straight_yellow_line"), ROAD_WITH_DOUBLE_STRAIGHT_YELLOW_LINE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","road_with_double_straight_yellow_line"), new BlockItem(ROAD_WITH_DOUBLE_STRAIGHT_YELLOW_LINE, new Item.Settings()));
	}

	public static final road_with_double_straight_white_line ROAD_WITH_DOUBLE_STRAIGHT_WHITE_LINE = new road_with_double_straight_white_line
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","road_with_double_straight_white_line"), ROAD_WITH_DOUBLE_STRAIGHT_WHITE_LINE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","road_with_double_straight_white_line"), new BlockItem(ROAD_WITH_DOUBLE_STRAIGHT_WHITE_LINE, new Item.Settings()));
	}

	public static final median_yellow MEDIAN_YELLOW = new median_yellow
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","median_yellow"), MEDIAN_YELLOW);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","median_yellow"), new BlockItem(MEDIAN_YELLOW, new Item.Settings()));
	}

	public static final median_white MEDIAN_WHITE = new median_white
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","median_white"), MEDIAN_WHITE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","median_white"), new BlockItem(MEDIAN_WHITE, new Item.Settings()));
	}

	public static final bike_median BIKE_MEDIAN = new bike_median
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","bike_median"), BIKE_MEDIAN);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","bike_median"), new BlockItem(BIKE_MEDIAN, new Item.Settings()));
	}

	public static final bike_lane BIKE_LANE = new bike_lane
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","bike_lane"), BIKE_LANE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","bike_lane"), new BlockItem(BIKE_LANE, new Item.Settings()));
	}

	public static final bike_lane_side BIKE_LANE_SIDE = new bike_lane_side
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","bike_lane_side"), BIKE_LANE_SIDE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","bike_lane_side"), new BlockItem(BIKE_LANE_SIDE, new Item.Settings()));
	}

	public static final bike_lane_corner BIKE_LANE_CORNER = new bike_lane_corner
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","bike_lane_corner"), BIKE_LANE_CORNER);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","bike_lane_corner"), new BlockItem(BIKE_LANE_CORNER, new Item.Settings()));
	}

	public static final bike_lane_ind BIKE_LANE_IND = new bike_lane_ind
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","bike_lane_ind"), BIKE_LANE_IND);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","bike_lane_ind"), new BlockItem(BIKE_LANE_IND, new Item.Settings()));
	}

	//REALISTICCITIES ROAD DECORATIONS
	
	public static final traffic_cone TRAFFIC_CONE = new traffic_cone
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1f,5f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","traffic_cone"), TRAFFIC_CONE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","traffic_cone"), new BlockItem(TRAFFIC_CONE, new Item.Settings()));
	}
	
	public static final bike_cone BIKE_CONE = new bike_cone
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1f,5f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","bike_cone"), BIKE_CONE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","bike_cone"), new BlockItem(BIKE_CONE, new Item.Settings()));
	}

	public static final fire_hydrant FIRE_HYDRANT = new fire_hydrant
		(FabricBlockSettings.of(Material.METAL).sounds(BlockSoundGroup.METAL).strength(3f,5f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","fire_hydrant"), FIRE_HYDRANT);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","fire_hydrant"), new BlockItem(FIRE_HYDRANT, new Item.Settings()));
	}

	//REALISTICCITIES BLOCKS

	public static final concrete CONCRETE = new concrete
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","concrete"), CONCRETE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","concrete"), new BlockItem(CONCRETE, new Item.Settings()));
	}
	
	public static final concrete_slab CONCRETE_SLAB = new concrete_slab
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","concrete_slab"), CONCRETE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","concrete_slab"), new BlockItem(CONCRETE_SLAB, new Item.Settings()));
	}

	public static final vertical_concrete_slab VERTICAL_CONCRETE_SLAB = new vertical_concrete_slab
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","vertical_concrete_slab"), VERTICAL_CONCRETE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","vertical_concrete_slab"), new BlockItem(VERTICAL_CONCRETE_SLAB, new Item.Settings()));
	}

	public static final concrete_stairs CONCRETE_STAIRS = new concrete_stairs
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","concrete_stairs"), CONCRETE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","concrete_stairs"), new BlockItem(CONCRETE_STAIRS, new Item.Settings()));
	}

	public static final concrete_wall CONCRETE_WALL = new concrete_wall
		(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f,6f).requiresTool());
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","concrete_wall"), CONCRETE_WALL);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","concrete_wall"), new BlockItem(CONCRETE_WALL, new Item.Settings()));
	}

	public static final net.realisticcities.mod.block.thin_tree THIN_TREE = new thin_tree
		(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(0.5f, 3f));
	static {
		Registry.register(Registry.BLOCK, new Identifier("realisticcities","thin_tree"), THIN_TREE);
		Registry.register(Registry.ITEM, new Identifier("realisticcities","thin_tree"), new BlockItem(THIN_TREE, new Item.Settings()));
	}

	//public static final net.realisticcities.mod.block.bench BENCH = new bench
	//	(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(0.5f, 3f));
	//static {
	//	Registry.register(Registry.BLOCK, new Identifier("realisticcities","bench"), BENCH);
	//	Registry.register(Registry.ITEM, new Identifier("realisticcities","bench"), new BlockItem(BENCH, new Item.Settings()));
	//}

	//ITEMGROUPS
	
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
			stacks.add(new ItemStack(RealisticCities.THIN_TREE));
			//stacks.add(new ItemStack(RealisticCities.BENCH));
		})
		.build();

	public static final Logger LOGGER = LoggerFactory.getLogger("realisticcities");

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("realisticcities", "mud_ball"), MUD_BALL);
	}
}