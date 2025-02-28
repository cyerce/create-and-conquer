package net.aepherastudios.createconquer.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.aepherastudios.createconquer.block.CCBlocks;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.TntMinecartRenderer;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.level.block.Blocks;

public class PrimedHighExplosiveRenderer extends EntityRenderer<PrimedTnt> {
    private final BlockRenderDispatcher blockRenderer;

    public PrimedHighExplosiveRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
        this.shadowRadius = 0.5F;
        this.blockRenderer = pContext.getBlockRenderDispatcher();
    }

    public void render(PrimedTnt pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        pMatrixStack.pushPose();
        pMatrixStack.translate(0.0F, 0.5F, 0.0F);
        int i = pEntity.getFuse();
        if ((float)i - pPartialTicks + 1.0F < 10.0F) {
            float f = 1.0F - ((float)i - pPartialTicks + 1.0F) / 10.0F;
            f = Mth.clamp(f, 0.0F, 1.0F);
            f *= f;
            f *= f;
            float f1 = 1.0F + f * 0.3F;
            pMatrixStack.scale(f1, f1, f1);
        }

        pMatrixStack.mulPose(Axis.YP.rotationDegrees(-90.0F));
        pMatrixStack.translate(-0.5F, -0.5F, 0.5F);
        pMatrixStack.mulPose(Axis.YP.rotationDegrees(90.0F));
        TntMinecartRenderer.renderWhiteSolidBlock(this.blockRenderer, CCBlocks.HIGH_POWER_EXPLOSIVE.get().defaultBlockState(), pMatrixStack, pBuffer, pPackedLight, i / 5 % 2 == 0);
        pMatrixStack.popPose();
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }


    public ResourceLocation getTextureLocation(PrimedTnt pEntity) {
        return TextureAtlas.LOCATION_BLOCKS;
    }
}
