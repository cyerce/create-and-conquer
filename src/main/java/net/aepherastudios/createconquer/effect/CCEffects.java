package net.aepherastudios.createconquer.effect;

import net.aepherastudios.createconquer.CreateConquer;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CCEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CreateConquer.MOD_ID);

    public static final RegistryObject<MobEffect> RADIATION_SICKNESS = MOB_EFFECTS.register("radiation_sickness",
            () -> new RadiationSicknessEffect(MobEffectCategory.HARMFUL, 25518819));

    public static final RegistryObject<MobEffect> RADIATION_SICKNESS_EXTREME = MOB_EFFECTS.register("radiation_sickness_extreme",
            () -> new RadiationSicknessExtremeEffect(MobEffectCategory.HARMFUL, 25518819));

    public static final RegistryObject<MobEffect> RADIATION_SICKNESS_DEATH = MOB_EFFECTS.register("radiation_sickness_death",
            () -> new RadiationSicknessDeathEffect(MobEffectCategory.HARMFUL, 25518819));

    public static final RegistryObject<MobEffect> MUSTARD_GAS_POISONING = MOB_EFFECTS.register("mustard_gas_poisoning",
            () -> new MustardGasPoisoningEffect(MobEffectCategory.HARMFUL, 77600457));


    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
