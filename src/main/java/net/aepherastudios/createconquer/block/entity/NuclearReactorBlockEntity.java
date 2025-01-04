package net.aepherastudios.createconquer.block.entity;

import net.aepherastudios.createconquer.fluid.CCFluids;
import net.aepherastudios.createconquer.item.CCItems;
import net.aepherastudios.createconquer.screen.NuclearReactorMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.templates.FluidTank;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NuclearReactorBlockEntity extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(12){
        @Override
        protected void onContentsChanged(int slot){
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, ItemStack stack) {
            return switch(slot){
                case 0, 1, 3, 4 -> stack.getItem() == CCItems.BORON_ROD.get();
                case 2 -> stack.getItem() == CCItems.POLONIUM_ROD.get();
                case 7, 8, 9, 10, 11 -> stack.getItem() == CCItems.FUEL_ROD.get();
                default -> super.isItemValid(slot, stack);
            };
        }
    };

    private static final int CONTROL_SLOT_1 = 0;
    private static final int CONTROL_SLOT_2 = 1;
    private static final int POLONIUM_SLOT = 2;
    private static final int CONTROL_SLOT_3 = 3;
    private static final int CONTROL_SLOT_4 = 4;
    private static final int FLUID_IN_SLOT = 5;
    private static final int FLUID_OUT_SLOT = 6;
    private static final int FUEL_SLOT_1 = 7;
    private static final int FUEL_SLOT_2 = 8;
    private static final int FUEL_SLOT_3 = 9;
    private static final int FUEL_SLOT_4 = 10;
    private static final int FUEL_SLOT_5 = 11;

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();
    private LazyOptional<IFluidHandler> lazyFluidHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int fuelDurProgress = 0;
    private int fuelDurMaxProgress = 100;
    private int poloniumDurProgress = 0;
    private int poloniumDurMaxProgress = 20;
    private int controlDurProgress = 0;
    private int controlDurMaxProgress = 20;
    private int fluidProgress = 0;
    private int maxFluidProgress = 1;

    private final FluidTank FLUID_TANK = createFluidTank();

    private FluidTank createFluidTank() {
        return new FluidTank(10000){
            @Override
            protected void onContentsChanged() {
                setChanged();
                if(!level.isClientSide){
                    level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
                }
            }

            @Override
            public boolean isFluidValid(int slot, FluidStack stack) {
                return switch (slot){
                  case 5 -> stack.getFluid() == Fluids.WATER || stack.getFluid() == CCFluids.SOURCE_IRRADIATED_WATER.get();
                  case 6 -> stack.getFluid() == CCFluids.SOURCE_SUPERHEATED_IRRADIATED_WATER.get();
                    default -> super.isFluidValid(slot, stack);
                };
            }
        };


    }

    public NuclearReactorBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(CCBlockEntities.NUCLEAR_REACTOR_BE.get(), pPos, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int pI) {
                return switch (pI){
                    case 0 -> NuclearReactorBlockEntity.this.fuelDurProgress;
                    case 1 -> NuclearReactorBlockEntity.this.fuelDurMaxProgress;
                    case 2 -> NuclearReactorBlockEntity.this.poloniumDurProgress;
                    case 3 -> NuclearReactorBlockEntity.this.poloniumDurMaxProgress;
                    case 4 -> NuclearReactorBlockEntity.this.controlDurProgress;
                    case 5 -> NuclearReactorBlockEntity.this.controlDurMaxProgress;
                    default -> 0;

                };
            }

            @Override
            public void set(int pIndex, int pVal) {
                switch (pIndex){
                    case 0 -> NuclearReactorBlockEntity.this.fuelDurProgress = pVal;
                    case 1 -> NuclearReactorBlockEntity.this.fuelDurMaxProgress = pVal;
                    case 2 -> NuclearReactorBlockEntity.this.poloniumDurProgress = pVal;
                    case 3 -> NuclearReactorBlockEntity.this.poloniumDurMaxProgress = pVal;
                    case 4 -> NuclearReactorBlockEntity.this.controlDurProgress = pVal;
                    case 5 -> NuclearReactorBlockEntity.this.controlDurMaxProgress = pVal;
                }
            }

            @Override
            public int getCount() {
                return 6;
            }
        };
    }
    public void drops() {
        SimpleContainer invintory = new SimpleContainer(itemHandler.getSlots());
        for(int i = 0; i < itemHandler.getSlots(); i++){
            invintory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, invintory);

    }
    @Override
    public Component getDisplayName() {
        return Component.literal("NUCLEAR REACTOR!!!");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
        return new NuclearReactorMenu(pContainerId, pPlayerInventory, this, this.data);
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if(cap == ForgeCapabilities.ITEM_HANDLER){
            return lazyItemHandler.cast();
        }

        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
        lazyFluidHandler = LazyOptional.of(() -> FLUID_TANK);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
        lazyFluidHandler.invalidate();
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        pTag.put("inventory", itemHandler.serializeNBT());
        pTag = FLUID_TANK.writeToNBT(pTag);

        super.saveAdditional(pTag);
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);
        FLUID_TANK.readFromNBT(pTag);

        itemHandler.deserializeNBT(pTag.getCompound("inventory"));
    }

    public void tick(Level level, BlockPos pPos, BlockState pState) {
        fillFluid();

        if (itemHandler.getStackInSlot(POLONIUM_SLOT).getItem() == CCItems.POLONIUM_ROD.get()) {
            if (controlDurProgress < controlDurMaxProgress) {
                if (!itemHandler.getStackInSlot(CONTROL_SLOT_1).isEmpty() && !itemHandler.getStackInSlot(CONTROL_SLOT_2).isEmpty() &&
                        !itemHandler.getStackInSlot(CONTROL_SLOT_3).isEmpty() && !itemHandler.getStackInSlot(CONTROL_SLOT_4).isEmpty()) {
                    setIsMeltdown(false);
                    controlDurProgress++;
                } else {
                    setIsMeltdown(true);
                }
            } else if (controlDurProgress == controlDurMaxProgress) {
                if (itemHandler.getStackInSlot(CONTROL_SLOT_1).getDamageValue() >= itemHandler.getStackInSlot(CONTROL_SLOT_1).getMaxDamage()) {
                    itemHandler.extractItem(CONTROL_SLOT_1, 1, false);
                }
                if (itemHandler.getStackInSlot(CONTROL_SLOT_2).getDamageValue() >= itemHandler.getStackInSlot(CONTROL_SLOT_2).getMaxDamage()) {
                    itemHandler.extractItem(CONTROL_SLOT_2, 1, false);
                }
                if (itemHandler.getStackInSlot(CONTROL_SLOT_3).getDamageValue() >= itemHandler.getStackInSlot(CONTROL_SLOT_3).getMaxDamage()) {
                    itemHandler.extractItem(CONTROL_SLOT_3, 1, false);
                }
                if (itemHandler.getStackInSlot(CONTROL_SLOT_4).getDamageValue() >= itemHandler.getStackInSlot(CONTROL_SLOT_4).getMaxDamage()) {
                    itemHandler.extractItem(CONTROL_SLOT_4, 1, false);
                }
                itemHandler.getStackInSlot(CONTROL_SLOT_1).setDamageValue(itemHandler.getStackInSlot(CONTROL_SLOT_1).getDamageValue() + 1);
                itemHandler.getStackInSlot(CONTROL_SLOT_2).setDamageValue(itemHandler.getStackInSlot(CONTROL_SLOT_2).getDamageValue() + 1);
                itemHandler.getStackInSlot(CONTROL_SLOT_3).setDamageValue(itemHandler.getStackInSlot(CONTROL_SLOT_3).getDamageValue() + 1);
                itemHandler.getStackInSlot(CONTROL_SLOT_4).setDamageValue(itemHandler.getStackInSlot(CONTROL_SLOT_4).getDamageValue() + 1);
                controlDurProgress = 0;
            }

            if (fuelDurProgress < fuelDurMaxProgress) {
                if (!itemHandler.getStackInSlot(FUEL_SLOT_1).isEmpty() && !itemHandler.getStackInSlot(FUEL_SLOT_2).isEmpty() &&
                        !itemHandler.getStackInSlot(FUEL_SLOT_3).isEmpty() &&
                        !itemHandler.getStackInSlot(FUEL_SLOT_4).isEmpty() && !itemHandler.getStackInSlot(FUEL_SLOT_5).isEmpty()) {
                    setIsMeltdown(false);
                    fuelDurProgress++;
                } else {
                    setIsMeltdown(true);
                }
            } else if (fuelDurProgress == fuelDurMaxProgress) {
                if (itemHandler.getStackInSlot(FUEL_SLOT_1).getItem() == CCItems.FUEL_ROD.get() && itemHandler.getStackInSlot(FUEL_SLOT_2).getItem() == CCItems.FUEL_ROD.get() &&
                        itemHandler.getStackInSlot(FUEL_SLOT_3).getItem() == CCItems.FUEL_ROD.get() &&
                        itemHandler.getStackInSlot(FUEL_SLOT_4).getItem() == CCItems.FUEL_ROD.get() && itemHandler.getStackInSlot(FUEL_SLOT_5).getItem() == CCItems.FUEL_ROD.get()) {
                    if (itemHandler.getStackInSlot(FUEL_SLOT_1).getDamageValue() == itemHandler.getStackInSlot(FUEL_SLOT_1).getMaxDamage()) {
                        itemHandler.extractItem(FUEL_SLOT_1, 1, false);

                        itemHandler.setStackInSlot(FUEL_SLOT_1, new ItemStack(CCItems.SPENT_FUEL_ROD.get(),
                                itemHandler.getStackInSlot(FUEL_SLOT_1).getCount() + 1));
                    }
                    if (itemHandler.getStackInSlot(FUEL_SLOT_2).getDamageValue() == itemHandler.getStackInSlot(FUEL_SLOT_2).getMaxDamage()) {
                        itemHandler.extractItem(FUEL_SLOT_2, 1, false);

                        itemHandler.setStackInSlot(FUEL_SLOT_2, new ItemStack(CCItems.SPENT_FUEL_ROD.get(),
                                itemHandler.getStackInSlot(FUEL_SLOT_2).getCount() + 1));
                    }
                    if (itemHandler.getStackInSlot(FUEL_SLOT_3).getDamageValue() == itemHandler.getStackInSlot(FUEL_SLOT_3).getMaxDamage()) {
                        if (itemHandler.getStackInSlot(FUEL_SLOT_3).getDamageValue() == itemHandler.getStackInSlot(FUEL_SLOT_3).getMaxDamage()) {
                            itemHandler.extractItem(FUEL_SLOT_3, 1, false);

                            itemHandler.setStackInSlot(FUEL_SLOT_3, new ItemStack(CCItems.SPENT_FUEL_ROD.get(),
                                    itemHandler.getStackInSlot(FUEL_SLOT_3).getCount() + 1));
                        }
                        if (itemHandler.getStackInSlot(FUEL_SLOT_4).getDamageValue() == itemHandler.getStackInSlot(FUEL_SLOT_4).getMaxDamage()) {
                            itemHandler.extractItem(FUEL_SLOT_4, 1, false);

                            itemHandler.setStackInSlot(FUEL_SLOT_4, new ItemStack(CCItems.SPENT_FUEL_ROD.get(),
                                    itemHandler.getStackInSlot(FUEL_SLOT_4).getCount() + 1));
                        }
                        if (itemHandler.getStackInSlot(FUEL_SLOT_5).getDamageValue() == itemHandler.getStackInSlot(FUEL_SLOT_5).getMaxDamage()) {
                            itemHandler.extractItem(FUEL_SLOT_5, 1, false);

                            itemHandler.setStackInSlot(FUEL_SLOT_5, new ItemStack(CCItems.SPENT_FUEL_ROD.get(),
                                    itemHandler.getStackInSlot(FUEL_SLOT_5).getCount() + 1));
                        }

                        itemHandler.getStackInSlot(FUEL_SLOT_1).setDamageValue(itemHandler.getStackInSlot(FUEL_SLOT_1).getDamageValue() + 1);
                        itemHandler.getStackInSlot(FUEL_SLOT_2).setDamageValue(itemHandler.getStackInSlot(FUEL_SLOT_2).getDamageValue() + 1);
                        itemHandler.getStackInSlot(FUEL_SLOT_3).setDamageValue(itemHandler.getStackInSlot(FUEL_SLOT_3).getDamageValue() + 1);
                        itemHandler.getStackInSlot(FUEL_SLOT_4).setDamageValue(itemHandler.getStackInSlot(FUEL_SLOT_4).getDamageValue() + 1);
                        itemHandler.getStackInSlot(FUEL_SLOT_5).setDamageValue(itemHandler.getStackInSlot(FUEL_SLOT_5).getDamageValue() + 1);
                    }
                    fuelDurProgress = 0;
                }
            }
        }

    }
    public void fillFluid(){
        if(hasFluidSourceSlot(FLUID_IN_SLOT)){
            tranceferItemFluidTank(FLUID_IN_SLOT);
        }
    }

    public void tranceferItemFluidTank(int fluidInSlot) {
        this.itemHandler.getStackInSlot(fluidInSlot).getCapability(ForgeCapabilities.FLUID_HANDLER_ITEM).ifPresent(iFluidHandlerItem -> {
            int drainAmount = Math.min(this.FLUID_TANK.getSpace(), 10000);

            FluidStack stack = iFluidHandlerItem.drain(drainAmount, IFluidHandler.FluidAction.SIMULATE);
            if(stack.getFluid() == Fluids.WATER){
                stack = iFluidHandlerItem.drain(drainAmount, IFluidHandler.FluidAction.EXECUTE);
                fillTankWithFluid(stack, iFluidHandlerItem.getContainer());
            }

        });
    }

    public void fillTankWithFluid(FluidStack stack, @NotNull ItemStack container) {
        this.FLUID_TANK.fill(new FluidStack(stack.getFluid(), stack.getAmount()), IFluidHandler.FluidAction.EXECUTE);

        this.itemHandler.extractItem(FLUID_IN_SLOT, 1, false);
        this.itemHandler.insertItem(FLUID_IN_SLOT, container, false);
    }

    public boolean hasFluidSourceSlot(int fluidInSlot) {
        return this.itemHandler.getStackInSlot(fluidInSlot).getCount() > 0 &&
                this.itemHandler.getStackInSlot(fluidInSlot).getCapability(ForgeCapabilities.FLUID_HANDLER_ITEM).isPresent();
    }

    boolean melt;
    public void setIsMeltdown(boolean imMelting){
        melt = imMelting;
    }
    public boolean getMelt(){
        return melt;
    }

    public void isCritical(boolean criticalyMelting){

    }
}
