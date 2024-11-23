package net.aepherastudios.createconquer.screen;

import net.aepherastudios.createconquer.block.ModBlocks;
import net.aepherastudios.createconquer.block.entity.NuclearReactorBlockEntity;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.items.SlotItemHandler;


public class NuclearReactorMenu extends AbstractContainerMenu {
    public final NuclearReactorBlockEntity blockEntity;
    private final Level level;
    private final ContainerData data;


    public NuclearReactorMenu(int pContainerId, Inventory inv, FriendlyByteBuf extraData) {
        this(pContainerId, inv, inv.player.level().getBlockEntity(extraData.readBlockPos()), new SimpleContainerData(10));
    }

    public NuclearReactorMenu(int pContainerId, Inventory inv, BlockEntity entity, ContainerData data) {
        super(ModMenuTypes.NUCLEAR_REACTOR_MENU.get() , pContainerId);
        checkContainerSize(inv, 10);
        blockEntity = ((NuclearReactorBlockEntity) entity);
        this.level = inv.player.level();
        this.data = data;

        addPlayerInventory(inv);
        addPlayerHotbar(inv);

        this.blockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER).ifPresent(iItemHandler -> {
            this.addSlot(new SlotItemHandler(iItemHandler,0,80,11));
            this.addSlot(new SlotItemHandler(iItemHandler,1,80,59));
            this.addSlot(new SlotItemHandler(iItemHandler,2,63,11));
            this.addSlot(new SlotItemHandler(iItemHandler,3,63,59));
            this.addSlot(new SlotItemHandler(iItemHandler,4,46,11));
            this.addSlot(new SlotItemHandler(iItemHandler,5,46,59));
            this.addSlot(new SlotItemHandler(iItemHandler,6,97,11));
            this.addSlot(new SlotItemHandler(iItemHandler,7,97,59));
            this.addSlot(new SlotItemHandler(iItemHandler,8,114,11));
            this.addSlot(new SlotItemHandler(iItemHandler,9,114,59));
        });

        addDataSlots(data);
    }


    @Override
    public ItemStack quickMoveStack(Player player, int i) {
        return null;
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()),
                pPlayer, ModBlocks.NUCLEAR_REACTOR.get());
    }

    private void addPlayerInventory(Inventory playerInv){
        for(int i = 0; i < 3; i++){
            for(int l = 0; l < 9; l++){
                this.addSlot(new Slot(playerInv, l + i * 9 + 9, 8 + l * 18, 84 + i *18));
            }
        }
    }
    private void addPlayerHotbar(Inventory playerInv){
        for(int i = 0; i < 9; i++){
            this.addSlot(new Slot(playerInv, i, 8 + i * 18, 142));
        }
    }
}
