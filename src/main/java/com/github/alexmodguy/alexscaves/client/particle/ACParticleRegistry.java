package com.github.alexmodguy.alexscaves.client.particle;

import com.github.alexmodguy.alexscaves.AlexsCaves;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ACParticleRegistry {
    public static final DeferredRegister<ParticleType<?>> DEF_REG = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, AlexsCaves.MODID);

    public static final RegistryObject<SimpleParticleType> SCARLET_MAGNETIC_ORBIT = DEF_REG.register("scarlet_magnetic_orbit", ()-> new SimpleParticleType(false));
    public static final RegistryObject<SimpleParticleType> AZURE_MAGNETIC_ORBIT = DEF_REG.register("azure_magnetic_orbit", ()-> new SimpleParticleType(false));

    public static final RegistryObject<SimpleParticleType> SCARLET_MAGNETIC_FLOW = DEF_REG.register("scarlet_magnetic_flow", ()-> new SimpleParticleType(false));
    public static final RegistryObject<SimpleParticleType> AZURE_MAGNETIC_FLOW = DEF_REG.register("azure_magnetic_flow", ()-> new SimpleParticleType(false));
    public static final RegistryObject<SimpleParticleType> GALENA_DEBRIS = DEF_REG.register("galena_debris", ()-> new SimpleParticleType(false));
    public static final RegistryObject<SimpleParticleType> FERROUSLIME = DEF_REG.register("ferrouslime", ()-> new SimpleParticleType(false));
    public static final RegistryObject<SimpleParticleType> FLY = DEF_REG.register("fly", ()-> new SimpleParticleType(false));
    public static final RegistryObject<SimpleParticleType> WATER_TREMOR = DEF_REG.register("water_tremor", ()-> new SimpleParticleType(false));
    public static final RegistryObject<SimpleParticleType> ACID_BUBBLE = DEF_REG.register("acid_bubble", ()-> new SimpleParticleType(false));
    public static final RegistryObject<SimpleParticleType> BLACK_VENT_SMOKE = DEF_REG.register("black_vent_smoke", ()-> new SimpleParticleType(false));
    public static final RegistryObject<SimpleParticleType> WHITE_VENT_SMOKE = DEF_REG.register("white_vent_smoke", ()-> new SimpleParticleType(false));
    public static final RegistryObject<SimpleParticleType> GREEN_VENT_SMOKE = DEF_REG.register("green_vent_smoke", ()-> new SimpleParticleType(false));
    public static final RegistryObject<SimpleParticleType> MUSHROOM_CLOUD = DEF_REG.register("mushroom_cloud", ()-> new SimpleParticleType(false));
    public static final RegistryObject<SimpleParticleType> MUSHROOM_CLOUD_SMOKE = DEF_REG.register("mushroom_cloud_smoke", ()-> new SimpleParticleType(false));
    public static final RegistryObject<SimpleParticleType> MUSHROOM_CLOUD_EXPLOSION = DEF_REG.register("mushroom_cloud_explosion", ()-> new SimpleParticleType(false));
    public static final RegistryObject<SimpleParticleType> NUCLEAR_BOMB = DEF_REG.register("nuclear_bomb", ()-> new SimpleParticleType(false));

}
