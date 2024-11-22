package net.aepherastudios.createconquer.fluid;

import net.aepherastudios.createconquer.CreateConquer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class RedstoneFluidType {
    public static final ResourceLocation MOLTEN_REDSTONE_STILL_RL = new ResourceLocation(CreateConquer.MOD_ID, "block/molten_redstone_still");
    public static final ResourceLocation MOLTEN_REDSTONE_FLOWING_RL = new ResourceLocation(CreateConquer.MOD_ID, "block/molten_redstone_flowing");
    public static final ResourceLocation MOLTEN_METAL_OVERLAY_RL = new ResourceLocation(CreateConquer.MOD_ID, "block/molten_metal_still");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateConquer.MOD_ID);

    public static final RegistryObject<FluidType> MOLTEN_REDSTONE_FLUID_TYPE = register("molten_redstone_fluid_type",
            FluidType.Properties.create().canConvertToSource(false).lightLevel(15).density(15).viscosity(5));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () ->
                    new BaseFluidType(MOLTEN_REDSTONE_STILL_RL, MOLTEN_REDSTONE_FLOWING_RL, MOLTEN_METAL_OVERLAY_RL, 0xA1FF0000, new Vector3f(1f, 0f, 0f), properties));
    }




    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
