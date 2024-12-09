package net.aepherastudios.createconquer.screen;

import net.aepherastudios.createconquer.CreateConquer;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CCMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, CreateConquer.MOD_ID);

    public static final RegistryObject<MenuType<NuclearReactorMenu>> NUCLEAR_REACTOR_MENU =
            registerMenuType(NuclearReactorMenu::new, "nuclear_reactor_menu");

    public static final RegistryObject<MenuType<ArcFurnaceMenu>> ARC_FURNACE_MENU =
            registerMenuType(ArcFurnaceMenu::new, "arc_furnace_menu");

    public static final RegistryObject<MenuType<CokingOvenMenu>> COKING_OVEN_MENU =
            registerMenuType(CokingOvenMenu::new, "coking_oven_menu");

    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory, String name){
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus){
        MENUS.register(eventBus);
    }
}
