package corgiaoc.byg.common.world.biome.nether;

import corgiaoc.byg.common.world.biome.BYGDefaultBiomeFeatures;
import corgiaoc.byg.common.world.biome.BYGNetherBiome;
import corgiaoc.byg.common.world.biome.BiomeUtil;
import corgiaoc.byg.core.world.BYGSurfaceBuilders;
import corgiaoc.byg.core.world.util.WorldGenRegistrationHelper;
import net.minecraft.client.audio.BackgroundMusicTracks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.carver.ConfiguredCarvers;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;

public class WailingGarth extends BYGNetherBiome {
    static final ConfiguredSurfaceBuilder SURFACE_BUILDER = WorldGenRegistrationHelper.createConfiguredSurfaceBuilder("wailing_garth", new ConfiguredSurfaceBuilder<>(BYGSurfaceBuilders.WAILING_GARTH, BYGSurfaceBuilders.Configs.SOULSAND));
    static final Biome.RainType PRECIPATATION = Biome.RainType.NONE;
    static final Biome.Category CATEGORY = Biome.Category.NETHER;
    static final float DEPTH = 0.125F;
    static final float SCALE = 0.05F;
    static final float TEMPERATURE = 0.8F;
    static final float DOWNFALL = 0.4F;
    static final int WATER_COLOR = 4159204;
    static final int WATER_FOG_COLOR = 329011;
    static final int GRASS_COLOR = 5849791;
    static final int FOLIAGE_COLOR = 5849791;

    static final Biome.Climate WEATHER = new Biome.Climate(PRECIPATATION, TEMPERATURE, Biome.TemperatureModifier.NONE, DOWNFALL);
    static final MobSpawnInfo.Builder SPAWN_SETTINGS = new MobSpawnInfo.Builder();
    static final BiomeGenerationSettings.Builder GENERATION_SETTINGS = (new BiomeGenerationSettings.Builder()).surfaceBuilder(SURFACE_BUILDER);

    public WailingGarth() {
        super(WEATHER, CATEGORY, DEPTH, SCALE, (new BiomeAmbience.Builder()).waterColor(WATER_COLOR).waterFogColor(WATER_FOG_COLOR)
                .grassColorOverride(GRASS_COLOR)
                .foliageColorOverride(FOLIAGE_COLOR)
                .fogColor(4529794)
                .skyColor(BiomeUtil.calcSkyColor(2.0F))
                .ambientParticle(new ParticleEffectAmbience(ParticleTypes.WARPED_SPORE, 0.01428F))
                .ambientLoopSound(SoundEvents.AMBIENT_SOUL_SAND_VALLEY_LOOP)
                .ambientMoodSound(new MoodSoundAmbience(SoundEvents.AMBIENT_SOUL_SAND_VALLEY_MOOD, 6000, 8, 2.0D))
                .ambientAdditionsSound(new SoundAdditionsAmbience(SoundEvents.AMBIENT_SOUL_SAND_VALLEY_ADDITIONS, 0.0111D))
                .backgroundMusic(BackgroundMusicTracks.createGameMusic(SoundEvents.MUSIC_BIOME_SOUL_SAND_VALLEY)).build(), GENERATION_SETTINGS.build(), SPAWN_SETTINGS.build());

    }

    static {
        GENERATION_SETTINGS.addCarver(GenerationStage.Carving.AIR, ConfiguredCarvers.NETHER_CAVE);
        GENERATION_SETTINGS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Features.SPRING_CLOSED);
        GENERATION_SETTINGS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Features.SPRING_LAVA);
        GENERATION_SETTINGS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Features.PATCH_FIRE);
        GENERATION_SETTINGS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Features.GLOWSTONE_EXTRA);
        GENERATION_SETTINGS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Features.GLOWSTONE);
        GENERATION_SETTINGS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Features.BROWN_MUSHROOM_NETHER);
        GENERATION_SETTINGS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Features.RED_MUSHROOM_NETHER);
        GENERATION_SETTINGS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Features.ORE_MAGMA);
        GENERATION_SETTINGS.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.NETHER_SPROUTS); //Nether Sprouts
        DefaultBiomeFeatures.addNetherDefaultOres(GENERATION_SETTINGS); //Ores
        GENERATION_SETTINGS.addStructureStart(StructureFeatures.RUINED_PORTAL_NETHER); //NetherPortal
        GENERATION_SETTINGS.addStructureStart(StructureFeatures.NETHER_BRIDGE); //Fortress
        GENERATION_SETTINGS.addStructureStart(StructureFeatures.BASTION_REMNANT); //BastionRemnant
        GENERATION_SETTINGS.addStructureStart(StructureFeatures.NETHER_FOSSIL); //Nether Fossils
        BYGDefaultBiomeFeatures.addMiniNetherMushrooms(GENERATION_SETTINGS);
        BYGDefaultBiomeFeatures.addWailingVegetation(GENERATION_SETTINGS);
        BYGDefaultBiomeFeatures.addHangingChains(GENERATION_SETTINGS);
        BYGDefaultBiomeFeatures.addHangingLanterns(GENERATION_SETTINGS);
        BYGDefaultBiomeFeatures.addWailingPillars(GENERATION_SETTINGS);

        SPAWN_SETTINGS.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.GHAST, 50, 4, 4));
        SPAWN_SETTINGS.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ZOMBIFIED_PIGLIN, 100, 4, 4));
        SPAWN_SETTINGS.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.MAGMA_CUBE, 2, 4, 4));
        SPAWN_SETTINGS.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ENDERMAN, 1, 4, 4));
        SPAWN_SETTINGS.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.PIGLIN, 15, 4, 4));
        SPAWN_SETTINGS.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.STRIDER, 60, 1, 2));
        SPAWN_SETTINGS.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.HOGLIN, 60, 1, 2));

    }
}
