package net.aepherastudios.createconquer.block.entity;

import it.unimi.dsi.fastutil.floats.FloatDoubleImmutablePair;
import net.aepherastudios.createconquer.item.ModItems;
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
import net.minecraft.world.inventory.SimpleContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
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
        public boolean isItemValid(int slot, @NotNull ItemStack stack) {
            return switch(slot){
                case 0 -> stack.getItem() == ModItems.BORON_ROD.get();
                case 1 -> stack.getItem() == ModItems.BORON_ROD.get();
                case 2 -> stack.getItem() == ModItems.POLONIUM_ROD.get();
                case 3 -> stack.getItem() == ModItems.BORON_ROD.get();
                case 4 -> stack.getItem() == ModItems.BORON_ROD.get();
                case 5 -> true;
                case 6 -> false;
                case 7 -> stack.getItem() == ModItems.FUEL_ROD.get();
                case 8 -> stack.getItem() == ModItems.FUEL_ROD.get();
                case 9 -> stack.getItem() == ModItems.FUEL_ROD.get();
                case 10 -> stack.getItem() == ModItems.FUEL_ROD.get();
                case 11 -> stack.getItem() == ModItems.FUEL_ROD.get();
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

    protected final ContainerData data;
    private int fuelDurProgress = 0;
    private int fuelDurMaxProgress;
    private int poloniumDurProgress = 0;
    private int poloniumDurMaxProgress;
    private int controlDurProgress = 0;
    private int controlDurMaxProgress;

    public NuclearReactorBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.NUCLEAR_REACTOR_BE.get(), pPos, pBlockState);
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
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        pTag.put("inventory", itemHandler.serializeNBT());

        super.saveAdditional(pTag);
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);

        itemHandler.deserializeNBT(pTag.getCompound("inventory"));
    }

    public void tick(Level level, BlockPos pPos, BlockState pState){

    }


}
