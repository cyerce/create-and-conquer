package net.aepherastudios.createconquer.entity;

import net.aepherastudios.createconquer.CreateConquer;
import net.aepherastudios.createconquer.entity.custom.SuperheatedBlazeEntity;
import net.minecraft.util.datafix.fixes.RemoveGolemGossipFix;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CCEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CreateConquer.MOD_ID);

    public static final RegistryObject<EntityType<SuperheatedBlazeEntity>> SUPERHEATED_BLAZE =
            ENTITY_TYPES.register("superheated_blaze", () -> EntityType.Builder.of(SuperheatedBlazeEntity::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.8f).clientTrackingRange(8).build("superheated_blaze"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
