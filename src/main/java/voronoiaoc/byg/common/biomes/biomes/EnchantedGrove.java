package voronoiaoc.byg.common.biomes.biomes;

import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.structure.MineshaftConfig;
import net.minecraft.world.gen.feature.structure.MineshaftStructure;
import net.minecraft.world.gen.feature.structure.VillageConfig;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import voronoiaoc.byg.common.world.feature.biomefeatures.BYGFeatures;
import voronoiaoc.byg.common.world.feature.biomefeatures.BYGTreeFeatures;
import voronoiaoc.byg.core.byglists.BYGBiomeList;

import javax.annotation.Nullable;

public class EnchantedGrove extends Biome implements BiomeTools {
    static final ConfiguredSurfaceBuilder SURFACE_BUILDER = new ConfiguredSurfaceBuilder<>(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG);
    static final Precipitation PRECIPATATION = Precipitation.RAIN;
    static final Category CATEGORY = Category.PLAINS;
    static final double DEPTH = 0.25F;
    static final double SCALE = 0.1F;
    static final float TEMPERATURE = 0.75F;
    static final float DOWNFALL = 0.8F;
    static final int WATER_COLOR = 4159204;
    static final int WATER_FOG_COLOR = 329011;
    static final String PARENT = null;

    public EnchantedGrove() {
        super(new Settings().surfaceBuilder(SURFACE_BUILDER).precipitation(PRECIPATATION).category(CATEGORY).depth((float) DEPTH).scale((float) SCALE).temperature(TEMPERATURE).downfall(DOWNFALL).parent(PARENT).effects((new BiomeEffects.Builder()).waterColor(WATER_COLOR).waterFogColor(WATER_FOG_COLOR).fogColor(12638463).moodSound(BiomeMoodSound.CAVE).build()));
        //this.addStructure(Feature.VILLAGE.configure(new VillageConfig("village/plains/town_centers", 6)));
        //this.addStructure(Feature.PILLAGER_OUTPOST.configure(IFeatureConfig.NO_FEATURE_CONFIG));
        //this.addStructure(Feature.MINESHAFT.configure(new MineshaftConfig(0.004D, MineshaftStructure.Type.NORMAL)));
        //this.addStructure(Feature.STRONGHOLD.configure(IFeatureConfig.NO_FEATURE_CONFIG));
        BYGTreeFeatures.addEnchantedGroveTrees(this);
        DefaultBiomeFeatures.addLandCarvers(this);
        //DefaultBiomeFeatures.addStructures(this);
        DefaultBiomeFeatures.addDungeons(this);
        DefaultBiomeFeatures.addMineables(this);
        DefaultBiomeFeatures.addDefaultOres(this);
        DefaultBiomeFeatures.addDefaultDisks(this);
        DefaultBiomeFeatures.addDefaultMushrooms(this);
        DefaultBiomeFeatures.addDefaultVegetation(this);
        DefaultBiomeFeatures.addFrozenTopLayer(this);
        BYGFeatures.addGrass( this);
        BYGFeatures.addBYGMushrooms( this);
        BYGFeatures.addCloverFlowerPatch( this);
        BYGFeatures.addAnemones( this);
        BYGFeatures.addSages( this);

        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.SHEEP, 12, 4, 4));
        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.PIG, 10, 4, 4));
        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.CHICKEN, 10, 4, 4));
        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.COW, 8, 4, 4));
        this.addSpawn(SpawnGroup.AMBIENT, new SpawnEntry(EntityType.BAT, 10, 8, 8));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.ENDERMAN, 10, 1, 4));

    }

    @Nullable
    @Override
    public Biome getHill(INoiseRandom rand) {
        return (rand.random(5) == 0) ? BYGBiomeList.FRESHWATERLAKE : BYGBiomeList.FLOWERING_ENCHANTED_GROVE;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public int getGrassColor(double posX, double posZ) {
        return 8560845;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public int getFoliageColor() {
        return 11898572;
    }

    @Override
    public Biome getRiver() {
        return Biomes.RIVER;
    }
}
