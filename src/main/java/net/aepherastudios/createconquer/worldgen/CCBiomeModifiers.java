package net.aepherastudios.createconquer.worldgen;

import net.aepherastudios.createconquer.CreateConquer;
import net.minecraft.core.HolderSet;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;
import org.checkerframework.checker.signature.qual.Identifier;

public class CCBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_ALUNITE_ORE = registerKey("add_alunite_ore");
    public static final ResourceKey<BiomeModifier> ADD_BAUXITE_ORE = registerKey("add_bauxite_ore");
    public static final ResourceKey<BiomeModifier> ADD_BORAX_ORE = registerKey("add_borax_ore");
    public static final ResourceKey<BiomeModifier> ADD_COSALITE_ORE = registerKey("add_cosalite_ore");
    public static final ResourceKey<BiomeModifier> ADD_CHRYSOBERYL_ORE = registerKey("add_chrysoberyl_ore");
    public static final ResourceKey<BiomeModifier> ADD_CHROMITE_ORE = registerKey("add_chromite_ore");
    public static final ResourceKey<BiomeModifier> ADD_CORUNDUM_ORE = registerKey("add_corundum_ore");
    public static final ResourceKey<BiomeModifier> ADD_CASSITERITE_ORE = registerKey("add_cassiterite_ore");
    public static final ResourceKey<BiomeModifier> ADD_ILMENITE_ORE = registerKey("add_ilmenite_ore");
    public static final ResourceKey<BiomeModifier> ADD_MAGNETITE_ORE = registerKey("add_magnetite_ore");
    public static final ResourceKey<BiomeModifier> ADD_MILLERITE_ORE = registerKey("add_millerite_ore");
    public static final ResourceKey<BiomeModifier> ADD_PENTLANDITE_ORE = registerKey("add_pentlandite_ore");
    public static final ResourceKey<BiomeModifier> ADD_LEPIDOLITE_ORE = registerKey("add_lepidolite_ore");
    public static final ResourceKey<BiomeModifier> ADD_WOLFRAMITE_ORE = registerKey("add_wolframite_ore");
    public static final ResourceKey<BiomeModifier> ADD_URANINITE_ORE = registerKey("add_uraninite_ore");
    public static final ResourceKey<BiomeModifier> ADD_SPHALERITE_ORE = registerKey("add_sphalerite_ore");
    public static final ResourceKey<BiomeModifier> ADD_POTASH_ORE = registerKey("add_potash_ore");
    public static final ResourceKey<BiomeModifier> ADD_FLUORITE_ORE = registerKey("add_fluorite_ore");
    public static final ResourceKey<BiomeModifier> ADD_SULFUR_ORE = registerKey("add_sulfur_ore");

    public static final ResourceKey<BiomeModifier> SPAWN_SUPERHEATED_BLAZE = registerKey("spawn_superheated_blaze");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_ALUNITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CCPlacedFeatures.ALUNITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_BAUXITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CCPlacedFeatures.BAUXITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_BORAX_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CCPlacedFeatures.BORAX_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_CASSITERITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CCPlacedFeatures.CASSITERITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_CHROMITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CCPlacedFeatures.CHROMITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_CORUNDUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CCPlacedFeatures.CORUNDUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_COSALITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CCPlacedFeatures.COSALITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_CHRYSOBERYL_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CCPlacedFeatures.CHRYSOBERYL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_ILMENITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CCPlacedFeatures.ILMENITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_LEPIDOLITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CCPlacedFeatures.LEPIDOLITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_MAGNETITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CCPlacedFeatures.MAGNETITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_MILLERITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CCPlacedFeatures.MILLERITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_PENTLANDITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CCPlacedFeatures.PENTLANDITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_WOLFRAMITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CCPlacedFeatures.WOLFRAMITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_URANINITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CCPlacedFeatures.URANINITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_SPHALERITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CCPlacedFeatures.SPHALERITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_POTASH_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CCPlacedFeatures.POTASH_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_FLUORITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CCPlacedFeatures.FLUORITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_SULFUR_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CCPlacedFeatures.SULFUR_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(CreateConquer.MOD_ID, name));
    }
}