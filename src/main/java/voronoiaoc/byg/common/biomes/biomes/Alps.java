package voronoiaoc.byg.common.biomes.biomes;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class Alps extends Biome implements BiomeTools {
    static final ConfiguredSurfaceBuilder<?> SURFACE_BUILDER = new ConfiguredSurfaceBuilder<>(SurfaceBuilder.DEFAULT, new TernarySurfaceConfig(Blocks.SNOW_BLOCK.getDefaultState(), Blocks.SNOW_BLOCK.getDefaultState(), Blocks.SNOW_BLOCK.getDefaultState()));
    static final Precipitation PRECIPATATION = Precipitation.SNOW;
    static final Category CATEGORY = Category.ICY;
    static final double DEPTH = 6.0F;
    static final double SCALE = 0.45F;
    static final float TEMPERATURE = -0.5F;
    static final float DOWNFALL = 0.9F;
    static final int WATER_COLOR = 4159204;
    static final int WATER_FOG_COLOR = 329011;
    static final String PARENT = null;

    public Alps() {
        super(new Settings().surfaceBuilder(SURFACE_BUILDER).precipitation(PRECIPATATION).category(CATEGORY).depth((float) DEPTH).scale((float) SCALE).temperature(TEMPERATURE).downfall(DOWNFALL).parent(PARENT).effects((new BiomeEffects.Builder()).waterColor(WATER_COLOR).waterFogColor(WATER_FOG_COLOR).fogColor(12638463).moodSound(BiomeMoodSound.CAVE).build()));
        ////this.addStructureFeature(Feature.VILLAGE.configure(new VillageConfig("village/snowy/town_centers", 6)));
        ////this.addStructureFeature(Feature.IGLOO.configure(FeatureConfig.DEFAULT));
        ////this.addStructureFeature(Feature.MINESHAFT.configure(new MineshaftConfig(0.004D, MineshaftStructure.Type.NORMAL)));
        ////this.addStructureFeature(Feature.STRONGHOLD.configure(FeatureConfig.DEFAULT));
        ////this.addStructureFeature(Feature.PILLAGER_OUTPOST.configure(FeatureConfig.DEFAULT));
        DefaultBiomeFeatures.addFrozenTopLayer(this);

        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.RABBIT, 10, 2, 3));
        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.POLAR_BEAR, 1, 1, 2));
        this.addSpawn(SpawnGroup.AMBIENT, new SpawnEntry(EntityType.BAT, 10, 8, 8));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.SPIDER, 100, 4, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.ZOMBIE, 95, 4, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.CREEPER, 100, 4, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.SLIME, 100, 4, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.ENDERMAN, 10, 1, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.WITCH, 5, 1, 1));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.SKELETON, 20, 4, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.STRAY, 80, 4, 4));
    }
}
