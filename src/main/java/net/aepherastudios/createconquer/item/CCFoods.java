package net.aepherastudios.createconquer.item;

import net.aepherastudios.createconquer.effect.CCEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class CCFoods {
    public static final FoodProperties ORANGE = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 1200), 1f).build();
    public static final FoodProperties URANIUM_POWDER = new FoodProperties.Builder().alwaysEat().nutrition(2)
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(CCEffects.RADIATION_SICKNESS_DEATH.get(), 120001, 1, true, true, true), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 12000), 1f).build();
    public static final FoodProperties COMPUTING_MECHANISM = new FoodProperties.Builder().alwaysEat().nutrition(2)
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 120001, 1, true, true, true), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 12000), 1f).build();
    public static final FoodProperties RADIOACTIVE_WASTE = new FoodProperties.Builder().alwaysEat().nutrition(2)
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(CCEffects.RADIATION_SICKNESS_DEATH.get(), 120001, 1, true, true, true), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 12000), 1f).build();
}
