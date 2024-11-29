package net.aepherastudios.createconquer.fluid;

import net.aepherastudios.createconquer.CreateConquer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class HydrogenSulfideMonoethanolamineFluidType {
    public static final ResourceLocation HYDROGEN_SULFIDE_MONOETHANOLAMINE_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation HYDROGEN_SULFIDE_MONOETHANOLAMINE_FLOWING_RL = new ResourceLocation( "block/water_flow");
    public static final ResourceLocation HYDROGEN_SULFIDE_MONOETHANOLAMINE_OVERLAY_RL = new ResourceLocation(CreateConquer.MOD_ID, "block/molten_metal_still");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateConquer.MOD_ID);

    public static final RegistryObject<FluidType> HYDROGEN_SULFIDE_MONOETHANOLAMINE_FLUID_TYPE = register("hydrogen_sulfide_monoethanolamine_fluid",
            FluidType.Properties.create().canConvertToSource(false).density(15).viscosity(5));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () ->
                new BaseFluidType(HYDROGEN_SULFIDE_MONOETHANOLAMINE_STILL_RL, HYDROGEN_SULFIDE_MONOETHANOLAMINE_FLOWING_RL, HYDROGEN_SULFIDE_MONOETHANOLAMINE_OVERLAY_RL, 0xA1FFFFFF, new Vector3f(1, 1, 1), properties));
    }




    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
