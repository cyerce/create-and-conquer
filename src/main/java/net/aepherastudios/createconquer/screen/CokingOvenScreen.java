package net.aepherastudios.createconquer.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.aepherastudios.createconquer.CreateConquer;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class CokingOvenScreen extends AbstractContainerScreen<CokingOvenMenu> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(CreateConquer.MOD_ID, "textures/gui/coking_oven.png");

    public CokingOvenScreen(CokingOvenMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    protected void init() {
        super.init();
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        guiGraphics.blit(TEXTURE, x, y, 0, 0, imageWidth, imageHeight);

        renderProgressArrow(guiGraphics, x, y);
        this.renderTooltip(guiGraphics, pMouseX, pMouseY);

    }

    private void renderProgressArrow(GuiGraphics guiGraphics, int x, int y) {
        if(menu.isCrafting()) {
            guiGraphics.blit(TEXTURE, x + 79, y + 35, 176, 14, menu.getScaledProgress(), 16);
        }
    }
}