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

public class CCFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, CreateConquer.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_URANIUM = FLUIDS.register("molten_uranium_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_URANIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_URANIUM = FLUIDS.register("flowing_molten_uranium",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_URANIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_URANIUM_SULFATE = FLUIDS.register("molten_uranium_sulfate_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_URANIUM_SULFATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_URANIUM_SULFATE = FLUIDS.register("flowing_molten_uranium_sulfate",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_URANIUM_SULFATE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_URANIUM_SULFIDE = FLUIDS.register("molten_uranium_sulfide_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_URANIUM_SULFIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_URANIUM_SULFIDE = FLUIDS.register("flowing_molten_uranium_sulfide",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_URANIUM_SULFIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_PLUTONIUM = FLUIDS.register("molten_plutonium_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_PLUTONIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_PLUTONIUM = FLUIDS.register("flowing_molten_plutonium",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_PLUTONIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_PLUTONIUM_SULFATE = FLUIDS.register("molten_plutonium_sulfate_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_PLUTONIUM_SULFATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_PLUTONIUM_SULFATE = FLUIDS.register("flowing_molten_plutonium_sulfate",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_PLUTONIUM_SULFATE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_PLUTONIUM_SULFIDE = FLUIDS.register("molten_plutonium_sulfide_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_PLUTONIUM_SULFIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_PLUTONIUM_SULFIDE = FLUIDS.register("flowing_molten_plutonium_sulfide",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_PLUTONIUM_SULFIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TITANIUM = FLUIDS.register("molten_titanium_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_TITANIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TITANIUM = FLUIDS.register("flowing_molten_titanium",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_TITANIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TITANIUM_SULFATE = FLUIDS.register("molten_titanium_sulfate_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_TITANIUM_SULFATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TITANIUM_SULFATE = FLUIDS.register("flowing_molten_titanium_sulfate",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_TITANIUM_SULFATE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TITANIUM_SULFIDE = FLUIDS.register("molten_titanium_sulfide_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_TITANIUM_SULFIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TITANIUM_SULFIDE = FLUIDS.register("flowing_molten_titanium_sulfide",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_TITANIUM_SULFIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_BERYLLIUM = FLUIDS.register("molten_beryllium_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_BERYLLIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_BERYLLIUM = FLUIDS.register("flowing_molten_beryllium",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_BERYLLIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_BERYLLIUM_SULFATE = FLUIDS.register("molten_beryllium_sulfate_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_BERYLLIUM_SULFATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_BERYLLIUM_SULFATE = FLUIDS.register("flowing_molten_beryllium_sulfate",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_BERYLLIUM_SULFATE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_BERYLLIUM_SULFIDE = FLUIDS.register("molten_beryllium_sulfide_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_BERYLLIUM_SULFIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_BERYLLIUM_SULFIDE = FLUIDS.register("flowing_molten_beryllium_sulfide",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_BERYLLIUM_SULFIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_LITHIUM = FLUIDS.register("molten_lithium_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_LITHIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_LITHIUM = FLUIDS.register("flowing_molten_lithium",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_LITHIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_LITHIUM_SULFATE = FLUIDS.register("molten_lithium_sulfate_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_LITHIUM_SULFATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_LITHIUM_SULFATE = FLUIDS.register("flowing_molten_lithium_sulfate",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_LITHIUM_SULFATE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_LITHIUM_SULFIDE = FLUIDS.register("molten_lithium_sulfide_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_LITHIUM_SULFIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_LITHIUM_SULFIDE = FLUIDS.register("flowing_molten_lithium_sulfide",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_LITHIUM_SULFIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_THORIUM = FLUIDS.register("molten_thorium_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_THORIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_THORIUM = FLUIDS.register("flowing_molten_thorium",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_THORIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_THORIUM_SULFATE = FLUIDS.register("molten_thorium_sulfate_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_THORIUM_SULFATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_THORIUM_SULFATE = FLUIDS.register("flowing_molten_thorium_sulfate",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_THORIUM_SULFATE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_THORIUM_SULFIDE = FLUIDS.register("molten_thorium_sulfide_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_THORIUM_SULFIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_THORIUM_SULFIDE = FLUIDS.register("flowing_molten_thorium_sulfide",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_THORIUM_SULFIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_LEAD = FLUIDS.register("molten_lead_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_LEAD_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_LEAD = FLUIDS.register("flowing_molten_lead",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_LEAD_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_LEAD_SULFATE = FLUIDS.register("molten_lead_sulfate_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_LEAD_SULFATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_LEAD_SULFATE = FLUIDS.register("flowing_molten_lead_sulfate",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_LEAD_SULFATE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_LEAD_SULFIDE = FLUIDS.register("molten_lead_sulfide_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_LEAD_SULFIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_LEAD_SULFIDE = FLUIDS.register("flowing_molten_lead_sulfide",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_LEAD_SULFIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_NICKEL = FLUIDS.register("molten_nickel_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_NICKEL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_NICKEL = FLUIDS.register("flowing_molten_nickel",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_NICKEL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_NICKEL_SULFATE = FLUIDS.register("molten_nickel_sulfate_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_NICKEL_SULFATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_NICKEL_SULFATE = FLUIDS.register("flowing_molten_nickel_sulfate",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_NICKEL_SULFATE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_NICKEL_SULFIDE = FLUIDS.register("molten_nickel_sulfide_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_NICKEL_SULFIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_NICKEL_SULFIDE = FLUIDS.register("flowing_molten_nickel_sulfide",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_NICKEL_SULFIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TANKSTEEL = FLUIDS.register("molten_tanksteel_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_TANKSTEEL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TANKSTEEL = FLUIDS.register("flowing_molten_tanksteel",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_TANKSTEEL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_STEEL = FLUIDS.register("molten_steel_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_STEEL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_STEEL = FLUIDS.register("flowing_molten_steel",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_STEEL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ALUMINUM = FLUIDS.register("molten_aluminum_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_ALUMINUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ALUMINUM = FLUIDS.register("flowing_molten_aluminum",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_ALUMINUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ALUMINUM_SULFATE = FLUIDS.register("molten_aluminum_sulfate_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_ALUMINUM_SULFATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ALUMINUM_SULFATE = FLUIDS.register("flowing_molten_aluminum_sulfate",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_ALUMINUM_SULFATE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ALUMINUM_SULFIDE = FLUIDS.register("molten_aluminum_sulfide_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_ALUMINUM_SULFIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ALUMINUM_SULFIDE = FLUIDS.register("flowing_molten_aluminum_sulfide",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_ALUMINUM_SULFIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TIN = FLUIDS.register("molten_tin_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_TIN_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TIN = FLUIDS.register("flowing_molten_tin",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_TIN_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TIN_SULFATE = FLUIDS.register("molten_tin_sulfate_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_TIN_SULFATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TIN_SULFATE = FLUIDS.register("flowing_molten_tin_sulfate",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_TIN_SULFATE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TIN_SULFIDE = FLUIDS.register("molten_tin_sulfide_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_TIN_SULFIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TIN_SULFIDE = FLUIDS.register("flowing_molten_tin_sulfide",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_TIN_SULFIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ZINC = FLUIDS.register("molten_zinc_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_ZINC_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ZINC = FLUIDS.register("flowing_molten_zinc",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_ZINC_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ZINC_SULFATE = FLUIDS.register("molten_zinc_sulfate_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_ZINC_SULFATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ZINC_SULFATE = FLUIDS.register("flowing_molten_zinc_sulfate",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_ZINC_SULFATE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ZINC_SULFIDE = FLUIDS.register("molten_zinc_sulfide_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_ZINC_SULFIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ZINC_SULFIDE = FLUIDS.register("flowing_molten_zinc_sulfide",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_ZINC_SULFIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_COPPER = FLUIDS.register("molten_copper_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_COPPER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_COPPER = FLUIDS.register("flowing_molten_copper",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_COPPER_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_COPPER_SULFATE = FLUIDS.register("molten_copper_sulfate_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_COPPER_SULFATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_COPPER_SULFATE = FLUIDS.register("flowing_molten_copper_sulfate",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_COPPER_SULFATE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_COPPER_SULFIDE = FLUIDS.register("molten_copper_sulfide_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_COPPER_SULFIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_COPPER_SULFIDE = FLUIDS.register("flowing_molten_copper_sulfide",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_COPPER_SULFIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_SILICON = FLUIDS.register("molten_silicon_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_SILICON_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_SILICON = FLUIDS.register("flowing_molten_silicon",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_SILICON_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_URANIUM_235 = FLUIDS.register("molten_uranium_235_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_URANIUM_235_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_URANIUM_235 = FLUIDS.register("flowing_molten_uranium_235",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_URANIUM_235_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_URANIUM_238 = FLUIDS.register("molten_uranium_238_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_URANIUM_238_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_URANIUM_238 = FLUIDS.register("flowing_molten_uranium_238",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_URANIUM_238_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_URANIUM_233 = FLUIDS.register("molten_uranium_233_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_URANIUM_233_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_URANIUM_233 = FLUIDS.register("flowing_molten_uranium_233",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_URANIUM_233_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_FISSILE_URANIUM_20 = FLUIDS.register("molten_fissile_uranium_20_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_FISSILE_URANIUM_20_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_FISSILE_URANIUM_20 = FLUIDS.register("flowing_molten_fissile_uranium_20",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_FISSILE_URANIUM_20_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_FISSILE_URANIUM_90 = FLUIDS.register("molten_fissile_uranium_90_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_FISSILE_URANIUM_90_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_FISSILE_URANIUM_90 = FLUIDS.register("flowing_molten_fissile_uranium_90",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_FISSILE_URANIUM_90_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_LITHIUM_6 = FLUIDS.register("molten_lithium_6_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_LITHIUM_6_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_LITHIUM_6 = FLUIDS.register("flowing_molten_lithium_6",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_LITHIUM_6_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_LITHIUM_7 = FLUIDS.register("molten_lithium_7_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_LITHIUM_7_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_LITHIUM_7 = FLUIDS.register("flowing_molten_lithium_7",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_LITHIUM_7_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ROSE_GOLD = FLUIDS.register("molten_rose_gold_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_ROSE_GOLD_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ROSE_GOLD = FLUIDS.register("flowing_molten_rose_gold",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_ROSE_GOLD_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ROSESTEEL = FLUIDS.register("molten_rosesteel_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_ROSESTEEL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ROSESTEEL = FLUIDS.register("flowing_molten_rosesteel",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_ROSESTEEL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ALNICO = FLUIDS.register("molten_alnico_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_ALNICO_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ALNICO = FLUIDS.register("flowing_molten_alnico",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_ALNICO_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_BRONZE = FLUIDS.register("molten_bronze_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_BRONZE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_BRONZE = FLUIDS.register("flowing_molten_bronze",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_BRONZE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_INVAR = FLUIDS.register("molten_invar_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_INVAR_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_INVAR = FLUIDS.register("flowing_molten_invar",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_INVAR_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_STAINLESS_STEEL = FLUIDS.register("molten_stainless_steel_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_STAINLESS_STEEL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_STAINLESS_STEEL = FLUIDS.register("flowing_molten_stainless_steel",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_STAINLESS_STEEL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_STABALLOY = FLUIDS.register("molten_staballoy_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_STABALLOY_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_STABALLOY = FLUIDS.register("flowing_molten_staballoy",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_STABALLOY_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_BRASS = FLUIDS.register("molten_brass_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_BRASS_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_BRASS = FLUIDS.register("flowing_molten_brass",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_BRASS_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_BISMUTH = FLUIDS.register("molten_bismuth_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_BISMUTH_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_BISMUTH = FLUIDS.register("flowing_molten_bismuth",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_BISMUTH_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_BISMUTH_SULFATE = FLUIDS.register("molten_bismuth_sulfate_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_BISMUTH_SULFATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_BISMUTH_SULFATE = FLUIDS.register("flowing_molten_bismuth_sulfate",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_BISMUTH_SULFATE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_BISMUTH_SULFIDE = FLUIDS.register("molten_bismuth_sulfide_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_BISMUTH_SULFIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_BISMUTH_SULFIDE = FLUIDS.register("flowing_molten_bismuth_sulfide",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_BISMUTH_SULFIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_POLONIUM = FLUIDS.register("molten_polonium_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_POLONIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_POLONIUM = FLUIDS.register("flowing_molten_polonium",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_POLONIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_POLONIUM_SULFATE = FLUIDS.register("molten_polonium_sulfate_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_POLONIUM_SULFATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_POLONIUM_SULFATE = FLUIDS.register("flowing_molten_polonium_sulfate",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_POLONIUM_SULFATE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_POLONIUM_SULFIDE = FLUIDS.register("molten_polonium_sulfide_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_POLONIUM_SULFIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_POLONIUM_SULFIDE = FLUIDS.register("flowing_molten_polonium_sulfide",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_POLONIUM_SULFIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TUNGSTEN = FLUIDS.register("molten_tungsten_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_TUNGSTEN_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TUNGSTEN = FLUIDS.register("flowing_molten_tungsten",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_TUNGSTEN_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TUNGSTEN_SULFATE = FLUIDS.register("molten_tungsten_sulfate_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_TUNGSTEN_SULFATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TUNGSTEN_SULFATE = FLUIDS.register("flowing_molten_tungsten_sulfate",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_TUNGSTEN_SULFATE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TUNGSTEN_SULFIDE = FLUIDS.register("molten_tungsten_sulfide_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_TUNGSTEN_SULFIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TUNGSTEN_SULFIDE = FLUIDS.register("flowing_molten_tungsten_sulfide",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_TUNGSTEN_SULFIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_CHROMIUM = FLUIDS.register("molten_chromium_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_CHROMIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_CHROMIUM = FLUIDS.register("flowing_molten_chromium",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_CHROMIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_CHROMIUM_SULFATE = FLUIDS.register("molten_chromium_sulfate_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_CHROMIUM_SULFATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_CHROMIUM_SULFATE = FLUIDS.register("flowing_molten_chromium_sulfate",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_CHROMIUM_SULFATE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_CHROMIUM_SULFIDE = FLUIDS.register("molten_chromium_sulfide_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_CHROMIUM_SULFIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_CHROMIUM_SULFIDE = FLUIDS.register("flowing_molten_chromium_sulfide",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_CHROMIUM_SULFIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_COBALT = FLUIDS.register("molten_cobalt_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_COBALT_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_COBALT = FLUIDS.register("flowing_molten_cobalt",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_COBALT_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_COBALT_SULFATE = FLUIDS.register("molten_cobalt_sulfate_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_COBALT_SULFATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_COBALT_SULFATE = FLUIDS.register("flowing_molten_cobalt_sulfate",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_COBALT_SULFATE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_COBALT_SULFIDE = FLUIDS.register("molten_cobalt_sulfide_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_COBALT_SULFIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_COBALT_SULFIDE = FLUIDS.register("flowing_molten_cobalt_sulfide",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_COBALT_SULFIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ELECTRUM = FLUIDS.register("molten_electrum_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_ELECTRUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ELECTRUM = FLUIDS.register("flowing_molten_electrum",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_ELECTRUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_SILVER = FLUIDS.register("molten_silver_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_SILVER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_SILVER = FLUIDS.register("flowing_molten_silver",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_SILVER_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_SILVER_SULFATE = FLUIDS.register("molten_silver_sulfate_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_SILVER_SULFATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_SILVER_SULFATE = FLUIDS.register("flowing_molten_silver_sulfate",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_SILVER_SULFATE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_SILVER_SULFIDE = FLUIDS.register("molten_silver_sulfide_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_SILVER_SULFIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_SILVER_SULFIDE = FLUIDS.register("flowing_molten_silver_sulfide",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_SILVER_SULFIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_IRON = FLUIDS.register("molten_iron_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_IRON_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_IRON = FLUIDS.register("flowing_molten_iron",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_IRON_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_IRON_SULFATE = FLUIDS.register("molten_iron_sulfate_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_IRON_SULFATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_IRON_SULFATE = FLUIDS.register("flowing_molten_iron_sulfate",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_IRON_SULFATE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_IRON_SULFIDE = FLUIDS.register("molten_iron_sulfide_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_IRON_SULFIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_IRON_SULFIDE = FLUIDS.register("flowing_molten_iron_sulfide",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_IRON_SULFIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_GOLD = FLUIDS.register("molten_gold_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_GOLD_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_GOLD = FLUIDS.register("flowing_molten_gold",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_GOLD_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_GOLD_SULFATE = FLUIDS.register("molten_gold_sulfate_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_GOLD_SULFATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_GOLD_SULFATE = FLUIDS.register("flowing_molten_gold_sulfate",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_GOLD_SULFATE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_GOLD_SULFIDE = FLUIDS.register("molten_gold_sulfide_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_GOLD_SULFIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_GOLD_SULFIDE = FLUIDS.register("flowing_molten_gold_sulfide",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_GOLD_SULFIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_NETHERITE = FLUIDS.register("molten_netherite_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_NETHERITE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_NETHERITE = FLUIDS.register("flowing_molten_netherite",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_NETHERITE_FLUID_PROPERTIES));


    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_REDSTONE = FLUIDS.register("molten_redstone_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MOLTEN_REDSTONE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_REDSTONE = FLUIDS.register("flowing_molten_redstone",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MOLTEN_REDSTONE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_OXYGEN = FLUIDS.register("oxygen_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.OXYGEN_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_OXYGEN = FLUIDS.register("flowing_oxygen",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.OXYGEN_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_HYDROGEN = FLUIDS.register("hydrogen_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.HYDROGEN_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_HYDROGEN = FLUIDS.register("flowing_hydrogen",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.HYDROGEN_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_HEAVY_WATER = FLUIDS.register("heavy_water_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.HEAVY_WATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_HEAVY_WATER = FLUIDS.register("flowing_heavy_water",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.HEAVY_WATER_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_DEUTERIUM = FLUIDS.register("deuterium_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.DEUTERIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_DEUTERIUM = FLUIDS.register("flowing_deuterium",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.DEUTERIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_TRITIUM = FLUIDS.register("tritium_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.TRITIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_TRITIUM = FLUIDS.register("flowing_tritium",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.TRITIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_CRUDE_OIL = FLUIDS.register("crude_oil_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.CRUDE_OIL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_CRUDE_OIL = FLUIDS.register("flowing_crude_oil",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.CRUDE_OIL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_METHANE = FLUIDS.register("methane_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.METHANE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_METHANE = FLUIDS.register("flowing_methane",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.METHANE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_ETHANE = FLUIDS.register("ethane_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.ETHANE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_ETHANE = FLUIDS.register("flowing_ethane",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.ETHANE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_PROPANE = FLUIDS.register("propane_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.PROPANE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_PROPANE = FLUIDS.register("flowing_propane",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.PROPANE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_BUTANE = FLUIDS.register("butane_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.BUTANE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_BUTANE = FLUIDS.register("flowing_butane",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.BUTANE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_GASOLINE = FLUIDS.register("gasoline_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.GASOLINE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_GASOLINE = FLUIDS.register("flowing_gasoline",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.GASOLINE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_KEROSENE = FLUIDS.register("kerosene_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.KEROSENE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_KEROSENE = FLUIDS.register("flowing_kerosene",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.KEROSENE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_DIESEL = FLUIDS.register("diesel_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.DIESEL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_DIESEL = FLUIDS.register("flowing_diesel",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.DIESEL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_BITUMEN = FLUIDS.register("bitumen_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.BITUMEN_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_BITUMEN = FLUIDS.register("flowing_bitumen",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.BITUMEN_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_FORMALDEHYDE = FLUIDS.register("formaldehyde_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.FORMALDEHYDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_FORMALDEHYDE = FLUIDS.register("flowing_formaldehyde",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.FORMALDEHYDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_ETHANOL = FLUIDS.register("ethanol_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.ETHANOL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_ETHANOL = FLUIDS.register("flowing_ethanol",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.ETHANOL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_METHANOL = FLUIDS.register("methanol_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.METHANOL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_METHANOL = FLUIDS.register("flowing_methanol",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.METHANOL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_AMMONIA = FLUIDS.register("ammonia_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.AMMONIA_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_AMMONIA = FLUIDS.register("flowing_ammonia",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.AMMONIA_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_FLUORINE = FLUIDS.register("fluorine_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.FLUORINE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_FLUORINE = FLUIDS.register("flowing_fluorine",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.FLUORINE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_NITROGEN = FLUIDS.register("nitrogen_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.NITROGEN_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_NITROGEN = FLUIDS.register("flowing_nitrogen",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.NITROGEN_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_POTASSIUM_CHLORIDE = FLUIDS.register("potassium_chloride_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.POTASSIUM_CHLORIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_POTASSIUM_CHLORIDE = FLUIDS.register("flowing_potassium_chloride",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.POTASSIUM_CHLORIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_POTASSIUM_HYDROGEN_FLUORIDE = FLUIDS.register("potassium_hydrogen_fluoride_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.POTASSIUM_HYDROGEN_FLUORIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_POTASSIUM_HYDROGEN_FLUORIDE = FLUIDS.register("flowing_potassium_hydrogen_fluoride",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.POTASSIUM_HYDROGEN_FLUORIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_SULFURIC_ACID = FLUIDS.register("sulfuric_acid_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.SULFURIC_ACID_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_SULFURIC_ACID = FLUIDS.register("flowing_sulfuric_acid",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.SULFURIC_ACID_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_HYDROFLUORIC_ACID = FLUIDS.register("hydrofluoric_acid_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.HYDROFLUORIC_ACID_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_HYDROFLUORIC_ACID = FLUIDS.register("flowing_hydrofluoric_acid",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.HYDROFLUORIC_ACID_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_CHLORINE = FLUIDS.register("chlorine_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.CHLORINE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_CHLORINE = FLUIDS.register("flowing_chlorine",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.CHLORINE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_SULFUR_DICHLORIDE = FLUIDS.register("sulfur_dichloride_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.SULFUR_DICHLORIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_SULFUR_DICHLORIDE = FLUIDS.register("flowing_sulfur_dichloride",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.SULFUR_DICHLORIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MUSTARD_GAS = FLUIDS.register("mustard_gas_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MUSTARD_GAS_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MUSTARD_GAS = FLUIDS.register("flowing_mustard_gas",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MUSTARD_GAS_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_ETHYLENE = FLUIDS.register("ethylene_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.ETHYLENE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_ETHYLENE = FLUIDS.register("flowing_ethylene",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.ETHYLENE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_BENZENE = FLUIDS.register("benzene_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.BENZENE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_BENZENE = FLUIDS.register("flowing_benzene",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.BENZENE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_ETHYLBENZENE = FLUIDS.register("ethylbenzene_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.ETHYLBENZENE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_ETHYLBENZENE = FLUIDS.register("flowing_ethylbenzene",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.ETHYLBENZENE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_NAPTHA = FLUIDS.register("naptha_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.NAPTHA_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_NAPTHA = FLUIDS.register("flowing_naptha",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.NAPTHA_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_NAPALM = FLUIDS.register("napalm_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.NAPALM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_NAPALM = FLUIDS.register("flowing_napalm",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.NAPALM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_POLYETHYLENE = FLUIDS.register("polyethylene_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.POLYETHYLENE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_POLYETHYLENE = FLUIDS.register("flowing_polyethylene",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.POLYETHYLENE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MONOETHANOLAMINE = FLUIDS.register("monoethanolamine_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.MONOETHANOLAMINE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MONOETHANOLAMINE = FLUIDS.register("flowing_monoethanolamine",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.MONOETHANOLAMINE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_ETHYLENE_OXIDE = FLUIDS.register("ethylene_oxide_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.ETHYLENE_OXIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_ETHYLENE_OXIDE = FLUIDS.register("flowing_ethylene_oxide",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.ETHYLENE_OXIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_HYDROGEN_SULFIDE = FLUIDS.register("hydrogen_sulfide_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.HYDROGEN_SULFIDE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_HYDROGEN_SULFIDE = FLUIDS.register("flowing_hydrogen_sulfide",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.HYDROGEN_SULFIDE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_HYDROGEN_SULFIDE_MONOETHANOLAMINE = FLUIDS.register("hydrogen_sulfide_monoethanolamine_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.HYDROGEN_SULFIDE_MONOETHANOLAMINE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_HYDROGEN_SULFIDE_MONOETHANOLAMINE = FLUIDS.register("flowing_hydrogen_sulfide_monoethanolamine",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.HYDROGEN_SULFIDE_MONOETHANOLAMINE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_NATURAL_GAS = FLUIDS.register("natural_gas_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.NATURAL_GAS_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_NATURAL_GAS = FLUIDS.register("flowing_natural_gas",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.NATURAL_GAS_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_RAW_NATURAL_GAS = FLUIDS.register("raw_natural_gas_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.RAW_NATURAL_GAS_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_RAW_NATURAL_GAS = FLUIDS.register("flowing_raw_natural_gas",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.RAW_NATURAL_GAS_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_RAW_CRUDE_OIL = FLUIDS.register("raw_crude_oil_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.RAW_CRUDE_OIL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_RAW_CRUDE_OIL = FLUIDS.register("flowing_raw_crude_oil",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.RAW_CRUDE_OIL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_RAW_DIRTY_CRUDE_OIL = FLUIDS.register("raw_dirty_crude_oil_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.RAW_DIRTY_CRUDE_OIL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_RAW_DIRTY_CRUDE_OIL = FLUIDS.register("flowing_raw_dirty_crude_oil",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.RAW_DIRTY_CRUDE_OIL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_SALINE_WATER = FLUIDS.register("saline_water_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.SALINE_WATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_SALINE_WATER = FLUIDS.register("flowing_saline_water",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.SALINE_WATER_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_WASH_OIL = FLUIDS.register("wash_oil_fluid",
            () -> new ForgeFlowingFluid.Source(CCFluids.WASH_OIL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_WASH_OIL = FLUIDS.register("flowing_wash_oil",
            () -> new ForgeFlowingFluid.Flowing(CCFluids.WASH_OIL_FLUID_PROPERTIES));






    public static final ForgeFlowingFluid.Properties MOLTEN_URANIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            UraniumFluidType.MOLTEN_URANIUM_FLUID_TYPE, SOURCE_MOLTEN_URANIUM, FLOWING_MOLTEN_URANIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_URANIUM_BLOCK).bucket(CCItems.MOLTEN_URANIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_URANIUM_SULFATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            UraniumSulfateFluidType.MOLTEN_URANIUM_SULFATE_FLUID_TYPE, SOURCE_MOLTEN_URANIUM_SULFATE, FLOWING_MOLTEN_URANIUM_SULFATE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_URANIUM_SULFATE_BLOCK).bucket(CCItems.MOLTEN_URANIUM_SULFATE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_URANIUM_SULFIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            UraniumSulfideFluidType.MOLTEN_URANIUM_SULFIDE_FLUID_TYPE, SOURCE_MOLTEN_URANIUM_SULFIDE, FLOWING_MOLTEN_URANIUM_SULFIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_URANIUM_SULFIDE_BLOCK).bucket(CCItems.MOLTEN_URANIUM_SULFIDE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_PLUTONIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            PlutoniumFluidType.MOLTEN_PLUTONIUM_FLUID_TYPE, SOURCE_MOLTEN_PLUTONIUM, FLOWING_MOLTEN_PLUTONIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_PLUTONIUM_BLOCK).bucket(CCItems.MOLTEN_PLUTONIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_PLUTONIUM_SULFATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            PlutoniumSulfateFluidType.MOLTEN_PLUTONIUM_SULFATE_FLUID_TYPE, SOURCE_MOLTEN_PLUTONIUM_SULFATE, FLOWING_MOLTEN_PLUTONIUM_SULFATE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_PLUTONIUM_SULFATE_BLOCK).bucket(CCItems.MOLTEN_PLUTONIUM_SULFATE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_PLUTONIUM_SULFIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            PlutoniumSulfideFluidType.MOLTEN_PLUTONIUM_SULFIDE_FLUID_TYPE, SOURCE_MOLTEN_PLUTONIUM_SULFIDE, FLOWING_MOLTEN_PLUTONIUM_SULFIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_PLUTONIUM_SULFIDE_BLOCK).bucket(CCItems.MOLTEN_PLUTONIUM_SULFIDE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_BERYLLIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            BerylliumFluidType.MOLTEN_BERYLLIUM_FLUID_TYPE, SOURCE_MOLTEN_BERYLLIUM, FLOWING_MOLTEN_BERYLLIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_BERYLLIUM_BLOCK).bucket(CCItems.MOLTEN_BERYLLIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_BERYLLIUM_SULFATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            BerylliumSulfateFluidType.MOLTEN_BERYLLIUM_SULFATE_FLUID_TYPE, SOURCE_MOLTEN_BERYLLIUM_SULFATE, FLOWING_MOLTEN_BERYLLIUM_SULFATE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_BERYLLIUM_SULFATE_BLOCK).bucket(CCItems.MOLTEN_BERYLLIUM_SULFATE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_BERYLLIUM_SULFIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            BerylliumSulfideFluidType.MOLTEN_BERYLLIUM_SULFIDE_FLUID_TYPE, SOURCE_MOLTEN_BERYLLIUM_SULFIDE, FLOWING_MOLTEN_BERYLLIUM_SULFIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_BERYLLIUM_SULFIDE_BLOCK).bucket(CCItems.MOLTEN_BERYLLIUM_SULFIDE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_TITANIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            TitaniumFluidType.MOLTEN_TITANIUM_FLUID_TYPE, SOURCE_MOLTEN_TITANIUM, FLOWING_MOLTEN_TITANIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_TITANIUM_BLOCK).bucket(CCItems.MOLTEN_TITANIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_TITANIUM_SULFATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            TitaniumSulfateFluidType.MOLTEN_TITANIUM_SULFATE_FLUID_TYPE, SOURCE_MOLTEN_TITANIUM_SULFATE, FLOWING_MOLTEN_TITANIUM_SULFATE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_TITANIUM_SULFATE_BLOCK).bucket(CCItems.MOLTEN_TITANIUM_SULFATE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_TITANIUM_SULFIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            TitaniumSulfideFluidType.MOLTEN_TITANIUM_SULFIDE_FLUID_TYPE, SOURCE_MOLTEN_TITANIUM_SULFIDE, FLOWING_MOLTEN_TITANIUM_SULFIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_TITANIUM_SULFIDE_BLOCK).bucket(CCItems.MOLTEN_TITANIUM_SULFIDE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_LITHIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            LithiumFluidType.MOLTEN_LITHIUM_FLUID_TYPE, SOURCE_MOLTEN_LITHIUM, FLOWING_MOLTEN_LITHIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_LITHIUM_BLOCK).bucket(CCItems.MOLTEN_LITHIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_LITHIUM_SULFATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            LithiumSulfateFluidType.MOLTEN_LITHIUM_SULFATE_FLUID_TYPE, SOURCE_MOLTEN_LITHIUM_SULFATE, FLOWING_MOLTEN_LITHIUM_SULFATE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_LITHIUM_SULFATE_BLOCK).bucket(CCItems.MOLTEN_LITHIUM_SULFATE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_LITHIUM_SULFIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            LithiumSulfideFluidType.MOLTEN_LITHIUM_SULFIDE_FLUID_TYPE, SOURCE_MOLTEN_LITHIUM_SULFIDE, FLOWING_MOLTEN_LITHIUM_SULFIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_LITHIUM_SULFIDE_BLOCK).bucket(CCItems.MOLTEN_LITHIUM_SULFIDE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_THORIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ThoriumFluidType.MOLTEN_THORIUM_FLUID_TYPE, SOURCE_MOLTEN_THORIUM, FLOWING_MOLTEN_THORIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_THORIUM_BLOCK).bucket(CCItems.MOLTEN_THORIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_THORIUM_SULFATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ThoriumSulfateFluidType.MOLTEN_THORIUM_SULFATE_FLUID_TYPE, SOURCE_MOLTEN_THORIUM_SULFATE, FLOWING_MOLTEN_THORIUM_SULFATE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_THORIUM_SULFATE_BLOCK).bucket(CCItems.MOLTEN_THORIUM_SULFATE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_THORIUM_SULFIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ThoriumSulfideFluidType.MOLTEN_THORIUM_SULFIDE_FLUID_TYPE, SOURCE_MOLTEN_THORIUM_SULFIDE, FLOWING_MOLTEN_THORIUM_SULFIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_THORIUM_SULFIDE_BLOCK).bucket(CCItems.MOLTEN_THORIUM_SULFIDE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_NICKEL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            NickelFluidType.MOLTEN_NICKEL_FLUID_TYPE, SOURCE_MOLTEN_NICKEL, FLOWING_MOLTEN_NICKEL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_NICKEL_BLOCK).bucket(CCItems.MOLTEN_NICKEL_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_NICKEL_SULFATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            NickelSulfateFluidType.MOLTEN_NICKEL_SULFATE_FLUID_TYPE, SOURCE_MOLTEN_NICKEL_SULFATE, FLOWING_MOLTEN_NICKEL_SULFATE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_NICKEL_SULFATE_BLOCK).bucket(CCItems.MOLTEN_NICKEL_SULFATE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_NICKEL_SULFIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            NickelSulfideFluidType.MOLTEN_NICKEL_SULFIDE_FLUID_TYPE, SOURCE_MOLTEN_NICKEL_SULFIDE, FLOWING_MOLTEN_NICKEL_SULFIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_NICKEL_SULFIDE_BLOCK).bucket(CCItems.MOLTEN_NICKEL_SULFIDE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_LEAD_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            LeadFluidType.MOLTEN_LEAD_FLUID_TYPE, SOURCE_MOLTEN_LEAD, FLOWING_MOLTEN_LEAD)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_LEAD_BLOCK).bucket(CCItems.MOLTEN_LEAD_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_LEAD_SULFATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            LeadSulfateFluidType.MOLTEN_LEAD_SULFATE_FLUID_TYPE, SOURCE_MOLTEN_LEAD_SULFATE, FLOWING_MOLTEN_LEAD_SULFATE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_LEAD_SULFATE_BLOCK).bucket(CCItems.MOLTEN_LEAD_SULFATE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_LEAD_SULFIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            LeadSulfideFluidType.MOLTEN_LEAD_SULFIDE_FLUID_TYPE, SOURCE_MOLTEN_LEAD_SULFIDE, FLOWING_MOLTEN_LEAD_SULFIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_LEAD_SULFIDE_BLOCK).bucket(CCItems.MOLTEN_LEAD_SULFIDE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_TANKSTEEL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            TanksteelFluidType.MOLTEN_TANKSTEEL_FLUID_TYPE, SOURCE_MOLTEN_TANKSTEEL, FLOWING_MOLTEN_TANKSTEEL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_TANKSTEEL_BLOCK).bucket(CCItems.MOLTEN_TANKSTEEL_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_STEEL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            SteelFluidType.MOLTEN_STEEL_FLUID_TYPE, SOURCE_MOLTEN_STEEL, FLOWING_MOLTEN_STEEL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_STEEL_BLOCK).bucket(CCItems.MOLTEN_STEEL_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_ALUMINUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            AluminumFluidType.MOLTEN_ALUMINUM_FLUID_TYPE, SOURCE_MOLTEN_ALUMINUM, FLOWING_MOLTEN_ALUMINUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_ALUMINUM_BLOCK).bucket(CCItems.MOLTEN_ALUMINUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_ALUMINUM_SULFATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            AluminumSulfateFluidType.MOLTEN_ALUMINUM_SULFATE_FLUID_TYPE, SOURCE_MOLTEN_ALUMINUM_SULFATE, FLOWING_MOLTEN_ALUMINUM_SULFATE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_ALUMINUM_SULFATE_BLOCK).bucket(CCItems.MOLTEN_ALUMINUM_SULFATE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_ALUMINUM_SULFIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            AluminumSulfideFluidType.MOLTEN_ALUMINUM_SULFIDE_FLUID_TYPE, SOURCE_MOLTEN_ALUMINUM_SULFIDE, FLOWING_MOLTEN_ALUMINUM_SULFIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_ALUMINUM_SULFIDE_BLOCK).bucket(CCItems.MOLTEN_ALUMINUM_SULFIDE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_TIN_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            TinFluidType.MOLTEN_TIN_FLUID_TYPE, SOURCE_MOLTEN_TIN, FLOWING_MOLTEN_TIN)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_TIN_BLOCK).bucket(CCItems.MOLTEN_TIN_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_TIN_SULFATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            TinSulfateFluidType.MOLTEN_TIN_SULFATE_FLUID_TYPE, SOURCE_MOLTEN_TIN_SULFATE, FLOWING_MOLTEN_TIN_SULFATE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_TIN_SULFATE_BLOCK).bucket(CCItems.MOLTEN_TIN_SULFATE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_TIN_SULFIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            TinSulfideFluidType.MOLTEN_TIN_SULFIDE_FLUID_TYPE, SOURCE_MOLTEN_TIN_SULFIDE, FLOWING_MOLTEN_TIN_SULFIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_TIN_SULFIDE_BLOCK).bucket(CCItems.MOLTEN_TIN_SULFIDE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_ZINC_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ZincFluidType.MOLTEN_ZINC_FLUID_TYPE, SOURCE_MOLTEN_ZINC, FLOWING_MOLTEN_ZINC)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_ZINC_BLOCK).bucket(CCItems.MOLTEN_ZINC_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_ZINC_SULFATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ZincSulfateFluidType.MOLTEN_ZINC_SULFATE_FLUID_TYPE, SOURCE_MOLTEN_ZINC_SULFATE, FLOWING_MOLTEN_ZINC_SULFATE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_ZINC_SULFATE_BLOCK).bucket(CCItems.MOLTEN_ZINC_SULFATE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_ZINC_SULFIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ZincSulfideFluidType.MOLTEN_ZINC_SULFIDE_FLUID_TYPE, SOURCE_MOLTEN_ZINC_SULFIDE, FLOWING_MOLTEN_ZINC_SULFIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_ZINC_SULFIDE_BLOCK).bucket(CCItems.MOLTEN_ZINC_SULFIDE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_COPPER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            CopperFluidType.MOLTEN_COPPER_FLUID_TYPE, SOURCE_MOLTEN_COPPER, FLOWING_MOLTEN_COPPER)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_COPPER_BLOCK).bucket(CCItems.MOLTEN_COPPER_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_COPPER_SULFATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            CopperSulfateFluidType.MOLTEN_COPPER_SULFATE_FLUID_TYPE, SOURCE_MOLTEN_COPPER_SULFATE, FLOWING_MOLTEN_COPPER_SULFATE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_COPPER_SULFATE_BLOCK).bucket(CCItems.MOLTEN_COPPER_SULFATE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_COPPER_SULFIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            CopperSulfideFluidType.MOLTEN_COPPER_SULFIDE_FLUID_TYPE, SOURCE_MOLTEN_COPPER_SULFIDE, FLOWING_MOLTEN_COPPER_SULFIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_COPPER_SULFIDE_BLOCK).bucket(CCItems.MOLTEN_COPPER_SULFIDE_BUCKET).tickRate(30);

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

    public static final ForgeFlowingFluid.Properties MOLTEN_BISMUTH_SULFATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            BismuthSulfateFluidType.MOLTEN_BISMUTH_SULFATE_FLUID_TYPE, SOURCE_MOLTEN_BISMUTH_SULFATE, FLOWING_MOLTEN_BISMUTH_SULFATE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_BISMUTH_SULFATE_BLOCK).bucket(CCItems.MOLTEN_BISMUTH_SULFATE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_BISMUTH_SULFIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            BismuthSulfideFluidType.MOLTEN_BISMUTH_SULFIDE_FLUID_TYPE, SOURCE_MOLTEN_BISMUTH_SULFIDE, FLOWING_MOLTEN_BISMUTH_SULFIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_BISMUTH_SULFIDE_BLOCK).bucket(CCItems.MOLTEN_BISMUTH_SULFIDE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_POLONIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            PoloniumFluidType.MOLTEN_POLONIUM_FLUID_TYPE, SOURCE_MOLTEN_POLONIUM, FLOWING_MOLTEN_POLONIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_POLONIUM_BLOCK).bucket(CCItems.MOLTEN_POLONIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_POLONIUM_SULFATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            PoloniumSulfateFluidType.MOLTEN_POLONIUM_SULFATE_FLUID_TYPE, SOURCE_MOLTEN_POLONIUM_SULFATE, FLOWING_MOLTEN_POLONIUM_SULFATE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_POLONIUM_SULFATE_BLOCK).bucket(CCItems.MOLTEN_POLONIUM_SULFATE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_POLONIUM_SULFIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            PoloniumSulfideFluidType.MOLTEN_POLONIUM_SULFIDE_FLUID_TYPE, SOURCE_MOLTEN_POLONIUM_SULFIDE, FLOWING_MOLTEN_POLONIUM_SULFIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_POLONIUM_SULFIDE_BLOCK).bucket(CCItems.MOLTEN_POLONIUM_SULFIDE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_TUNGSTEN_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            TungstenFluidType.MOLTEN_TUNGSTEN_FLUID_TYPE, SOURCE_MOLTEN_TUNGSTEN, FLOWING_MOLTEN_TUNGSTEN)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_TUNGSTEN_BLOCK).bucket(CCItems.MOLTEN_TUNGSTEN_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_TUNGSTEN_SULFATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            TungstenSulfateFluidType.MOLTEN_TUNGSTEN_SULFATE_FLUID_TYPE, SOURCE_MOLTEN_TUNGSTEN_SULFATE, FLOWING_MOLTEN_TUNGSTEN_SULFATE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_TUNGSTEN_SULFATE_BLOCK).bucket(CCItems.MOLTEN_TUNGSTEN_SULFATE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_TUNGSTEN_SULFIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            TungstenSulfideFluidType.MOLTEN_TUNGSTEN_SULFIDE_FLUID_TYPE, SOURCE_MOLTEN_TUNGSTEN_SULFIDE, FLOWING_MOLTEN_TUNGSTEN_SULFIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_TUNGSTEN_SULFIDE_BLOCK).bucket(CCItems.MOLTEN_TUNGSTEN_SULFIDE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_CHROMIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ChromiumFluidType.MOLTEN_CHROMIUM_FLUID_TYPE, SOURCE_MOLTEN_CHROMIUM, FLOWING_MOLTEN_CHROMIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_CHROMIUM_BLOCK).bucket(CCItems.MOLTEN_CHROMIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_CHROMIUM_SULFATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ChromiumSulfateFluidType.MOLTEN_CHROMIUM_SULFATE_FLUID_TYPE, SOURCE_MOLTEN_CHROMIUM_SULFATE, FLOWING_MOLTEN_CHROMIUM_SULFATE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_CHROMIUM_SULFATE_BLOCK).bucket(CCItems.MOLTEN_CHROMIUM_SULFATE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_CHROMIUM_SULFIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ChromiumSulfideFluidType.MOLTEN_CHROMIUM_SULFIDE_FLUID_TYPE, SOURCE_MOLTEN_CHROMIUM_SULFIDE, FLOWING_MOLTEN_CHROMIUM_SULFIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_CHROMIUM_SULFIDE_BLOCK).bucket(CCItems.MOLTEN_CHROMIUM_SULFIDE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_COBALT_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            CobaltFluidType.MOLTEN_COBALT_FLUID_TYPE, SOURCE_MOLTEN_COBALT, FLOWING_MOLTEN_COBALT)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_COBALT_BLOCK).bucket(CCItems.MOLTEN_COBALT_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_COBALT_SULFATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            CobaltSulfateFluidType.MOLTEN_COBALT_SULFATE_FLUID_TYPE, SOURCE_MOLTEN_COBALT_SULFATE, FLOWING_MOLTEN_COBALT_SULFATE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_COBALT_SULFATE_BLOCK).bucket(CCItems.MOLTEN_COBALT_SULFATE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_COBALT_SULFIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            CobaltSulfideFluidType.MOLTEN_COBALT_SULFIDE_FLUID_TYPE, SOURCE_MOLTEN_COBALT_SULFIDE, FLOWING_MOLTEN_COBALT_SULFIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_COBALT_SULFIDE_BLOCK).bucket(CCItems.MOLTEN_COBALT_SULFIDE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_ELECTRUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ElectrumFluidType.MOLTEN_ELECTRUM_FLUID_TYPE, SOURCE_MOLTEN_ELECTRUM, FLOWING_MOLTEN_ELECTRUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_ELECTRUM_BLOCK).bucket(CCItems.MOLTEN_ELECTRUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_SILVER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            SilverFluidType.MOLTEN_SILVER_FLUID_TYPE, SOURCE_MOLTEN_SILVER, FLOWING_MOLTEN_SILVER)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_SILVER_BLOCK).bucket(CCItems.MOLTEN_SILVER_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_SILVER_SULFATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            SilverSulfateFluidType.MOLTEN_SILVER_SULFATE_FLUID_TYPE, SOURCE_MOLTEN_SILVER_SULFATE, FLOWING_MOLTEN_SILVER_SULFATE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_SILVER_SULFATE_BLOCK).bucket(CCItems.MOLTEN_SILVER_SULFATE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_SILVER_SULFIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            SilverSulfideFluidType.MOLTEN_SILVER_SULFIDE_FLUID_TYPE, SOURCE_MOLTEN_SILVER_SULFIDE, FLOWING_MOLTEN_SILVER_SULFIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_SILVER_SULFIDE_BLOCK).bucket(CCItems.MOLTEN_SILVER_SULFIDE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_IRON_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            IronFluidType.MOLTEN_IRON_FLUID_TYPE, SOURCE_MOLTEN_IRON, FLOWING_MOLTEN_IRON)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_IRON_BLOCK).bucket(CCItems.MOLTEN_IRON_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_IRON_SULFATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            IronSulfateFluidType.MOLTEN_IRON_SULFATE_FLUID_TYPE, SOURCE_MOLTEN_IRON_SULFATE, FLOWING_MOLTEN_IRON_SULFATE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_IRON_SULFATE_BLOCK).bucket(CCItems.MOLTEN_IRON_SULFATE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_IRON_SULFIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            IronSulfideFluidType.MOLTEN_IRON_SULFIDE_FLUID_TYPE, SOURCE_MOLTEN_IRON_SULFIDE, FLOWING_MOLTEN_IRON_SULFIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_IRON_SULFIDE_BLOCK).bucket(CCItems.MOLTEN_IRON_SULFIDE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_GOLD_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            GoldFluidType.MOLTEN_GOLD_FLUID_TYPE, SOURCE_MOLTEN_GOLD, FLOWING_MOLTEN_GOLD)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_GOLD_BLOCK).bucket(CCItems.MOLTEN_GOLD_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_GOLD_SULFATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            GoldSulfateFluidType.MOLTEN_GOLD_SULFATE_FLUID_TYPE, SOURCE_MOLTEN_GOLD_SULFATE, FLOWING_MOLTEN_GOLD_SULFATE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_GOLD_SULFATE_BLOCK).bucket(CCItems.MOLTEN_GOLD_SULFATE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_GOLD_SULFIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            GoldSulfideFluidType.MOLTEN_GOLD_SULFIDE_FLUID_TYPE, SOURCE_MOLTEN_GOLD_SULFIDE, FLOWING_MOLTEN_GOLD_SULFIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(CCBlocks.MOLTEN_GOLD_SULFIDE_BLOCK).bucket(CCItems.MOLTEN_GOLD_SULFIDE_BUCKET).tickRate(30);

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

    public static final ForgeFlowingFluid.Properties ETHYLENE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            EthyleneFluidType.ETHYLENE_FLUID_TYPE, SOURCE_ETHYLENE, FLOWING_ETHYLENE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.ETHYLENE_BLOCK).bucket(CCItems.ETHYLENE_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties SULFUR_DICHLORIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            SulfurDichlorideFluidType.SULFUR_DICHLORIDE_FLUID_TYPE, SOURCE_SULFUR_DICHLORIDE, FLOWING_SULFUR_DICHLORIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.SULFUR_DICHLORIDE_BLOCK).bucket(CCItems.SULFUR_DICHLORIDE_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties CHLORINE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ChlorineFluidType.CHLORINE_FLUID_TYPE, SOURCE_CHLORINE, FLOWING_CHLORINE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.CHLORINE_BLOCK).bucket(CCItems.CHLORINE_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties MUSTARD_GAS_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            MustardGasFluidType.MUSTARD_GAS_FLUID_TYPE, SOURCE_MUSTARD_GAS, FLOWING_MUSTARD_GAS)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.MUSTARD_GAS_BLOCK).bucket(CCItems.MUSTARD_GAS_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties POTASSIUM_HYDROGEN_FLUORIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            PotassiumHydrogenFluorideFluidType.MOLTEN_POTASSIUM_HYDROGEN_FLUORIDE_FLUID_TYPE, SOURCE_POTASSIUM_HYDROGEN_FLUORIDE, FLOWING_POTASSIUM_HYDROGEN_FLUORIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.MOLTEN_POTASSIUM_HYDROGEN_FLUORIDE_BLOCK).bucket(CCItems.POTASSIUM_HYDROGEN_FLUORIDE_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties POTASSIUM_CHLORIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            PotassiumChlorideFluidType.MOLTEN_POTASSIUM_CHLORIDE_FLUID_TYPE, SOURCE_POTASSIUM_CHLORIDE, FLOWING_POTASSIUM_CHLORIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.MOLTEN_POTASSIUM_CHLORIDE_BLOCK).bucket(CCItems.POTASSIUM_CHLORIDE_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties BENZENE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            BenzeneFluidType.BENZENE_FLUID_TYPE, SOURCE_BENZENE, FLOWING_BENZENE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.BENZENE_BLOCK).bucket(CCItems.BENZENE_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties NAPTHA_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            NapthaFluidType.NAPTHA_FLUID_TYPE, SOURCE_NAPTHA, FLOWING_NAPTHA)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.NAPTHA_BLOCK).bucket(CCItems.NAPTHA_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties ETHYLBENZENE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            EthylbenzeneFluidType.ETHYLBENZENE_FLUID_TYPE, SOURCE_ETHYLBENZENE, FLOWING_ETHYLBENZENE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.ETHYLBENZENE_BLOCK).bucket(CCItems.ETHYLBENZENE_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties NAPALM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            NapalmFluidType.NAPALM_FLUID_TYPE, SOURCE_NAPALM, FLOWING_NAPALM)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.NAPALM_BLOCK).bucket(CCItems.NAPALM_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties POLYETHYLENE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            PolyethyleneFluidType.POLYETHYLENE_FLUID_TYPE, SOURCE_POLYETHYLENE, FLOWING_POLYETHYLENE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.POLYETHYLENE_BLOCK).bucket(CCItems.POLYETHYLENE_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties HYDROGEN_SULFIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            HydrogenSulfideFluidType.HYDROGEN_SULFIDE_FLUID_TYPE, SOURCE_HYDROGEN_SULFIDE, FLOWING_HYDROGEN_SULFIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.HYDROGEN_SULFIDE_BLOCK).bucket(CCItems.HYDROGEN_SULFIDE_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties HYDROGEN_SULFIDE_MONOETHANOLAMINE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            HydrogenSulfideMonoethanolamineFluidType.HYDROGEN_SULFIDE_MONOETHANOLAMINE_FLUID_TYPE, SOURCE_HYDROGEN_SULFIDE_MONOETHANOLAMINE, FLOWING_HYDROGEN_SULFIDE_MONOETHANOLAMINE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.HYDROGEN_SULFIDE_MONOETHANOLAMINE_BLOCK).bucket(CCItems.HYDROGEN_SULFIDE_MONOETHANOLAMINE_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties MONOETHANOLAMINE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            MonoethanolamineFluidType.MONOETHANOLAMINE_FLUID_TYPE, SOURCE_MONOETHANOLAMINE, FLOWING_MONOETHANOLAMINE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.MONOETHANOLAMINE_BLOCK).bucket(CCItems.MONOETHANOLAMINE_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties ETHYLENE_OXIDE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            EthyleneOxideFluidType.ETHYLENE_OXIDE_FLUID_TYPE, SOURCE_ETHYLENE_OXIDE, FLOWING_ETHYLENE_OXIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.ETHYLENE_OXIDE_BLOCK).bucket(CCItems.ETHYLENE_OXIDE_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties RAW_CRUDE_OIL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            RawCrudeOilFluidType.RAW_CRUDE_OIL_FLUID_TYPE, SOURCE_RAW_CRUDE_OIL, FLOWING_RAW_CRUDE_OIL)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.RAW_CRUDE_OIL_BLOCK).bucket(CCItems.RAW_CRUDE_OIL_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties RAW_DIRTY_CRUDE_OIL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            RawDirtyCrudeOilFluidType.RAW_DIRTY_CRUDE_OIL_FLUID_TYPE, SOURCE_RAW_DIRTY_CRUDE_OIL, FLOWING_RAW_DIRTY_CRUDE_OIL)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.RAW_DIRTY_CRUDE_OIL_BLOCK).bucket(CCItems.RAW_DIRTY_CRUDE_OIL_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties SALINE_WATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            SalineWaterFluidType.SALINE_WATER_FLUID_TYPE, SOURCE_SALINE_WATER, FLOWING_SALINE_WATER)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.SALINE_WATER_BLOCK).bucket(CCItems.SALINE_WATER_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties WASH_OIL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            WashOilFluidType.WASH_OIL_FLUID_TYPE, SOURCE_WASH_OIL, FLOWING_WASH_OIL)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.WASH_OIL_BLOCK).bucket(CCItems.WASH_OIL_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties NATURAL_GAS_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            NaturalGasFluidType.NATURAL_GAS_FLUID_TYPE, SOURCE_NATURAL_GAS, FLOWING_NATURAL_GAS)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.NATURAL_GAS_BLOCK).bucket(CCItems.NATURAL_GAS_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties RAW_NATURAL_GAS_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            RawNaturalGasFluidType.RAW_NATURAL_GAS_FLUID_TYPE, SOURCE_RAW_NATURAL_GAS, FLOWING_RAW_NATURAL_GAS)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(CCBlocks.RAW_NATURAL_GAS_BLOCK).bucket(CCItems.RAW_NATURAL_GAS_BUCKET).tickRate(5);




    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
