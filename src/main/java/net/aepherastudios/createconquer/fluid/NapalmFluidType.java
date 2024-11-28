package net.aepherastudios.createconquer.fluid;

import net.aepherastudios.createconquer.CreateConquer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class NapalmFluidType {
    public static final ResourceLocation NAPALM_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation NAPALM_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation NAPALM_OVERLAY_RL = new ResourceLocation(CreateConquer.MOD_ID, "block/molten_metal_still");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateConquer.MOD_ID);

    public static final RegistryObject<FluidType> NAPALM_FLUID_TYPE = register("napalm_fluid",
            FluidType.Properties.create().canConvertToSource(false).density(15).viscosity(5));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () ->
                new BaseFluidType(NAPALM_STILL_RL, NAPALM_FLOWING_RL, NAPALM_OVERLAY_RL, 0xA1FFD6AE, new Vector3f(1.0f, 214f / 255f, 174f / 255f), properties));
    }




    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
