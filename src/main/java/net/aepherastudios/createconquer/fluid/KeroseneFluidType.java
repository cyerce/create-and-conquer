package net.aepherastudios.createconquer.fluid;

import net.aepherastudios.createconquer.CreateConquer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class KeroseneFluidType {
    public static final ResourceLocation KEROSENE_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation KEROSENE_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation KEROSENE_OVERLAY_RL = new ResourceLocation(CreateConquer.MOD_ID, "block/molten_metal_still");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateConquer.MOD_ID);

    public static final RegistryObject<FluidType> KEROSENE_FLUID_TYPE = register("kerosene_fluid",
            FluidType.Properties.create().canConvertToSource(false).density(15).viscosity(5));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () ->
                new BaseFluidType(KEROSENE_STILL_RL, KEROSENE_FLOWING_RL, KEROSENE_OVERLAY_RL, 0xA1B2D8D9, new Vector3f(178f / 255f, 216f / 255f, 217f / 255f), properties));
    }




    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
