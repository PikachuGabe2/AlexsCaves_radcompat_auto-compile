package com.github.alexmodguy.alexscaves.client.beta;

import com.github.alexmodguy.alexscaves.server.misc.ACPlayerCapes;
import com.github.alexthe666.citadel.client.texture.CitadelTextureManager;
import com.github.alexthe666.citadel.client.texture.VideoFrameTexture;
import com.github.alexthe666.citadel.client.video.Video;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.VertexFormat;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

import java.util.UUID;

public class UserVerification extends Screen {

    private static boolean passed = false;
    public static final String THE_KING_URL = "https://raw.githubusercontent.com/tojrobinson/jurassicsystems.com/master/static/vid/theKing.mp4";
    private static final ResourceLocation THE_KING = new ResourceLocation("alexscaves:the_king.mp4");
    private static Video theKingVideo = null;

    protected UserVerification() {
        super(Component.literal("Uh Uh Uh..."));
    }

    public static void onGameStart()  {
        if (!passed) {
            UUID userUUID = Minecraft.getInstance().getUser().getProfileId();
            if (ACPlayerCapes.getAll().contains(userUUID)) {
                passed = true;
            } else {
                if (!(Minecraft.getInstance().screen instanceof UserVerification)) {
                    Minecraft.getInstance().setScreen(new UserVerification());
                }
            }
        }
    }

    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
        if (theKingVideo == null) {
            VideoFrameTexture videoFrameTexture = CitadelTextureManager.getVideoTexture(THE_KING, 480, 480);
            theKingVideo = new Video(THE_KING_URL, THE_KING, videoFrameTexture, 10, false);
            theKingVideo.setRepeat(true);
        } else {
            theKingVideo.setPaused(false);
            int screenHeight = this.height;
            int screenWidth = this.width;
            theKingVideo.update();
            RenderSystem.setShader(GameRenderer::getPositionTexShader);
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            RenderSystem.setShaderTexture(0, THE_KING);
            Tesselator tesselator = Tesselator.getInstance();
            BufferBuilder bufferbuilder = tesselator.getBuilder();
            bufferbuilder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX);
            bufferbuilder.vertex(0.0D, screenHeight, 50.0D).uv(0.0F, 1.0F).endVertex();
            bufferbuilder.vertex(screenWidth, screenHeight, 50.0D).uv(1.0F, 1.0F).endVertex();
            bufferbuilder.vertex(screenWidth, 0.0D, 50.0D).uv(1.0F, 0.0F).endVertex();
            bufferbuilder.vertex(0.0D, 0.0D, 50.0D).uv(0.0F, 0.0F).endVertex();
            tesselator.end();
        }
    }
}