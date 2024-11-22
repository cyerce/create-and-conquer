package net.aepherastudios.createconquer.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class RadiationSicknessDeathEffect extends MobEffect {
    public RadiationSicknessDeathEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.level().isClientSide()) {
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200, 0, false, false, false));
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 1, false, false, false));
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 200, 1, false, false, false));
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 200, 0, false, false, false));
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.WITHER, 200, 3, false, false, false));
        }
        super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}