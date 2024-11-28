package net.aepherastudios.createconquer.fluid;

import net.aepherastudios.createconquer.CreateConquer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class SulfurDichlorideFluidType {
    public static final ResourceLocation SULFUR_DICHLORIDE_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation SULFUR_DICHLORIDE_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation SULFUR_DICHLORIDE_OVERLAY_RL = new ResourceLocation(CreateConquer.MOD_ID, "block/molten_metal_still");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateConquer.MOD_ID);

    public static final RegistryObject<FluidType> SULFUR_DICHLORIDE_FLUID_TYPE = register("sulfur_dichloride_fluid",
            FluidType.Properties.create().canConvertToSource(false).density(15).viscosity(5));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () ->
                new BaseFluidType(SULFUR_DICHLORIDE_STILL_RL, SULFUR_DICHLORIDE_FLOWING_RL, SULFUR_DICHLORIDE_OVERLAY_RL, 0xA16D0E00, new Vector3f(109f / 255f, 14f / 255f, 0), properties));
    }




    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
