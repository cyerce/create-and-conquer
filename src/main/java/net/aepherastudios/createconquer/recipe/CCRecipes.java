package net.aepherastudios.createconquer.recipe;

import net.aepherastudios.createconquer.CreateConquer;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CCRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, CreateConquer.MOD_ID);

    public static final RegistryObject<RecipeSerializer<CokingOvenRecipe>> GEM_POLISHING_SERIALIZER =
            SERIALIZERS.register("coking", () -> CokingOvenRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}