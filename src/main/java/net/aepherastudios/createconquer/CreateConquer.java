package net.aepherastudios.createconquer;

import com.mojang.logging.LogUtils;
import net.aepherastudios.createconquer.block.CCBlocks;
import net.aepherastudios.createconquer.block.entity.CCBlockEntities;
import net.aepherastudios.createconquer.effect.CCEffects;
import net.aepherastudios.createconquer.entity.CCEntities;
import net.aepherastudios.createconquer.entity.CCEntityDataSerializers;
import net.aepherastudios.createconquer.entity.client.SuperheatedBlazeEntityRenderer;
import net.aepherastudios.createconquer.entity.custom.SuperheatedBlazeEntity;
import net.aepherastudios.createconquer.fluid.*;
import net.aepherastudios.createconquer.item.CCCreativeModeTabs;
import net.aepherastudios.createconquer.item.CCItems;
import net.aepherastudios.createconquer.screen.ArcFurnaceScreen;
import net.aepherastudios.createconquer.screen.CCMenuTypes;
import net.aepherastudios.createconquer.screen.CokingOvenScreen;
import net.aepherastudios.createconquer.screen.NuclearReactorScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CreateConquer.MOD_ID)
public class CreateConquer
{
    public static final String MOD_ID = "createconquer";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CreateConquer() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        CCItems.register(modEventBus);
        CCBlocks.register(modEventBus);
        CCBlockEntities.register(modEventBus);
        CCMenuTypes.register(modEventBus);
        CCCreativeModeTabs.register(modEventBus);
        CCFluids.register(modEventBus);
        CCEffects.register(modEventBus);
        CCEntities.register(modEventBus);
        CCEntityDataSerializers.register(modEventBus);



        UraniumFluidType.register(modEventBus);
        UraniumSulfateFluidType.register(modEventBus);
        UraniumSulfideFluidType.register(modEventBus);
        PlutoniumFluidType.register(modEventBus);
        PlutoniumSulfateFluidType.register(modEventBus);
        PlutoniumSulfideFluidType.register(modEventBus);
        BerylliumFluidType.register(modEventBus);
        BerylliumSulfateFluidType.register(modEventBus);
        BerylliumSulfideFluidType.register(modEventBus);
        TitaniumFluidType.register(modEventBus);
        TitaniumSulfateFluidType.register(modEventBus);
        TitaniumSulfideFluidType.register(modEventBus);
        LithiumFluidType.register(modEventBus);
        LithiumSulfateFluidType.register(modEventBus);
        LithiumSulfideFluidType.register(modEventBus);
        ThoriumFluidType.register(modEventBus);
        ThoriumSulfateFluidType.register(modEventBus);
        ThoriumSulfideFluidType.register(modEventBus);
        NickelFluidType.register(modEventBus);
        NickelSulfateFluidType.register(modEventBus);
        NickelSulfideFluidType.register(modEventBus);
        LeadFluidType.register(modEventBus);
        LeadSulfateFluidType.register(modEventBus);
        LeadSulfideFluidType.register(modEventBus);
        TanksteelFluidType.register(modEventBus);
        SteelFluidType.register(modEventBus);
        AluminumFluidType.register(modEventBus);
        AluminumSulfateFluidType.register(modEventBus);
        AluminumSulfideFluidType.register(modEventBus);
        TinFluidType.register(modEventBus);
        TinSulfateFluidType.register(modEventBus);
        TinSulfideFluidType.register(modEventBus);
        ZincFluidType.register(modEventBus);
        ZincSulfateFluidType.register(modEventBus);
        ZincSulfideFluidType.register(modEventBus);
        CopperFluidType.register(modEventBus);
        CopperSulfateFluidType.register(modEventBus);
        CopperSulfideFluidType.register(modEventBus);
        SiliconFluidType.register(modEventBus);
        Uranium235FluidType.register(modEventBus);
        Uranium238FluidType.register(modEventBus);
        Uranium233FluidType.register(modEventBus);
        FissileUranium20FluidType.register(modEventBus);
        FissileUranium90FluidType.register(modEventBus);
        Lithium6FluidType.register(modEventBus);
        Lithium7FluidType.register(modEventBus);
        RoseGoldFluidType.register(modEventBus);
        RosesteelFluidType.register(modEventBus);
        InvarFluidType.register(modEventBus);
        BronzeFluidType.register(modEventBus);
        AlnicoFluidType.register(modEventBus);
        StainlessSteelFluidType.register(modEventBus);
        StaballoyFluidType.register(modEventBus);
        BrassFluidType.register(modEventBus);
        BismuthFluidType.register(modEventBus);
        BismuthSulfateFluidType.register(modEventBus);
        BismuthSulfideFluidType.register(modEventBus);
        PoloniumFluidType.register(modEventBus);
        PoloniumSulfateFluidType.register(modEventBus);
        PoloniumSulfideFluidType.register(modEventBus);
        TungstenFluidType.register(modEventBus);
        TungstenSulfateFluidType.register(modEventBus);
        TungstenSulfideFluidType.register(modEventBus);
        ChromiumFluidType.register(modEventBus);
        ChromiumSulfateFluidType.register(modEventBus);
        ChromiumSulfideFluidType.register(modEventBus);
        CobaltFluidType.register(modEventBus);
        CobaltSulfideFluidType.register(modEventBus);
        CobaltSulfateFluidType.register(modEventBus);
        ElectrumFluidType.register(modEventBus);
        SilverFluidType.register(modEventBus);
        SilverSulfateFluidType.register(modEventBus);
        SilverSulfideFluidType.register(modEventBus);
        IronFluidType.register(modEventBus);
        IronSulfateFluidType.register(modEventBus);
        IronSulfideFluidType.register(modEventBus);
        GoldFluidType.register(modEventBus);
        GoldSulfateFluidType.register(modEventBus);
        GoldSulfideFluidType.register(modEventBus);
        NetheriteFluidType.register(modEventBus);
        RedstoneFluidType.register(modEventBus);

