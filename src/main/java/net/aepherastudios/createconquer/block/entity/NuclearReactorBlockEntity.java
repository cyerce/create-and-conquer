package net.aepherastudios.createconquer.block.entity;

import it.unimi.dsi.fastutil.floats.FloatDoubleImmutablePair;
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

    private final ItemStackHandler itemHanler = new ItemStackHandler(10);



    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();



    public NuclearReactorBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.NUCLEAR_REACTOR_BE.get(), pPos, pBlockState);
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
        lazyItemHandler = LazyOptional.of(
                () -> itemHanler);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("block.createconquer.nuclear_reactor");
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        pTag.put("inventory", itemHanler.serializeNBT());

        super.saveAdditional(pTag);
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int i, Inventory inventory, Player player) {
        return null;
    }

    @Override
    public void load(CompoundTag pTag){
        super.load(pTag);
        itemHanler.deserializeNBT(pTag.getCompound("inventory"));
    }

    public void drops() {
        SimpleContainer invintory = new SimpleContainer(itemHanler.getSlots());
        for(int i = 0; i < itemHanler.getSlots(); i++){
            invintory.setItem(i, itemHanler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, invintory);
    }

    public void tick(Level pLevel, BlockPos pPos, BlockState pState) {
        if(ReactorOn()){
            tickDownRods();
            tickDownFuel();
        }
    }

    private void tickDownFuel() {

    }

    private void tickDownRods() {

    }

    private boolean ReactorOn() {

        return false;
    }
}
