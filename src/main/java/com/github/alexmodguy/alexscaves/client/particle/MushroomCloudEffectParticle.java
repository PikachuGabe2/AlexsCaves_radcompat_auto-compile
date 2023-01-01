package com.github.alexmodguy.alexscaves.client.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.FastColor;

public class MushroomCloudEffectParticle extends TextureSheetParticle {

    private final SpriteSet sprites;

    protected MushroomCloudEffectParticle(ClientLevel world, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed, SpriteSet sprites) {
        super(world, x, y, z, xSpeed, ySpeed, zSpeed);
        this.xd = xSpeed;
        this.yd = ySpeed;
        this.zd = zSpeed;
        this.setSize(0.5F, 0.5F);
        this.quadSize = 0.8F + world.random.nextFloat() * 0.3F;
        this.lifetime = 15 + world.random.nextInt(10);
        this.friction = 0.96F;
        float randCol = world.random.nextFloat() * 0.05F;
        this.sprites = sprites;
        int color1 = 0XFFB300;
        this.setColor(Math.min(FastColor.ARGB32.red(color1) / 255F + randCol, 1), FastColor.ARGB32.green(color1) / 255F + randCol, FastColor.ARGB32.blue(color1) / 255F + randCol);
    }

    public void tick() {
        this.xo = this.x;
        this.yo = this.y;
        this.zo = this.z;
        this.setSpriteFromAge(this.sprites);
        if (this.age++ >= this.lifetime) {
            this.remove();
        } else {
            this.rCol = this.rCol * 0.95F;
            this.gCol = this.gCol * 0.95F;
            this.bCol = this.bCol * 0.95F;
            this.move(this.xd, this.yd, this.zd);
            this.xd *= (double) this.friction;
            this.yd *= (double) this.friction;
            this.zd *= (double) this.friction;
        }
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_LIT;
    }

    public float getQuadSize(float scaleFactor) {
        return super.getQuadSize(scaleFactor);
    }

    public int getLightColor(float partialTicks) {
        return 240;
    }

    public static class Factory implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public Factory(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }

        public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            MushroomCloudEffectParticle particle = new MushroomCloudEffectParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, spriteSet);
            particle.setSpriteFromAge(spriteSet);
            return particle;
        }
    }
}
