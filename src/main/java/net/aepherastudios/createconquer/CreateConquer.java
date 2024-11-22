package net.aepherastudios.createconquer;

import com.mojang.logging.LogUtils;
import net.aepherastudios.createconquer.block.ModBlocks;
import net.aepherastudios.createconquer.effect.ModEffects;
import net.aepherastudios.createconquer.fluid.*;
import net.aepherastudios.createconquer.item.ModCreativeModeTabs;
import net.aepherastudios.createconquer.item.ModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
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
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        ModFluids.register(modEventBus);
        ModEffects.register(modEventBus);

        UraniumFluidType.register(modEventBus);
        PlutoniumFluidType.register(modEventBus);
        BerylliumFluidType.register(modEventBus);
        TitaniumFluidType.register(modEventBus);
        LithiumFluidType.register(modEventBus);
        ThoriumFluidType.register(modEventBus);
        NickelFluidType.register(modEventBus);
        LeadFluidType.register(modEventBus);
        TanksteelFluidType.register(modEventBus);
        SteelFluidType.register(modEventBus);
        AluminumFluidType.register(modEventBus);
        TinFluidType.register(modEventBus);
        ZincFluidType.register(modEventBus);
        CopperFluidType.register(modEventBus);
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
        PoloniumFluidType.register(modEventBus);
        TungstenFluidType.register(modEventBus);
        ChromiumFluidType.register(modEventBus);
        CobaltFluidType.register(modEventBus);
        ElectrumFluidType.register(modEventBus);
        SilverFluidType.register(modEventBus);
        IronFluidType.register(modEventBus);
        GoldFluidType.register(modEventBus);
        NetheriteFluidType.register(modEventBus);
        RedstoneFluidType.register(modEventBus);

        HydrogenFluidType.register(modEventBus);
        OxygenFluidType.register(modEventBus);
        HeavyWaterFluidType.register(modEventBus);
        DeuteriumFluidType.register(modEventBus);
        TritiumFluidType.register(modEventBus);
        CrudeOilFluidType.register(modEventBus);

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
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_HYDROGEN.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_HYDROGEN.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_OXYGEN.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_OXYGEN.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_HEAVY_WATER.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_HEAVY_WATER.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_DEUTERIUM.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_DEUTERIUM.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_TRITIUM.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_TRITIUM.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_METHANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_METHANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_ETHANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_ETHANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_PROPANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_PROPANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_BUTANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_BUTANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_GASOLINE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_GASOLINE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_KEROSENE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_KEROSENE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_DIESEL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_DIESEL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_FORMALDEHYDE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_FORMALDEHYDE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_AMMONIA.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_AMMONIA.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_METHANOL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_METHANOL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_NITROGEN.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_NITROGEN.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_FLUORINE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_FLUORINE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_SULFURIC_ACID.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_SULFURIC_ACID.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_HYDROFLUORIC_ACID.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_HYDROFLUORIC_ACID.get(), RenderType.translucent());
        }
    }
}
