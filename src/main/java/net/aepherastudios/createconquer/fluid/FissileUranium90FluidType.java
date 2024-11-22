package net.aepherastudios.createconquer.fluid;

import net.aepherastudios.createconquer.CreateConquer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class FissileUranium90FluidType {
    public static final ResourceLocation MOLTEN_METAL_STILL_RL = new ResourceLocation(CreateConquer.MOD_ID, "block/molten_metal_still");
    public static final ResourceLocation MOLTEN_METAL_FLOWING_RL = new ResourceLocation(CreateConquer.MOD_ID, "block/molten_metal_flowing");
    public static final ResourceLocation MOLTEN_METAL_OVERLAY_RL = new ResourceLocation(CreateConquer.MOD_ID, "block/molten_metal_still");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateConquer.MOD_ID);

    public static final RegistryObject<FluidType> MOLTEN_FISSILE_URANIUM_90_FLUID_TYPE = register("molten_fissile_uranium_90_fluid",
            FluidType.Properties.create().canConvertToSource(false).lightLevel(15).density(15).viscosity(5));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () ->
                new BaseFluidType(MOLTEN_METAL_STILL_RL, MOLTEN_METAL_FLOWING_RL, MOLTEN_METAL_OVERLAY_RL, 0xA1ABC196, new Vector3f(171f / 255f, 193f / 255f, 150f/255f), properties));
    }




    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
