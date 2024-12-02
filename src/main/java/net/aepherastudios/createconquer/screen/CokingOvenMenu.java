package net.aepherastudios.createconquer.screen;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.FurnaceMenu;

public class CokingOvenMenu extends FurnaceMenu {
    public CokingOvenMenu(int pContainerId, Inventory pPlayerInventory) {
        super(pContainerId, pPlayerInventory);
    }

    public CokingOvenMenu(int pContainerId, Inventory pPlayerInventory, Container pFurnaceContainer, ContainerData pFurnaceData) {
        super(pContainerId, pPlayerInventory, pFurnaceContainer, pFurnaceData);
    }
}
