package net.aepherastudios.createconquer.fluid;

import net.aepherastudios.createconquer.CreateConquer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class HydrogenFluidType {
    public static final ResourceLocation FLUID_STILL_RL = new ResourceLocation( "block/water_still");
    public static final ResourceLocation FLUID_FLOWING_RL = new ResourceLocation( "block/water_flow");
    public static final ResourceLocation FLUID_OVERLAY_RL = new ResourceLocation(CreateConquer.MOD_ID, "block/molten_metal_still");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateConquer.MOD_ID);

    public static final RegistryObject<FluidType> HYDROGEN_FLUID_TYPE = register("hydrogen_fluid",
            FluidType.Properties.create().canConvertToSource(false).density(15).viscosity(5));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () ->
                new BaseFluidType(FLUID_STILL_RL, FLUID_FLOWING_RL, FLUID_OVERLAY_RL, 0xA1D8ABDD, new Vector3f(216f / 255f, 171f / 255f, 221f/255f), properties));
    }




    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
