package net.aepherastudios.createconquer.block;

import net.aepherastudios.createconquer.CreateConquer;
import net.aepherastudios.createconquer.block.custom.ArcFurnaceBlock;
import net.aepherastudios.createconquer.block.custom.CokingOvenBlock;
import net.aepherastudios.createconquer.block.custom.NuclearReactorBlock;
import net.aepherastudios.createconquer.block.custom.SuperheatedFireBlock;
import net.aepherastudios.createconquer.fluid.CCFluids;
import net.aepherastudios.createconquer.item.CCItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class CCBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CreateConquer.MOD_ID);

    public static final RegistryObject<Block> URANIUM_BLOCK = registerBlock("uranium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> PLUTONIUM_BLOCK = registerBlock("plutonium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> BERYLLIUM_BLOCK = registerBlock("beryllium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> THORIUM_BLOCK = registerBlock("thorium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> LITHIUM_BLOCK = registerBlock("lithium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> NICKEL_BLOCK = registerBlock("nickel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> TANKSTEEL_BLOCK = registerBlock("tanksteel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> ALUMINUM_BLOCK = registerBlock("aluminum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> SILICON_BLOCK = registerBlock("silicon_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> URANIUM_235_BLOCK = registerBlock("uranium_235_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> URANIUM_238_BLOCK = registerBlock("uranium_238_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> URANIUM_233_BLOCK = registerBlock("uranium_233_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> LITHIUM_6_BLOCK = registerBlock("lithium_6_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> LITHIUM_7_BLOCK = registerBlock("lithium_7_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> ROSESTEEL_BLOCK = registerBlock("rosesteel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> FISSILE_URANIUM_20_BLOCK = registerBlock("fissile_uranium_20_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> FISSILE_URANIUM_90_BLOCK = registerBlock("fissile_uranium_90_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> BORAX_BLOCK = registerBlock("borax_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> BORON_BLOCK = registerBlock("boron_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> BISMUTH_BLOCK = registerBlock("bismuth_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> POLONIUM_BLOCK = registerBlock("polonium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> TUNGSTEN_BLOCK = registerBlock("tungsten_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> STAINLESS_STEEL_BLOCK = registerBlock("stainless_steel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> COBALT_BLOCK = registerBlock("cobalt_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> CHROMIUM_BLOCK = registerBlock("chromium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> ELECTRUM_BLOCK = registerBlock("electrum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> ROSE_GOLD_BLOCK = registerBlock("rose_gold_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> INVAR_BLOCK = registerBlock("invar_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> STABALLOY_BLOCK = registerBlock("staballoy_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> ALNICO_BLOCK = registerBlock("alnico_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> CHROMITE_ORE = registerBlock("chromite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> COSALITE_ORE = registerBlock("cosalite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> MILLERITE_ORE = registerBlock("millerite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ILMENITE_ORE = registerBlock("ilmenite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> LEPIDOLITE_ORE = registerBlock("lepidolite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHRYSOBERYL_ORE = registerBlock("chrysoberyl_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> WOLFRAMITE_ORE = registerBlock("wolframite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> BORAX_ORE = registerBlock("borax_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> GALENA_ORE = registerBlock("galena_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> URANINITE_ORE = registerBlock("uraninite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> MAGNETITE_ORE = registerBlock("magnetite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORUNDUM_ORE = registerBlock("corundum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ALUNITE_ORE = registerBlock("alunite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> PENTLANDITE_ORE = registerBlock("pentlandite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> BAUXITE_ORE = registerBlock("bauxite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CASSITERITE_ORE = registerBlock("cassiterite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> SPHALERITE_ORE = registerBlock("sphalerite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> POTASH_ORE = registerBlock("potash_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> FLUORITE_ORE = registerBlock("fluorite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> SULFUR_ORE = registerBlock("sulfur_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_CHROMITE_ORE = registerBlock("deepslate_chromite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> DEEPSLATE_COSALITE_ORE = registerBlock("deepslate_cosalite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> DEEPSLATE_MILLERITE_ORE = registerBlock("deepslate_millerite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> DEEPSLATE_ILMENITE_ORE = registerBlock("deepslate_ilmenite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> DEEPSLATE_CHRYSOBERYL_ORE = registerBlock("deepslate_chrysoberyl_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> DEEPSLATE_WOLFRAMITE_ORE = registerBlock("deepslate_wolframite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> DEEPSLATE_BORAX_ORE = registerBlock("deepslate_borax_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> DEEPSLATE_GALENA_ORE = registerBlock("deepslate_galena_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> DEEPSLATE_MAGNETITE_ORE = registerBlock("deepslate_magnetite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> DEEPSLATE_CORUNDUM_ORE = registerBlock("deepslate_corundum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> DEEPSLATE_ALUNITE_ORE = registerBlock("deepslate_alunite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> DEEPSLATE_PENTLANDITE_ORE = registerBlock("deepslate_pentlandite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> DEEPSLATE_BAUXITE_ORE = registerBlock("deepslate_bauxite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> DEEPSLATE_CASSITERITE_ORE = registerBlock("deepslate_cassiterite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> DEEPSLATE_LEPIDOLITE_ORE = registerBlock("deepslate_lepidolite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> DEEPSLATE_URANINITE_ORE = registerBlock("deepslate_uraninite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> DEEPSLATE_SPHALERITE_ORE = registerBlock("deepslate_sphalerite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> DEEPSLATE_POTASH_ORE = registerBlock("deepslate_potash_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> DEEPSLATE_FLUORITE_ORE = registerBlock("deepslate_fluorite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> DEEPSLATE_SULFUR_ORE = registerBlock("deepslate_sulfur_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> RAW_CHROMITE_BLOCK = registerBlock("raw_chromite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RAW_COSALITE_BLOCK = registerBlock("raw_cosalite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RAW_MILLERITE_BLOCK = registerBlock("raw_millerite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RAW_ILMENITE_BLOCK = registerBlock("raw_ilmenite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RAW_LEPIDOLITE_BLOCK = registerBlock("raw_lepidolite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RAW_CHRYSOBERYL_BLOCK = registerBlock("raw_chrysoberyl_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RAW_WOLFRAMITE_BLOCK = registerBlock("raw_wolframite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RAW_GALENA_BLOCK = registerBlock("raw_galena_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RAW_URANINITE_BLOCK = registerBlock("raw_uraninite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RAW_MAGNETITE_BLOCK = registerBlock("raw_magnetite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RAW_CORUNDUM_BLOCK = registerBlock("raw_corundum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RAW_ALUNITE_BLOCK = registerBlock("raw_alunite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RAW_PENTLANDITE_BLOCK = registerBlock("raw_pentlandite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RAW_BAUXITE_BLOCK = registerBlock("raw_bauxite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RAW_CASSITERITE_BLOCK = registerBlock("raw_cassiterite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RAW_SPHALERITE_BLOCK = registerBlock("raw_sphalerite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> POLISHED_QUARTZ_TILES = registerBlock("polished_quartz_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SMALL_POLISHED_QUARTZ_TILES = registerBlock("small_polished_quartz_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> AMETHYST_TILES = registerBlock("amethyst_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SMALL_AMETHYST_TILES = registerBlock("small_amethyst_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_DIAMOND_TILES = registerBlock("polished_diamond_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SMALL_POLISHED_DIAMOND_TILES = registerBlock("small_polished_diamond_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_EMERALD_TILES = registerBlock("polished_emerald_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SMALL_POLISHED_EMERALD_TILES = registerBlock("small_polished_emerald_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_LAPIS_TILES = registerBlock("polished_lapis_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SMALL_POLISHED_LAPIS_TILES = registerBlock("small_polished_lapis_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> REDSTONE_CRYSTAL_TILES = registerBlock("redstone_crystal_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SMALL_REDSTONE_CRYSTAL_TILES = registerBlock("small_redstone_crystal_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_RUBY_TILES = registerBlock("polished_ruby_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SMALL_POLISHED_RUBY_TILES = registerBlock("small_polished_ruby_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_SAPPHIRE_TILES = registerBlock("polished_sapphire_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SMALL_POLISHED_SAPPHIRE_TILES = registerBlock("small_polished_sapphire_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_SMOKY_QUARTZ_TILES = registerBlock("polished_smoky_quartz_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SMALL_POLISHED_SMOKY_QUARTZ_TILES = registerBlock("small_polished_smoky_quartz_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_CITRINE_TILES = registerBlock("polished_citrine_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SMALL_POLISHED_CITRINE_TILES = registerBlock("small_polished_citrine_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> FLUORITE_TILES = registerBlock("fluorite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SMALL_FLUORITE_TILES = registerBlock("small_fluorite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<RotatedPillarBlock> CITRINE_BLOCK = registerBlock("citrine_block",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<RotatedPillarBlock> SMOKY_QUARTZ_BLOCK = registerBlock("smoky_quartz_block",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));


    public static final RegistryObject<LiquidBlock> MOLTEN_URANIUM_BLOCK = BLOCKS.register("molten_uranium_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_URANIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_URANIUM_SULFATE_BLOCK = BLOCKS.register("molten_uranium_sulfate_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_URANIUM_SULFATE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_URANIUM_SULFIDE_BLOCK = BLOCKS.register("molten_uranium_sulfide_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_URANIUM_SULFIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_PLUTONIUM_BLOCK = BLOCKS.register("molten_plutonium_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_PLUTONIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_PLUTONIUM_SULFATE_BLOCK = BLOCKS.register("molten_plutonium_sulfate_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_PLUTONIUM_SULFATE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_PLUTONIUM_SULFIDE_BLOCK = BLOCKS.register("molten_plutonium_sulfide_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_PLUTONIUM_SULFIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_BERYLLIUM_BLOCK = BLOCKS.register("molten_beryllium_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_BERYLLIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_BERYLLIUM_SULFIDE_BLOCK = BLOCKS.register("molten_beryllium_sulfide_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_BERYLLIUM_SULFIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_BERYLLIUM_SULFATE_BLOCK = BLOCKS.register("molten_beryllium_sulfate_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_BERYLLIUM_SULFATE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_TITANIUM_BLOCK = BLOCKS.register("molten_titanium_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_TITANIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_TITANIUM_SULFIDE_BLOCK = BLOCKS.register("molten_titanium_sulfide_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_TITANIUM_SULFIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_TITANIUM_SULFATE_BLOCK = BLOCKS.register("molten_titanium_sulfate_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_TITANIUM_SULFATE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_LITHIUM_BLOCK = BLOCKS.register("molten_lithium_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_LITHIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_LITHIUM_SULFATE_BLOCK = BLOCKS.register("molten_lithium_sulfate_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_LITHIUM_SULFATE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_LITHIUM_SULFIDE_BLOCK = BLOCKS.register("molten_lithium_sulfide_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_LITHIUM_SULFIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_THORIUM_BLOCK = BLOCKS.register("molten_thorium_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_THORIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_THORIUM_SULFATE_BLOCK = BLOCKS.register("molten_thorium_sulfate_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_THORIUM_SULFATE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_THORIUM_SULFIDE_BLOCK = BLOCKS.register("molten_thorium_sulfide_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_THORIUM_SULFIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_NICKEL_BLOCK = BLOCKS.register("molten_nickel_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_NICKEL, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_NICKEL_SULFATE_BLOCK = BLOCKS.register("molten_nickel_sulfate_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_NICKEL_SULFATE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_NICKEL_SULFIDE_BLOCK = BLOCKS.register("molten_nickel_sulfide_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_NICKEL_SULFIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_LEAD_BLOCK = BLOCKS.register("molten_lead_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_LEAD, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_LEAD_SULFATE_BLOCK = BLOCKS.register("molten_lead_sulfate_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_LEAD_SULFATE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_LEAD_SULFIDE_BLOCK = BLOCKS.register("molten_lead_sulfide_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_LEAD_SULFIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_STEEL_BLOCK = BLOCKS.register("molten_steel_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_STEEL, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_TANKSTEEL_BLOCK = BLOCKS.register("molten_tanksteel_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_TANKSTEEL, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_ALUMINUM_BLOCK = BLOCKS.register("molten_aluminum_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_ALUMINUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_ALUMINUM_SULFATE_BLOCK = BLOCKS.register("molten_aluminum_sulfate_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_ALUMINUM_SULFATE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_ALUMINUM_SULFIDE_BLOCK = BLOCKS.register("molten_aluminum_sulfide_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_ALUMINUM_SULFIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_TIN_BLOCK = BLOCKS.register("molten_tin_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_TIN, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_TIN_SULFATE_BLOCK = BLOCKS.register("molten_tin_sulfate_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_TIN_SULFATE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_TIN_SULFIDE_BLOCK = BLOCKS.register("molten_tin_sulfide_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_TIN_SULFIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_ZINC_BLOCK = BLOCKS.register("molten_zinc_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_ZINC, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_ZINC_SULFATE_BLOCK = BLOCKS.register("molten_zinc_sulfate_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_ZINC_SULFATE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_ZINC_SULFIDE_BLOCK = BLOCKS.register("molten_zinc_sulfide_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_ZINC_SULFIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_COPPER_BLOCK = BLOCKS.register("molten_copper_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_COPPER, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_COPPER_SULFATE_BLOCK = BLOCKS.register("molten_copper_sulfate_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_COPPER_SULFATE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_COPPER_SULFIDE_BLOCK = BLOCKS.register("molten_copper_sulfide_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_COPPER_SULFIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_SILICON_BLOCK = BLOCKS.register("molten_silicon_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_SILICON, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_URANIUM_235_BLOCK = BLOCKS.register("molten_uranium_235_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_URANIUM_235, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_URANIUM_238_BLOCK = BLOCKS.register("molten_uranium_238_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_URANIUM_238, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_URANIUM_233_BLOCK = BLOCKS.register("molten_uranium_233_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_URANIUM_233, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_FISSILE_URANIUM_20_BLOCK = BLOCKS.register("molten_fissile_uranium_20_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_FISSILE_URANIUM_20, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_FISSILE_URANIUM_90_BLOCK = BLOCKS.register("molten_fissile_uranium_90_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_FISSILE_URANIUM_90, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_LITHIUM_6_BLOCK = BLOCKS.register("molten_lithium_6_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_LITHIUM_6, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_LITHIUM_7_BLOCK = BLOCKS.register("molten_lithium_7_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_LITHIUM_7, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_ROSE_GOLD_BLOCK = BLOCKS.register("molten_rose_gold_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_ROSE_GOLD, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_ROSESTEEL_BLOCK = BLOCKS.register("molten_rosesteel_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_ROSESTEEL, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_INVAR_BLOCK = BLOCKS.register("molten_invar_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_INVAR, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_BRONZE_BLOCK = BLOCKS.register("molten_bronze_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_BRONZE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_ALNICO_BLOCK = BLOCKS.register("molten_alnico_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_ALNICO, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_STAINLESS_STEEL_BLOCK = BLOCKS.register("molten_stainless_steel_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_STAINLESS_STEEL, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_STABALLOY_BLOCK = BLOCKS.register("molten_staballoy_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_STABALLOY, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_BRASS_BLOCK = BLOCKS.register("molten_brass_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_BRASS, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_BISMUTH_BLOCK = BLOCKS.register("molten_bismuth_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_BISMUTH, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_BISMUTH_SULFATE_BLOCK = BLOCKS.register("molten_bismuth_sulfate_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_BISMUTH_SULFATE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_BISMUTH_SULFIDE_BLOCK = BLOCKS.register("molten_bismuth_sulfide_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_BISMUTH_SULFIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_POLONIUM_BLOCK = BLOCKS.register("molten_polonium_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_POLONIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_POLONIUM_SULFATE_BLOCK = BLOCKS.register("molten_polonium_sulfate_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_POLONIUM_SULFATE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_POLONIUM_SULFIDE_BLOCK = BLOCKS.register("molten_polonium_sulfide_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_POLONIUM_SULFIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_TUNGSTEN_BLOCK = BLOCKS.register("molten_tungsten_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_TUNGSTEN, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_TUNGSTEN_SULFATE_BLOCK = BLOCKS.register("molten_tungsten_sulfate_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_TUNGSTEN_SULFATE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_TUNGSTEN_SULFIDE_BLOCK = BLOCKS.register("molten_tungsten_sulfide_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_TUNGSTEN_SULFIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_CHROMIUM_BLOCK = BLOCKS.register("molten_chromium_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_CHROMIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_CHROMIUM_SULFATE_BLOCK = BLOCKS.register("molten_chromium_sulfate_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_CHROMIUM_SULFATE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_CHROMIUM_SULFIDE_BLOCK = BLOCKS.register("molten_chromium_sulfide_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_CHROMIUM_SULFIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_COBALT_BLOCK = BLOCKS.register("molten_cobalt_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_COBALT, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_COBALT_SULFATE_BLOCK = BLOCKS.register("molten_cobalt_sulfate_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_COBALT_SULFATE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_COBALT_SULFIDE_BLOCK = BLOCKS.register("molten_cobalt_sulfide_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_COBALT_SULFIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_ELECTRUM_BLOCK = BLOCKS.register("molten_electrum_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_ELECTRUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_SILVER_BLOCK = BLOCKS.register("molten_silver_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_SILVER, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_SILVER_SULFATE_BLOCK = BLOCKS.register("molten_silver_sulfate_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_SILVER_SULFATE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_SILVER_SULFIDE_BLOCK = BLOCKS.register("molten_silver_sulfide_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_SILVER_SULFIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_IRON_BLOCK = BLOCKS.register("molten_iron_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_IRON, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_IRON_SULFATE_BLOCK = BLOCKS.register("molten_iron_sulfate_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_IRON_SULFATE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_IRON_SULFIDE_BLOCK = BLOCKS.register("molten_iron_sulfide_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_IRON_SULFIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_GOLD_BLOCK = BLOCKS.register("molten_gold_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_GOLD, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_GOLD_SULFATE_BLOCK = BLOCKS.register("molten_gold_sulfate_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_GOLD_SULFATE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_GOLD_SULFIDE_BLOCK = BLOCKS.register("molten_gold_sulfide_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_GOLD_SULFIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_NETHERITE_BLOCK = BLOCKS.register("molten_netherite_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_NETHERITE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_REDSTONE_BLOCK = BLOCKS.register("molten_redstone_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MOLTEN_REDSTONE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> OXYGEN_BLOCK = BLOCKS.register("oxygen_block",
            () -> new LiquidBlock(CCFluids.SOURCE_OXYGEN, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> HYDROGEN_BLOCK = BLOCKS.register("hydrogen_block",
            () -> new LiquidBlock(CCFluids.SOURCE_HYDROGEN, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> HEAVY_WATER_BLOCK = BLOCKS.register("heavy_water_block",
            () -> new LiquidBlock(CCFluids.SOURCE_HEAVY_WATER, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> DEUTERIUM_BLOCK = BLOCKS.register("deuterium_block",
            () -> new LiquidBlock(CCFluids.SOURCE_DEUTERIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> TRITIUM_BLOCK = BLOCKS.register("tritium_block",
            () -> new LiquidBlock(CCFluids.SOURCE_TRITIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> CRUDE_OIL_BLOCK = BLOCKS.register("crude_oil_block",
            () -> new LiquidBlock(CCFluids.SOURCE_CRUDE_OIL, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> METHANE_BLOCK = BLOCKS.register("methane_block",
            () -> new LiquidBlock(CCFluids.SOURCE_METHANE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> ETHANE_BLOCK = BLOCKS.register("ethane_block",
            () -> new LiquidBlock(CCFluids.SOURCE_ETHANE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> PROPANE_BLOCK = BLOCKS.register("propane_block",
            () -> new LiquidBlock(CCFluids.SOURCE_PROPANE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> BUTANE_BLOCK = BLOCKS.register("butane_block",
            () -> new LiquidBlock(CCFluids.SOURCE_BUTANE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> GASOLINE_BLOCK = BLOCKS.register("gasoline_block",
            () -> new LiquidBlock(CCFluids.SOURCE_GASOLINE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> KEROSENE_BLOCK = BLOCKS.register("kerosene_block",
            () -> new LiquidBlock(CCFluids.SOURCE_KEROSENE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> DIESEL_BLOCK = BLOCKS.register("diesel_block",
            () -> new LiquidBlock(CCFluids.SOURCE_DIESEL, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> BITUMEN_BLOCK = BLOCKS.register("bitumen_block",
            () -> new LiquidBlock(CCFluids.SOURCE_BITUMEN, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> FORMALDEHYDE_BLOCK = BLOCKS.register("formaldehyde_block",
            () -> new LiquidBlock(CCFluids.SOURCE_FORMALDEHYDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> ETHANOL_BLOCK = BLOCKS.register("ethanol_block",
            () -> new LiquidBlock(CCFluids.SOURCE_ETHANOL, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> METHANOL_BLOCK = BLOCKS.register("methanol_block",
            () -> new LiquidBlock(CCFluids.SOURCE_METHANOL, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> AMMONIA_BLOCK = BLOCKS.register("ammonia_block",
            () -> new LiquidBlock(CCFluids.SOURCE_AMMONIA, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> NITROGEN_BLOCK = BLOCKS.register("nitrogen_block",
            () -> new LiquidBlock(CCFluids.SOURCE_NITROGEN, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> FLUORINE_BLOCK = BLOCKS.register("fluorine_block",
            () -> new LiquidBlock(CCFluids.SOURCE_FLUORINE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_POTASSIUM_HYDROGEN_FLUORIDE_BLOCK = BLOCKS.register("molten_potassium_hydrogen_fluoride_block",
            () -> new LiquidBlock(CCFluids.SOURCE_POTASSIUM_HYDROGEN_FLUORIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_POTASSIUM_CHLORIDE_BLOCK = BLOCKS.register("molten_potassium_chloride_block",
            () -> new LiquidBlock(CCFluids.SOURCE_POTASSIUM_CHLORIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> SULFURIC_ACID_BLOCK = BLOCKS.register("sulfuric_acid_block",
            () -> new LiquidBlock(CCFluids.SOURCE_SULFURIC_ACID, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> ETHYLENE_BLOCK = BLOCKS.register("ethylene_block",
            () -> new LiquidBlock(CCFluids.SOURCE_ETHYLENE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> HYDROFLUORIC_ACID_BLOCK = BLOCKS.register("hydrofluoric_acid_block",
            () -> new LiquidBlock(CCFluids.SOURCE_HYDROFLUORIC_ACID, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> CHLORINE_BLOCK = BLOCKS.register("chlorine_block",
            () -> new LiquidBlock(CCFluids.SOURCE_CHLORINE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MUSTARD_GAS_BLOCK = BLOCKS.register("mustard_gas_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MUSTARD_GAS, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> SULFUR_DICHLORIDE_BLOCK = BLOCKS.register("sulfur_dichloride_block",
            () -> new LiquidBlock(CCFluids.SOURCE_SULFUR_DICHLORIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> NAPTHA_BLOCK = BLOCKS.register("naptha_block",
            () -> new LiquidBlock(CCFluids.SOURCE_NAPTHA, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> BENZENE_BLOCK = BLOCKS.register("benzene_block",
            () -> new LiquidBlock(CCFluids.SOURCE_BENZENE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> ETHYLBENZENE_BLOCK = BLOCKS.register("ethylbenzene_block",
            () -> new LiquidBlock(CCFluids.SOURCE_ETHYLBENZENE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> NAPALM_BLOCK = BLOCKS.register("napalm_block",
            () -> new LiquidBlock(CCFluids.SOURCE_NAPALM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> POLYETHYLENE_BLOCK = BLOCKS.register("polyethylene_block",
            () -> new LiquidBlock(CCFluids.SOURCE_POLYETHYLENE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> HYDROGEN_SULFIDE_MONOETHANOLAMINE_BLOCK = BLOCKS.register("hydrogen_sulfide_monoethanolamine_block",
            () -> new LiquidBlock(CCFluids.SOURCE_HYDROGEN_SULFIDE_MONOETHANOLAMINE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MONOETHANOLAMINE_BLOCK = BLOCKS.register("monoethanolamine_block",
            () -> new LiquidBlock(CCFluids.SOURCE_MONOETHANOLAMINE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> HYDROGEN_SULFIDE_BLOCK = BLOCKS.register("hydrogen_sulfide_block",
            () -> new LiquidBlock(CCFluids.SOURCE_HYDROGEN_SULFIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> ETHYLENE_OXIDE_BLOCK = BLOCKS.register("ethylene_oxide_block",
            () -> new LiquidBlock(CCFluids.SOURCE_ETHYLENE_OXIDE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> NATURAL_GAS_BLOCK = BLOCKS.register("natural_gas_block",
            () -> new LiquidBlock(CCFluids.SOURCE_NATURAL_GAS, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> RAW_NATURAL_GAS_BLOCK = BLOCKS.register("raw_natural_gas_block",
            () -> new LiquidBlock(CCFluids.SOURCE_RAW_NATURAL_GAS, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> RAW_CRUDE_OIL_BLOCK = BLOCKS.register("raw_crude_oil_block",
            () -> new LiquidBlock(CCFluids.SOURCE_RAW_CRUDE_OIL, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> RAW_DIRTY_CRUDE_OIL_BLOCK = BLOCKS.register("raw_dirty_crude_oil_block",
            () -> new LiquidBlock(CCFluids.SOURCE_RAW_DIRTY_CRUDE_OIL, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> SALINE_WATER_BLOCK = BLOCKS.register("saline_water_block",
            () -> new LiquidBlock(CCFluids.SOURCE_SALINE_WATER, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> WASH_OIL_BLOCK = BLOCKS.register("wash_oil_block",
            () -> new LiquidBlock(CCFluids.SOURCE_WASH_OIL, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> STEAM_BLOCK = BLOCKS.register("steam_block",
            () -> new LiquidBlock(CCFluids.SOURCE_STEAM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> IRRADIATED_WATER_BLOCK = BLOCKS.register("irradiated_water_block",
            () -> new LiquidBlock(CCFluids.SOURCE_IRRADIATED_WATER, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> SUPERHEATED_IRRADIATED_WATER_BLOCK = BLOCKS.register("superheated_irradiated_water_block",
            () -> new LiquidBlock(CCFluids.SOURCE_SUPERHEATED_IRRADIATED_WATER, BlockBehaviour.Properties.copy(Blocks.LAVA)));



    public static final RegistryObject<Block> RED_ASPHALT = registerBlock("red_asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ORANGE_ASPHALT = registerBlock("orange_asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> YELLOW_ASPHALT = registerBlock("yellow_asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> GREEN_ASPHALT = registerBlock("green_asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> LIME_ASPHALT = registerBlock("lime_asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> BLUE_ASPHALT = registerBlock("blue_asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> CYAN_ASPHALT = registerBlock("cyan_asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> LIGHT_BLUE_ASPHALT = registerBlock("light_blue_asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> PURPLE_ASPHALT = registerBlock("purple_asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> MAGENTA_ASPHALT = registerBlock("magenta_asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> PINK_ASPHALT = registerBlock("pink_asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> BROWN_ASPHALT = registerBlock("brown_asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> WHITE_ASPHALT = registerBlock("white_asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> BLACK_ASPHALT = registerBlock("black_asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> GRAY_ASPHALT = registerBlock("gray_asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> LIGHT_GRAY_ASPHALT = registerBlock("light_gray_asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> RADIOACTIVE_WASTE_BARREL = registerBlock("radioactive_waste_barrel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> URANIUM_SAND = registerBlock("uranium_sand",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> URANIUM_GLASS = registerBlock("uranium_glass",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> HIGH_POWER_EXPLOSIVE = registerBlock("high_power_explosive",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(0f).sound(SoundType.GRASS)));

    public static final RegistryObject<Block> SUPERHEATED_FIRE = registerBlock("superheated_fire",
            () -> new SuperheatedFireBlock(BlockBehaviour.Properties.copy(Blocks.FIRE).mapColor(MapColor.FIRE).replaceable().noCollission().instabreak()));

    public static final RegistryObject<Block> NAPALM_BOMB = registerBlock("napalm_bomb",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));


    public static final RegistryObject<Block> RTG_GENERATOR = registerBlock("rtg_generator",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> BREEDER_REACTOR = registerBlock("breeder_reactor",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> REACTOR_CORE = registerBlock("reactor_core",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> HEAT_EXCHANGER = registerBlock("heat_exchanger",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));


    public static final RegistryObject<Block> ARC_FURNACE = registerBlock("arc_furnace",
            () -> new ArcFurnaceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> NUCLEAR_REACTOR = registerBlock("nuclear_reactor",
            () -> new NuclearReactorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> COKING_OVEN = registerBlock("coking_oven",
            () -> new CokingOvenBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return CCItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}