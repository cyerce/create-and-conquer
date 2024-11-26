package net.aepherastudios.createconquer.fluid;

import net.aepherastudios.createconquer.CreateConquer;
import net.aepherastudios.createconquer.block.CCBlocks;
import net.aepherastudios.createconquer.item.CCItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, CreateConquer.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_URANIUM = FLUIDS.register("molten_uranium_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_URANIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_URANIUM = FLUIDS.register("flowing_molten_uranium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_URANIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_PLUTONIUM = FLUIDS.register("molten_plutonium_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_PLUTONIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_PLUTONIUM = FLUIDS.register("flowing_molten_plutonium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_PLUTONIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TITANIUM = FLUIDS.register("molten_titanium_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_TITANIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TITANIUM = FLUIDS.register("flowing_molten_titanium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_TITANIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_BERYLLIUM = FLUIDS.register("molten_beryllium_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_BERYLLIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_BERYLLIUM = FLUIDS.register("flowing_molten_beryllium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_BERYLLIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_LITHIUM = FLUIDS.register("molten_lithium_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_LITHIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_LITHIUM = FLUIDS.register("flowing_molten_lithium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_LITHIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_THORIUM = FLUIDS.register("molten_thorium_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_THORIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_THORIUM = FLUIDS.register("flowing_molten_thorium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_THORIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_LEAD = FLUIDS.register("molten_lead_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_LEAD_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_LEAD = FLUIDS.register("flowing_molten_lead",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_LEAD_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_NICKEL = FLUIDS.register("molten_nickel_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_NICKEL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_NICKEL = FLUIDS.register("flowing_molten_nickel",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_NICKEL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TANKSTEEL = FLUIDS.register("molten_tanksteel_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_TANKSTEEL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TANKSTEEL = FLUIDS.register("flowing_molten_tanksteel",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_TANKSTEEL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_STEEL = FLUIDS.register("molten_steel_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_STEEL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_STEEL = FLUIDS.register("flowing_molten_steel",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_STEEL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ALUMINUM = FLUIDS.register("molten_aluminum_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_ALUMINUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ALUMINUM = FLUIDS.register("flowing_molten_aluminum",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_ALUMINUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TIN = FLUIDS.register("molten_tin_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_TIN_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TIN = FLUIDS.register("flowing_molten_tin",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_TIN_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ZINC = FLUIDS.register("molten_zinc_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_ZINC_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ZINC = FLUIDS.register("flowing_molten_zinc",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_ZINC_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_COPPER = FLUIDS.register("molten_copper_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_COPPER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_COPPER = FLUIDS.register("flowing_molten_copper",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_COPPER_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_SILICON = FLUIDS.register("molten_silicon_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_SILICON_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_SILICON = FLUIDS.register("flowing_molten_silicon",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_SILICON_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_URANIUM_235 = FLUIDS.register("molten_uranium_235_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_URANIUM_235_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_URANIUM_235 = FLUIDS.register("flowing_molten_uranium_235",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_URANIUM_235_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_URANIUM_238 = FLUIDS.register("molten_uranium_238_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_URANIUM_238_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_URANIUM_238 = FLUIDS.register("flowing_molten_uranium_238",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_URANIUM_238_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_URANIUM_233 = FLUIDS.register("molten_uranium_233_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_URANIUM_233_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_URANIUM_233 = FLUIDS.register("flowing_molten_uranium_233",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_URANIUM_233_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_FISSILE_URANIUM_20 = FLUIDS.register("molten_fissile_uranium_20_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_FISSILE_URANIUM_20_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_FISSILE_URANIUM_20 = FLUIDS.register("flowing_molten_fissile_uranium_20",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_FISSILE_URANIUM_20_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_FISSILE_URANIUM_90 = FLUIDS.register("molten_fissile_uranium_90_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_FISSILE_URANIUM_90_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_FISSILE_URANIUM_90 = FLUIDS.register("flowing_molten_fissile_uranium_90",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_FISSILE_URANIUM_90_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_LITHIUM_6 = FLUIDS.register("molten_lithium_6_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_LITHIUM_6_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_LITHIUM_6 = FLUIDS.register("flowing_molten_lithium_6",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_LITHIUM_6_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_LITHIUM_7 = FLUIDS.register("molten_lithium_7_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_LITHIUM_7_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_LITHIUM_7 = FLUIDS.register("flowing_molten_lithium_7",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_LITHIUM_7_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ROSE_GOLD = FLUIDS.register("molten_rose_gold_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_ROSE_GOLD_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ROSE_GOLD = FLUIDS.register("flowing_molten_rose_gold",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_ROSE_GOLD_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ROSESTEEL = FLUIDS.register("molten_rosesteel_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_ROSESTEEL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ROSESTEEL = FLUIDS.register("flowing_molten_rosesteel",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_ROSESTEEL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ALNICO = FLUIDS.register("molten_alnico_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_ALNICO_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ALNICO = FLUIDS.register("flowing_molten_alnico",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_ALNICO_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_BRONZE = FLUIDS.register("molten_bronze_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_BRONZE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_BRONZE = FLUIDS.register("flowing_molten_bronze",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_BRONZE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_INVAR = FLUIDS.register("molten_invar_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_INVAR_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_INVAR = FLUIDS.register("flowing_molten_invar",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_INVAR_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_STAINLESS_STEEL = FLUIDS.register("molten_stainless_steel_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_STAINLESS_STEEL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_STAINLESS_STEEL = FLUIDS.register("flowing_molten_stainless_steel",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_STAINLESS_STEEL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_STABALLOY = FLUIDS.register("molten_staballoy_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_STABALLOY_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_STABALLOY = FLUIDS.register("flowing_molten_staballoy",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_STABALLOY_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_BRASS = FLUIDS.register("molten_brass_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_BRASS_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_BRASS = FLUIDS.register("flowing_molten_brass",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_BRASS_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_BISMUTH = FLUIDS.register("molten_bismuth_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_BISMUTH_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_BISMUTH = FLUIDS.register("flowing_molten_bismuth",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_BISMUTH_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_POLONIUM = FLUIDS.register("molten_polonium_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_POLONIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_POLONIUM = FLUIDS.register("flowing_molten_polonium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_POLONIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TUNGSTEN = FLUIDS.register("molten_tungsten_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_TUNGSTEN_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TUNGSTEN = FLUIDS.register("flowing_molten_tungsten",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_TUNGSTEN_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_CHROMIUM = FLUIDS.register("molten_chromium_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_CHROMIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_CHROMIUM = FLUIDS.register("flowing_molten_chromium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_CHROMIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_COBALT = FLUIDS.register("molten_cobalt_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_COBALT_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_COBALT = FLUIDS.register("flowing_molten_cobalt",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_COBALT_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ELECTRUM = FLUIDS.register("molten_electrum_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_ELECTRUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ELECTRUM = FLUIDS.register("flowing_molten_electrum",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_ELECTRUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_SILVER = FLUIDS.register("molten_silver_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_SILVER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_SILVER = FLUIDS.register("flowing_molten_silver",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_SILVER_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_IRON = FLUIDS.register("molten_iron_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_IRON_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_IRON = FLUIDS.register("flowing_molten_iron",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_IRON_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_GOLD = FLUIDS.register("molten_gold_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_GOLD_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_GOLD = FLUIDS.register("flowing_molten_gold",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_GOLD_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_NETHERITE = FLUIDS.register("molten_netherite_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_NETHERITE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_NETHERITE = FLUIDS.register("flowing_molten_netherite",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_NETHERITE_FLUID_PROPERTIES));


    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_REDSTONE = FLUIDS.register("molten_redstone_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_REDSTONE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_REDSTONE = FLUIDS.register("flowing_molten_redstone",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_REDSTONE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_OXYGEN = FLUIDS.register("oxygen_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.OXYGEN_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_OXYGEN = FLUIDS.register("flowing_oxygen",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.OXYGEN_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_HYDROGEN = FLUIDS.register("hydrogen_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.HYDROGEN_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_HYDROGEN = FLUIDS.register("flowing_hydrogen",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.HYDROGEN_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_HEAVY_WATER = FLUIDS.register("heavy_water_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.HEAVY_WATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_HEAVY_WATER = FLUIDS.register("flowing_heavy_water",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.HEAVY_WATER_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_DEUTERIUM = FLUIDS.register("deuterium_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.DEUTERIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_DEUTERIUM = FLUIDS.register("flowing_deuterium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.DEUTERIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_TRITIUM = FLUIDS.register("tritium_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.TRITIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_TRITIUM = FLUIDS.register("flowing_tritium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.TRITIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_CRUDE_OIL = FLUIDS.register("crude_oil_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.CRUDE_OIL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_CRUDE_OIL = FLUIDS.register("flowing_crude_oil",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.CRUDE_OIL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_METHANE = FLUIDS.register("methane_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.METHANE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_METHANE = FLUIDS.register("flowing_methane",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.METHANE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_ETHANE = FLUIDS.register("ethane_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.ETHANE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_ETHANE = FLUIDS.register("flowing_ethane",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.ETHANE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_PROPANE = FLUIDS.register("propane_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.PROPANE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_PROPANE = FLUIDS.register("flowing_propane",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.PROPANE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_BUTANE = FLUIDS.register("butane_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.BUTANE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_BUTANE = FLUIDS.register("flowing_butane",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.BUTANE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_GASOLINE = FLUIDS.register("gasoline_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.GASOLINE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_GASOLINE = FLUIDS.register("flowing_gasoline",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.GASOLINE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_KEROSENE = FLUIDS.register("kerosene_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.KEROSENE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_KEROSENE = FLUIDS.register("flowing_kerosene",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.KEROSENE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_DIESEL = FLUIDS.register("diesel_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.DIESEL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_DIESEL = FLUIDS.register("flowing_diesel",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.DIESEL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_BITUMEN = FLUIDS.register("bitumen_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.BITUMEN_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_BITUMEN = FLUIDS.register("flowing_bitumen",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.BITUMEN_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_FORMALDEHYDE = FLUIDS.register("formaldehyde_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.FORMALDEHYDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_FORMALDEHYDE = FLUIDS.register("flowing_formaldehyde",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.FORMALDEHYDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_ETHANOL = FLUIDS.register("ethanol_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.ETHANOL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_ETHANOL = FLUIDS.register("flowing_ethanol",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.ETHANOL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_METHANOL = FLUIDS.register("methanol_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.METHANOL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_METHANOL = FLUIDS.register("flowing_methanol",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.METHANOL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_AMMONIA = FLUIDS.register("ammonia_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.AMMONIA_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_AMMONIA = FLUIDS.register("flowing_ammonia",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.AMMONIA_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_FLUORINE = FLUIDS.register("fluorine_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.FLUORINE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_FLUORINE = FLUIDS.register("flowing_fluorine",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.FLUORINE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_NITROGEN = FLUIDS.register("nitrogen_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.NITROGEN_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_NITROGEN = FLUIDS.register("flowing_nitrogen",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.NITROGEN_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_POTASSIUM_CHLORIDE = FLUIDS.register("potassium_chloride_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.POTASSIUM_CHLORIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_POTASSIUM_CHLORIDE = FLUIDS.register("flowing_potassium_chloride",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.POTASSIUM_CHLORIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_POTASSIUM_HYDROGEN_FLUORIDE = FLUIDS.register("potassium_hydrogen_fluoride_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.POTASSIUM_HYDROGEN_FLUORIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_POTASSIUM_HYDROGEN_FLUORIDE = FLUIDS.register("flowing_potassium_hydrogen_fluoride",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.POTASSIUM_HYDROGEN_FLUORIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_SULFURIC_ACID = FLUIDS.register("sulfuric_acid_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.SULFURIC_ACID_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_SULFURIC_ACID = FLUIDS.register("flowing_sulfuric_acid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.SULFURIC_ACID_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_HYDROFLUORIC_ACID = FLUIDS.register("hydrofluoric_acid_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.HYDROFLUORIC_ACID_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_HYDROFLUORIC_ACID = FLUIDS.register("flowing_hydrofluoric_acid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.HYDROFLUORIC_ACID_FLUID_PROPERTIES));




    public static final ForgeFlowingFluid.Properties MOLTEN_URANIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            UraniumFluidType.MOLTEN_URANIUM_FLUID_TYPE, SOURCE_MOLTEN_URANIUM, FLOWING_MOLTEN_URANIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_URANIUM_BLOCK).bucket(CCItems.MOLTEN_URANIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_PLUTONIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            PlutoniumFluidType.MOLTEN_PLUTONIUM_FLUID_TYPE, SOURCE_MOLTEN_PLUTONIUM, FLOWING_MOLTEN_PLUTONIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_PLUTONIUM_BLOCK).bucket(CCItems.MOLTEN_PLUTONIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_BERYLLIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            BerylliumFluidType.MOLTEN_BERYLLIUM_FLUID_TYPE, SOURCE_MOLTEN_BERYLLIUM, FLOWING_MOLTEN_BERYLLIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_BERYLLIUM_BLOCK).bucket(CCItems.MOLTEN_BERYLLIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_TITANIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            TitaniumFluidType.MOLTEN_TITANIUM_FLUID_TYPE, SOURCE_MOLTEN_TITANIUM, FLOWING_MOLTEN_TITANIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_TITANIUM_BLOCK).bucket(CCItems.MOLTEN_TITANIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_LITHIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            LithiumFluidType.MOLTEN_LITHIUM_FLUID_TYPE, SOURCE_MOLTEN_LITHIUM, FLOWING_MOLTEN_LITHIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_LITHIUM_BLOCK).bucket(CCItems.MOLTEN_LITHIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_THORIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ThoriumFluidType.MOLTEN_THORIUM_FLUID_TYPE, SOURCE_MOLTEN_THORIUM, FLOWING_MOLTEN_THORIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_THORIUM_BLOCK).bucket(CCItems.MOLTEN_THORIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_NICKEL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            NickelFluidType.MOLTEN_NICKEL_FLUID_TYPE, SOURCE_MOLTEN_NICKEL, FLOWING_MOLTEN_NICKEL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_NICKEL_BLOCK).bucket(CCItems.MOLTEN_NICKEL_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_LEAD_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            LeadFluidType.MOLTEN_LEAD_FLUID_TYPE, SOURCE_MOLTEN_LEAD, FLOWING_MOLTEN_LEAD)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_LEAD_BLOCK).bucket(CCItems.MOLTEN_LEAD_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_TANKSTEEL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            TanksteelFluidType.MOLTEN_TANKSTEEL_FLUID_TYPE, SOURCE_MOLTEN_TANKSTEEL, FLOWING_MOLTEN_TANKSTEEL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_TANKSTEEL_BLOCK).bucket(CCItems.MOLTEN_TANKSTEEL_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_STEEL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            SteelFluidType.MOLTEN_STEEL_FLUID_TYPE, SOURCE_MOLTEN_STEEL, FLOWING_MOLTEN_STEEL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_STEEL_BLOCK).bucket(CCItems.MOLTEN_STEEL_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_ALUMINUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            AluminumFluidType.MOLTEN_ALUMINUM_FLUID_TYPE, SOURCE_MOLTEN_ALUMINUM, FLOWING_MOLTEN_ALUMINUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_ALUMINUM_BLOCK).bucket(CCItems.MOLTEN_ALUMINUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_TIN_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            TinFluidType.MOLTEN_TIN_FLUID_TYPE, SOURCE_MOLTEN_TIN, FLOWING_MOLTEN_TIN)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_TIN_BLOCK).bucket(CCItems.MOLTEN_TIN_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_ZINC_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ZincFluidType.MOLTEN_ZINC_FLUID_TYPE, SOURCE_MOLTEN_ZINC, FLOWING_MOLTEN_ZINC)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_ZINC_BLOCK).bucket(CCItems.MOLTEN_ZINC_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_COPPER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            CopperFluidType.MOLTEN_COPPER_FLUID_TYPE, SOURCE_MOLTEN_COPPER, FLOWING_MOLTEN_COPPER)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_COPPER_BLOCK).bucket(CCItems.MOLTEN_COPPER_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_SILICON_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            SiliconFluidType.MOLTEN_SILICON_FLUID_TYPE, SOURCE_MOLTEN_SILICON, FLOWING_MOLTEN_SILICON)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_SILICON_BLOCK).bucket(CCItems.MOLTEN_SILICON_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_URANIUM_235_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            Uranium235FluidType.MOLTEN_URANIUM_235_FLUID_TYPE, SOURCE_MOLTEN_URANIUM_235, FLOWING_MOLTEN_URANIUM_235)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_URANIUM_235_BLOCK).bucket(CCItems.MOLTEN_URANIUM_235_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_URANIUM_238_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            Uranium238FluidType.MOLTEN_URANIUM_238_FLUID_TYPE, SOURCE_MOLTEN_URANIUM_238, FLOWING_MOLTEN_URANIUM_238)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_URANIUM_238_BLOCK).bucket(CCItems.MOLTEN_URANIUM_238_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_URANIUM_233_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            Uranium233FluidType.MOLTEN_URANIUM_233_FLUID_TYPE, SOURCE_MOLTEN_URANIUM_233, FLOWING_MOLTEN_URANIUM_233)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_URANIUM_233_BLOCK).bucket(CCItems.MOLTEN_URANIUM_233_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_FISSILE_URANIUM_20_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            FissileUranium20FluidType.MOLTEN_FISSILE_URANIUM_20_FLUID_TYPE, SOURCE_MOLTEN_FISSILE_URANIUM_20, FLOWING_MOLTEN_FISSILE_URANIUM_20)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_FISSILE_URANIUM_20_BLOCK).bucket(CCItems.MOLTEN_FISSILE_URANIUM_20_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_FISSILE_URANIUM_90_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            FissileUranium90FluidType.MOLTEN_FISSILE_URANIUM_90_FLUID_TYPE, SOURCE_MOLTEN_FISSILE_URANIUM_90, FLOWING_MOLTEN_FISSILE_URANIUM_90)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_FISSILE_URANIUM_90_BLOCK).bucket(CCItems.MOLTEN_FISSILE_URANIUM_90_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_LITHIUM_6_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            Lithium6FluidType.MOLTEN_LITHIUM_6_FLUID_TYPE, SOURCE_MOLTEN_LITHIUM_6, FLOWING_MOLTEN_LITHIUM_6)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_LITHIUM_6_BLOCK).bucket(CCItems.MOLTEN_LITHIUM_6_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_LITHIUM_7_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            Lithium7FluidType.MOLTEN_LITHIUM_7_FLUID_TYPE, SOURCE_MOLTEN_LITHIUM_7, FLOWING_MOLTEN_LITHIUM_7)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_LITHIUM_7_BLOCK).bucket(CCItems.MOLTEN_LITHIUM_7_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_ROSE_GOLD_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            RoseGoldFluidType.MOLTEN_ROSE_GOLD_FLUID_TYPE, SOURCE_MOLTEN_ROSE_GOLD, FLOWING_MOLTEN_ROSE_GOLD)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_ROSE_GOLD_BLOCK).bucket(CCItems.MOLTEN_ROSE_GOLD_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_ROSESTEEL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            RosesteelFluidType.MOLTEN_ROSESTEEL_FLUID_TYPE, SOURCE_MOLTEN_ROSESTEEL, FLOWING_MOLTEN_ROSESTEEL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_ROSESTEEL_BLOCK).bucket(CCItems.MOLTEN_ROSESTEEL_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_INVAR_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            InvarFluidType.MOLTEN_INVAR_FLUID_TYPE, SOURCE_MOLTEN_INVAR, FLOWING_MOLTEN_INVAR)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_INVAR_BLOCK).bucket(CCItems.MOLTEN_INVAR_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_BRONZE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            BronzeFluidType.MOLTEN_BRONZE_FLUID_TYPE, SOURCE_MOLTEN_BRONZE, FLOWING_MOLTEN_BRONZE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_BRONZE_BLOCK).bucket(CCItems.MOLTEN_BRONZE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_ALNICO_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            AlnicoFluidType.MOLTEN_ALNICO_FLUID_TYPE, SOURCE_MOLTEN_ALNICO, FLOWING_MOLTEN_ALNICO)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_ALNICO_BLOCK).bucket(CCItems.MOLTEN_ALNICO_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_STAINLESS_STEEL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            StainlessSteelFluidType.MOLTEN_STAINLESS_STEEL_FLUID_TYPE, SOURCE_MOLTEN_STAINLESS_STEEL, FLOWING_MOLTEN_STAINLESS_STEEL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_STAINLESS_STEEL_BLOCK).bucket(CCItems.MOLTEN_STAINLESS_STEEL_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_STABALLOY_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            StaballoyFluidType.MOLTEN_STABALLOY_FLUID_TYPE, SOURCE_MOLTEN_STABALLOY, FLOWING_MOLTEN_STABALLOY)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_STABALLOY_BLOCK).bucket(CCItems.MOLTEN_STABALLOY_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_BRASS_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            BrassFluidType.MOLTEN_BRASS_FLUID_TYPE, SOURCE_MOLTEN_BRASS, FLOWING_MOLTEN_BRASS)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_BRASS_BLOCK).bucket(CCItems.MOLTEN_BRASS_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_BISMUTH_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            BismuthFluidType.MOLTEN_BISMUTH_FLUID_TYPE, SOURCE_MOLTEN_BISMUTH, FLOWING_MOLTEN_BISMUTH)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_BISMUTH_BLOCK).bucket(CCItems.MOLTEN_BISMUTH_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_POLONIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            PoloniumFluidType.MOLTEN_POLONIUM_FLUID_TYPE, SOURCE_MOLTEN_POLONIUM, FLOWING_MOLTEN_POLONIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_POLONIUM_BLOCK).bucket(CCItems.MOLTEN_POLONIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_TUNGSTEN_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            TungstenFluidType.MOLTEN_TUNGSTEN_FLUID_TYPE, SOURCE_MOLTEN_TUNGSTEN, FLOWING_MOLTEN_TUNGSTEN)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_TUNGSTEN_BLOCK).bucket(CCItems.MOLTEN_TUNGSTEN_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_CHROMIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ChromiumFluidType.MOLTEN_CHROMIUM_FLUID_TYPE, SOURCE_MOLTEN_CHROMIUM, FLOWING_MOLTEN_CHROMIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_CHROMIUM_BLOCK).bucket(CCItems.MOLTEN_CHROMIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_COBALT_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            CobaltFluidType.MOLTEN_COBALT_FLUID_TYPE, SOURCE_MOLTEN_COBALT, FLOWING_MOLTEN_COBALT)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_COBALT_BLOCK).bucket(CCItems.MOLTEN_COBALT_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_ELECTRUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ElectrumFluidType.MOLTEN_ELECTRUM_FLUID_TYPE, SOURCE_MOLTEN_ELECTRUM, FLOWING_MOLTEN_ELECTRUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_ELECTRUM_BLOCK).bucket(CCItems.MOLTEN_ELECTRUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_SILVER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            SilverFluidType.MOLTEN_SILVER_FLUID_TYPE, SOURCE_MOLTEN_SILVER, FLOWING_MOLTEN_SILVER)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_SILVER_BLOCK).bucket(CCItems.MOLTEN_SILVER_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_IRON_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            IronFluidType.MOLTEN_IRON_FLUID_TYPE, SOURCE_MOLTEN_IRON, FLOWING_MOLTEN_IRON)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_IRON_BLOCK).bucket(CCItems.MOLTEN_IRON_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_GOLD_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            GoldFluidType.MOLTEN_GOLD_FLUID_TYPE, SOURCE_MOLTEN_GOLD, FLOWING_MOLTEN_GOLD)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_GOLD_BLOCK).bucket(CCItems.MOLTEN_GOLD_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_NETHERITE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            NetheriteFluidType.MOLTEN_NETHERITE_FLUID_TYPE, SOURCE_MOLTEN_NETHERITE, FLOWING_MOLTEN_NETHERITE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_NETHERITE_BLOCK).bucket(CCItems.MOLTEN_NETHERITE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_REDSTONE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            RedstoneFluidType.MOLTEN_REDSTONE_FLUID_TYPE, SOURCE_MOLTEN_REDSTONE, FLOWING_MOLTEN_REDSTONE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_REDSTONE_BLOCK).bucket(CCItems.MOLTEN_REDSTONE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties OXYGEN_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            OxygenFluidType.OXYGEN_FLUID_TYPE, SOURCE_OXYGEN, FLOWING_OXYGEN)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.OXYGEN_BLOCK).bucket(CCItems.OXYGEN_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties HYDROGEN_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            HydrogenFluidType.HYDROGEN_FLUID_TYPE, SOURCE_HYDROGEN, FLOWING_HYDROGEN)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.HYDROGEN_BLOCK).bucket(CCItems.HYDROGEN_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties HEAVY_WATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            HeavyWaterFluidType.HEAVY_WATER_FLUID_TYPE, SOURCE_HEAVY_WATER, FLOWING_HEAVY_WATER)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.HEAVY_WATER_BLOCK).bucket(CCItems.HEAVY_WATER_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties DEUTERIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            DeuteriumFluidType.DEUTERIUM_FLUID_TYPE, SOURCE_DEUTERIUM, FLOWING_DEUTERIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.DEUTERIUM_BLOCK).bucket(CCItems.DEUTERIUM_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties TRITIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            TritiumFluidType.TRITIUM_FLUID_TYPE, SOURCE_TRITIUM, FLOWING_TRITIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.TRITIUM_BLOCK).bucket(CCItems.TRITIUM_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties CRUDE_OIL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            CrudeOilFluidType.CRUDE_OIL_FLUID_TYPE, SOURCE_CRUDE_OIL, FLOWING_CRUDE_OIL)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.CRUDE_OIL_BLOCK).bucket(CCItems.CRUDE_OIL_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties METHANE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            MethaneFluidType.METHANE_FLUID_TYPE, SOURCE_METHANE, FLOWING_METHANE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.METHANE_BLOCK).bucket(CCItems.METHANE_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties ETHANE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            EthaneFluidType.ETHANE_FLUID_TYPE, SOURCE_ETHANE, FLOWING_ETHANE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.ETHANE_BLOCK).bucket(CCItems.ETHANE_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties PROPANE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            PropaneFluidType.PROPANE_FLUID_TYPE, SOURCE_PROPANE, FLOWING_PROPANE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.PROPANE_BLOCK).bucket(CCItems.PROPANE_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties BUTANE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ButaneFluidType.BUTANE_FLUID_TYPE, SOURCE_BUTANE, FLOWING_BUTANE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.BUTANE_BLOCK).bucket(CCItems.BUTANE_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties GASOLINE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            GasolineFluidType.GASOLINE_FLUID_TYPE, SOURCE_GASOLINE, FLOWING_GASOLINE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.GASOLINE_BLOCK).bucket(CCItems.GASOLINE_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties KEROSENE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            KeroseneFluidType.KEROSENE_FLUID_TYPE, SOURCE_KEROSENE, FLOWING_KEROSENE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.KEROSENE_BLOCK).bucket(CCItems.KEROSENE_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties DIESEL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            DieselFluidType.DIESEL_FLUID_TYPE, SOURCE_DIESEL, FLOWING_DIESEL)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.DIESEL_BLOCK).bucket(CCItems.DIESEL_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties BITUMEN_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            BitumenFluidType.BITUMEN_FLUID_TYPE, SOURCE_BITUMEN, FLOWING_BITUMEN)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.BITUMEN_BLOCK).bucket(CCItems.BITUMEN_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties FORMALDEHYDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            FormaldehydeFluidType.FORMALDEHYDE_FLUID_TYPE, SOURCE_FORMALDEHYDE, FLOWING_FORMALDEHYDE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.FORMALDEHYDE_BLOCK).bucket(CCItems.FORMALDEHYDE_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties ETHANOL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            EthanolFluidType.ETHANOL_FLUID_TYPE, SOURCE_ETHANOL, FLOWING_ETHANOL)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.ETHANOL_BLOCK).bucket(CCItems.ETHANOL_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties METHANOL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            MethanolFluidType.METHANOL_FLUID_TYPE, SOURCE_METHANOL, FLOWING_METHANOL)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.METHANOL_BLOCK).bucket(CCItems.METHANOL_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties FLUORINE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            FluorineFluidType.FLUORINE_FLUID_TYPE, SOURCE_FLUORINE, FLOWING_FLUORINE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.FLUORINE_BLOCK).bucket(CCItems.FLUORINE_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties NITROGEN_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            NitrogenFluidType.NITROGEN_FLUID_TYPE, SOURCE_NITROGEN, FLOWING_NITROGEN)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.NITROGEN_BLOCK).bucket(CCItems.NITROGEN_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties AMMONIA_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            AmmoniaFluidType.AMMONIA_FLUID_TYPE, SOURCE_AMMONIA, FLOWING_AMMONIA)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.AMMONIA_BLOCK).bucket(CCItems.AMMONIA_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties SULFURIC_ACID_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            SulfuricAcidFluidType.SULFURIC_ACID_FLUID_TYPE, SOURCE_SULFURIC_ACID, FLOWING_SULFURIC_ACID)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.SULFURIC_ACID_BLOCK).bucket(CCItems.SULFURIC_ACID_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties HYDROFLUORIC_ACID_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            HydrofluoricAcidFluidType.HYDROFLUORIC_ACID_FLUID_TYPE, SOURCE_HYDROFLUORIC_ACID, FLOWING_HYDROFLUORIC_ACID)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.HYDROFLUORIC_ACID_BLOCK).bucket(CCItems.HYDROFLUORIC_ACID_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties POTASSIUM_HYDROGEN_FLUORIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            PotassiumHydrogenFluorideFluidType.MOLTEN_POTASSIUM_HYDROGEN_FLUORIDE_FLUID_TYPE, SOURCE_POTASSIUM_HYDROGEN_FLUORIDE, FLOWING_POTASSIUM_HYDROGEN_FLUORIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.MOLTEN_POTASSIUM_HYDROGEN_FLUORIDE_BLOCK).bucket(CCItems.POTASSIUM_HYDROGEN_FLUORIDE_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties POTASSIUM_CHLORIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            PotassiumChlorideFluidType.MOLTEN_POTASSIUM_CHLORIDE_FLUID_TYPE, SOURCE_POTASSIUM_CHLORIDE, FLOWING_POTASSIUM_CHLORIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.MOLTEN_POTASSIUM_CHLORIDE_BLOCK).bucket(CCItems.POTASSIUM_CHLORIDE_BUCKET).tickRate(5);




    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
