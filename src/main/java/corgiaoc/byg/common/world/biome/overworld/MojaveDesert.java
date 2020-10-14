package corgiaoc.byg.common.world.biome.overworld;

import com.google.common.collect.Maps;
import corgiaoc.byg.common.world.biome.BYGBiome;
import corgiaoc.byg.common.world.biome.BYGDefaultBiomeFeatures;
import corgiaoc.byg.common.world.biome.BiomeUtil;
import corgiaoc.byg.core.world.BYGSurfaceBuilders;
import corgiaoc.byg.core.world.util.WorldGenRegistrationHelper;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

import java.util.Collections;
import java.util.HashMap;

public class MojaveDesert extends BYGBiome {
    static final ConfiguredSurfaceBuilder SURFACE_BUILDER = WorldGenRegistrationHelper.createConfiguredSurfaceBuilder("mojave", new ConfiguredSurfaceBuilder<>(BYGSurfaceBuilders.MOJAVE, new SurfaceBuilderConfig(Blocks.SAND.getDefaultState(), Blocks.SAND.getDefaultState(), Blocks.SANDSTONE.getDefaultState())));
    static final Biome.RainType PRECIPATATION = Biome.RainType.NONE;
    static final Biome.Category CATEGORY = Biome.Category.DESERT;
    static final float DEPTH = 0.125F;
    static final float SCALE = 0.05F;
    static final float TEMPERATURE = 2.0F;
    static final float DOWNFALL = 0.0F;
    static final int WATER_COLOR = 4159204;
    static final int WATER_FOG_COLOR = 329011;
    
    static final Biome.Climate WEATHER = new Biome.Climate(PRECIPATATION, TEMPERATURE, Biome.TemperatureModifier.NONE, DOWNFALL);
    static final MobSpawnInfo.Builder SPAWN_SETTINGS = new MobSpawnInfo.Builder();
    static final BiomeGenerationSettings.Builder GENERATION_SETTINGS = (new BiomeGenerationSettings.Builder()).withSurfaceBuilder(SURFACE_BUILDER);

    public MojaveDesert() {
        super(WEATHER, CATEGORY, DEPTH, SCALE, (new BiomeAmbience.Builder()).setWaterColor(WATER_COLOR).setWaterFogColor(WATER_FOG_COLOR).setFogColor(12638463).withSkyColor(BiomeUtil.calcSkyColor(0.8F)).setMoodSound(MoodSoundAmbience.DEFAULT_CAVE).build(), GENERATION_SETTINGS.build(), SPAWN_SETTINGS.copy());
    }

    public HashMap<Biome, Integer> getHills() {
        return Maps.newHashMap(Collections.singletonMap(WorldGenRegistries.BIOME.getOrThrow(Biomes.DESERT), 1));
    }

    public Biome getHills(INoiseRandom rand) {
        return WorldGenRegistries.BIOME.getValueForKey(Biomes.DESERT);
    }

    static {
        DefaultBiomeFeatures.withStrongholdAndMineshaft(GENERATION_SETTINGS);
        DefaultBiomeFeatures.withCavesAndCanyons(GENERATION_SETTINGS);
        DefaultBiomeFeatures.withMonsterRoom(GENERATION_SETTINGS);
        DefaultBiomeFeatures.withCommonOverworldBlocks(GENERATION_SETTINGS);
        DefaultBiomeFeatures.withOverworldOres(GENERATION_SETTINGS);
        DefaultBiomeFeatures.withDisks(GENERATION_SETTINGS);
        DefaultBiomeFeatures.withDefaultFlowers(GENERATION_SETTINGS);
        DefaultBiomeFeatures.withBadlandsGrass(GENERATION_SETTINGS);
        DefaultBiomeFeatures.withDesertDeadBushes(GENERATION_SETTINGS);
        DefaultBiomeFeatures.withNormalMushroomGeneration(GENERATION_SETTINGS);
        DefaultBiomeFeatures.withDesertVegetation(GENERATION_SETTINGS);
        DefaultBiomeFeatures.withLavaAndWaterSprings(GENERATION_SETTINGS);
        DefaultBiomeFeatures.withDesertWells(GENERATION_SETTINGS);
        DefaultBiomeFeatures.withFrozenTopLayer(GENERATION_SETTINGS);
        BYGDefaultBiomeFeatures.addMiniCactus(GENERATION_SETTINGS);
        BYGDefaultBiomeFeatures.addJoshuaTrees(GENERATION_SETTINGS);
        BYGDefaultBiomeFeatures.addBYGDesertPlants(GENERATION_SETTINGS);
        BYGDefaultBiomeFeatures.addFirecracker(GENERATION_SETTINGS);
        DefaultBiomeFeatures.withDesertVegetation(GENERATION_SETTINGS);
        BYGDefaultBiomeFeatures.addBYGMushrooms(GENERATION_SETTINGS);
        BYGDefaultBiomeFeatures.addGrass(GENERATION_SETTINGS);
        DefaultBiomeFeatures.withBadlandsGrassAndBush(GENERATION_SETTINGS);
        BYGDefaultBiomeFeatures.addBushes(GENERATION_SETTINGS);

        SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(EntityType.TROPICAL_FISH, 4, 2, 3));
        SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(EntityType.SALMON, 10, 8, 8));
        SPAWN_SETTINGS.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.SPIDER, 100, 4, 4));
        SPAWN_SETTINGS.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.SKELETON, 100, 4, 4));
        SPAWN_SETTINGS.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.CREEPER, 100, 4, 4));
        SPAWN_SETTINGS.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.SLIME, 100, 4, 4));
        SPAWN_SETTINGS.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ENDERMAN, 10, 1, 4));
        SPAWN_SETTINGS.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.WITCH, 5, 1, 1));
        SPAWN_SETTINGS.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ZOMBIE, 19, 4, 4));
        SPAWN_SETTINGS.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ZOMBIE_VILLAGER, 1, 1, 1));
        SPAWN_SETTINGS.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.HUSK, 80, 4, 4));

    }
}
