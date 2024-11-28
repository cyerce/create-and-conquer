package net.aepherastudios.createconquer.fluid;

import net.aepherastudios.createconquer.CreateConquer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class MustardGasFluidType {
    public static final ResourceLocation MUSTARD_GAS_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation MUSTARD_GAS_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation MUSTARD_GAS_OVERLAY_RL = new ResourceLocation(CreateConquer.MOD_ID, "block/molten_metal_still");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateConquer.MOD_ID);

    public static final RegistryObject<FluidType> MUSTARD_GAS_FLUID_TYPE = register("mustard_gas_fluid",
            FluidType.Properties.create().canConvertToSource(false).density(15).viscosity(5));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () ->
                new BaseFluidType(MUSTARD_GAS_STILL_RL, MUSTARD_GAS_FLOWING_RL, MUSTARD_GAS_OVERLAY_RL, 0xA1FFF700, new Vector3f(1.0f, 247f / 255f, 0.0f), properties));
    }




    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
