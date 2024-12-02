package net.aepherastudios.createconquer.item;

import net.aepherastudios.createconquer.CreateConquer;
import net.aepherastudios.createconquer.block.CCBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CCCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateConquer.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CREATECONQUER_TAB = CREATIVE_MODE_TABS.register("createconquer_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(CCItems.URANIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.createconquer_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(CCItems.URANIUM_INGOT.get());
                        pOutput.accept(CCItems.URANIUM_PLATE.get());
                        pOutput.accept(CCItems.URANIUM_NUGGET.get());
                        pOutput.accept(CCItems.URANIUM_POWDER.get());
                        pOutput.accept(CCBlocks.URANIUM_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_URANIUM_BUCKET.get());
                        pOutput.accept(CCItems.URANIUM_SULFATE_CRYSTAL.get());
                        pOutput.accept(CCItems.URANIUM_SULFIDE.get());
                        pOutput.accept(CCItems.MOLTEN_URANIUM_SULFATE_BUCKET.get());
                        pOutput.accept(CCItems.MOLTEN_URANIUM_SULFIDE_BUCKET.get());

                        pOutput.accept(CCItems.PLUTONIUM_INGOT.get());
                        pOutput.accept(CCItems.PLUTONIUM_PLATE.get());
                        pOutput.accept(CCItems.PLUTONIUM_NUGGET.get());
                        pOutput.accept(CCItems.PLUTONIUM_POWDER.get());
                        pOutput.accept(CCBlocks.PLUTONIUM_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_PLUTONIUM_BUCKET.get());
                        pOutput.accept(CCItems.PLUTONIUM_SULFATE_CRYSTAL.get());
                        pOutput.accept(CCItems.PLUTONIUM_SULFIDE.get());
                        pOutput.accept(CCItems.MOLTEN_PLUTONIUM_SULFATE_BUCKET.get());
                        pOutput.accept(CCItems.MOLTEN_PLUTONIUM_SULFIDE_BUCKET.get());

                        pOutput.accept(CCItems.BERYLLIUM_INGOT.get());
                        pOutput.accept(CCItems.BERYLLIUM_PLATE.get());
                        pOutput.accept(CCItems.BERYLLIUM_NUGGET.get());
                        pOutput.accept(CCItems.BERYLLIUM_POWDER.get());
                        pOutput.accept(CCBlocks.BERYLLIUM_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_BERYLLIUM_BUCKET.get());
                        pOutput.accept(CCItems.BERYLLIUM_SULFATE_CRYSTAL.get());
                        pOutput.accept(CCItems.BERYLLIUM_SULFIDE.get());
                        pOutput.accept(CCItems.MOLTEN_BERYLLIUM_SULFATE_BUCKET.get());
                        pOutput.accept(CCItems.MOLTEN_BERYLLIUM_SULFIDE_BUCKET.get());

                        pOutput.accept(CCItems.TITANIUM_INGOT.get());
                        pOutput.accept(CCItems.TITANIUM_PLATE.get());
                        pOutput.accept(CCItems.TITANIUM_NUGGET.get());
                        pOutput.accept(CCItems.TITANIUM_POWDER.get());
                        pOutput.accept(CCBlocks.TITANIUM_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_TITANIUM_BUCKET.get());
                        pOutput.accept(CCItems.TITANIUM_SULFATE_CRYSTAL.get());
                        pOutput.accept(CCItems.TITANIUM_SULFIDE.get());
                        pOutput.accept(CCItems.MOLTEN_TITANIUM_SULFATE_BUCKET.get());
                        pOutput.accept(CCItems.MOLTEN_TITANIUM_SULFIDE_BUCKET.get());

                        pOutput.accept(CCItems.THORIUM_INGOT.get());
                        pOutput.accept(CCItems.THORIUM_PLATE.get());
                        pOutput.accept(CCItems.THORIUM_NUGGET.get());
                        pOutput.accept(CCItems.THORIUM_POWDER.get());
                        pOutput.accept(CCBlocks.THORIUM_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_THORIUM_BUCKET.get());
                        pOutput.accept(CCItems.THORIUM_SULFATE_CRYSTAL.get());
                        pOutput.accept(CCItems.THORIUM_SULFIDE.get());
                        pOutput.accept(CCItems.MOLTEN_THORIUM_SULFATE_BUCKET.get());
                        pOutput.accept(CCItems.MOLTEN_THORIUM_SULFIDE_BUCKET.get());

                        pOutput.accept(CCItems.LITHIUM_INGOT.get());
                        pOutput.accept(CCItems.LITHIUM_PLATE.get());
                        pOutput.accept(CCItems.LITHIUM_NUGGET.get());
                        pOutput.accept(CCItems.LITHIUM_POWDER.get());
                        pOutput.accept(CCBlocks.LITHIUM_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_LITHIUM_BUCKET.get());
                        pOutput.accept(CCItems.LITHIUM_SULFATE_CRYSTAL.get());
                        pOutput.accept(CCItems.LITHIUM_SULFIDE.get());
                        pOutput.accept(CCItems.MOLTEN_LITHIUM_SULFATE_BUCKET.get());
                        pOutput.accept(CCItems.MOLTEN_LITHIUM_SULFIDE_BUCKET.get());

                        pOutput.accept(CCItems.LEAD_INGOT.get());
                        pOutput.accept(CCItems.LEAD_PLATE.get());
                        pOutput.accept(CCItems.LEAD_NUGGET.get());
                        pOutput.accept(CCItems.LEAD_POWDER.get());
                        pOutput.accept(CCBlocks.LEAD_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_LEAD_BUCKET.get());
                        pOutput.accept(CCItems.LEAD_SULFATE_CRYSTAL.get());
                        pOutput.accept(CCItems.LEAD_SULFIDE.get());
                        pOutput.accept(CCItems.MOLTEN_LEAD_SULFATE_BUCKET.get());
                        pOutput.accept(CCItems.MOLTEN_LEAD_SULFIDE_BUCKET.get());

                        pOutput.accept(CCItems.TANKSTEEL_INGOT.get());
                        pOutput.accept(CCItems.TANKSTEEL_PLATE.get());
                        pOutput.accept(CCItems.TANKSTEEL_NUGGET.get());
                        pOutput.accept(CCItems.TANKSTEEL_POWDER.get());
                        pOutput.accept(CCBlocks.TANKSTEEL_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_TANKSTEEL_BUCKET.get());

                        pOutput.accept(CCItems.STEEL_INGOT.get());
                        pOutput.accept(CCItems.STEEL_PLATE.get());
                        pOutput.accept(CCItems.STEEL_NUGGET.get());
                        pOutput.accept(CCItems.STEEL_POWDER.get());
                        pOutput.accept(CCBlocks.STEEL_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_STEEL_BUCKET.get());

                        pOutput.accept(CCItems.ALUMINUM_INGOT.get());
                        pOutput.accept(CCItems.ALUMINUM_PLATE.get());
                        pOutput.accept(CCItems.ALUMINUM_NUGGET.get());
                        pOutput.accept(CCItems.ALUMINUM_POWDER.get());
                        pOutput.accept(CCBlocks.ALUMINUM_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_ALUMINUM_BUCKET.get());
                        pOutput.accept(CCItems.ALUMINUM_SULFATE_CRYSTAL.get());
                        pOutput.accept(CCItems.ALUMINUM_SULFIDE.get());
                        pOutput.accept(CCItems.MOLTEN_ALUMINUM_SULFATE_BUCKET.get());
                        pOutput.accept(CCItems.MOLTEN_ALUMINUM_SULFIDE_BUCKET.get());

                        pOutput.accept(CCItems.TIN_INGOT.get());
                        pOutput.accept(CCItems.TIN_PLATE.get());
                        pOutput.accept(CCItems.TIN_NUGGET.get());
                        pOutput.accept(CCItems.TIN_POWDER.get());
                        pOutput.accept(CCBlocks.TIN_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_TIN_BUCKET.get());
                        pOutput.accept(CCItems.TIN_SULFATE_CRYSTAL.get());
                        pOutput.accept(CCItems.TIN_SULFIDE.get());
                        pOutput.accept(CCItems.MOLTEN_TIN_SULFATE_BUCKET.get());
                        pOutput.accept(CCItems.MOLTEN_TIN_SULFIDE_BUCKET.get());

                        pOutput.accept(CCItems.ZINC_PLATE.get());
                        pOutput.accept(CCItems.ZINC_POWDER.get());
                        pOutput.accept(CCItems.ZINC_ROD.get());
                        pOutput.accept(CCItems.ZINC_WIRE.get());
                        pOutput.accept(CCItems.MOLTEN_ZINC_BUCKET.get());
                        pOutput.accept(CCItems.ZINC_SULFATE_CRYSTAL.get());
                        pOutput.accept(CCItems.ZINC_SULFIDE.get());
                        pOutput.accept(CCItems.MOLTEN_ZINC_SULFATE_BUCKET.get());
                        pOutput.accept(CCItems.MOLTEN_ZINC_SULFIDE_BUCKET.get());

                        pOutput.accept(CCItems.COPPER_POWDER.get());
                        pOutput.accept(CCItems.COPPER_GEAR.get());
                        pOutput.accept(CCItems.COPPER_WIRE.get());
                        pOutput.accept(CCItems.COPPER_ROD.get());
                        pOutput.accept(CCItems.MOLTEN_COPPER_BUCKET.get());
                        pOutput.accept(CCItems.COPPER_SULFATE_CRYSTAL.get());
                        pOutput.accept(CCItems.COPPER_SULFIDE.get());
                        pOutput.accept(CCItems.MOLTEN_COPPER_SULFATE_BUCKET.get());
                        pOutput.accept(CCItems.MOLTEN_COPPER_SULFIDE_BUCKET.get());

                        pOutput.accept(CCItems.SILICON_INGOT.get());
                        pOutput.accept(CCItems.SILICON_PLATE.get());
                        pOutput.accept(CCItems.SILICON_NUGGET.get());
                        pOutput.accept(CCItems.SILICON_POWDER.get());
                        pOutput.accept(CCBlocks.SILICON_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_SILICON_BUCKET.get());

                        pOutput.accept(CCItems.URANIUM_235_INGOT.get());
                        pOutput.accept(CCItems.URANIUM_235_PLATE.get());
                        pOutput.accept(CCItems.URANIUM_235_NUGGET.get());
                        pOutput.accept(CCItems.URANIUM_235_POWDER.get());
                        pOutput.accept(CCBlocks.URANIUM_235_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_URANIUM_235_BUCKET.get());

                        pOutput.accept(CCItems.URANIUM_238_INGOT.get());
                        pOutput.accept(CCItems.URANIUM_238_PLATE.get());
                        pOutput.accept(CCItems.URANIUM_238_NUGGET.get());
                        pOutput.accept(CCItems.URANIUM_238_POWDER.get());
                        pOutput.accept(CCBlocks.URANIUM_238_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_URANIUM_238_BUCKET.get());

                        pOutput.accept(CCItems.URANIUM_233_INGOT.get());
                        pOutput.accept(CCItems.URANIUM_233_PLATE.get());
                        pOutput.accept(CCItems.URANIUM_233_NUGGET.get());
                        pOutput.accept(CCItems.URANIUM_233_POWDER.get());
                        pOutput.accept(CCBlocks.URANIUM_233_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_URANIUM_233_BUCKET.get());

                        pOutput.accept(CCItems.LITHIUM_6_INGOT.get());
                        pOutput.accept(CCItems.LITHIUM_6_PLATE.get());
                        pOutput.accept(CCItems.LITHIUM_6_NUGGET.get());
                        pOutput.accept(CCItems.LITHIUM_6_POWDER.get());
                        pOutput.accept(CCBlocks.LITHIUM_6_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_LITHIUM_6_BUCKET.get());

                        pOutput.accept(CCItems.LITHIUM_7_INGOT.get());
                        pOutput.accept(CCItems.LITHIUM_7_PLATE.get());
                        pOutput.accept(CCItems.LITHIUM_7_NUGGET.get());
                        pOutput.accept(CCItems.LITHIUM_7_POWDER.get());
                        pOutput.accept(CCBlocks.LITHIUM_7_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_LITHIUM_7_BUCKET.get());

                        pOutput.accept(CCItems.ROSESTEEL_INGOT.get());
                        pOutput.accept(CCItems.ROSESTEEL_PLATE.get());
                        pOutput.accept(CCItems.ROSESTEEL_NUGGET.get());
                        pOutput.accept(CCItems.ROSESTEEL_POWDER.get());
                        pOutput.accept(CCBlocks.ROSESTEEL_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_ROSESTEEL_BUCKET.get());

                        pOutput.accept(CCItems.ROSE_GOLD_INGOT.get());
                        pOutput.accept(CCItems.ROSE_GOLD_PLATE.get());
                        pOutput.accept(CCItems.ROSE_GOLD_NUGGET.get());
                        pOutput.accept(CCItems.ROSE_GOLD_POWDER.get());
                        pOutput.accept(CCBlocks.ROSE_GOLD_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_ROSE_GOLD_BUCKET.get());

                        pOutput.accept(CCItems.BRONZE_INGOT.get());
                        pOutput.accept(CCItems.BRONZE_PLATE.get());
                        pOutput.accept(CCItems.BRONZE_NUGGET.get());
                        pOutput.accept(CCItems.BRONZE_POWDER.get());
                        pOutput.accept(CCBlocks.BRONZE_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_BRONZE_BUCKET.get());

                        pOutput.accept(CCItems.STAINLESS_STEEL_INGOT.get());
                        pOutput.accept(CCItems.STAINLESS_STEEL_PLATE.get());
                        pOutput.accept(CCItems.STAINLESS_STEEL_NUGGET.get());
                        pOutput.accept(CCItems.STAINLESS_STEEL_POWDER.get());
                        pOutput.accept(CCBlocks.STAINLESS_STEEL_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_STAINLESS_STEEL_BUCKET.get());

                        pOutput.accept(CCItems.STABALLOY_INGOT.get());
                        pOutput.accept(CCItems.STABALLOY_PLATE.get());
                        pOutput.accept(CCItems.STABALLOY_NUGGET.get());
                        pOutput.accept(CCItems.STABALLOY_POWDER.get());
                        pOutput.accept(CCBlocks.STABALLOY_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_STABALLOY_BUCKET.get());

                        pOutput.accept(CCItems.BRASS_POWDER.get());
                        pOutput.accept(CCItems.BRASS_GEAR.get());
                        pOutput.accept(CCItems.MOLTEN_BRASS_BUCKET.get());

                        pOutput.accept(CCItems.FISSILE_URANIUM_20_INGOT.get());
                        pOutput.accept(CCItems.FISSILE_URANIUM_20_PLATE.get());
                        pOutput.accept(CCItems.FISSILE_URANIUM_20_NUGGET.get());
                        pOutput.accept(CCItems.FISSILE_URANIUM_20_POWDER.get());
                        pOutput.accept(CCBlocks.FISSILE_URANIUM_20_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_FISSILE_URANIUM_20_BUCKET.get());

                        pOutput.accept(CCItems.FISSILE_URANIUM_90_INGOT.get());
                        pOutput.accept(CCItems.FISSILE_URANIUM_90_PLATE.get());
                        pOutput.accept(CCItems.FISSILE_URANIUM_90_NUGGET.get());
                        pOutput.accept(CCItems.FISSILE_URANIUM_90_POWDER.get());
                        pOutput.accept(CCBlocks.FISSILE_URANIUM_90_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_FISSILE_URANIUM_90_BUCKET.get());

                        pOutput.accept(CCItems.BISMUTH_INGOT.get());
                        pOutput.accept(CCItems.BISMUTH_PLATE.get());
                        pOutput.accept(CCItems.BISMUTH_NUGGET.get());
                        pOutput.accept(CCItems.BISMUTH_POWDER.get());
                        pOutput.accept(CCBlocks.BISMUTH_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_BISMUTH_BUCKET.get());
                        pOutput.accept(CCItems.BISMUTH_SULFATE_CRYSTAL.get());
                        pOutput.accept(CCItems.BISMUTH_SULFIDE.get());
                        pOutput.accept(CCItems.MOLTEN_BISMUTH_SULFATE_BUCKET.get());
                        pOutput.accept(CCItems.MOLTEN_BISMUTH_SULFIDE_BUCKET.get());

                        pOutput.accept(CCItems.POLONIUM_INGOT.get());
                        pOutput.accept(CCItems.POLONIUM_PLATE.get());
                        pOutput.accept(CCItems.POLONIUM_NUGGET.get());
                        pOutput.accept(CCItems.POLONIUM_POWDER.get());
                        pOutput.accept(CCItems.POLONIUM_ROD.get());
                        pOutput.accept(CCBlocks.POLONIUM_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_POLONIUM_BUCKET.get());
                        pOutput.accept(CCItems.POLONIUM_SULFATE_CRYSTAL.get());
                        pOutput.accept(CCItems.POLONIUM_SULFIDE.get());
                        pOutput.accept(CCItems.MOLTEN_POLONIUM_SULFATE_BUCKET.get());
                        pOutput.accept(CCItems.MOLTEN_POLONIUM_SULFIDE_BUCKET.get());

                        pOutput.accept(CCItems.TUNGSTEN_INGOT.get());
                        pOutput.accept(CCItems.TUNGSTEN_PLATE.get());
                        pOutput.accept(CCItems.TUNGSTEN_NUGGET.get());
                        pOutput.accept(CCItems.TUNGSTEN_POWDER.get());
                        pOutput.accept(CCBlocks.TUNGSTEN_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_TUNGSTEN_BUCKET.get());
                        pOutput.accept(CCItems.TUNGSTEN_SULFATE_CRYSTAL.get());
                        pOutput.accept(CCItems.TUNGSTEN_SULFIDE.get());
                        pOutput.accept(CCItems.MOLTEN_TUNGSTEN_SULFATE_BUCKET.get());
                        pOutput.accept(CCItems.MOLTEN_TUNGSTEN_SULFIDE_BUCKET.get());

                        pOutput.accept(CCItems.CHROMIUM_INGOT.get());
                        pOutput.accept(CCItems.CHROMIUM_PLATE.get());
                        pOutput.accept(CCItems.CHROMIUM_NUGGET.get());
                        pOutput.accept(CCItems.CHROMIUM_POWDER.get());
                        pOutput.accept(CCBlocks.CHROMIUM_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_CHROMIUM_BUCKET.get());
                        pOutput.accept(CCItems.CHROMIUM_SULFATE_CRYSTAL.get());
                        pOutput.accept(CCItems.CHROMIUM_SULFIDE.get());
                        pOutput.accept(CCItems.MOLTEN_CHROMIUM_SULFATE_BUCKET.get());
                        pOutput.accept(CCItems.MOLTEN_CHROMIUM_SULFIDE_BUCKET.get());

                        pOutput.accept(CCItems.ELECTRUM_INGOT.get());
                        pOutput.accept(CCItems.ELECTRUM_PLATE.get());
                        pOutput.accept(CCItems.ELECTRUM_NUGGET.get());
                        pOutput.accept(CCItems.ELECTRUM_POWDER.get());
                        pOutput.accept(CCItems.ELECTRUM_GEAR.get());
                        pOutput.accept(CCItems.ELECTRUM_WIRE.get());
                        pOutput.accept(CCItems.ELECTRUM_ROD.get());
                        pOutput.accept(CCBlocks.ELECTRUM_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_ELECTRUM_BUCKET.get());

                        pOutput.accept(CCItems.SILVER_INGOT.get());
                        pOutput.accept(CCItems.SILVER_PLATE.get());
                        pOutput.accept(CCItems.SILVER_NUGGET.get());
                        pOutput.accept(CCItems.SILVER_POWDER.get());
                        pOutput.accept(CCItems.SILVER_ROD.get());
                        pOutput.accept(CCItems.SILVER_WIRE.get());
                        pOutput.accept(CCBlocks.SILVER_BLOCK.get());
                        pOutput.accept(CCItems.MOLTEN_SILVER_BUCKET.get());
                        pOutput.accept(CCItems.SILVER_SULFATE_CRYSTAL.get());
                        pOutput.accept(CCItems.SILVER_SULFIDE.get());
                        pOutput.accept(CCItems.MOLTEN_SILVER_SULFATE_BUCKET.get());
                        pOutput.accept(CCItems.MOLTEN_SILVER_SULFIDE_BUCKET.get());

                        pOutput.accept(CCItems.IRON_POWDER.get());
                        pOutput.accept(CCItems.IRON_ROD.get());
                        pOutput.accept(CCItems.MOLTEN_IRON_BUCKET.get());
                        pOutput.accept(CCItems.IRON_SULFATE_CRYSTAL.get());
                        pOutput.accept(CCItems.IRON_SULFIDE.get());
                        pOutput.accept(CCItems.MOLTEN_IRON_SULFATE_BUCKET.get());
                        pOutput.accept(CCItems.MOLTEN_IRON_SULFIDE_BUCKET.get());

                        pOutput.accept(CCItems.GOLD_POWDER.get());
                        pOutput.accept(CCItems.GOLD_ROD.get());
                        pOutput.accept(CCItems.GOLD_WIRE.get());
                        pOutput.accept(CCItems.MOLTEN_GOLD_BUCKET.get());
                        pOutput.accept(CCItems.GOLD_SULFATE_CRYSTAL.get());
                        pOutput.accept(CCItems.GOLD_SULFIDE.get());
                        pOutput.accept(CCItems.MOLTEN_GOLD_SULFATE_BUCKET.get());
                        pOutput.accept(CCItems.MOLTEN_GOLD_SULFIDE_BUCKET.get());

                        pOutput.accept(CCItems.NETHERITE_PLATE.get());
                        pOutput.accept(CCItems.NETHERITE_POWDER.get());
                        pOutput.accept(CCItems.MOLTEN_NETHERITE_BUCKET.get());

                        pOutput.accept(CCItems.MOLTEN_REDSTONE_BUCKET.get());

                        pOutput.accept(CCItems.BORAX.get());
                        pOutput.accept(CCBlocks.BORAX_BLOCK.get());
                        pOutput.accept(CCItems.BORON.get());
                        pOutput.accept(CCItems.BORON_ROD.get());
                        pOutput.accept(CCBlocks.BORON_BLOCK.get());
                        pOutput.accept(CCItems.GRAPHITE.get());
                        pOutput.accept(CCItems.GRAPHITE_ROD.get());
                        pOutput.accept(CCItems.FUEL_PELLET.get());
                        pOutput.accept(CCItems.FUEL_ROD.get());
                        pOutput.accept(CCItems.SPENT_FUEL_ROD.get());

                        pOutput.accept(CCItems.FLUORITE.get());
                        pOutput.accept(CCItems.POTASH.get());
                        pOutput.accept(CCItems.SULFATE_CRYSTAL.get());
                        pOutput.accept(CCItems.SULFUR.get());
                        pOutput.accept(CCItems.SULFUR_DIOXIDE.get());
                        pOutput.accept(CCItems.SULFUR_TRIOXIDE.get());
                        pOutput.accept(CCItems.POTASSIUM_CHLORIDE.get());
                        pOutput.accept(CCItems.POTASSIUM_HYDROXIDE.get());
                        pOutput.accept(CCItems.POTASSIUM_HYDROGEN_FLUORIDE.get());
                        pOutput.accept(CCItems.PLASTIC.get());
                        pOutput.accept(CCItems.MAGNET.get());
                        pOutput.accept(CCItems.COKE.get());
                        pOutput.accept(CCItems.PEAT.get());
                        pOutput.accept(CCItems.LIGNITE.get());
                        pOutput.accept(CCItems.LITHIUM_DEUTERIDE.get());
                        pOutput.accept(CCItems.LITHIUM_TRITIDE.get());
                        pOutput.accept(CCItems.HEXAMINE_POWDER.get());
                        pOutput.accept(CCItems.POLISHED_QUARTZ.get());
                        pOutput.accept(CCItems.BASIC_CIRCUIT.get());
                        pOutput.accept(CCItems.ADVANCED_CIRCUIT.get());
                        pOutput.accept(CCItems.CIRCUIT_MECHANISM.get());
                        pOutput.accept(CCItems.ADVANCED_CIRCUIT_MECHANISM.get());
                        pOutput.accept(CCItems.PHOTOELECTRIC_CELL.get());
                        pOutput.accept(CCItems.ADVANCED_PHOTOELECTRIC_CELL.get());
                        pOutput.accept(CCItems.CAPACITOR.get());
                        pOutput.accept(CCItems.TRANSISTOR.get());
                        pOutput.accept(CCItems.MOTOR.get());
                        pOutput.accept(CCItems.GENERATOR.get());
                        pOutput.accept(CCItems.COMPUTING_MECHANISM.get());
                        pOutput.accept(CCItems.GYRO.get());
                        pOutput.accept(CCItems.GYROSCOPE.get());
                        pOutput.accept(CCItems.ROCKET_CONTROL_MECHANISM.get());
                        pOutput.accept(CCItems.REENTRY_VEHICLE.get());
                        pOutput.accept(CCItems.THRUSTER.get());
                        pOutput.accept(CCItems.CONNECTOR.get());

                        pOutput.accept(CCItems.HYDROGEN_BUCKET.get());
                        pOutput.accept(CCItems.OXYGEN_BUCKET.get());
                        pOutput.accept(CCItems.HEAVY_WATER_BUCKET.get());
                        pOutput.accept(CCItems.DEUTERIUM_BUCKET.get());
                        pOutput.accept(CCItems.TRITIUM_BUCKET.get());

                        pOutput.accept(CCItems.SPHERE_CAST.get());
                        pOutput.accept(CCItems.ROD_CAST.get());
                        pOutput.accept(CCItems.INGOT_CAST.get());
                        pOutput.accept(CCItems.PLATE_CAST.get());
                        pOutput.accept(CCItems.NUGGET_CAST.get());
                        pOutput.accept(CCItems.GEAR_CAST.get());

                        pOutput.accept(CCBlocks.ALUNITE_ORE.get());
                        pOutput.accept(CCBlocks.DEEPSLATE_ALUNITE_ORE.get());
                        pOutput.accept(CCBlocks.RAW_ALUNITE_BLOCK.get());
                        pOutput.accept(CCItems.RAW_ALUNITE.get());
                        pOutput.accept(CCItems.CRUSHED_RAW_ALUNITE.get());
                        pOutput.accept(CCItems.ALUNITE_BLEND.get());

                        pOutput.accept(CCBlocks.CORUNDUM_ORE.get());
                        pOutput.accept(CCBlocks.DEEPSLATE_CORUNDUM_ORE.get());
                        pOutput.accept(CCBlocks.RAW_CORUNDUM_BLOCK.get());
                        pOutput.accept(CCItems.RAW_CORUNDUM.get());
                        pOutput.accept(CCItems.CRUSHED_RAW_CORUNDUM.get());
                        pOutput.accept(CCItems.CORUNDUM_BLEND.get());

                        pOutput.accept(CCBlocks.MAGNETITE_ORE.get());
                        pOutput.accept(CCBlocks.DEEPSLATE_MAGNETITE_ORE.get());
                        pOutput.accept(CCBlocks.RAW_MAGNETITE_BLOCK.get());
                        pOutput.accept(CCItems.RAW_MAGNETITE.get());
                        pOutput.accept(CCItems.CRUSHED_RAW_MAGNETITE.get());
                        pOutput.accept(CCItems.MAGNETITE_BLEND.get());

                        pOutput.accept(CCBlocks.URANINITE_ORE.get());
                        pOutput.accept(CCBlocks.DEEPSLATE_URANINITE_ORE.get());
                        pOutput.accept(CCBlocks.RAW_URANINITE_BLOCK.get());
                        pOutput.accept(CCItems.RAW_URANINITE.get());
                        pOutput.accept(CCItems.CRUSHED_RAW_URANINITE.get());
                        pOutput.accept(CCItems.URANINITE_BLEND.get());

                        pOutput.accept(CCBlocks.GALENA_ORE.get());
                        pOutput.accept(CCBlocks.DEEPSLATE_GALENA_ORE.get());
                        pOutput.accept(CCBlocks.RAW_GALENA_BLOCK.get());
                        pOutput.accept(CCItems.RAW_GALENA.get());
                        pOutput.accept(CCItems.CRUSHED_RAW_GALENA.get());
                        pOutput.accept(CCItems.GALENA_BLEND.get());

                        pOutput.accept(CCBlocks.BAUXITE_ORE.get());
                        pOutput.accept(CCBlocks.DEEPSLATE_BAUXITE_ORE.get());
                        pOutput.accept(CCBlocks.RAW_BAUXITE_BLOCK.get());
                        pOutput.accept(CCItems.RAW_BAUXITE.get());
                        pOutput.accept(CCItems.CRUSHED_RAW_BAUXITE.get());
                        pOutput.accept(CCItems.BAUXITE_BLEND.get());

                        pOutput.accept(CCBlocks.WOLFRAMITE_ORE.get());
                        pOutput.accept(CCBlocks.DEEPSLATE_WOLFRAMITE_ORE.get());
                        pOutput.accept(CCBlocks.RAW_WOLFRAMITE_BLOCK.get());
                        pOutput.accept(CCItems.RAW_WOLFRAMITE.get());
                        pOutput.accept(CCItems.CRUSHED_RAW_WOLFRAMITE.get());
                        pOutput.accept(CCItems.WOLFRAMITE_BLEND.get());

                        pOutput.accept(CCBlocks.CHRYSOBERYL_ORE.get());
                        pOutput.accept(CCBlocks.DEEPSLATE_CHRYSOBERYL_ORE.get());
                        pOutput.accept(CCBlocks.RAW_CHRYSOBERYL_BLOCK.get());
                        pOutput.accept(CCItems.RAW_CHRYSOBERYL.get());
                        pOutput.accept(CCItems.CRUSHED_RAW_CHRYSOBERYL.get());
                        pOutput.accept(CCItems.CHRYSOBERYL_BLEND.get());

                        pOutput.accept(CCBlocks.LEPIDOLITE_ORE.get());
                        pOutput.accept(CCBlocks.DEEPSLATE_LEPIDOLITE_ORE.get());
                        pOutput.accept(CCBlocks.RAW_LEPIDOLITE_BLOCK.get());
                        pOutput.accept(CCItems.RAW_LEPIDOLITE.get());
                        pOutput.accept(CCItems.CRUSHED_RAW_LEPIDOLITE.get());
                        pOutput.accept(CCItems.LEPIDOLITE_BLEND.get());

                        pOutput.accept(CCBlocks.ILMENITE_ORE.get());
                        pOutput.accept(CCBlocks.DEEPSLATE_ILMENITE_ORE.get());
                        pOutput.accept(CCBlocks.RAW_ILMENITE_BLOCK.get());
                        pOutput.accept(CCItems.RAW_ILMENITE.get());
                        pOutput.accept(CCItems.CRUSHED_RAW_ILMENITE.get());
                        pOutput.accept(CCItems.ILMENITE_BLEND.get());

                        pOutput.accept(CCBlocks.PENTLANDITE_ORE.get());
                        pOutput.accept(CCBlocks.DEEPSLATE_PENTLANDITE_ORE.get());
                        pOutput.accept(CCBlocks.RAW_PENTLANDITE_BLOCK.get());
                        pOutput.accept(CCItems.RAW_PENTLANDITE.get());
                        pOutput.accept(CCItems.CRUSHED_RAW_PENTLANDITE.get());
                        pOutput.accept(CCItems.PENTLANDITE_BLEND.get());

                        pOutput.accept(CCBlocks.MILLERITE_ORE.get());
                        pOutput.accept(CCBlocks.DEEPSLATE_MILLERITE_ORE.get());
                        pOutput.accept(CCBlocks.RAW_MILLERITE_BLOCK.get());
                        pOutput.accept(CCItems.RAW_MILLERITE.get());
                        pOutput.accept(CCItems.CRUSHED_RAW_MILLERITE.get());
                        pOutput.accept(CCItems.MILLERITE_BLEND.get());

                        pOutput.accept(CCBlocks.COSALITE_ORE.get());
                        pOutput.accept(CCBlocks.DEEPSLATE_COSALITE_ORE.get());
                        pOutput.accept(CCBlocks.RAW_COSALITE_BLOCK.get());
                        pOutput.accept(CCItems.RAW_COSALITE.get());
                        pOutput.accept(CCItems.CRUSHED_RAW_COSALITE.get());
                        pOutput.accept(CCItems.COSALITE_BLEND.get());

                        pOutput.accept(CCBlocks.CHROMITE_ORE.get());
                        pOutput.accept(CCBlocks.DEEPSLATE_CHROMITE_ORE.get());
                        pOutput.accept(CCBlocks.RAW_CHROMITE_BLOCK.get());
                        pOutput.accept(CCItems.RAW_CHROMITE.get());
                        pOutput.accept(CCItems.CRUSHED_RAW_CHROMITE.get());
                        pOutput.accept(CCItems.CHROMITE_BLEND.get());

                        pOutput.accept(CCBlocks.CASSITERITE_ORE.get());
                        pOutput.accept(CCBlocks.DEEPSLATE_CASSITERITE_ORE.get());
                        pOutput.accept(CCBlocks.RAW_CASSITERITE_BLOCK.get());
                        pOutput.accept(CCItems.RAW_CASSITERITE.get());
                        pOutput.accept(CCItems.CRUSHED_RAW_CASSITERITE.get());
                        pOutput.accept(CCItems.CASSITERITE_BLEND.get());

                        pOutput.accept(CCBlocks.SPHALERITE_ORE.get());
                        pOutput.accept(CCBlocks.DEEPSLATE_SPHALERITE_ORE.get());
                        pOutput.accept(CCBlocks.RAW_SPHALERITE_BLOCK.get());
                        pOutput.accept(CCItems.RAW_SPHALERITE.get());
                        pOutput.accept(CCItems.CRUSHED_RAW_SPHALERITE.get());
                        pOutput.accept(CCItems.SPHALERITE_BLEND.get());

                        pOutput.accept(CCBlocks.BORAX_ORE.get());
                        pOutput.accept(CCBlocks.DEEPSLATE_BORAX_ORE.get());
                        pOutput.accept(CCBlocks.FLUORITE_ORE.get());
                        pOutput.accept(CCBlocks.DEEPSLATE_FLUORITE_ORE.get());
                        pOutput.accept(CCBlocks.POTASH_ORE.get());
                        pOutput.accept(CCBlocks.DEEPSLATE_POTASH_ORE.get());

                        pOutput.accept(CCItems.NATURAL_GAS_BUCKET.get());
                        pOutput.accept(CCItems.RAW_NATURAL_GAS_BUCKET.get());
                        pOutput.accept(CCItems.CRUDE_OIL_BUCKET.get());
                        pOutput.accept(CCItems.RAW_CRUDE_OIL_BUCKET.get());
                        pOutput.accept(CCItems.RAW_DIRTY_CRUDE_OIL_BUCKET.get());
                        pOutput.accept(CCItems.WASH_OIL_BUCKET.get());
                        pOutput.accept(CCItems.GASOLINE_BUCKET.get());
                        pOutput.accept(CCItems.KEROSENE_BUCKET.get());
                        pOutput.accept(CCItems.DIESEL_BUCKET.get());
                        pOutput.accept(CCItems.BITUMEN_BUCKET.get());
                        pOutput.accept(CCItems.METHANE_BUCKET.get());
                        pOutput.accept(CCItems.ETHANE_BUCKET.get());
                        pOutput.accept(CCItems.PROPANE_BUCKET.get());
                        pOutput.accept(CCItems.BUTANE_BUCKET.get());

                        pOutput.accept(CCItems.FORMALDEHYDE_BUCKET.get());
                        pOutput.accept(CCItems.ETHANOL_BUCKET.get());
                        pOutput.accept(CCItems.METHANOL_BUCKET.get());
                        pOutput.accept(CCItems.AMMONIA_BUCKET.get());
                        pOutput.accept(CCItems.FLUORINE_BUCKET.get());

                        pOutput.accept(CCItems.FLUORINE_BUCKET.get());
                        pOutput.accept(CCItems.POTASSIUM_CHLORIDE_BUCKET.get());
                        pOutput.accept(CCItems.POTASSIUM_HYDROGEN_FLUORIDE_BUCKET.get());
                        pOutput.accept(CCItems.SULFURIC_ACID_BUCKET.get());
                        pOutput.accept(CCItems.HYDROFLUORIC_ACID_BUCKET.get());

                        pOutput.accept(CCItems.ETHYLENE_BUCKET.get());
                        pOutput.accept(CCItems.CHLORINE_BUCKET.get());
                        pOutput.accept(CCItems.SULFUR_DICHLORIDE_BUCKET.get());
                        pOutput.accept(CCItems.MUSTARD_GAS_BUCKET.get());
                        pOutput.accept(CCItems.BENZENE_BUCKET.get());
                        pOutput.accept(CCItems.ETHYLBENZENE_BUCKET.get());
                        pOutput.accept(CCItems.NAPTHA_BUCKET.get());
                        pOutput.accept(CCItems.POLYETHYLENE_BUCKET.get());
                        pOutput.accept(CCItems.HYDROGEN_SULFIDE_MONOETHANOLAMINE_BUCKET.get());
                        pOutput.accept(CCItems.HYDROGEN_SULFIDE_BUCKET.get());
                        pOutput.accept(CCItems.MONOETHANOLAMINE_BUCKET.get());
                        pOutput.accept(CCItems.ETHYLENE_OXIDE_BUCKET.get());
                        pOutput.accept(CCItems.SALINE_WATER_BUCKET.get());

                        pOutput.accept(CCItems.POLYSTYRENE.get());
                        pOutput.accept(CCItems.POLYETHYLENE.get());
                        pOutput.accept(CCItems.NAPALM_BUCKET.get());
                        pOutput.accept(CCItems.SALT.get());

                        pOutput.accept(CCItems.RAW_KIMBERLITE.get());
                        pOutput.accept(CCItems.RAW_EMERALD_BERYL.get());
                        pOutput.accept(CCItems.RAW_LAZURITE.get());
                        pOutput.accept(CCItems.RUBY_BLEND.get());
                        pOutput.accept(CCItems.SAPPHIRE_BLEND.get());
                        pOutput.accept(CCItems.RUBY.get());
                        pOutput.accept(CCItems.SAPPHIRE.get());
                        pOutput.accept(CCItems.CITRINE.get());
                        pOutput.accept(CCItems.SMOKY_QUARTZ.get());
                        pOutput.accept(CCItems.POLISHED_RUBY.get());
                        pOutput.accept(CCItems.POLISHED_SAPPHIRE.get());
                        pOutput.accept(CCItems.POLISHED_CITRINE.get());
                        pOutput.accept(CCItems.POLISHED_SMOKY_QUARTZ.get());
                        pOutput.accept(CCItems.POLISHED_DIAMOND.get());
                        pOutput.accept(CCItems.POLISHED_EMERALD.get());
                        pOutput.accept(CCItems.POLISHED_LAPIS.get());
                        pOutput.accept(CCItems.REDSTONE_CRYSTAL.get());

                        pOutput.accept(CCItems.ORANGE.get());

                        pOutput.accept(CCBlocks.RADIOACTIVE_WASTE_BARREL.get());

                        pOutput.accept(CCBlocks.NUCLEAR_REACTOR.get());
                        pOutput.accept(CCBlocks.ARC_FURNACE.get());
                        pOutput.accept(CCBlocks.COKING_OVEN.get());



                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> WEAPON_TAB = CREATIVE_MODE_TABS.register("weapon_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(CCItems.CONVENTIONAL_WARHEAD.get()))
                    .title(Component.translatable("creativetab.weapon_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(CCItems.CONVENTIONAL_WARHEAD.get());
                        pOutput.accept(CCItems.MINI_CONVENTIONAL_WARHEAD.get());
                        pOutput.accept(CCItems.NUCLEAR_WARHEAD.get());
                        pOutput.accept(CCItems.MINI_NUCLEAR_WARHEAD.get());
                        pOutput.accept(CCItems.THERMONUCLEAR_WARHEAD.get());
                        pOutput.accept(CCItems.MINI_THERMONUCLEAR_WARHEAD.get());
                        pOutput.accept(CCItems.CONVENTIONAL_MISSILE.get());
                        pOutput.accept(CCItems.CONVENTIONAL_ICBM.get());
                        pOutput.accept(CCItems.CONVENTIONAL_MIRV.get());
                        pOutput.accept(CCItems.NUCLEAR_MISSILE.get());
                        pOutput.accept(CCItems.NUCLEAR_ICBM.get());
                        pOutput.accept(CCItems.NUCLEAR_MIRV.get());
                        pOutput.accept(CCItems.THERMONUCLEAR_MISSILE.get());
                        pOutput.accept(CCItems.THERMONUCLEAR_ICBM.get());
                        pOutput.accept(CCItems.THERMONUCLEAR_MIRV.get());
                        pOutput.accept(CCItems.CONVENTIONAL_WARHEAD_HOUSED.get());
                        pOutput.accept(CCItems.CONVENTIONAL_MIRV_HOUSED.get());
                        pOutput.accept(CCItems.NUCLEAR_WARHEAD_HOUSED.get());
                        pOutput.accept(CCItems.NUCLEAR_MIRV_HOUSED.get());
                        pOutput.accept(CCItems.THERMONUCLEAR_WARHEAD_HOUSED.get());
                        pOutput.accept(CCItems.THERMONUCLEAR_MIRV_HOUSED.get());
                        pOutput.accept(CCItems.URANIUM_CORE.get());
                        pOutput.accept(CCItems.PLUTONIUM_CORE.get());
                        pOutput.accept(CCItems.HIGH_POWER_EXPLOSIVE.get());
                        pOutput.accept(CCItems.URANIUM_NUCLEAR_CORE.get());
                        pOutput.accept(CCItems.PLUTONIUM_NUCLEAR_CORE.get());
                        pOutput.accept(CCItems.FUSION_CORE.get());
                        pOutput.accept(CCItems.THERMONUCLEAR_CORE.get());



                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> DECORATION_TAB = CREATIVE_MODE_TABS.register("decoration_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(CCBlocks.POLISHED_QUARTZ_TILES.get()))
                    .title(Component.translatable("creativetab.decoration_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(CCBlocks.POLISHED_QUARTZ_TILES.get());
                        pOutput.accept(CCBlocks.SMALL_POLISHED_QUARTZ_TILES.get());
                        pOutput.accept(CCBlocks.AMETHYST_TILES.get());
                        pOutput.accept(CCBlocks.SMALL_AMETHYST_TILES.get());
                        pOutput.accept(CCBlocks.POLISHED_DIAMOND_TILES.get());
                        pOutput.accept(CCBlocks.SMALL_POLISHED_DIAMOND_TILES.get());
                        pOutput.accept(CCBlocks.POLISHED_EMERALD_TILES.get());
                        pOutput.accept(CCBlocks.SMALL_POLISHED_EMERALD_TILES.get());
                        pOutput.accept(CCBlocks.POLISHED_LAPIS_TILES.get());
                        pOutput.accept(CCBlocks.SMALL_POLISHED_LAPIS_TILES.get());
                        pOutput.accept(CCBlocks.POLISHED_RUBY_TILES.get());
                        pOutput.accept(CCBlocks.SMALL_POLISHED_RUBY_TILES.get());
                        pOutput.accept(CCBlocks.POLISHED_SAPPHIRE_TILES.get());
                        pOutput.accept(CCBlocks.SMALL_POLISHED_SAPPHIRE_TILES.get());
                        pOutput.accept(CCBlocks.POLISHED_SMOKY_QUARTZ_TILES.get());
                        pOutput.accept(CCBlocks.SMALL_POLISHED_SMOKY_QUARTZ_TILES.get());
                        pOutput.accept(CCBlocks.POLISHED_CITRINE_TILES.get());
                        pOutput.accept(CCBlocks.SMALL_POLISHED_CITRINE_TILES.get());
                        pOutput.accept(CCBlocks.REDSTONE_CRYSTAL_TILES.get());
                        pOutput.accept(CCBlocks.SMALL_REDSTONE_CRYSTAL_TILES.get());

                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> INCOMPLETE_PART_TAB = CREATIVE_MODE_TABS.register("incomplete_part_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(CCItems.INCOMPLETE_CAPACITOR.get()))
                    .title(Component.translatable("creativetab.incomplete_part_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(CCItems.INCOMPLETE_CAPACITOR.get());
                        pOutput.accept(CCItems.INCOMPLETE_BORON_ROD.get());
                        pOutput.accept(CCItems.INCOMPLETE_MISSILE.get());
                        pOutput.accept(CCItems.INCOMPLETE_CIRCUIT_MECHANISM.get());
                        pOutput.accept(CCItems.INCOMPLETE_ADVANCED_CIRCUIT_MECHANISM.get());
                        pOutput.accept(CCItems.INCOMPLETE_ADVANCED_PHOTOELECTRIC_CELL.get());
                        pOutput.accept(CCItems.INCOMPLETE_PHOTOELECTRIC_CELL.get());
                        pOutput.accept(CCItems.INCOMPLETE_TRANSISTOR.get());
                        pOutput.accept(CCItems.INCOMPLETE_COMPUTING_MECHANISM.get());
                        pOutput.accept(CCItems.INCOMPLETE_GYROSCOPE.get());
                        pOutput.accept(CCItems.INCOMPLETE_ROCKET_CONTROL_MECHANISM.get());
                        pOutput.accept(CCItems.INCOMPLETE_BASIC_CIRCUIT.get());
                        pOutput.accept(CCItems.INCOMPLETE_ADVANCED_CIRCUIT.get());
                        pOutput.accept(CCItems.INCOMPLETE_CONVENTIONAL_MISSILE.get());
                        pOutput.accept(CCItems.INCOMPLETE_NUCLEAR_MISSILE.get());
                        pOutput.accept(CCItems.INCOMPLETE_THERMONUCLEAR_MISSILE.get());
                        pOutput.accept(CCItems.INCOMPLETE_FUSION_CORE.get());
                        pOutput.accept(CCItems.INCOMPLETE_FUEL_ROD.get());



                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ITEM_CAST_TAB = CREATIVE_MODE_TABS.register("item_cast_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(CCItems.INGOT_CAST.get()))
                    .title(Component.translatable("creativetab.item_cast_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(CCItems.URANIUM_INGOT_CAST.get());
                        pOutput.accept(CCItems.PLUTONIUM_INGOT_CAST.get());
                        pOutput.accept(CCItems.BERYLLIUM_INGOT_CAST.get());
                        pOutput.accept(CCItems.TITANIUM_INGOT_CAST.get());
                        pOutput.accept(CCItems.LITHIUM_INGOT_CAST.get());
                        pOutput.accept(CCItems.THORIUM_INGOT_CAST.get());
                        pOutput.accept(CCItems.NICKEL_INGOT_CAST.get());
                        pOutput.accept(CCItems.LEAD_INGOT_CAST.get());
                        pOutput.accept(CCItems.TANKSTEEL_INGOT_CAST.get());
                        pOutput.accept(CCItems.STEEL_INGOT_CAST.get());
                        pOutput.accept(CCItems.ALUMINUM_INGOT_CAST.get());
                        pOutput.accept(CCItems.TIN_INGOT_CAST.get());
                        pOutput.accept(CCItems.ZINC_INGOT_CAST.get());
                        pOutput.accept(CCItems.COPPER_INGOT_CAST.get());
                        pOutput.accept(CCItems.SILICON_INGOT_CAST.get());
                        pOutput.accept(CCItems.URANIUM_235_INGOT_CAST.get());
                        pOutput.accept(CCItems.URANIUM_238_INGOT_CAST.get());
                        pOutput.accept(CCItems.URANIUM_233_INGOT_CAST.get());
                        pOutput.accept(CCItems.FISSILE_URANIUM_20_INGOT_CAST.get());
                        pOutput.accept(CCItems.FISSILE_URANIUM_90_INGOT_CAST.get());
                        pOutput.accept(CCItems.LITHIUM_6_INGOT_CAST.get());
                        pOutput.accept(CCItems.LITHIUM_7_INGOT_CAST.get());
                        pOutput.accept(CCItems.ROSE_GOLD_INGOT_CAST.get());
                        pOutput.accept(CCItems.ROSESTEEL_INGOT_CAST.get());
                        pOutput.accept(CCItems.INVAR_INGOT_CAST.get());
                        pOutput.accept(CCItems.BRONZE_INGOT_CAST.get());
                        pOutput.accept(CCItems.ALNICO_INGOT_CAST.get());
                        pOutput.accept(CCItems.STAINLESS_STEEL_INGOT_CAST.get());
                        pOutput.accept(CCItems.STABALLOY_INGOT_CAST.get());
                        pOutput.accept(CCItems.BRASS_INGOT_CAST.get());
                        pOutput.accept(CCItems.BISMUTH_INGOT_CAST.get());
                        pOutput.accept(CCItems.POLONIUM_INGOT_CAST.get());
                        pOutput.accept(CCItems.TUNGSTEN_INGOT_CAST.get());
                        pOutput.accept(CCItems.CHROMIUM_INGOT_CAST.get());
                        pOutput.accept(CCItems.COBALT_INGOT_CAST.get());
                        pOutput.accept(CCItems.ELECTRUM_INGOT_CAST.get());
                        pOutput.accept(CCItems.SILVER_INGOT_CAST.get());
                        pOutput.accept(CCItems.IRON_INGOT_CAST.get());
                        pOutput.accept(CCItems.GOLD_INGOT_CAST.get());
                        pOutput.accept(CCItems.NETHERITE_INGOT_CAST.get());

                        pOutput.accept(CCItems.URANIUM_PLATE_CAST.get());
                        pOutput.accept(CCItems.PLUTONIUM_PLATE_CAST.get());
                        pOutput.accept(CCItems.BERYLLIUM_PLATE_CAST.get());
                        pOutput.accept(CCItems.TITANIUM_PLATE_CAST.get());
                        pOutput.accept(CCItems.LITHIUM_PLATE_CAST.get());
                        pOutput.accept(CCItems.THORIUM_PLATE_CAST.get());
                        pOutput.accept(CCItems.NICKEL_PLATE_CAST.get());
                        pOutput.accept(CCItems.LEAD_PLATE_CAST.get());
                        pOutput.accept(CCItems.TANKSTEEL_PLATE_CAST.get());
                        pOutput.accept(CCItems.STEEL_PLATE_CAST.get());
                        pOutput.accept(CCItems.ALUMINUM_PLATE_CAST.get());
                        pOutput.accept(CCItems.TIN_PLATE_CAST.get());
                        pOutput.accept(CCItems.ZINC_PLATE_CAST.get());
                        pOutput.accept(CCItems.COPPER_PLATE_CAST.get());
                        pOutput.accept(CCItems.SILICON_PLATE_CAST.get());
                        pOutput.accept(CCItems.URANIUM_235_PLATE_CAST.get());
                        pOutput.accept(CCItems.URANIUM_238_PLATE_CAST.get());
                        pOutput.accept(CCItems.URANIUM_233_PLATE_CAST.get());
                        pOutput.accept(CCItems.FISSILE_URANIUM_20_PLATE_CAST.get());
                        pOutput.accept(CCItems.FISSILE_URANIUM_90_PLATE_CAST.get());
                        pOutput.accept(CCItems.LITHIUM_6_PLATE_CAST.get());
                        pOutput.accept(CCItems.LITHIUM_7_PLATE_CAST.get());
                        pOutput.accept(CCItems.ROSE_GOLD_PLATE_CAST.get());
                        pOutput.accept(CCItems.ROSESTEEL_PLATE_CAST.get());
                        pOutput.accept(CCItems.INVAR_PLATE_CAST.get());
                        pOutput.accept(CCItems.BRONZE_PLATE_CAST.get());
                        pOutput.accept(CCItems.ALNICO_PLATE_CAST.get());
                        pOutput.accept(CCItems.STAINLESS_STEEL_PLATE_CAST.get());
                        pOutput.accept(CCItems.STABALLOY_PLATE_CAST.get());
                        pOutput.accept(CCItems.BRASS_PLATE_CAST.get());
                        pOutput.accept(CCItems.BISMUTH_PLATE_CAST.get());
                        pOutput.accept(CCItems.POLONIUM_PLATE_CAST.get());
                        pOutput.accept(CCItems.TUNGSTEN_PLATE_CAST.get());
                        pOutput.accept(CCItems.CHROMIUM_PLATE_CAST.get());
                        pOutput.accept(CCItems.COBALT_PLATE_CAST.get());
                        pOutput.accept(CCItems.ELECTRUM_PLATE_CAST.get());
                        pOutput.accept(CCItems.SILVER_PLATE_CAST.get());
                        pOutput.accept(CCItems.IRON_PLATE_CAST.get());
                        pOutput.accept(CCItems.GOLD_PLATE_CAST.get());
                        pOutput.accept(CCItems.NETHERITE_PLATE_CAST.get());
                        pOutput.accept(CCItems.PLASTIC_PLATE_CAST.get());

                        pOutput.accept(CCItems.URANIUM_NUGGET_CAST.get());
                        pOutput.accept(CCItems.PLUTONIUM_NUGGET_CAST.get());
                        pOutput.accept(CCItems.BERYLLIUM_NUGGET_CAST.get());
                        pOutput.accept(CCItems.TITANIUM_NUGGET_CAST.get());
                        pOutput.accept(CCItems.LITHIUM_NUGGET_CAST.get());
                        pOutput.accept(CCItems.THORIUM_NUGGET_CAST.get());
                        pOutput.accept(CCItems.NICKEL_NUGGET_CAST.get());
                        pOutput.accept(CCItems.LEAD_NUGGET_CAST.get());
                        pOutput.accept(CCItems.TANKSTEEL_NUGGET_CAST.get());
                        pOutput.accept(CCItems.STEEL_NUGGET_CAST.get());
                        pOutput.accept(CCItems.ALUMINUM_NUGGET_CAST.get());
                        pOutput.accept(CCItems.TIN_NUGGET_CAST.get());
                        pOutput.accept(CCItems.ZINC_NUGGET_CAST.get());
                        pOutput.accept(CCItems.COPPER_NUGGET_CAST.get());
                        pOutput.accept(CCItems.SILICON_NUGGET_CAST.get());
                        pOutput.accept(CCItems.URANIUM_235_NUGGET_CAST.get());
                        pOutput.accept(CCItems.URANIUM_238_NUGGET_CAST.get());
                        pOutput.accept(CCItems.URANIUM_233_NUGGET_CAST.get());
                        pOutput.accept(CCItems.FISSILE_URANIUM_20_NUGGET_CAST.get());
                        pOutput.accept(CCItems.FISSILE_URANIUM_90_NUGGET_CAST.get());
                        pOutput.accept(CCItems.LITHIUM_6_NUGGET_CAST.get());
                        pOutput.accept(CCItems.LITHIUM_7_NUGGET_CAST.get());
                        pOutput.accept(CCItems.ROSE_GOLD_NUGGET_CAST.get());
                        pOutput.accept(CCItems.ROSESTEEL_NUGGET_CAST.get());
                        pOutput.accept(CCItems.INVAR_NUGGET_CAST.get());
                        pOutput.accept(CCItems.BRONZE_NUGGET_CAST.get());
                        pOutput.accept(CCItems.ALNICO_NUGGET_CAST.get());
                        pOutput.accept(CCItems.STAINLESS_STEEL_NUGGET_CAST.get());
                        pOutput.accept(CCItems.STABALLOY_NUGGET_CAST.get());
                        pOutput.accept(CCItems.BRASS_NUGGET_CAST.get());
                        pOutput.accept(CCItems.BISMUTH_NUGGET_CAST.get());
                        pOutput.accept(CCItems.POLONIUM_NUGGET_CAST.get());
                        pOutput.accept(CCItems.TUNGSTEN_NUGGET_CAST.get());
                        pOutput.accept(CCItems.CHROMIUM_NUGGET_CAST.get());
                        pOutput.accept(CCItems.COBALT_NUGGET_CAST.get());
                        pOutput.accept(CCItems.ELECTRUM_NUGGET_CAST.get());
                        pOutput.accept(CCItems.SILVER_NUGGET_CAST.get());
                        pOutput.accept(CCItems.IRON_NUGGET_CAST.get());
                        pOutput.accept(CCItems.GOLD_NUGGET_CAST.get());

                        pOutput.accept(CCItems.COPPER_GEAR_CAST.get());
                        pOutput.accept(CCItems.BRASS_GEAR_CAST.get());
                        pOutput.accept(CCItems.ELECTRUM_GEAR_CAST.get());

                        pOutput.accept(CCItems.IRON_ROD_CAST.get());
                        pOutput.accept(CCItems.POLONIUM_ROD_CAST.get());
                        pOutput.accept(CCItems.COPPER_ROD_CAST.get());
                        pOutput.accept(CCItems.ZINC_ROD_CAST.get());
                        pOutput.accept(CCItems.SILVER_ROD_CAST.get());
                        pOutput.accept(CCItems.GOLD_ROD_CAST.get());
                        pOutput.accept(CCItems.ELECTRUM_ROD_CAST.get());

                        pOutput.accept(CCItems.URANIUM_SPHERE_CAST.get());
                        pOutput.accept(CCItems.PLUTONIUM_SPHERE_CAST.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}