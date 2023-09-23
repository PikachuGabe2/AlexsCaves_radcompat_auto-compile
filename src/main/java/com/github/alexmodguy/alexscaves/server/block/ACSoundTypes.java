package com.github.alexmodguy.alexscaves.server.block;

import com.github.alexmodguy.alexscaves.server.misc.ACSoundRegistry;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.common.util.ForgeSoundType;

public class ACSoundTypes {

    public static final SoundType NEODYMIUM = new ForgeSoundType(1.0F, 1.0F, () -> ACSoundRegistry.NEODYMIUM_BREAK.get(), () -> ACSoundRegistry.NEODYMIUM_STEP.get(), () -> ACSoundRegistry.NEODYMIUM_PLACE.get(), () -> ACSoundRegistry.NEODYMIUM_BREAKING.get(), () -> ACSoundRegistry.NEODYMIUM_STEP.get());
    public static final SoundType METAL_SWARF = new ForgeSoundType(1.0F, 1.0F, () -> ACSoundRegistry.METAL_SWARF_BREAK.get(), () -> ACSoundRegistry.METAL_SWARF_STEP.get(), () -> ACSoundRegistry.METAL_SWARF_PLACE.get(), () -> ACSoundRegistry.METAL_SWARF_BREAKING.get(), () -> ACSoundRegistry.METAL_SWARF_STEP.get());
    public static final SoundType SCRAP_METAL = new ForgeSoundType(1.0F, 1.0F, () -> ACSoundRegistry.SCRAP_METAL_BREAK.get(), () -> ACSoundRegistry.SCRAP_METAL_STEP.get(), () -> ACSoundRegistry.SCRAP_METAL_PLACE.get(), () -> ACSoundRegistry.SCRAP_METAL_BREAKING.get(), () -> ACSoundRegistry.SCRAP_METAL_STEP.get());
    public static final SoundType METAL_SCAFFOLDING = new ForgeSoundType(1.0F, 1.0F, () -> ACSoundRegistry.SCRAP_METAL_BREAK.get(), () -> ACSoundRegistry.METAL_SCAFFOLDING_CLIMB.get(), () -> ACSoundRegistry.SCRAP_METAL_PLACE.get(), () -> ACSoundRegistry.SCRAP_METAL_BREAKING.get(), () -> ACSoundRegistry.METAL_SCAFFOLDING_CLIMB.get());
    public static final SoundType AMBER = new ForgeSoundType(1.0F, 1.0F, () -> ACSoundRegistry.AMBER_BREAK.get(), () -> ACSoundRegistry.AMBER_STEP.get(), () -> ACSoundRegistry.AMBER_PLACE.get(), () -> ACSoundRegistry.AMBER_BREAKING.get(), () -> ACSoundRegistry.AMBER_STEP.get());
    public static final SoundType AMBER_MONOLITH = new ForgeSoundType(1.0F, 1.0F, () -> ACSoundRegistry.AMBER_BREAK.get(), () -> ACSoundRegistry.AMBER_STEP.get(), () -> ACSoundRegistry.AMBER_MONOLITH_PLACE.get(), () -> ACSoundRegistry.AMBER_BREAKING.get(), () -> ACSoundRegistry.AMBER_STEP.get());
    public static final SoundType PEWEN_BRANCH = new ForgeSoundType(1.0F, 1.0F, () -> ACSoundRegistry.PEWEN_BRANCH_BREAK.get(), () -> SoundEvents.CHERRY_WOOD_STEP, () -> SoundEvents.CHERRY_WOOD_PLACE, () -> SoundEvents.CHERRY_WOOD_HIT, () -> SoundEvents.CHERRY_WOOD_FALL);
    public static final SoundType RADROCK = new ForgeSoundType(1.0F, 1.0F, () -> ACSoundRegistry.RADROCK_BREAK.get(), () -> ACSoundRegistry.RADROCK_STEP.get(), () -> ACSoundRegistry.RADROCK_PLACE.get(), () -> ACSoundRegistry.RADROCK_BREAKING.get(), () -> ACSoundRegistry.RADROCK_STEP.get());
    public static final SoundType SULFUR = new ForgeSoundType(1.0F, 1.0F, () -> ACSoundRegistry.SULFUR_BREAK.get(), () -> ACSoundRegistry.SULFUR_STEP.get(), () -> ACSoundRegistry.SULFUR_PLACE.get(), () -> ACSoundRegistry.SULFUR_BREAKING.get(), () -> ACSoundRegistry.SULFUR_STEP.get());
    public static final SoundType URANIUM = new ForgeSoundType(1.0F, 1.0F, () -> ACSoundRegistry.URANIUM_BREAK.get(), () -> ACSoundRegistry.URANIUM_STEP.get(), () -> ACSoundRegistry.URANIUM_PLACE.get(), () -> ACSoundRegistry.URANIUM_BREAKING.get(), () -> ACSoundRegistry.URANIUM_STEP.get());
    public static final SoundType HAZMAT_BLOCK = new ForgeSoundType(1.0F, 1.0F, () -> ACSoundRegistry.HAZMAT_BLOCK_BREAK.get(), () -> ACSoundRegistry.HAZMAT_BLOCK_STEP.get(), () -> ACSoundRegistry.HAZMAT_BLOCK_PLACE.get(), () -> ACSoundRegistry.HAZMAT_BLOCK_BREAKING.get(), () -> ACSoundRegistry.HAZMAT_BLOCK_STEP.get());
    public static final SoundType CINDER_BLOCK = new ForgeSoundType(1.0F, 1.0F, () -> ACSoundRegistry.CINDER_BLOCK_BREAK.get(), () -> ACSoundRegistry.CINDER_BLOCK_STEP.get(), () -> ACSoundRegistry.CINDER_BLOCK_PLACE.get(), () -> ACSoundRegistry.CINDER_BLOCK_BREAKING.get(), () -> ACSoundRegistry.CINDER_BLOCK_STEP.get());
    public static final SoundType UNREFINED_WASTE = new ForgeSoundType(1.0F, 1.0F, () -> ACSoundRegistry.UNREFINED_WASTE_BREAK.get(), () -> ACSoundRegistry.UNREFINED_WASTE_STEP.get(), () -> ACSoundRegistry.UNREFINED_WASTE_PLACE.get(), () -> ACSoundRegistry.UNREFINED_WASTE_BREAKING.get(), () -> ACSoundRegistry.UNREFINED_WASTE_STEP.get());
    public static final SoundType NUCLEAR_BOMB = new ForgeSoundType(1.0F, 1.0F, () -> ACSoundRegistry.NUCLEAR_BOMB_BREAK.get(), () -> ACSoundRegistry.NUCLEAR_BOMB_STEP.get(), () -> ACSoundRegistry.NUCLEAR_BOMB_PLACE.get(), () -> ACSoundRegistry.NUCLEAR_BOMB_BREAKING.get(), () -> ACSoundRegistry.NUCLEAR_BOMB_STEP.get());
    public static final SoundType THORNWOOD_BRANCH = new ForgeSoundType(1.0F, 1.0F, () -> ACSoundRegistry.THORNWOOD_BRANCH_BREAK.get(), () -> SoundEvents.MANGROVE_ROOTS_STEP, () -> SoundEvents.MANGROVE_ROOTS_PLACE, () -> SoundEvents.MANGROVE_ROOTS_HIT, () -> SoundEvents.MANGROVE_ROOTS_FALL);
    public static final SoundType PEERING_COPROLITH = new ForgeSoundType(1.0F, 1.0F, () -> ACSoundRegistry.PEERING_COPROLITH_BREAK.get(), () -> ACSoundRegistry.PEERING_COPROLITH_STEP.get(), () -> ACSoundRegistry.PEERING_COPROLITH_PLACE.get(), () -> ACSoundRegistry.PEERING_COPROLITH_BREAKING.get(), () -> ACSoundRegistry.PEERING_COPROLITH_STEP.get());
    public static final SoundType MOTH_BALL = new ForgeSoundType(1.0F, 1.0F, () -> ACSoundRegistry.MOTH_BALL_PLACE.get(), () -> SoundEvents.WOOL_STEP, () -> ACSoundRegistry.MOTH_BALL_PLACE.get(), () -> SoundEvents.WOOL_HIT, () -> SoundEvents.WOOL_STEP);
    public static final SoundType BEHOLDER = new ForgeSoundType(1.0F, 1.0F, () -> ACSoundRegistry.BEHOLDER_BREAK.get(), () -> ACSoundRegistry.BEHOLDER_STEP.get(), () -> ACSoundRegistry.BEHOLDER_PLACE.get(), () -> ACSoundRegistry.BEHOLDER_BREAKING.get(), () -> ACSoundRegistry.BEHOLDER_STEP.get());

}
