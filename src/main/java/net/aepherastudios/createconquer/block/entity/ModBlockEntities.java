package net.aepherastudios.createconquer.block.entity;

import net.aepherastudios.createconquer.CreateConquer;
import net.aepherastudios.createconquer.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.aepherastudios.createconquer.block.ModBlocks.NUCLEAR_REACTOR;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CreateConquer.MOD_ID);

    public static final RegistryObject<BlockEntityType<NuclearReactorBlockEntity>> NUCLEAR_REACTOR_BE =
            BLOCK_ENTITIES.register("nuclear_reactor_be", () ->
                    BlockEntityType.Builder.of(NuclearReactorBlockEntity::new,
                            ModBlocks.NUCLEAR_REACTOR.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