        HydrogenFluidType.register(modEventBus);
        OxygenFluidType.register(modEventBus);
        HeavyWaterFluidType.register(modEventBus);
        DeuteriumFluidType.register(modEventBus);
        TritiumFluidType.register(modEventBus);
        NaturalGasFluidType.register(modEventBus);
        RawNaturalGasFluidType.register(modEventBus);
        CrudeOilFluidType.register(modEventBus);
        RawCrudeOilFluidType.register(modEventBus);
        RawDirtyCrudeOilFluidType.register(modEventBus);
        WashOilFluidType.register(modEventBus);
        IrradiatedWaterFluidType.register(modEventBus);
        SuperheatedIrradiatedWaterFluidType.register(modEventBus);
        SteamFluidType.register(modEventBus);

        MethaneFluidType.register(modEventBus);
        EthaneFluidType.register(modEventBus);
        PropaneFluidType.register(modEventBus);
        ButaneFluidType.register(modEventBus);
        GasolineFluidType.register(modEventBus);
        KeroseneFluidType.register(modEventBus);
        DieselFluidType.register(modEventBus);
        BitumenFluidType.register(modEventBus);
        FormaldehydeFluidType.register(modEventBus);
        MethanolFluidType.register(modEventBus);
        AmmoniaFluidType.register(modEventBus);
        FluorineFluidType.register(modEventBus);
        NitrogenFluidType.register(modEventBus);
        PotassiumHydrogenFluorideFluidType.register(modEventBus);
        PotassiumChlorideFluidType.register(modEventBus);
        SulfuricAcidFluidType.register(modEventBus);
        HydrofluoricAcidFluidType.register(modEventBus);
        EthanolFluidType.register(modEventBus);

        EthyleneFluidType.register(modEventBus);
        ChlorineFluidType.register(modEventBus);
        SulfurDichlorideFluidType.register(modEventBus);
        MustardGasFluidType.register(modEventBus);
        BenzeneFluidType.register(modEventBus);
        NapthaFluidType.register(modEventBus);
        EthylbenzeneFluidType.register(modEventBus);
        NapalmFluidType.register(modEventBus);
        PolyethyleneFluidType.register(modEventBus);
        MonoethanolamineFluidType.register(modEventBus);
        HydrogenSulfideFluidType.register(modEventBus);
        HydrogenSulfideMonoethanolamineFluidType.register(modEventBus);
        EthyleneOxideFluidType.register(modEventBus);
        SalineWaterFluidType.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_HYDROGEN.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_HYDROGEN.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_OXYGEN.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_OXYGEN.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_HEAVY_WATER.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_HEAVY_WATER.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_DEUTERIUM.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_DEUTERIUM.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_TRITIUM.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_TRITIUM.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_METHANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_METHANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_ETHANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_ETHANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_PROPANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_PROPANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_BUTANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_BUTANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_GASOLINE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_GASOLINE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_KEROSENE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_KEROSENE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_DIESEL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_DIESEL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_FORMALDEHYDE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_FORMALDEHYDE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_AMMONIA.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_AMMONIA.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_METHANOL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_METHANOL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_NITROGEN.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_NITROGEN.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_FLUORINE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_FLUORINE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_SULFURIC_ACID.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_SULFURIC_ACID.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_HYDROFLUORIC_ACID.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_HYDROFLUORIC_ACID.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_ETHYLENE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_ETHYLENE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_CHLORINE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_CHLORINE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_SULFUR_DICHLORIDE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_SULFUR_DICHLORIDE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_MUSTARD_GAS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_MUSTARD_GAS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_NAPTHA.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_NAPTHA.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_BENZENE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_BENZENE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_ETHYLBENZENE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_ETHYLBENZENE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_POLYETHYLENE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_POLYETHYLENE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_ETHYLENE_OXIDE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_ETHYLENE_OXIDE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_MONOETHANOLAMINE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_MONOETHANOLAMINE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_HYDROGEN_SULFIDE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_HYDROGEN_SULFIDE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_HYDROGEN_SULFIDE_MONOETHANOLAMINE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_HYDROGEN_SULFIDE_MONOETHANOLAMINE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_SALINE_WATER.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_SALINE_WATER.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_NATURAL_GAS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_NATURAL_GAS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.SOURCE_RAW_NATURAL_GAS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(CCFluids.FLOWING_RAW_NATURAL_GAS.get(), RenderType.translucent());

            MenuScreens.register(CCMenuTypes.NUCLEAR_REACTOR_MENU.get(), NuclearReactorScreen::new);
            MenuScreens.register(CCMenuTypes.ARC_FURNACE_MENU.get(), ArcFurnaceScreen::new);
            MenuScreens.register(CCMenuTypes.COKING_OVEN_MENU.get(), CokingOvenScreen::new);

            EntityRenderers.register(CCEntities.SUPERHEATED_BLAZE.get(), SuperheatedBlazeEntityRenderer::new);
        }
    }
}
