package com.github.alexmodguy.alexscaves.client.render.entity;

import com.github.alexmodguy.alexscaves.client.model.DeepOneModel;
import com.github.alexmodguy.alexscaves.client.render.ACRenderTypes;
import com.github.alexmodguy.alexscaves.server.entity.living.DeepOneEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;

public class DeepOneRenderer extends MobRenderer<DeepOneEntity, DeepOneModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("alexscaves:textures/entity/deep_one/deep_one.png");
    private static final ResourceLocation TEXTURE_GLOW = new ResourceLocation("alexscaves:textures/entity/deep_one/deep_one_glow.png");

    public DeepOneRenderer(EntityRendererProvider.Context renderManagerIn) {
        super(renderManagerIn, new DeepOneModel(), 0.45F);
        this.addLayer(new LayerGlow());
        this.addLayer(new ItemInHandLayer<>(this, renderManagerIn.getItemInHandRenderer()));
    }

    public ResourceLocation getTextureLocation(DeepOneEntity entity) {
        return TEXTURE;
    }

    class LayerGlow extends RenderLayer<DeepOneEntity, DeepOneModel> {

        public LayerGlow() {
            super(DeepOneRenderer.this);
        }

        public void render(PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn, DeepOneEntity entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            if(!entitylivingbaseIn.isInvisible()){
                VertexConsumer ivertexbuilder = bufferIn.getBuffer(ACRenderTypes.getGhostly(TEXTURE_GLOW));
                float alpha = 1.0F;
                this.getParentModel().renderToBuffer(matrixStackIn, ivertexbuilder, 240, LivingEntityRenderer.getOverlayCoords(entitylivingbaseIn, 0.0F), 1.0F, 1.0F, 1.0F, alpha);
            }
        }
    }
}

