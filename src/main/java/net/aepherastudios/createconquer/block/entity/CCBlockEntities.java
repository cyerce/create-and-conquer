package net.aepherastudios.createconquer.block.entity;

import net.aepherastudios.createconquer.CreateConquer;
import net.aepherastudios.createconquer.block.CCBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class CCBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CreateConquer.MOD_ID);

    public static final RegistryObject<BlockEntityType<NuclearReactorBlockEntity>> NUCLEAR_REACTOR_BE =
            BLOCK_ENTITIES.register("nuclear_reactor_block_entity", () ->
                    BlockEntityType.Builder.of(NuclearReactorBlockEntity::new,
                            CCBlocks.NUCLEAR_REACTOR.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
