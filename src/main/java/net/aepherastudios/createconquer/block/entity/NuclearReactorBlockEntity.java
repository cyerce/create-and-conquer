package net.aepherastudios.createconquer.block.entity;

import it.unimi.dsi.fastutil.floats.FloatDoubleImmutablePair;
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

    private static final int FUEL_SLOT_1 = 7;
    private static final int FUEL_SLOT_2 = 9;
    private static final int FUEL_SLOT_3 = 1;
    private static final int FUEL_SLOT_4 = 3;
    private static final int FUEL_SLOT_5 = 5;
    private static final int POLONIUM_SLOT = 0;
    private static final int CONTROLE_ROD = 2;

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int fuelDurability;
    private int fuelMaxDurability;
    private int controleRodDurability;
    private int controleRodMaxDurability;
    private int poloniumRodDurablity;
    private int poloniumRodMaxDurability;

    public NuclearReactorBlockEntity(BlockPos pPos, BlockState pBlockState){
        super(ModBlockEntities.NUCLEAR_REACTOR_BE.get(), pPos, pBlockState);
        this.data = new ContainerData(){
            @Override
            public int get(int pIndex){
                return switch (pIndex){
                    case 0 -> NuclearReactorBlockEntity.this.fuelDurability;
                    case 1 -> NuclearReactorBlockEntity.this.fuelMaxDurability;
                    case 2 -> NuclearReactorBlockEntity.this.controleRodDurability;
                    case 3 -> NuclearReactorBlockEntity.this.controleRodMaxDurability;
                    case 4 -> NuclearReactorBlockEntity.this.poloniumRodDurablity;
                    case 5 -> NuclearReactorBlockEntity.this.poloniumRodMaxDurability;
                    default -> 0;
                };
            }
            @Override
            public void set(int pIndex, int pValue){
                switch (pIndex){
                    case 0 -> NuclearReactorBlockEntity.this.fuelDurability = pValue;
                    case 1 -> NuclearReactorBlockEntity.this.fuelMaxDurability = pValue;
                    case 2 -> NuclearReactorBlockEntity.this.controleRodDurability = pValue;
                    case 3 -> NuclearReactorBlockEntity.this.controleRodMaxDurability = pValue;
                    case 4 -> NuclearReactorBlockEntity.this.poloniumRodDurablity = pValue;
                    case 5 -> NuclearReactorBlockEntity.this.poloniumRodMaxDurability = pValue;
                }
            }

            @Override
            public int getCount(){
                return 10;
            }
        };
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side){
        if(cap == ForgeCapabilities.ITEM_HANDLER){
            return lazyItemHandler.cast();
        }

        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad(){
        super.onLoad();
        lazyItemHandler = LazyOptional.of(
                () -> itemHanler);
    }

    @Override
    public void invalidateCaps(){
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    @Override
    public Component getDisplayName(){
        return Component.translatable("block.createconquer.nuclear_reactor");
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        pTag.put("inventory", itemHanler.serializeNBT());

        super.saveAdditional(pTag);
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
        return new NuclearReactorMenu(pContainerId, pPlayerInventory, this, this.data);
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
            tickDownPoloniumRod();
        }
    }

    private void tickDownFuel(){

    }

    private void tickDownRods(){

    }
    private void tickDownPoloniumRod(){

    }

    private boolean ReactorOn(){

        return false;
    }
}
