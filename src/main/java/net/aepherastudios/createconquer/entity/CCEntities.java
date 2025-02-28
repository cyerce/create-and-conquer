package net.aepherastudios.createconquer.entity;

import net.aepherastudios.createconquer.CreateConquer;
import net.aepherastudios.createconquer.entity.client.PrimedHighExplosiveRenderer;
import net.aepherastudios.createconquer.entity.custom.PrimedHighExplosive;
import net.aepherastudios.createconquer.entity.custom.SuperheatedBlazeEntity;
import net.minecraft.client.renderer.entity.TntRenderer;
import net.minecraft.util.datafix.fixes.RemoveGolemGossipFix;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CCEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CreateConquer.MOD_ID);


    public static final RegistryObject<EntityType<SuperheatedBlazeEntity>> SUPERHEATED_BLAZE =
            ENTITY_TYPES.register("superheated_blaze", () -> EntityType.Builder.of(SuperheatedBlazeEntity::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.8f).fireImmune().clientTrackingRange(8).build("superheated_blaze"));

//    public static final RegistryObject<EntityType<PrimedHighExplosive>> PRIMED_HIGH_EXPLOSIVE =
//            ENTITY_TYPES.register("primed_high_explosive", () -> EntityType.Builder.of(PrimedHighExplosive::new, MobCategory.MISC)
//                    .fireImmune().sized(0.98F, 0.98F).clientTrackingRange(10).updateInterval(10));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
