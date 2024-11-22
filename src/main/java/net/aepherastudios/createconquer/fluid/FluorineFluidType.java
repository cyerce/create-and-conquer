package net.aepherastudios.createconquer.fluid;

import net.aepherastudios.createconquer.CreateConquer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class FluorineFluidType {
    public static final ResourceLocation FLUORINE_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation FLUORINE_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation FLUORINE_OVERLAY_RL = new ResourceLocation(CreateConquer.MOD_ID, "block/molten_metal_still");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateConquer.MOD_ID);

    public static final RegistryObject<FluidType> FLUORINE_FLUID_TYPE = register("fluorine_fluid",
            FluidType.Properties.create().canConvertToSource(false).density(15).viscosity(5));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () ->
                new BaseFluidType(FLUORINE_STILL_RL, FLUORINE_FLOWING_RL, FLUORINE_OVERLAY_RL, 0xA1FFFB7A, new Vector3f(254f / 255f, 251f / 255f, 229f / 122f), properties));
    }




    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
