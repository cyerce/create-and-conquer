package net.aepherastudios.createconquer.fluid;

import net.aepherastudios.createconquer.CreateConquer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class CrudeOilFluidType {
    public static final ResourceLocation OIL_STILL_RL = new ResourceLocation(CreateConquer.MOD_ID, "block/water_still");
    public static final ResourceLocation OIL_FLOWING_RL = new ResourceLocation(CreateConquer.MOD_ID, "block/water_flow");
    public static final ResourceLocation OIL_OVERLAY_RL = new ResourceLocation(CreateConquer.MOD_ID, "block/molten_metal_still");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateConquer.MOD_ID);

    public static final RegistryObject<FluidType> CRUDE_OIL_FLUID_TYPE = register("crude_oil_fluid",
            FluidType.Properties.create().canConvertToSource(false).lightLevel(0).density(15).viscosity(5));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () ->
                new BaseFluidType(OIL_STILL_RL, OIL_FLOWING_RL, OIL_OVERLAY_RL, 0xA1000000, new Vector3f(0, 0, 0), properties));
    }




    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
