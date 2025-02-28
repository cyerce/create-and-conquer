package net.aepherastudios.createconquer.event;

import net.aepherastudios.createconquer.CreateConquer;
import net.aepherastudios.createconquer.entity.CCEntities;
import net.aepherastudios.createconquer.entity.custom.SuperheatedBlazeEntity;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CreateConquer.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CCEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(CCEntities.SUPERHEATED_BLAZE.get(), SuperheatedBlazeEntity.createAttributes().build());
    }

    @SubscribeEvent
    public static void registerSpawnPlacements(SpawnPlacementRegisterEvent event) {
        event.register(CCEntities.SUPERHEATED_BLAZE.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.WORLD_SURFACE,
                SuperheatedBlazeEntity::checkMobSpawnRules,
                SpawnPlacementRegisterEvent.Operation.OR);
    }
}