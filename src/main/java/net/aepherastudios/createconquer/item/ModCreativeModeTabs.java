package net.aepherastudios.createconquer.item;

import net.aepherastudios.createconquer.CreateConquer;
import net.aepherastudios.createconquer.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateConquer.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CREATECONQUER_TAB = CREATIVE_MODE_TABS.register("createconquer_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.URANIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.createconquer_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.URANIUM_INGOT.get());
                        pOutput.accept(ModItems.URANIUM_PLATE.get());
                        pOutput.accept(ModItems.URANIUM_NUGGET.get());
                        pOutput.accept(ModItems.URANIUM_POWDER.get());
                        pOutput.accept(ModBlocks.URANIUM_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_URANIUM_BUCKET.get());

                        pOutput.accept(ModItems.PLUTONIUM_INGOT.get());
                        pOutput.accept(ModItems.PLUTONIUM_PLATE.get());
                        pOutput.accept(ModItems.PLUTONIUM_NUGGET.get());
                        pOutput.accept(ModItems.PLUTONIUM_POWDER.get());
                        pOutput.accept(ModBlocks.PLUTONIUM_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_PLUTONIUM_BUCKET.get());

                        pOutput.accept(ModItems.BERYLLIUM_INGOT.get());
                        pOutput.accept(ModItems.BERYLLIUM_PLATE.get());
                        pOutput.accept(ModItems.BERYLLIUM_NUGGET.get());
                        pOutput.accept(ModItems.BERYLLIUM_POWDER.get());
                        pOutput.accept(ModBlocks.BERYLLIUM_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_BERYLLIUM_BUCKET.get());

                        pOutput.accept(ModItems.TITANIUM_INGOT.get());
                        pOutput.accept(ModItems.TITANIUM_PLATE.get());
                        pOutput.accept(ModItems.TITANIUM_NUGGET.get());
                        pOutput.accept(ModItems.TITANIUM_POWDER.get());
                        pOutput.accept(ModBlocks.TITANIUM_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_TITANIUM_BUCKET.get());

                        pOutput.accept(ModItems.THORIUM_INGOT.get());
                        pOutput.accept(ModItems.THORIUM_PLATE.get());
                        pOutput.accept(ModItems.THORIUM_NUGGET.get());
                        pOutput.accept(ModItems.THORIUM_POWDER.get());
                        pOutput.accept(ModBlocks.THORIUM_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_THORIUM_BUCKET.get());

                        pOutput.accept(ModItems.LITHIUM_INGOT.get());
                        pOutput.accept(ModItems.LITHIUM_PLATE.get());
                        pOutput.accept(ModItems.LITHIUM_NUGGET.get());
                        pOutput.accept(ModItems.LITHIUM_POWDER.get());
                        pOutput.accept(ModBlocks.LITHIUM_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_LITHIUM_BUCKET.get());


                        pOutput.accept(ModItems.LEAD_INGOT.get());
                        pOutput.accept(ModItems.LEAD_PLATE.get());
                        pOutput.accept(ModItems.LEAD_NUGGET.get());
                        pOutput.accept(ModItems.LEAD_POWDER.get());
                        pOutput.accept(ModBlocks.LEAD_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_LEAD_BUCKET.get());

                        pOutput.accept(ModItems.TANKSTEEL_INGOT.get());
                        pOutput.accept(ModItems.TANKSTEEL_PLATE.get());
                        pOutput.accept(ModItems.TANKSTEEL_NUGGET.get());
                        pOutput.accept(ModItems.TANKSTEEL_POWDER.get());
                        pOutput.accept(ModBlocks.TANKSTEEL_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_TANKSTEEL_BUCKET.get());

                        pOutput.accept(ModItems.STEEL_INGOT.get());
                        pOutput.accept(ModItems.STEEL_PLATE.get());
                        pOutput.accept(ModItems.STEEL_NUGGET.get());
                        pOutput.accept(ModItems.STEEL_POWDER.get());
                        pOutput.accept(ModBlocks.STEEL_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_STEEL_BUCKET.get());


                        pOutput.accept(ModItems.ALUMINUM_INGOT.get());
                        pOutput.accept(ModItems.ALUMINUM_PLATE.get());
                        pOutput.accept(ModItems.ALUMINUM_NUGGET.get());
                        pOutput.accept(ModItems.ALUMINUM_POWDER.get());
                        pOutput.accept(ModBlocks.ALUMINUM_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_ALUMINUM_BUCKET.get());

                        pOutput.accept(ModItems.TIN_INGOT.get());
                        pOutput.accept(ModItems.TIN_PLATE.get());
                        pOutput.accept(ModItems.TIN_NUGGET.get());
                        pOutput.accept(ModItems.TIN_POWDER.get());
                        pOutput.accept(ModBlocks.TIN_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_TIN_BUCKET.get());

                        pOutput.accept(ModItems.ZINC_PLATE.get());
                        pOutput.accept(ModItems.ZINC_POWDER.get());
                        pOutput.accept(ModItems.ZINC_ROD.get());
                        pOutput.accept(ModItems.ZINC_WIRE.get());
                        pOutput.accept(ModItems.MOLTEN_ZINC_BUCKET.get());

                        pOutput.accept(ModItems.COPPER_POWDER.get());
                        pOutput.accept(ModItems.COPPER_GEAR.get());
                        pOutput.accept(ModItems.COPPER_WIRE.get());
                        pOutput.accept(ModItems.COPPER_ROD.get());
                        pOutput.accept(ModItems.MOLTEN_COPPER_BUCKET.get());

                        pOutput.accept(ModItems.SILICON_INGOT.get());
                        pOutput.accept(ModItems.SILICON_PLATE.get());
                        pOutput.accept(ModItems.SILICON_NUGGET.get());
                        pOutput.accept(ModItems.SILICON_POWDER.get());
                        pOutput.accept(ModBlocks.SILICON_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_SILICON_BUCKET.get());

                        pOutput.accept(ModItems.URANIUM_235_INGOT.get());
                        pOutput.accept(ModItems.URANIUM_235_PLATE.get());
                        pOutput.accept(ModItems.URANIUM_235_NUGGET.get());
                        pOutput.accept(ModItems.URANIUM_235_POWDER.get());
                        pOutput.accept(ModBlocks.URANIUM_235_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_URANIUM_235_BUCKET.get());

                        pOutput.accept(ModItems.URANIUM_238_INGOT.get());
                        pOutput.accept(ModItems.URANIUM_238_PLATE.get());
                        pOutput.accept(ModItems.URANIUM_238_NUGGET.get());
                        pOutput.accept(ModItems.URANIUM_238_POWDER.get());
                        pOutput.accept(ModBlocks.URANIUM_238_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_URANIUM_238_BUCKET.get());

                        pOutput.accept(ModItems.URANIUM_233_INGOT.get());
                        pOutput.accept(ModItems.URANIUM_233_PLATE.get());
                        pOutput.accept(ModItems.URANIUM_233_NUGGET.get());
                        pOutput.accept(ModItems.URANIUM_233_POWDER.get());
                        pOutput.accept(ModBlocks.URANIUM_233_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_URANIUM_233_BUCKET.get());

                        pOutput.accept(ModItems.LITHIUM_6_INGOT.get());
                        pOutput.accept(ModItems.LITHIUM_6_PLATE.get());
                        pOutput.accept(ModItems.LITHIUM_6_NUGGET.get());
                        pOutput.accept(ModItems.LITHIUM_6_POWDER.get());
                        pOutput.accept(ModBlocks.LITHIUM_6_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_LITHIUM_6_BUCKET.get());

                        pOutput.accept(ModItems.LITHIUM_7_INGOT.get());
                        pOutput.accept(ModItems.LITHIUM_7_PLATE.get());
                        pOutput.accept(ModItems.LITHIUM_7_NUGGET.get());
                        pOutput.accept(ModItems.LITHIUM_7_POWDER.get());
                        pOutput.accept(ModBlocks.LITHIUM_7_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_LITHIUM_7_BUCKET.get());

                        pOutput.accept(ModItems.ROSESTEEL_INGOT.get());
                        pOutput.accept(ModItems.ROSESTEEL_PLATE.get());
                        pOutput.accept(ModItems.ROSESTEEL_NUGGET.get());
                        pOutput.accept(ModItems.ROSESTEEL_POWDER.get());
                        pOutput.accept(ModBlocks.ROSESTEEL_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_ROSESTEEL_BUCKET.get());

                        pOutput.accept(ModItems.ROSE_GOLD_INGOT.get());
                        pOutput.accept(ModItems.ROSE_GOLD_PLATE.get());
                        pOutput.accept(ModItems.ROSE_GOLD_NUGGET.get());
                        pOutput.accept(ModItems.ROSE_GOLD_POWDER.get());
                        pOutput.accept(ModBlocks.ROSE_GOLD_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_ROSE_GOLD_BUCKET.get());

                        pOutput.accept(ModItems.BRONZE_INGOT.get());
                        pOutput.accept(ModItems.BRONZE_PLATE.get());
                        pOutput.accept(ModItems.BRONZE_NUGGET.get());
                        pOutput.accept(ModItems.BRONZE_POWDER.get());
                        pOutput.accept(ModBlocks.BRONZE_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_BRONZE_BUCKET.get());

                        pOutput.accept(ModItems.STAINLESS_STEEL_INGOT.get());
                        pOutput.accept(ModItems.STAINLESS_STEEL_PLATE.get());
                        pOutput.accept(ModItems.STAINLESS_STEEL_NUGGET.get());
                        pOutput.accept(ModItems.STAINLESS_STEEL_POWDER.get());
                        pOutput.accept(ModBlocks.STAINLESS_STEEL_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_STAINLESS_STEEL_BUCKET.get());

                        pOutput.accept(ModItems.STABALLOY_INGOT.get());
                        pOutput.accept(ModItems.STABALLOY_PLATE.get());
                        pOutput.accept(ModItems.STABALLOY_NUGGET.get());
                        pOutput.accept(ModItems.STABALLOY_POWDER.get());
                        pOutput.accept(ModBlocks.STABALLOY_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_STABALLOY_BUCKET.get());

                        pOutput.accept(ModItems.BRASS_POWDER.get());
                        pOutput.accept(ModItems.BRASS_GEAR.get());
                        pOutput.accept(ModItems.MOLTEN_BRASS_BUCKET.get());

                        pOutput.accept(ModItems.FISSILE_URANIUM_20_INGOT.get());
                        pOutput.accept(ModItems.FISSILE_URANIUM_20_PLATE.get());
                        pOutput.accept(ModItems.FISSILE_URANIUM_20_NUGGET.get());
                        pOutput.accept(ModItems.FISSILE_URANIUM_20_POWDER.get());
                        pOutput.accept(ModBlocks.FISSILE_URANIUM_20_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_FISSILE_URANIUM_20_BUCKET.get());

                        pOutput.accept(ModItems.FISSILE_URANIUM_90_INGOT.get());
                        pOutput.accept(ModItems.FISSILE_URANIUM_90_PLATE.get());
                        pOutput.accept(ModItems.FISSILE_URANIUM_90_NUGGET.get());
                        pOutput.accept(ModItems.FISSILE_URANIUM_90_POWDER.get());
                        pOutput.accept(ModBlocks.FISSILE_URANIUM_90_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_FISSILE_URANIUM_90_BUCKET.get());

                        pOutput.accept(ModItems.BISMUTH_INGOT.get());
                        pOutput.accept(ModItems.BISMUTH_PLATE.get());
                        pOutput.accept(ModItems.BISMUTH_NUGGET.get());
                        pOutput.accept(ModItems.BISMUTH_POWDER.get());
                        pOutput.accept(ModBlocks.BISMUTH_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_BISMUTH_BUCKET.get());

                        pOutput.accept(ModItems.POLONIUM_INGOT.get());
                        pOutput.accept(ModItems.POLONIUM_PLATE.get());
                        pOutput.accept(ModItems.POLONIUM_NUGGET.get());
                        pOutput.accept(ModItems.POLONIUM_POWDER.get());
                        pOutput.accept(ModItems.POLONIUM_ROD.get());
                        pOutput.accept(ModBlocks.POLONIUM_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_POLONIUM_BUCKET.get());

                        pOutput.accept(ModItems.TUNGSTEN_INGOT.get());
                        pOutput.accept(ModItems.TUNGSTEN_PLATE.get());
                        pOutput.accept(ModItems.TUNGSTEN_NUGGET.get());
                        pOutput.accept(ModItems.TUNGSTEN_POWDER.get());
                        pOutput.accept(ModBlocks.TUNGSTEN_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_TUNGSTEN_BUCKET.get());

                        pOutput.accept(ModItems.CHROMIUM_INGOT.get());
                        pOutput.accept(ModItems.CHROMIUM_PLATE.get());
                        pOutput.accept(ModItems.CHROMIUM_NUGGET.get());
                        pOutput.accept(ModItems.CHROMIUM_POWDER.get());
                        pOutput.accept(ModBlocks.CHROMIUM_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_CHROMIUM_BUCKET.get());

                        pOutput.accept(ModItems.ELECTRUM_INGOT.get());
                        pOutput.accept(ModItems.ELECTRUM_PLATE.get());
                        pOutput.accept(ModItems.ELECTRUM_NUGGET.get());
                        pOutput.accept(ModItems.ELECTRUM_POWDER.get());
                        pOutput.accept(ModItems.ELECTRUM_GEAR.get());
                        pOutput.accept(ModItems.ELECTRUM_WIRE.get());
                        pOutput.accept(ModItems.ELECTRUM_ROD.get());
                        pOutput.accept(ModBlocks.ELECTRUM_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_ELECTRUM_BUCKET.get());

                        pOutput.accept(ModItems.SILVER_INGOT.get());
                        pOutput.accept(ModItems.SILVER_PLATE.get());
                        pOutput.accept(ModItems.SILVER_NUGGET.get());
                        pOutput.accept(ModItems.SILVER_POWDER.get());
                        pOutput.accept(ModItems.SILVER_ROD.get());
                        pOutput.accept(ModItems.SILVER_WIRE.get());
                        pOutput.accept(ModBlocks.SILVER_BLOCK.get());
                        pOutput.accept(ModItems.MOLTEN_SILVER_BUCKET.get());

                        pOutput.accept(ModItems.IRON_POWDER.get());
                        pOutput.accept(ModItems.IRON_ROD.get());
                        pOutput.accept(ModItems.MOLTEN_IRON_BUCKET.get());

                        pOutput.accept(ModItems.GOLD_POWDER.get());
                        pOutput.accept(ModItems.GOLD_ROD.get());
                        pOutput.accept(ModItems.GOLD_WIRE.get());
                        pOutput.accept(ModItems.MOLTEN_GOLD_BUCKET.get());

                        pOutput.accept(ModItems.NETHERITE_PLATE.get());
                        pOutput.accept(ModItems.NETHERITE_POWDER.get());
                        pOutput.accept(ModItems.MOLTEN_NETHERITE_BUCKET.get());

                        pOutput.accept(ModItems.MOLTEN_REDSTONE_BUCKET.get());

                        pOutput.accept(ModItems.BORAX.get());
                        pOutput.accept(ModBlocks.BORAX_BLOCK.get());
                        pOutput.accept(ModItems.BORON.get());
                        pOutput.accept(ModItems.BORON_ROD.get());
                        pOutput.accept(ModBlocks.BORON_BLOCK.get());
                        pOutput.accept(ModItems.GRAPHITE.get());
                        pOutput.accept(ModItems.GRAPHITE_ROD.get());
                        pOutput.accept(ModItems.FUEL_PELLET.get());
                        pOutput.accept(ModItems.FUEL_ROD.get());
                        pOutput.accept(ModItems.SPENT_FUEL_ROD.get());

                        pOutput.accept(ModItems.FLUORITE.get());
                        pOutput.accept(ModItems.POTASH.get());
                        pOutput.accept(ModItems.SULFUR.get());
                        pOutput.accept(ModItems.SULFUR_DIOXIDE.get());
                        pOutput.accept(ModItems.SULFUR_TRIOXIDE.get());
                        pOutput.accept(ModItems.POTASSIUM_CHLORIDE.get());
                        pOutput.accept(ModItems.POTASSIUM_HYDROXIDE.get());
                        pOutput.accept(ModItems.POTASSIUM_HYDROGEN_FLUORIDE.get());
                        pOutput.accept(ModItems.PLASTIC.get());
                        pOutput.accept(ModItems.MAGNET.get());
                        pOutput.accept(ModItems.COKE.get());
                        pOutput.accept(ModItems.PEAT.get());
                        pOutput.accept(ModItems.LIGNITE.get());
                        pOutput.accept(ModItems.LITHIUM_DEUTERIDE.get());
                        pOutput.accept(ModItems.LITHIUM_TRITIDE.get());
                        pOutput.accept(ModItems.HEXAMINE_POWDER.get());
                        pOutput.accept(ModItems.POLISHED_QUARTZ.get());
                        pOutput.accept(ModItems.BASIC_CIRCUIT.get());
                        pOutput.accept(ModItems.ADVANCED_CIRCUIT.get());
                        pOutput.accept(ModItems.CIRCUIT_MECHANISM.get());
                        pOutput.accept(ModItems.ADVANCED_CIRCUIT_MECHANISM.get());
                        pOutput.accept(ModItems.PHOTOELECTRIC_CELL.get());
                        pOutput.accept(ModItems.ADVANCED_PHOTOELECTRIC_CELL.get());
                        pOutput.accept(ModItems.CAPACITOR.get());
                        pOutput.accept(ModItems.TRANSISTOR.get());
                        pOutput.accept(ModItems.MOTOR.get());
                        pOutput.accept(ModItems.GENERATOR.get());
                        pOutput.accept(ModItems.COMPUTING_MECHANISM.get());
                        pOutput.accept(ModItems.GYRO.get());
                        pOutput.accept(ModItems.GYROSCOPE.get());
                        pOutput.accept(ModItems.ROCKET_CONTROL_MECHANISM.get());
                        pOutput.accept(ModItems.REENTRY_VEHICLE.get());
                        pOutput.accept(ModItems.THRUSTER.get());
                        pOutput.accept(ModItems.CONNECTOR.get());

                        pOutput.accept(ModItems.HYDROGEN_BUCKET.get());
                        pOutput.accept(ModItems.OXYGEN_BUCKET.get());
                        pOutput.accept(ModItems.HEAVY_WATER_BUCKET.get());
                        pOutput.accept(ModItems.DEUTERIUM_BUCKET.get());
                        pOutput.accept(ModItems.TRITIUM_BUCKET.get());

                        pOutput.accept(ModItems.SPHERE_CAST.get());
                        pOutput.accept(ModItems.ROD_CAST.get());
                        pOutput.accept(ModItems.INGOT_CAST.get());
                        pOutput.accept(ModItems.PLATE_CAST.get());
                        pOutput.accept(ModItems.NUGGET_CAST.get());
                        pOutput.accept(ModItems.GEAR_CAST.get());

                        pOutput.accept(ModBlocks.ALUNITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_ALUNITE_ORE.get());
                        pOutput.accept(ModBlocks.RAW_ALUNITE_BLOCK.get());
                        pOutput.accept(ModItems.RAW_ALUNITE.get());
                        pOutput.accept(ModItems.CRUSHED_RAW_ALUNITE.get());
                        pOutput.accept(ModItems.ALUNITE_BLEND.get());

                        pOutput.accept(ModBlocks.CORUNDUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_CORUNDUM_ORE.get());
                        pOutput.accept(ModBlocks.RAW_CORUNDUM_BLOCK.get());
                        pOutput.accept(ModItems.RAW_CORUNDUM.get());
                        pOutput.accept(ModItems.CRUSHED_RAW_CORUNDUM.get());
                        pOutput.accept(ModItems.CORUNDUM_BLEND.get());

                        pOutput.accept(ModBlocks.MAGNETITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_MAGNETITE_ORE.get());
                        pOutput.accept(ModBlocks.RAW_MAGNETITE_BLOCK.get());
                        pOutput.accept(ModItems.RAW_MAGNETITE.get());
                        pOutput.accept(ModItems.CRUSHED_RAW_MAGNETITE.get());
                        pOutput.accept(ModItems.MAGNETITE_BLEND.get());

                        pOutput.accept(ModBlocks.URANINITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_URANINITE_ORE.get());
                        pOutput.accept(ModBlocks.RAW_URANINITE_BLOCK.get());
                        pOutput.accept(ModItems.RAW_URANINITE.get());
                        pOutput.accept(ModItems.CRUSHED_RAW_URANINITE.get());
                        pOutput.accept(ModItems.URANINITE_BLEND.get());

                        pOutput.accept(ModBlocks.GALENA_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_GALENA_ORE.get());
                        pOutput.accept(ModBlocks.RAW_GALENA_BLOCK.get());
                        pOutput.accept(ModItems.RAW_GALENA.get());
                        pOutput.accept(ModItems.CRUSHED_RAW_GALENA.get());
                        pOutput.accept(ModItems.GALENA_BLEND.get());

                        pOutput.accept(ModBlocks.BAUXITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_BAUXITE_ORE.get());
                        pOutput.accept(ModBlocks.RAW_BAUXITE_BLOCK.get());
                        pOutput.accept(ModItems.RAW_BAUXITE.get());
                        pOutput.accept(ModItems.CRUSHED_RAW_BAUXITE.get());
                        pOutput.accept(ModItems.BAUXITE_BLEND.get());

                        pOutput.accept(ModBlocks.WOLFRAMITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_WOLFRAMITE_ORE.get());
                        pOutput.accept(ModBlocks.RAW_WOLFRAMITE_BLOCK.get());
                        pOutput.accept(ModItems.RAW_WOLFRAMITE.get());
                        pOutput.accept(ModItems.CRUSHED_RAW_WOLFRAMITE.get());
                        pOutput.accept(ModItems.WOLFRAMITE_BLEND.get());

                        pOutput.accept(ModBlocks.CHRYSOBERYL_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_CHRYSOBERYL_ORE.get());
                        pOutput.accept(ModBlocks.RAW_CHRYSOBERYL_BLOCK.get());
                        pOutput.accept(ModItems.RAW_CHRYSOBERYL.get());
                        pOutput.accept(ModItems.CRUSHED_RAW_CHRYSOBERYL.get());
                        pOutput.accept(ModItems.CHRYSOBERYL_BLEND.get());

                        pOutput.accept(ModBlocks.LEPIDOLITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_LEPIDOLITE_ORE.get());
                        pOutput.accept(ModBlocks.RAW_LEPIDOLITE_BLOCK.get());
                        pOutput.accept(ModItems.RAW_LEPIDOLITE.get());
                        pOutput.accept(ModItems.CRUSHED_RAW_LEPIDOLITE.get());
                        pOutput.accept(ModItems.LEPIDOLITE_BLEND.get());

                        pOutput.accept(ModBlocks.ILMENITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_ILMENITE_ORE.get());
                        pOutput.accept(ModBlocks.RAW_ILMENITE_BLOCK.get());
                        pOutput.accept(ModItems.RAW_ILMENITE.get());
                        pOutput.accept(ModItems.CRUSHED_RAW_ILMENITE.get());
                        pOutput.accept(ModItems.ILMENITE_BLEND.get());

                        pOutput.accept(ModBlocks.PENTLANDITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_PENTLANDITE_ORE.get());
                        pOutput.accept(ModBlocks.RAW_PENTLANDITE_BLOCK.get());
                        pOutput.accept(ModItems.RAW_PENTLANDITE.get());
                        pOutput.accept(ModItems.CRUSHED_RAW_PENTLANDITE.get());
                        pOutput.accept(ModItems.PENTLANDITE_BLEND.get());

                        pOutput.accept(ModBlocks.MILLERITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_MILLERITE_ORE.get());
                        pOutput.accept(ModBlocks.RAW_MILLERITE_BLOCK.get());
                        pOutput.accept(ModItems.RAW_MILLERITE.get());
                        pOutput.accept(ModItems.CRUSHED_RAW_MILLERITE.get());
                        pOutput.accept(ModItems.MILLERITE_BLEND.get());

                        pOutput.accept(ModBlocks.COSALITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_COSALITE_ORE.get());
                        pOutput.accept(ModBlocks.RAW_COSALITE_BLOCK.get());
                        pOutput.accept(ModItems.RAW_COSALITE.get());
                        pOutput.accept(ModItems.CRUSHED_RAW_COSALITE.get());
                        pOutput.accept(ModItems.COSALITE_BLEND.get());

                        pOutput.accept(ModBlocks.CHROMITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_CHROMITE_ORE.get());
                        pOutput.accept(ModBlocks.RAW_CHROMITE_BLOCK.get());
                        pOutput.accept(ModItems.RAW_CHROMITE.get());
                        pOutput.accept(ModItems.CRUSHED_RAW_CHROMITE.get());
                        pOutput.accept(ModItems.CHROMITE_BLEND.get());

                        pOutput.accept(ModBlocks.CASSITERITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_CASSITERITE_ORE.get());
                        pOutput.accept(ModBlocks.RAW_CASSITERITE_BLOCK.get());
                        pOutput.accept(ModItems.RAW_CASSITERITE.get());
                        pOutput.accept(ModItems.CRUSHED_RAW_CASSITERITE.get());
                        pOutput.accept(ModItems.CASSITERITE_BLEND.get());

                        pOutput.accept(ModBlocks.BORAX_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_BORAX_ORE.get());
                        pOutput.accept(ModBlocks.FLUORITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_FLUORITE_ORE.get());
                        pOutput.accept(ModBlocks.POTASH_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_POTASH_ORE.get());

                        pOutput.accept(ModItems.CRUDE_OIL_BUCKET.get());
                        pOutput.accept(ModItems.GASOLINE_BUCKET.get());
                        pOutput.accept(ModItems.KEROSENE_BUCKET.get());
                        pOutput.accept(ModItems.DIESEL_BUCKET.get());
                        pOutput.accept(ModItems.BITUMEN_BUCKET.get());
                        pOutput.accept(ModItems.METHANE_BUCKET.get());
                        pOutput.accept(ModItems.ETHANE_BUCKET.get());
                        pOutput.accept(ModItems.PROPANE_BUCKET.get());
                        pOutput.accept(ModItems.BUTANE_BUCKET.get());

                        pOutput.accept(ModItems.FORMALDEHYDE_BUCKET.get());
                        pOutput.accept(ModItems.ETHANOL_BUCKET.get());
                        pOutput.accept(ModItems.METHANOL_BUCKET.get());
                        pOutput.accept(ModItems.AMMONIA_BUCKET.get());
                        pOutput.accept(ModItems.FLUORINE_BUCKET.get());

                        pOutput.accept(ModItems.FLUORINE_BUCKET.get());
                        pOutput.accept(ModItems.POTASSIUM_CHLORIDE_BUCKET.get());
                        pOutput.accept(ModItems.POTASSIUM_HYDROGEN_FLUORIDE_BUCKET.get());
                        pOutput.accept(ModItems.SULFURIC_ACID_BUCKET.get());
                        pOutput.accept(ModItems.HYDROFLUORIC_ACID_BUCKET.get());

                        pOutput.accept(ModItems.RAW_KIMBERLITE.get());
                        pOutput.accept(ModItems.RAW_EMERALD_BERYL.get());
                        pOutput.accept(ModItems.RAW_LAZURITE.get());
                        pOutput.accept(ModItems.RUBY_BLEND.get());
                        pOutput.accept(ModItems.SAPPHIRE_BLEND.get());
                        pOutput.accept(ModItems.RUBY.get());
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.CITRINE.get());
                        pOutput.accept(ModItems.SMOKY_QUARTZ.get());
                        pOutput.accept(ModItems.POLISHED_RUBY.get());
                        pOutput.accept(ModItems.POLISHED_SAPPHIRE.get());
                        pOutput.accept(ModItems.POLISHED_CITRINE.get());
                        pOutput.accept(ModItems.POLISHED_SMOKY_QUARTZ.get());
                        pOutput.accept(ModItems.POLISHED_DIAMOND.get());
                        pOutput.accept(ModItems.POLISHED_EMERALD.get());
                        pOutput.accept(ModItems.POLISHED_LAPIS.get());
                        pOutput.accept(ModItems.REDSTONE_CRYSTAL.get());

                        pOutput.accept(ModItems.ORANGE.get());



                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> WEAPON_TAB = CREATIVE_MODE_TABS.register("weapon_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CONVENTIONAL_WARHEAD.get()))
                    .title(Component.translatable("creativetab.weapon_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.CONVENTIONAL_WARHEAD.get());
                        pOutput.accept(ModItems.NUCLEAR_WARHEAD.get());
                        pOutput.accept(ModItems.THERMONUCLEAR_WARHEAD.get());
                        pOutput.accept(ModItems.CONVENTIONAL_MISSILE.get());
                        pOutput.accept(ModItems.NUCLEAR_MISSILE.get());
                        pOutput.accept(ModItems.THERMONUCLEAR_MISSILE.get());
                        pOutput.accept(ModItems.CONVENTIONAL_WARHEAD_HOUSED.get());
                        pOutput.accept(ModItems.NUCLEAR_WARHEAD_HOUSED.get());
                        pOutput.accept(ModItems.THERMONUCLEAR_WARHEAD_HOUSED.get());
                        pOutput.accept(ModItems.URANIUM_CORE.get());
                        pOutput.accept(ModItems.PLUTONIUM_CORE.get());
                        pOutput.accept(ModItems.HIGH_POWER_EXPLOSIVE.get());
                        pOutput.accept(ModItems.URANIUM_NUCLEAR_CORE.get());
                        pOutput.accept(ModItems.PLUTONIUM_NUCLEAR_CORE.get());
                        pOutput.accept(ModItems.FUSION_CORE.get());
                        pOutput.accept(ModItems.THERMONUCLEAR_CORE.get());



                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> DECORATION_TAB = CREATIVE_MODE_TABS.register("decoration_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.POLISHED_QUARTZ_TILES.get()))
                    .title(Component.translatable("creativetab.decoration_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.POLISHED_QUARTZ_TILES.get());
                        pOutput.accept(ModBlocks.SMALL_POLISHED_QUARTZ_TILES.get());
                        pOutput.accept(ModBlocks.AMETHYST_TILES.get());
                        pOutput.accept(ModBlocks.SMALL_AMETHYST_TILES.get());
                        pOutput.accept(ModBlocks.POLISHED_DIAMOND_TILES.get());
                        pOutput.accept(ModBlocks.SMALL_POLISHED_DIAMOND_TILES.get());
                        pOutput.accept(ModBlocks.POLISHED_EMERALD_TILES.get());
                        pOutput.accept(ModBlocks.SMALL_POLISHED_EMERALD_TILES.get());
                        pOutput.accept(ModBlocks.POLISHED_LAPIS_TILES.get());
                        pOutput.accept(ModBlocks.SMALL_POLISHED_LAPIS_TILES.get());
                        pOutput.accept(ModBlocks.POLISHED_RUBY_TILES.get());
                        pOutput.accept(ModBlocks.SMALL_POLISHED_RUBY_TILES.get());
                        pOutput.accept(ModBlocks.POLISHED_SAPPHIRE_TILES.get());
                        pOutput.accept(ModBlocks.SMALL_POLISHED_SAPPHIRE_TILES.get());
                        pOutput.accept(ModBlocks.POLISHED_SMOKY_QUARTZ_TILES.get());
                        pOutput.accept(ModBlocks.SMALL_POLISHED_SMOKY_QUARTZ_TILES.get());
                        pOutput.accept(ModBlocks.POLISHED_CITRINE_TILES.get());
                        pOutput.accept(ModBlocks.SMALL_POLISHED_CITRINE_TILES.get());
                        pOutput.accept(ModBlocks.REDSTONE_CRYSTAL_TILES.get());
                        pOutput.accept(ModBlocks.SMALL_REDSTONE_CRYSTAL_TILES.get());

                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> INCOMPLETE_PART_TAB = CREATIVE_MODE_TABS.register("incomplete_part_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.INCOMPLETE_CAPACITOR.get()))
                    .title(Component.translatable("creativetab.incomplete_part_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.INCOMPLETE_CAPACITOR.get());
                        pOutput.accept(ModItems.INCOMPLETE_BORON_ROD.get());
                        pOutput.accept(ModItems.INCOMPLETE_MISSILE.get());
                        pOutput.accept(ModItems.INCOMPLETE_CIRCUIT_MECHANISM.get());
                        pOutput.accept(ModItems.INCOMPLETE_ADVANCED_CIRCUIT_MECHANISM.get());
                        pOutput.accept(ModItems.INCOMPLETE_ADVANCED_PHOTOELECTRIC_CELL.get());
                        pOutput.accept(ModItems.INCOMPLETE_PHOTOELECTRIC_CELL.get());
                        pOutput.accept(ModItems.INCOMPLETE_TRANSISTOR.get());
                        pOutput.accept(ModItems.INCOMPLETE_COMPUTING_MECHANISM.get());
                        pOutput.accept(ModItems.INCOMPLETE_GYROSCOPE.get());
                        pOutput.accept(ModItems.INCOMPLETE_ROCKET_CONTROL_MECHANISM.get());
                        pOutput.accept(ModItems.INCOMPLETE_BASIC_CIRCUIT.get());
                        pOutput.accept(ModItems.INCOMPLETE_ADVANCED_CIRCUIT.get());
                        pOutput.accept(ModItems.INCOMPLETE_CONVENTIONAL_MISSILE.get());
                        pOutput.accept(ModItems.INCOMPLETE_NUCLEAR_MISSILE.get());
                        pOutput.accept(ModItems.INCOMPLETE_THERMONUCLEAR_MISSILE.get());
                        pOutput.accept(ModItems.INCOMPLETE_FUSION_CORE.get());
                        pOutput.accept(ModItems.INCOMPLETE_FUEL_ROD.get());



                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ITEM_CAST_TAB = CREATIVE_MODE_TABS.register("item_cast_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.INGOT_CAST.get()))
                    .title(Component.translatable("creativetab.item_cast_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.URANIUM_INGOT_CAST.get());
                        pOutput.accept(ModItems.PLUTONIUM_INGOT_CAST.get());
                        pOutput.accept(ModItems.BERYLLIUM_INGOT_CAST.get());
                        pOutput.accept(ModItems.TITANIUM_INGOT_CAST.get());
                        pOutput.accept(ModItems.LITHIUM_INGOT_CAST.get());
                        pOutput.accept(ModItems.THORIUM_INGOT_CAST.get());
                        pOutput.accept(ModItems.NICKEL_INGOT_CAST.get());
                        pOutput.accept(ModItems.LEAD_INGOT_CAST.get());
                        pOutput.accept(ModItems.TANKSTEEL_INGOT_CAST.get());
                        pOutput.accept(ModItems.STEEL_INGOT_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_INGOT_CAST.get());
                        pOutput.accept(ModItems.TIN_INGOT_CAST.get());
                        pOutput.accept(ModItems.ZINC_INGOT_CAST.get());
                        pOutput.accept(ModItems.COPPER_INGOT_CAST.get());
                        pOutput.accept(ModItems.SILICON_INGOT_CAST.get());
                        pOutput.accept(ModItems.URANIUM_235_INGOT_CAST.get());
                        pOutput.accept(ModItems.URANIUM_238_INGOT_CAST.get());
                        pOutput.accept(ModItems.URANIUM_233_INGOT_CAST.get());
                        pOutput.accept(ModItems.FISSILE_URANIUM_20_INGOT_CAST.get());
                        pOutput.accept(ModItems.FISSILE_URANIUM_90_INGOT_CAST.get());
                        pOutput.accept(ModItems.LITHIUM_6_INGOT_CAST.get());
                        pOutput.accept(ModItems.LITHIUM_7_INGOT_CAST.get());
                        pOutput.accept(ModItems.ROSE_GOLD_INGOT_CAST.get());
                        pOutput.accept(ModItems.ROSESTEEL_INGOT_CAST.get());
                        pOutput.accept(ModItems.INVAR_INGOT_CAST.get());
                        pOutput.accept(ModItems.BRONZE_INGOT_CAST.get());
                        pOutput.accept(ModItems.ALNICO_INGOT_CAST.get());
                        pOutput.accept(ModItems.STAINLESS_STEEL_INGOT_CAST.get());
                        pOutput.accept(ModItems.STABALLOY_INGOT_CAST.get());
                        pOutput.accept(ModItems.BRASS_INGOT_CAST.get());
                        pOutput.accept(ModItems.BISMUTH_INGOT_CAST.get());
                        pOutput.accept(ModItems.POLONIUM_INGOT_CAST.get());
                        pOutput.accept(ModItems.TUNGSTEN_INGOT_CAST.get());
                        pOutput.accept(ModItems.CHROMIUM_INGOT_CAST.get());
                        pOutput.accept(ModItems.COBALT_INGOT_CAST.get());
                        pOutput.accept(ModItems.ELECTRUM_INGOT_CAST.get());
                        pOutput.accept(ModItems.SILVER_INGOT_CAST.get());
                        pOutput.accept(ModItems.IRON_INGOT_CAST.get());
                        pOutput.accept(ModItems.GOLD_INGOT_CAST.get());
                        pOutput.accept(ModItems.NETHERITE_INGOT_CAST.get());

                        pOutput.accept(ModItems.URANIUM_PLATE_CAST.get());
                        pOutput.accept(ModItems.PLUTONIUM_PLATE_CAST.get());
                        pOutput.accept(ModItems.BERYLLIUM_PLATE_CAST.get());
                        pOutput.accept(ModItems.TITANIUM_PLATE_CAST.get());
                        pOutput.accept(ModItems.LITHIUM_PLATE_CAST.get());
                        pOutput.accept(ModItems.THORIUM_PLATE_CAST.get());
                        pOutput.accept(ModItems.NICKEL_PLATE_CAST.get());
                        pOutput.accept(ModItems.LEAD_PLATE_CAST.get());
                        pOutput.accept(ModItems.TANKSTEEL_PLATE_CAST.get());
                        pOutput.accept(ModItems.STEEL_PLATE_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_PLATE_CAST.get());
                        pOutput.accept(ModItems.TIN_PLATE_CAST.get());
                        pOutput.accept(ModItems.ZINC_PLATE_CAST.get());
                        pOutput.accept(ModItems.COPPER_PLATE_CAST.get());
                        pOutput.accept(ModItems.SILICON_PLATE_CAST.get());
                        pOutput.accept(ModItems.URANIUM_235_PLATE_CAST.get());
                        pOutput.accept(ModItems.URANIUM_238_PLATE_CAST.get());
                        pOutput.accept(ModItems.URANIUM_233_PLATE_CAST.get());
                        pOutput.accept(ModItems.FISSILE_URANIUM_20_PLATE_CAST.get());
                        pOutput.accept(ModItems.FISSILE_URANIUM_90_PLATE_CAST.get());
                        pOutput.accept(ModItems.LITHIUM_6_PLATE_CAST.get());
                        pOutput.accept(ModItems.LITHIUM_7_PLATE_CAST.get());
                        pOutput.accept(ModItems.ROSE_GOLD_PLATE_CAST.get());
                        pOutput.accept(ModItems.ROSESTEEL_PLATE_CAST.get());
                        pOutput.accept(ModItems.INVAR_PLATE_CAST.get());
                        pOutput.accept(ModItems.BRONZE_PLATE_CAST.get());
                        pOutput.accept(ModItems.ALNICO_PLATE_CAST.get());
                        pOutput.accept(ModItems.STAINLESS_STEEL_PLATE_CAST.get());
                        pOutput.accept(ModItems.STABALLOY_PLATE_CAST.get());
                        pOutput.accept(ModItems.BRASS_PLATE_CAST.get());
                        pOutput.accept(ModItems.BISMUTH_PLATE_CAST.get());
                        pOutput.accept(ModItems.POLONIUM_PLATE_CAST.get());
                        pOutput.accept(ModItems.TUNGSTEN_PLATE_CAST.get());
                        pOutput.accept(ModItems.CHROMIUM_PLATE_CAST.get());
                        pOutput.accept(ModItems.COBALT_PLATE_CAST.get());
                        pOutput.accept(ModItems.ELECTRUM_PLATE_CAST.get());
                        pOutput.accept(ModItems.SILVER_PLATE_CAST.get());
                        pOutput.accept(ModItems.IRON_PLATE_CAST.get());
                        pOutput.accept(ModItems.GOLD_PLATE_CAST.get());
                        pOutput.accept(ModItems.NETHERITE_PLATE_CAST.get());

                        pOutput.accept(ModItems.URANIUM_NUGGET_CAST.get());
                        pOutput.accept(ModItems.PLUTONIUM_NUGGET_CAST.get());
                        pOutput.accept(ModItems.BERYLLIUM_NUGGET_CAST.get());
                        pOutput.accept(ModItems.TITANIUM_NUGGET_CAST.get());
                        pOutput.accept(ModItems.LITHIUM_NUGGET_CAST.get());
                        pOutput.accept(ModItems.THORIUM_NUGGET_CAST.get());
                        pOutput.accept(ModItems.NICKEL_NUGGET_CAST.get());
                        pOutput.accept(ModItems.LEAD_NUGGET_CAST.get());
                        pOutput.accept(ModItems.TANKSTEEL_NUGGET_CAST.get());
                        pOutput.accept(ModItems.STEEL_NUGGET_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_NUGGET_CAST.get());
                        pOutput.accept(ModItems.TIN_NUGGET_CAST.get());
                        pOutput.accept(ModItems.ZINC_NUGGET_CAST.get());
                        pOutput.accept(ModItems.COPPER_NUGGET_CAST.get());
                        pOutput.accept(ModItems.SILICON_NUGGET_CAST.get());
                        pOutput.accept(ModItems.URANIUM_235_NUGGET_CAST.get());
                        pOutput.accept(ModItems.URANIUM_238_NUGGET_CAST.get());
                        pOutput.accept(ModItems.URANIUM_233_NUGGET_CAST.get());
                        pOutput.accept(ModItems.FISSILE_URANIUM_20_NUGGET_CAST.get());
                        pOutput.accept(ModItems.FISSILE_URANIUM_90_NUGGET_CAST.get());
                        pOutput.accept(ModItems.LITHIUM_6_NUGGET_CAST.get());
                        pOutput.accept(ModItems.LITHIUM_7_NUGGET_CAST.get());
                        pOutput.accept(ModItems.ROSE_GOLD_NUGGET_CAST.get());
                        pOutput.accept(ModItems.ROSESTEEL_NUGGET_CAST.get());
                        pOutput.accept(ModItems.INVAR_NUGGET_CAST.get());
                        pOutput.accept(ModItems.BRONZE_NUGGET_CAST.get());
                        pOutput.accept(ModItems.ALNICO_NUGGET_CAST.get());
                        pOutput.accept(ModItems.STAINLESS_STEEL_NUGGET_CAST.get());
                        pOutput.accept(ModItems.STABALLOY_NUGGET_CAST.get());
                        pOutput.accept(ModItems.BRASS_NUGGET_CAST.get());
                        pOutput.accept(ModItems.BISMUTH_NUGGET_CAST.get());
                        pOutput.accept(ModItems.POLONIUM_NUGGET_CAST.get());
                        pOutput.accept(ModItems.TUNGSTEN_NUGGET_CAST.get());
                        pOutput.accept(ModItems.CHROMIUM_NUGGET_CAST.get());
                        pOutput.accept(ModItems.COBALT_NUGGET_CAST.get());
                        pOutput.accept(ModItems.ELECTRUM_NUGGET_CAST.get());
                        pOutput.accept(ModItems.SILVER_NUGGET_CAST.get());
                        pOutput.accept(ModItems.IRON_NUGGET_CAST.get());
                        pOutput.accept(ModItems.GOLD_NUGGET_CAST.get());

                        pOutput.accept(ModItems.COPPER_GEAR_CAST.get());
                        pOutput.accept(ModItems.BRASS_GEAR_CAST.get());
                        pOutput.accept(ModItems.ELECTRUM_GEAR_CAST.get());

                        pOutput.accept(ModItems.IRON_ROD_CAST.get());
                        pOutput.accept(ModItems.POLONIUM_ROD_CAST.get());
                        pOutput.accept(ModItems.COPPER_ROD_CAST.get());
                        pOutput.accept(ModItems.ZINC_ROD_CAST.get());
                        pOutput.accept(ModItems.SILVER_ROD_CAST.get());
                        pOutput.accept(ModItems.GOLD_ROD_CAST.get());
                        pOutput.accept(ModItems.ELECTRUM_ROD_CAST.get());

                        pOutput.accept(ModItems.URANIUM_SPHERE_CAST.get());
                        pOutput.accept(ModItems.PLUTONIUM_SPHERE_CAST.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}