package net.aepherastudios.createconquer.worldgen;

import net.aepherastudios.createconquer.CreateConquer;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class CCPlacedFeatures {
    public static final ResourceKey<PlacedFeature> ALUNITE_ORE_PLACED_KEY = registerKey("alunite_ore_placed");
    public static final ResourceKey<PlacedFeature> BAUXITE_ORE_PLACED_KEY = registerKey("bauxite_ore_placed");
    public static final ResourceKey<PlacedFeature> BORAX_ORE_PLACED_KEY = registerKey("borax_ore_placed");
    public static final ResourceKey<PlacedFeature> COSALITE_ORE_PLACED_KEY = registerKey("cosalite_ore_placed");
    public static final ResourceKey<PlacedFeature> CORUNDUM_ORE_PLACED_KEY = registerKey("corundum_ore_placed");
    public static final ResourceKey<PlacedFeature> CASSITERITE_ORE_PLACED_KEY = registerKey("cassiterite_ore_placed");
    public static final ResourceKey<PlacedFeature> CHROMITE_ORE_PLACED_KEY = registerKey("chromite_ore_placed");
    public static final ResourceKey<PlacedFeature> CHRYSOBERYL_ORE_PLACED_KEY = registerKey("chrysoberyl_ore_placed");
    public static final ResourceKey<PlacedFeature> ILMENITE_ORE_PLACED_KEY = registerKey("ilmenite_ore_placed");
    public static final ResourceKey<PlacedFeature> LEPIDOLITE_ORE_PLACED_KEY = registerKey("lepidolite_ore_placed");
    public static final ResourceKey<PlacedFeature> MILLERITE_ORE_PLACED_KEY = registerKey("millerite_ore_placed");
    public static final ResourceKey<PlacedFeature> MAGNETITE_ORE_PLACED_KEY = registerKey("magnetite_ore_placed");
    public static final ResourceKey<PlacedFeature> PENTLANDITE_ORE_PLACED_KEY = registerKey("pentlandite_ore_placed");
    public static final ResourceKey<PlacedFeature> WOLFRAMITE_ORE_PLACED_KEY = registerKey("wolframite_ore_placed");
    public static final ResourceKey<PlacedFeature> URANINITE_ORE_PLACED_KEY = registerKey("uraninite_ore_placed");
    public static final ResourceKey<PlacedFeature> SPHALERITE_ORE_PLACED_KEY = registerKey("sphalerite_ore_placed");
    public static final ResourceKey<PlacedFeature> POTASH_ORE_PLACED_KEY = registerKey("potash_ore_placed");
    public static final ResourceKey<PlacedFeature> FLUORITE_ORE_PLACED_KEY = registerKey("fluorite_ore_placed");
    public static final ResourceKey<PlacedFeature> SULFUR_ORE_PLACED_KEY = registerKey("sulfur_ore_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ALUNITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CCConfiguredFeatures.OVERWORLD_ALUNITE_ORE_KEY),
                CCOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, BAUXITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CCConfiguredFeatures.OVERWORLD_BAUXITE_ORE_KEY),
                CCOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, BORAX_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CCConfiguredFeatures.OVERWORLD_BORAX_ORE_KEY),
                CCOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, COSALITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CCConfiguredFeatures.OVERWORLD_COSALITE_ORE_KEY),
                CCOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, CORUNDUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CCConfiguredFeatures.OVERWORLD_CORUNDUM_ORE_KEY),
                CCOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, CASSITERITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CCConfiguredFeatures.OVERWORLD_CASSITERITE_ORE_KEY),
                CCOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, CHROMITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CCConfiguredFeatures.OVERWORLD_CHROMITE_ORE_KEY),
                CCOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, CHRYSOBERYL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CCConfiguredFeatures.OVERWORLD_CHRYSOBERYL_ORE_KEY),
                CCOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, ILMENITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CCConfiguredFeatures.OVERWORLD_ILMENITE_ORE_KEY),
                CCOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, LEPIDOLITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CCConfiguredFeatures.OVERWORLD_LEPIDOLITE_ORE_KEY),
                CCOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, MILLERITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CCConfiguredFeatures.OVERWORLD_MILLERITE_ORE_KEY),
                CCOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, MAGNETITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CCConfiguredFeatures.OVERWORLD_MAGNETITE_ORE_KEY),
                CCOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, PENTLANDITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CCConfiguredFeatures.OVERWORLD_PENTLANDITE_ORE_KEY),
                CCOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, WOLFRAMITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CCConfiguredFeatures.OVERWORLD_WOLFRAMITE_ORE_KEY),
                CCOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, URANINITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CCConfiguredFeatures.OVERWORLD_URANINITE_ORE_KEY),
                CCOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, SPHALERITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CCConfiguredFeatures.OVERWORLD_SPHALERITE_ORE_KEY),
                CCOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, POTASH_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CCConfiguredFeatures.OVERWORLD_POTASH_ORE_KEY),
                CCOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, FLUORITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CCConfiguredFeatures.OVERWORLD_FLUORITE_ORE_KEY),
                CCOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, SULFUR_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CCConfiguredFeatures.OVERWORLD_SULFUR_ORE_KEY),
                CCOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(CreateConquer.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}