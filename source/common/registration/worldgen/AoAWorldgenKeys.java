package net.tslat.aoa3.common.registration.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.tslat.aoa3.advent.AdventOfAscension;

public final class AoAWorldgenKeys {
	public static final class Features {
		public static final class Configured {
			public static final ResourceKey<ConfiguredFeature<?, ?>> SINGLE_CALAB_OR_VANILLA_GRASS = key("single_calab_or_vanilla_grass");
			public static final ResourceKey<ConfiguredFeature<?, ?>> PRECASIAN_LAVA_SPRING = key("precasian_lava_spring");
			public static final ResourceKey<ConfiguredFeature<?, ?>> PRECASIAN_SPRING = key("precasian_spring");
			public static final ResourceKey<ConfiguredFeature<?, ?>> PRECASIAN_LAVA_LAKE = key("precasian_lava_lake");
			public static final ResourceKey<ConfiguredFeature<?, ?>> PRECASIAN_GRASS_PATCH = key("precasian_grass_patch");
			public static final ResourceKey<ConfiguredFeature<?, ?>> PRECASIAN_TALL_GRASS_PATCH = key("precasian_tall_grass_patch");
			public static final ResourceKey<ConfiguredFeature<?, ?>> PRECASIAN_JUNGLE_GRASS_PATCH = key("precasian_jungle_grass_patch");
			public static final ResourceKey<ConfiguredFeature<?, ?>> SINGLE_PRECASIAN_GRASS_ASSORTMENT = key("single_precasian_grass_assortment");
			public static final ResourceKey<ConfiguredFeature<?, ?>> LUCALUS_TREE = key("lucalus_tree");
			public static final ResourceKey<ConfiguredFeature<?, ?>> BAOBAB_TREE = key("baobab_tree");
			public static final ResourceKey<ConfiguredFeature<?, ?>> GIANT_STRANGLEWOOD_TREE = key("giant_stranglewood_tree");
			public static final ResourceKey<ConfiguredFeature<?, ?>> STRANGLEWOOD_TREE = key("stranglewood_tree");
			public static final ResourceKey<ConfiguredFeature<?, ?>> SPINDLY_STRANGLEWOOD_TREE = key("spindly_stranglewood_tree");
			public static final ResourceKey<ConfiguredFeature<?, ?>> STRANGLEWOOD_BUSH = key("stranglewood_bush");
			public static final ResourceKey<ConfiguredFeature<?, ?>> PRECASIAN_JUNGLE_GROUND_FLORA = key("precasian_jungle_ground_flora");
			public static final ResourceKey<ConfiguredFeature<?, ?>> DESERT_DEAD_TREE_1 = key("desert_dead_tree_1");
			public static final ResourceKey<ConfiguredFeature<?, ?>> DESERT_DEAD_TREE_2 = key("desert_dead_tree_2");
			public static final ResourceKey<ConfiguredFeature<?, ?>> DESERT_DEAD_TREES = key("desert_dead_trees");
			public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_CACTUS = key("tall_cactus");
			public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_CACTUS_PATCH = key("tall_cactus_patch");
			public static final ResourceKey<ConfiguredFeature<?, ?>> BETTER_CLAY_DISK = key("better_clay_disk");
			public static final ResourceKey<ConfiguredFeature<?, ?>> BETTER_SAND_DISK = key("better_sand_disk");
			public static final ResourceKey<ConfiguredFeature<?, ?>> BETTER_GRAVEL_DISK = key("better_gravel_disk");
			public static final ResourceKey<ConfiguredFeature<?, ?>> GRAVEL_ORE = key("gravel_ore");
			public static final ResourceKey<ConfiguredFeature<?, ?>> GRANITE_ORE = key("granite_ore");
			public static final ResourceKey<ConfiguredFeature<?, ?>> DIORITE_ORE = key("diorite_ore");
			public static final ResourceKey<ConfiguredFeature<?, ?>> ANDESITE_ORE = key("andesite_ore");
			public static final ResourceKey<ConfiguredFeature<?, ?>> TUFF_ORE = key("tuff_ore");

			private static ResourceKey<ConfiguredFeature<?, ?>> key(String id) {
				return ResourceKey.create(Registries.CONFIGURED_FEATURE, AdventOfAscension.id(id));
			}
		}

