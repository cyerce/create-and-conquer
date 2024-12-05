package net.aepherastudios.createconquer.worldgen;

import net.aepherastudios.createconquer.CreateConquer;
import net.aepherastudios.createconquer.block.CCBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class CCConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ALUNITE_ORE_KEY = registerKey("alunite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BORAX_ORE_KEY = registerKey("borax_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BAUXITE_ORE_KEY = registerKey("bauxite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COSALITE_ORE_KEY = registerKey("cosalite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CORUNDUM_ORE_KEY = registerKey("corundum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CASSITERITE_ORE_KEY = registerKey("cassiterite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHROMITE_ORE_KEY = registerKey("chromite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHRYSOBERYL_ORE_KEY = registerKey("chrysoberyl_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ILMENITE_ORE_KEY = registerKey("ilmenite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LEPIDOLITE_ORE_KEY = registerKey("lepidolite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MAGNETITE_ORE_KEY = registerKey("magnetite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MILLERITE_ORE_KEY = registerKey("millerite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PENTLANDITE_ORE_KEY = registerKey("pentlandite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_WOLFRAMITE_ORE_KEY = registerKey("wolframite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_URANINITE_ORE_KEY = registerKey("uraninite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SPHALERITE_ORE_KEY = registerKey("sphalerite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_POTASH_ORE_KEY = registerKey("potash_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_FLUORITE_ORE_KEY = registerKey("fluorite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SULFUR_ORE_KEY = registerKey("sulfur_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworldAluniteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        CCBlocks.ALUNITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, CCBlocks.DEEPSLATE_ALUNITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldBauxiteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        CCBlocks.BAUXITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, CCBlocks.DEEPSLATE_BAUXITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldBoraxOres = List.of(OreConfiguration.target(stoneReplaceable,
                        CCBlocks.BORAX_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, CCBlocks.DEEPSLATE_BORAX_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldCosaliteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        CCBlocks.COSALITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, CCBlocks.DEEPSLATE_COSALITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldCorundumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        CCBlocks.CORUNDUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, CCBlocks.DEEPSLATE_CORUNDUM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldCassiteriteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        CCBlocks.CASSITERITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, CCBlocks.DEEPSLATE_CASSITERITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldChromiteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        CCBlocks.CHROMITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, CCBlocks.DEEPSLATE_CHROMITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldChrysoberylOres = List.of(OreConfiguration.target(stoneReplaceable,
                        CCBlocks.CHRYSOBERYL_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, CCBlocks.DEEPSLATE_CHRYSOBERYL_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldLepidoliteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        CCBlocks.LEPIDOLITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, CCBlocks.DEEPSLATE_LEPIDOLITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldIlmeniteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        CCBlocks.ILMENITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, CCBlocks.DEEPSLATE_ILMENITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldMilleriteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        CCBlocks.MILLERITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, CCBlocks.DEEPSLATE_MILLERITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldMagnetiteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        CCBlocks.MAGNETITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, CCBlocks.DEEPSLATE_MAGNETITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldPentlanditeOres = List.of(OreConfiguration.target(stoneReplaceable,
                        CCBlocks.PENTLANDITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, CCBlocks.DEEPSLATE_PENTLANDITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldWolframiteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        CCBlocks.WOLFRAMITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, CCBlocks.DEEPSLATE_WOLFRAMITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldUraniniteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        CCBlocks.URANINITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, CCBlocks.DEEPSLATE_URANINITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldSphaleriteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        CCBlocks.SPHALERITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, CCBlocks.DEEPSLATE_SPHALERITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldPotashOres = List.of(OreConfiguration.target(stoneReplaceable,
                        CCBlocks.POTASH_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, CCBlocks.DEEPSLATE_POTASH_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldFluoriteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        CCBlocks.FLUORITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, CCBlocks.DEEPSLATE_FLUORITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldSulfurOres = List.of(OreConfiguration.target(stoneReplaceable,
                        CCBlocks.SULFUR_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, CCBlocks.DEEPSLATE_SULFUR_ORE.get().defaultBlockState()));



        register(context, OVERWORLD_ALUNITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAluniteOres, 9));
        register(context, OVERWORLD_BAUXITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldBauxiteOres, 9));
        register(context, OVERWORLD_BORAX_ORE_KEY, Feature.ORE, new OreConfiguration(overworldBoraxOres, 9));
        register(context, OVERWORLD_COSALITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCosaliteOres, 9));
        register(context, OVERWORLD_CORUNDUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCorundumOres, 9));
        register(context, OVERWORLD_CHROMITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldChromiteOres, 9));
        register(context, OVERWORLD_CHRYSOBERYL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldChrysoberylOres, 9));
        register(context, OVERWORLD_CASSITERITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCassiteriteOres, 9));
        register(context, OVERWORLD_ILMENITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldIlmeniteOres, 9));
        register(context, OVERWORLD_LEPIDOLITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldLepidoliteOres, 9));
        register(context, OVERWORLD_MAGNETITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldMagnetiteOres, 9));
        register(context, OVERWORLD_MILLERITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldMilleriteOres, 9));
        register(context, OVERWORLD_PENTLANDITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPentlanditeOres, 9));
        register(context, OVERWORLD_WOLFRAMITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldWolframiteOres, 9));
        register(context, OVERWORLD_URANINITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldUraniniteOres, 9));
        register(context, OVERWORLD_SPHALERITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSphaleriteOres, 9));
        register(context, OVERWORLD_POTASH_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPotashOres, 9));
        register(context, OVERWORLD_FLUORITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldFluoriteOres, 9));
        register(context, OVERWORLD_SULFUR_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSulfurOres, 9));

    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(CreateConquer.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}