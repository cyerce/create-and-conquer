package net.aepherastudios.createconquer.block.entity;

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
                case 5, 6 -> stack.getCapability(ForgeCapabilities.FLUID_HANDLER_ITEM).isPresent();
                case 7, 8, 9, 10, 11 -> stack.getItem() == CCItems.FUEL_ROD.get();
                default -> super.isItemValid(slot, stack);
            };
        }
    };

    private static final int CONTROL_SLOT = 0;
    private static final int CONTROL_SLOT_2 = 1;
    private static final int POLONIUM_SLOT = 2;
    private static final int CONTROL_SLOT_3 = 3;
    private static final int CONTROL_SLOT_4 = 4;
    private static final int FLUID_IN_SLOT = 5;
    private static final int FLUID_OUT_SLOT = 6;
    private static final int FUEL1_SLOT = 7;
    private static final int FUEL2_SLOT = 8;
    private static final int FUEL3_SLOT = 9;
    private static final int FUEl4_SLOT = 10;
    private static final int FUEl5_SLOT = 11;

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
            public boolean isFluidValid(FluidStack stack) {
                return stack.getFluid() == Fluids.WATER;
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

    public void tick(Level level, BlockPos pPos, BlockState pState){
        fillFluid();

        if(itemHandler.getStackInSlot(2).getItem() == CCItems.POLONIUM_ROD.get()) {
            if (controlDurProgress < controlDurMaxProgress) {
                if (!itemHandler.getStackInSlot(0).isEmpty() && !itemHandler.getStackInSlot(1).isEmpty() &&
                        !itemHandler.getStackInSlot(3).isEmpty() && !itemHandler.getStackInSlot(4).isEmpty()) {
                    setIsMeltdown(false);
                    controlDurProgress++;
                }else {
                    setIsMeltdown(true);
                }
            } else if (controlDurProgress == controlDurMaxProgress) {
                if(itemHandler.getStackInSlot(0).getDamageValue() >= itemHandler.getStackInSlot(0).getMaxDamage()){
                    itemHandler.extractItem(0, 1, false);
                }
                if(itemHandler.getStackInSlot(1).getDamageValue() >= itemHandler.getStackInSlot(1).getMaxDamage()){
                    itemHandler.extractItem(1, 1, false);
                }
                if(itemHandler.getStackInSlot(3).getDamageValue() >= itemHandler.getStackInSlot(3).getMaxDamage()){
                    itemHandler.extractItem(3, 1, false);
                }
                if(itemHandler.getStackInSlot(4).getDamageValue() >= itemHandler.getStackInSlot(4).getMaxDamage()){
                    itemHandler.extractItem(4, 1, false);
                }
                itemHandler.getStackInSlot(0).setDamageValue(itemHandler.getStackInSlot(0).getDamageValue() + 100);
                itemHandler.getStackInSlot(1).setDamageValue(itemHandler.getStackInSlot(1).getDamageValue() + 100);
                itemHandler.getStackInSlot(3).setDamageValue(itemHandler.getStackInSlot(3).getDamageValue() + 100);
                itemHandler.getStackInSlot(4).setDamageValue(itemHandler.getStackInSlot(4).getDamageValue() + 100);
                controlDurProgress = 0;
            }

            if (fuelDurProgress < fuelDurMaxProgress) {
                if (!itemHandler.getStackInSlot(7).isEmpty() && !itemHandler.getStackInSlot(8).isEmpty() &&
                        !itemHandler.getStackInSlot(9).isEmpty() &&
                        !itemHandler.getStackInSlot(10).isEmpty() && !itemHandler.getStackInSlot(11).isEmpty()) {
                    setIsMeltdown(false);
                    fuelDurProgress++;
                }else{
                    setIsMeltdown(true);
                }
            } else if (fuelDurProgress == fuelDurMaxProgress) {
                if(itemHandler.getStackInSlot(7).getItem() == CCItems.FUEL_ROD.get() && itemHandler.getStackInSlot(8).getItem() == CCItems.FUEL_ROD.get() &&
                        itemHandler.getStackInSlot(9).getItem() == CCItems.FUEL_ROD.get() &&
                        itemHandler.getStackInSlot(10).getItem() == CCItems.FUEL_ROD.get() && itemHandler.getStackInSlot(11).getItem() == CCItems.FUEL_ROD.get()) {
                    if(itemHandler.getStackInSlot(7).getDamageValue() == itemHandler.getStackInSlot(7).getMaxDamage()){
                        itemHandler.extractItem(7, 1, false);
                        itemHandler.insertItem(7, new ItemStack(CCItems.SPENT_FUEL_ROD.get(), 1), false);
                    }
                    if(itemHandler.getStackInSlot(8).getDamageValue() == itemHandler.getStackInSlot(8).getMaxDamage()){
                        itemHandler.extractItem(8, 1, false);
                        itemHandler.insertItem(8, new ItemStack(CCItems.SPENT_FUEL_ROD.get(), 1), false);
                    }
                    if(itemHandler.getStackInSlot(9).getDamageValue() == itemHandler.getStackInSlot(9).getMaxDamage()){
                        itemHandler.extractItem(9, 1, false);
                        itemHandler.insertItem(9, new ItemStack(CCItems.SPENT_FUEL_ROD.get(), 1), false);
                    }
                    if(itemHandler.getStackInSlot(10).getDamageValue() == itemHandler.getStackInSlot(10).getMaxDamage()){
                        itemHandler.extractItem(10, 1, false);
                        itemHandler.insertItem(10, new ItemStack(CCItems.SPENT_FUEL_ROD.get(), 1), false);
                    }
                    if(itemHandler.getStackInSlot(11).getDamageValue() == itemHandler.getStackInSlot(11).getMaxDamage()){
                        itemHandler.extractItem(11, 1, false);
                        itemHandler.insertItem(11, new ItemStack(CCItems.SPENT_FUEL_ROD.get(), 1), false);
                    }

                    itemHandler.getStackInSlot(7).setDamageValue(itemHandler.getStackInSlot(7).getDamageValue() + 100);
                    itemHandler.getStackInSlot(8).setDamageValue(itemHandler.getStackInSlot(8).getDamageValue() + 100);
                    itemHandler.getStackInSlot(9).setDamageValue(itemHandler.getStackInSlot(9).getDamageValue() + 100);
                    itemHandler.getStackInSlot(10).setDamageValue(itemHandler.getStackInSlot(10).getDamageValue() + 100);
                    itemHandler.getStackInSlot(11).setDamageValue(itemHandler.getStackInSlot(11).getDamageValue() + 100);
                }
                fuelDurProgress = 0;
            }
        }
    }

    public void fillFluid(){
        if(hasFluidSourceSlot(FLUID_IN_SLOT)){
            tranceferItemFluidTank(FLUID_IN_SLOT);
        }
    }

    private void tranceferItemFluidTank(int fluidInSlot) {
        this.itemHandler.getStackInSlot(fluidInSlot).getCapability(ForgeCapabilities.FLUID_HANDLER_ITEM).ifPresent(iFluidHandlerItem -> {
            int drainAmount = Math.min(this.FLUID_TANK.getSpace(), 10000);

            FluidStack stack = iFluidHandlerItem.drain(drainAmount, IFluidHandler.FluidAction.SIMULATE);
            if(stack.getFluid() == Fluids.WATER){
                stack = iFluidHandlerItem.drain(drainAmount, IFluidHandler.FluidAction.EXECUTE);
                fillTankWithFluid(stack, iFluidHandlerItem.getContainer());
            }

        });
    }

    private void fillTankWithFluid(FluidStack stack, @NotNull ItemStack container) {
        this.FLUID_TANK.fill(new FluidStack(stack.getFluid(), stack.getAmount()), IFluidHandler.FluidAction.EXECUTE);

        this.itemHandler.extractItem(FLUID_IN_SLOT, 1, false);
        this.itemHandler.insertItem(FLUID_IN_SLOT, container, false);
    }

    private boolean hasFluidSourceSlot(int fluidInSlot) {
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