		public static final class Placed {
			public static final ResourceKey<PlacedFeature> PRECASIAN_GRASS_BONEMEAL = key("precasian_grass_bonemeal");
			public static final ResourceKey<PlacedFeature> PRECASIAN_LAVA_SPRING = key("precasian_lava_spring");
			public static final ResourceKey<PlacedFeature> PRECASIAN_SPRING = key("precasian_spring");
			public static final ResourceKey<PlacedFeature> UNDERGROUND_PRECASIAN_LAVA_LAKE = key("underground_precasian_lava_lake");
			public static final ResourceKey<PlacedFeature> SURFACE_PRECASIAN_LAVA_LAKE = key("surface_precasian_lava_lake");
			public static final ResourceKey<PlacedFeature> PRECASIAN_GRASS_PATCH = key("precasian_grass_patch");
			public static final ResourceKey<PlacedFeature> PRECASIAN_TALL_GRASS_PATCH = key("precasian_tall_grass_patch");
			public static final ResourceKey<PlacedFeature> PRECASIAN_JUNGLE_GRASS_PATCH = key("precasian_jungle_grass_patch");
			public static final ResourceKey<PlacedFeature> PRECASIAN_SPARSE_GRASS = key("precasian_sparse_grass");
			public static final ResourceKey<PlacedFeature> SPARSE_LUCALUS_TREES = key("sparse_lucalus_trees");
			public static final ResourceKey<PlacedFeature> RARE_BAOBAB_TREES = key("rare_baobab_trees");
			public static final ResourceKey<PlacedFeature> COMMON_BAOBAB_TREES = key("common_baobab_trees");
			public static final ResourceKey<PlacedFeature> SPARSE_ACACIA_TREES = key("sparse_acacia_trees");
			public static final ResourceKey<PlacedFeature> DENSE_LUCALUS_TREES = key("dense_lucalus_trees");
			public static final ResourceKey<PlacedFeature> DENSE_STRANGLEWOOD_TREES = key("dense_stranglewood_trees");
			public static final ResourceKey<PlacedFeature> DENSE_GIANT_STRANGLEWOOD_TREES = key("dense_giant_stranglewood_trees");
			public static final ResourceKey<PlacedFeature> PRECASIAN_JUNGLE_GROUND_FLORA = key("precasian_jungle_ground_flora");
			public static final ResourceKey<PlacedFeature> SPINDLY_STRANGLEWOOD_TREE = key("single_spindly_stranglewood_tree");
			public static final ResourceKey<PlacedFeature> STRANGLEWOOD_BUSH = key("stranglewood_bush");
			public static final ResourceKey<PlacedFeature> DESERT_DEAD_TREE_1 = key("desert_dead_tree_1");
			public static final ResourceKey<PlacedFeature> DESERT_DEAD_TREE_2 = key("desert_dead_tree_2");
			public static final ResourceKey<PlacedFeature> DESERT_DEAD_TREES = key("desert_dead_trees");
			public static final ResourceKey<PlacedFeature> TALL_CACTUS = key("tall_cactus");
			public static final ResourceKey<PlacedFeature> TALL_CACTUS_PATCH = key("tall_cactus_patch");
			public static final ResourceKey<PlacedFeature> BETTER_SAND_DISK = key("better_sand_disk");
			public static final ResourceKey<PlacedFeature> BETTER_CLAY_DISK = key("better_clay_disk");
			public static final ResourceKey<PlacedFeature> BETTER_GRAVEL_DISK = key("better_gravel_disk");
			public static final ResourceKey<PlacedFeature> GRAVEL_ORE = key("gravel_ore");
			public static final ResourceKey<PlacedFeature> TUFF_ORE = key("tuff_ore");
			public static final ResourceKey<PlacedFeature> HIGH_ALTITUDE_GRANITE_ORE = key("high_altitude_granite_ore");
			public static final ResourceKey<PlacedFeature> LOW_ALTITUDE_GRANITE_ORE = key("low_altitude_granite_ore");
			public static final ResourceKey<PlacedFeature> HIGH_ALTITUDE_DIORITE_ORE = key("high_altitude_diorite_ore");
			public static final ResourceKey<PlacedFeature> LOW_ALTITUDE_DIORITE_ORE = key("low_altitude_diorite_ore");
			public static final ResourceKey<PlacedFeature> HIGH_ALTITUDE_ANDESITE_ORE = key("high_altitude_andesite_ore");
			public static final ResourceKey<PlacedFeature> LOW_ALTITUDE_ANDESITE_ORE = key("low_altitude_andesite_ore");

			private static ResourceKey<PlacedFeature> key(String id) {
				return ResourceKey.create(Registries.PLACED_FEATURE, AdventOfAscension.id(id));
			}
		}
	}
}
