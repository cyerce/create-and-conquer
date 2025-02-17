package net.aepherastudios.createconquer.entity;

import net.aepherastudios.createconquer.CreateConquer;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CCEntityDataSerializers {
    private static final DeferredRegister<EntityDataSerializer<?>> REGISTER = DeferredRegister.create(ForgeRegistries.Keys.ENTITY_DATA_SERIALIZERS, CreateConquer.MOD_ID);

    public static void register(IEventBus modEventBus) {
        REGISTER.register(modEventBus);
    }
}
