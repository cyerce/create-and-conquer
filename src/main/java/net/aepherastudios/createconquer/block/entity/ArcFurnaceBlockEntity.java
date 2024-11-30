package net.aepherastudios.createconquer.block.entity;

import net.aepherastudios.createconquer.block.CCBlocks;
import net.aepherastudios.createconquer.item.CCItems;
import net.aepherastudios.createconquer.screen.ArcFurnaceMenu;
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
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ArcFurnaceBlockEntity extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(6){
        @Override
        protected void onContentsChanged(int slot){
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, ItemStack stack){
            return switch(slot) {
                case 0 -> stack.getItem() == CCItems.LEAD_POWDER.get();
                default -> super.isItemValid(slot, stack);
            };
        }
    };

    public static final int SLOT1 = 0;
    public static final int SLOT2 = 1;
    public static final int SLOT3 = 2;
    public static final int SLOT4 = 3;
    public static final int SLOT5 = 4;
    public static final int SLOT6 = 6;

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected ContainerData data;
    private int progress;
    private int maxProgress = 78;


    public ArcFurnaceBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(CCBlockEntities.ARC_FURNACE_BE.get(), pPos, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int i) {
                return switch (i){
                    case 0 -> ArcFurnaceBlockEntity.this.progress;
                    case 1 -> ArcFurnaceBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int i, int i1) {
                switch (i){
                    case 0 -> ArcFurnaceBlockEntity.this.progress = i1;
                    case 1 -> ArcFurnaceBlockEntity.this.maxProgress = i1;
                }
            }

            @Override
            public int getCount() {
                return 2;
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
        return Component.literal("Arc Furnace");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
        return new ArcFurnaceMenu(pContainerId, pPlayerInventory, this, this.data);
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
