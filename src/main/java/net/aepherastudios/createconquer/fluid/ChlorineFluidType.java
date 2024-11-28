package net.aepherastudios.createconquer.fluid;

import net.aepherastudios.createconquer.CreateConquer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class ChlorineFluidType {
    public static final ResourceLocation CHLORINE_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation CHLORINE_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation CHLORINE_OVERLAY_RL = new ResourceLocation(CreateConquer.MOD_ID, "block/molten_metal_still");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateConquer.MOD_ID);

    public static final RegistryObject<FluidType> CHLORINE_FLUID_TYPE = register("chlorine_fluid",
            FluidType.Properties.create().canConvertToSource(false).density(15).viscosity(5));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () ->
                new BaseFluidType(CHLORINE_STILL_RL, CHLORINE_FLOWING_RL, CHLORINE_OVERLAY_RL, 0xA19BD24D, new Vector3f(155f / 255f, 210f / 255f, 77f / 255f), properties));
    }




    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
