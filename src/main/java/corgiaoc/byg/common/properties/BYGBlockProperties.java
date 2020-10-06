package corgiaoc.byg.common.properties;

import corgiaoc.byg.core.BYGBlocks;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.DyeColor;
import net.minecraft.potion.Effects;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;
import corgiaoc.byg.client.textures.BYGMaterials;
import corgiaoc.byg.common.properties.blocks.*;
import corgiaoc.byg.common.properties.blocks.grassblocks.*;
import corgiaoc.byg.common.properties.blocks.nether.BYGOvergrownNetherrackBlock;
import corgiaoc.byg.common.properties.blocks.nether.BYGQuartzCrystalBlock;
import corgiaoc.byg.common.properties.blocks.nether.BoricFireBlock;
import corgiaoc.byg.common.properties.blocks.nether.DoubleNetherPlantBlock;
import corgiaoc.byg.common.properties.blocks.nether.crimson.CrimsonBerryBushBlock;
import corgiaoc.byg.common.properties.blocks.nether.crimson.CrimsonBlackstoneBlock;
import corgiaoc.byg.common.properties.blocks.nether.embur.BlueNetherrackBlock;
import corgiaoc.byg.common.properties.blocks.nether.embur.EmburPlantBlock;
import corgiaoc.byg.common.properties.blocks.nether.embur.EmburVinesPlantBlock;
import corgiaoc.byg.common.properties.blocks.nether.glowstonegardens.*;
import corgiaoc.byg.common.properties.blocks.nether.scorched.ScorchedPlantBlock;
import corgiaoc.byg.common.properties.blocks.nether.subzerohypogeal.SubzeroAshBlock;
import corgiaoc.byg.common.properties.blocks.nether.sythian.*;
import corgiaoc.byg.common.properties.blocks.nether.wailing.HangingBonesBlock;
import corgiaoc.byg.common.properties.blocks.nether.wailing.WhalingGrassBlock;
import corgiaoc.byg.common.properties.blocks.nether.warped.*;
import corgiaoc.byg.common.properties.blocks.nether.weepingmire.LamentVineBlock;
import corgiaoc.byg.common.properties.blocks.nether.weepingmire.LamentVinePlantBlock;
import corgiaoc.byg.common.world.feature.biomefeatures.BYGFeatureConfigs;

import java.util.function.ToIntFunction;

public class BYGBlockProperties {

    public static class BYGFairySlipperFlower extends BYGFairySlipperBlock {
        public BYGFairySlipperFlower(String registryName) {
            super(Effects.SATURATION, 7,
                    Block.Properties.create(Material.PLANTS)
                            .sound(SoundType.PLANT)
                            .hardnessAndResistance(0.0f)
                            .doesNotBlockMovement()
                            .notSolid()
                            .setLightLevel((state) -> 8)
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGDoublePlant extends DoublePlantBlock {
        public BYGDoublePlant(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGDoubleNetherPlant extends DoubleNetherPlantBlock {
        public BYGDoubleNetherPlant(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.ROOT)
                    .hardnessAndResistance(0.0f)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGDoubleDamagePlant extends DoubleDamagePlantBlock {
        public BYGDoubleDamagePlant(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGDesertPlant extends BYGDesertPlants {
        public BYGDesertPlant(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGSnowyPlant extends BYGSnowyPlants {
        public BYGSnowyPlant(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGBeachGrass extends BYGBeachGrassBlock {
        public BYGBeachGrass(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGLily extends BYGLilyPadBlock {
        public BYGLily(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGEmburLily extends NetherLilyBlock {
        public BYGEmburLily(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGWaterSilk extends BYGWaterSilkBlock {
        public BYGWaterSilk(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f)
                    .notSolid()
                    .doesNotBlockMovement()

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGLeafPile extends BYGLeafPileBlock {
        public BYGLeafPile(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }


    public static class BYGTallGrass extends TallGrassBlock {
        public BYGTallGrass(String registryName) {
            super(Block.Properties.create(Material.TALL_PLANTS)
                    .sound(SoundType.PLANT)
                    .doesNotBlockMovement()
                    .hardnessAndResistance(0.0f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGWinterTallGrass extends BYGSnowyPlants {
        public BYGWinterTallGrass(String registryName) {
            super(Block.Properties.create(Material.TALL_PLANTS)
                    .sound(SoundType.PLANT)
                    .doesNotBlockMovement()
                    .hardnessAndResistance(0.0f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPrairieGrass extends BYGPrairieGrassBlock {
        public BYGPrairieGrass(String registryName) {
            super(Block.Properties.create(Material.TALL_PLANTS)
                    .sound(SoundType.PLANT)
                    .doesNotBlockMovement()
                    .hardnessAndResistance(0.0f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGAmaranth extends AmaranthBlock {
        public BYGAmaranth(String registryName) {
            super(Block.Properties.create(Material.TALL_PLANTS)
                    .sound(SoundType.PLANT)
                    .doesNotBlockMovement()
                    .hardnessAndResistance(0.0f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGAllium extends TallAlliumBlock {
        public BYGAllium(String registryName) {
            super(Block.Properties.create(Material.TALL_PLANTS)
                    .sound(SoundType.PLANT)
                    .doesNotBlockMovement()
                    .hardnessAndResistance(0.0f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPinkAllium extends TallPinkAlliumBlock {
        public BYGPinkAllium(String registryName) {
            super(Block.Properties.create(Material.TALL_PLANTS)
                    .sound(SoundType.PLANT)
                    .doesNotBlockMovement()
                    .hardnessAndResistance(0.0f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGIceBlock extends IceBlock {
        public BYGIceBlock(String registryName) {
            super(Block.Properties.create(Material.ICE)
                    .sound(SoundType.GLASS)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .notSolid()
                    .slipperiness(0.98F)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPackedIceBlock extends Block {
        public BYGPackedIceBlock(String registryName) {
            super(Block.Properties.create(Material.PACKED_ICE)
                    .sound(SoundType.GLASS)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .notSolid()
                    .slipperiness(0.98F)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGFrostMagma extends BYGFrostMagmaBlock {
        public BYGFrostMagma(String registryName) {
            super(Block.Properties.create(Material.PACKED_ICE)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .notSolid()
                    .slipperiness(0.98F)
                    .setLightLevel((state) -> 10)
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGSubzeroAsh extends SubzeroAshBlock {
        public BYGSubzeroAsh(String registryName) {
            super(Block.Properties.create(Material.SNOW)
                    .sound(SoundType.SAND)
                    .hardnessAndResistance(0.1f)
                    .harvestTool(ToolType.SHOVEL)
                    .speedFactor(0.6F)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGSubzeroAshBlock extends Block {
        public BYGSubzeroAshBlock(String registryName) {
            super(Block.Properties.create(Material.SNOW_BLOCK)
                    .sound(SoundType.SAND)
                    .hardnessAndResistance(0.2f)
                    .harvestTool(ToolType.SHOVEL)
            );
            setRegistryName(registryName);
        }
    }

    public static class BlockOvergrownStoneBlock extends SpreadableBlock {
        public BlockOvergrownStoneBlock(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(1.5f, 6.0f)
                    .tickRandomly()
                    .harvestTool(ToolType.PICKAXE), Blocks.STONE


            );
            setRegistryName(registryName);
        }
    }

    public static class BlockOvergrownDaciteBlock extends SpreadableBlock {
        public BlockOvergrownDaciteBlock(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(1.5f, 6.0f)
                    .tickRandomly()
                    .harvestTool(ToolType.PICKAXE), BYGBlocks.DACITE


            );
            setRegistryName(registryName);
        }
    }

    public static class BYGDirt extends Block {
        public BYGDirt(String registryName) {
            super(Block.Properties.create(Material.EARTH)
                    .sound(SoundType.GROUND)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
            );
            setRegistryName(registryName);
        }
    }


    public static class BYGMud extends Block {
        public BYGMud(String registryName) {
            super(Block.Properties.create(Material.EARTH)
                    .sound(SoundType.GROUND)
                    .hardnessAndResistance(0.2f)
                    .speedFactor(0.4F)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGMeadowGrass extends SpreadableBlock {
        public BYGMeadowGrass(String registryName) {
            super(Block.Properties.create(Material.ORGANIC)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.6f)
                    .tickRandomly(), BYGBlocks.MEADOW_DIRT
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGGlowcelium extends BYGGlowCeliumBlock {
        public BYGGlowcelium(String registryName) {
            super(Block.Properties.create(BYGMaterials.GLOWCELIUM)
                    .sound(SoundType.GROUND)
                    .hardnessAndResistance(0.6f)
                    .tickRandomly()
                    .setLightLevel((state) -> 10)

            );
            setRegistryName(registryName);
        }
    }


    public static class BYGLeafFoilage extends LeafFoliageBlock {
        public BYGLeafFoilage(String registryName) {
            super(DyeColor.GREEN, Block.Properties.create(Material.LEAVES, MaterialColor.GRASS)
                    .hardnessAndResistance(0.0F)
                    .tickRandomly()
                    .sound(SoundType.PLANT)
                    .notSolid()
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGBloomingWitchhazelLeaves extends LeavesBlock {
        public BYGBloomingWitchhazelLeaves(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .hardnessAndResistance(0.2F)
                    .tickRandomly()
                    .sound(SoundType.PLANT)
                    .notSolid()
                    .setLightLevel((state) -> 12)
            );
            setRegistryName(registryName);
            this.setDefaultState(this.stateContainer.getBaseState().with(DISTANCE, Integer.valueOf(7)).with(PERSISTENT, Boolean.valueOf(false)));
        }
    }

    public static class BYGPetal extends Block {
        public BYGPetal(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.2f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGNyliumSoulSand extends Block {

        public BYGNyliumSoulSand(String registryName) {
            super(Block.Properties.create(Material.SAND)
                    .sound(SoundType.SAND)
                    .hardnessAndResistance(0.5f)
                    .speedFactor(0.6F)
                    .harvestTool(ToolType.SHOVEL)
            );
            setRegistryName(registryName);
        }

    }

    public static class BYGNyliumSoulSoil extends Block {

        public BYGNyliumSoulSoil(String registryName) {
            super(Block.Properties.create(Material.SAND)
                    .sound(SoundType.SAND)
                    .hardnessAndResistance(0.5f)
                    .harvestTool(ToolType.SHOVEL)

            );
            setRegistryName(registryName);
        }

    }

    public static class BYGQuartzCrystal extends BYGQuartzCrystalBlock {
        public BYGQuartzCrystal(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(0.1F)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGQuartziteSand extends Block {
        public BYGQuartziteSand(String registryName) {
            super(Block.Properties.create(Material.SAND)
                    .sound(SoundType.SAND)
                    .hardnessAndResistance(0.2f)
            );
            setRegistryName(registryName);
        }
    }

    public static class HangingBones extends HangingBonesBlock {
        public HangingBones(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(0.0F)
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }

    public static class WailingVines extends VineBlock {
        public WailingVines(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.NETHER_VINE_LOWER_PITCH)
                    .hardnessAndResistance(0.0F)
                    .tickRandomly()
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }

    public static class WhalingGrass extends WhalingGrassBlock {
        public WhalingGrass(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.ROOT)
                    .hardnessAndResistance(0.0F)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class ScorchedPlant extends ScorchedPlantBlock {
        public ScorchedPlant(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0F)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGWarpedCacti extends WarpedCactiBlock {
        public BYGWarpedCacti(String registryName) {
            super(Block.Properties.create(Material.CACTUS)
                    .sound(SoundType.CLOTH)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .notSolid()
                    .setLightLevel((state) -> 8)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGWarpedCoral extends BYGWarpedCoralPlantBlock {
        public BYGWarpedCoral(String registryName) {
            super(Block.Properties.create(Material.OCEAN_PLANT)
                    .sound(SoundType.WET_GRASS)
                    .hardnessAndResistance(0.0F)
                    .doesNotBlockMovement()
                    .notSolid()
                    .setLightLevel((state) -> 8)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGWarpedFanCoral extends BYGWarpedFinBlock {
        public BYGWarpedFanCoral(String registryName) {
            super(Block.Properties.create(Material.OCEAN_PLANT)
                    .sound(SoundType.WET_GRASS)
                    .hardnessAndResistance(0.0F)
                    .doesNotBlockMovement()
                    .notSolid()
                    .lootFrom(BYGBlocks.WARPED_CORAL)
                    .setLightLevel((state) -> 8)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGWarpedWallFanCoral extends BYGWarpedCoralWallFanBlock {
        public BYGWarpedWallFanCoral(String registryName) {
            super(Block.Properties.create(Material.OCEAN_PLANT)
                    .sound(SoundType.WET_GRASS)
                    .hardnessAndResistance(0.0F)
                    .doesNotBlockMovement()
                    .notSolid()
                    .lootFrom(BYGBlocks.WARPED_CORAL)
                    .setLightLevel((state) -> 8)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGWarpedBush extends BYGWarpedBushBlock {
        public BYGWarpedBush(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f)
                    .doesNotBlockMovement()
                    .notSolid()
                    .setLightLevel((state) -> 8)
            );
            setRegistryName(registryName);

        }
    }

    public static class SythianStalk extends SythianStalkBlock {
        public SythianStalk(String registryName) {
            super(Block.Properties.create(Material.BAMBOO)
                    .sound(SoundType.BAMBOO)
                    .hardnessAndResistance(0.2f)
                    .notSolid()
                    .tickRandomly()
                    .setLightLevel((state) -> 8)
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGWartBlock extends Block {
        public BYGWartBlock(String registryName) {
            super(Block.Properties.create(Material.ORGANIC)
                    .sound(SoundType.WART)
                    .hardnessAndResistance(1.0F)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGLamentPlant extends NetherSproutsBlock {
        public BYGLamentPlant(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.ROOT)
                    .hardnessAndResistance(0.0F)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGLamentVinePlant extends LamentVinePlantBlock {
        public BYGLamentVinePlant(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.NETHER_VINE)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGLamentVine extends LamentVineBlock {
        public BYGLamentVine(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.NETHER_VINE)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGEmburGelBlock extends HoneyBlock {
        public BYGEmburGelBlock(String registryName) {
            super(Block.Properties.create(Material.CLAY)
                    .sound(SoundType.HONEY)
                    .notSolid()
                    .speedFactor(1.6F)
                    .slipperiness(0.6F)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGEmburGelVine extends EmburVinesPlantBlock {
        public BYGEmburGelVine(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0F)
                    .tickRandomly()
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGEmburPlant extends EmburPlantBlock {
        public BYGEmburPlant(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.ROOT)
                    .hardnessAndResistance(0.0F)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGEmberNylium extends SpreadableBlock {
        public BYGEmberNylium(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.NYLIUM)
                    .hardnessAndResistance(0.4F)
                    .tickRandomly()
                    .harvestTool(ToolType.PICKAXE), BYGBlocks.BLUE_NETHERRACK, BYGFeatureConfigs.SpreadableBlockConfigs.EMBUR_ROOTS

            );
            setRegistryName(registryName);
        }
    }

    public static class SythianSapling extends SythianSaplingBlock {
        public SythianSapling(String registryName) {
            super(Block.Properties.create(Material.BAMBOO_SAPLING)
                    .sound(SoundType.BAMBOO_SAPLING)
                    .hardnessAndResistance(0.0f)
                    .doesNotBlockMovement()
                    .notSolid()
                    .tickRandomly()
            );
            setRegistryName(registryName);

        }
    }

    public static class SythianPlant extends BYGSythianPlantBlock {
        public SythianPlant(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.ROOT)
                    .hardnessAndResistance(0.0f)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGSythianNylium extends SpreadableBlock {
        public BYGSythianNylium(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.NYLIUM)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .harvestTool(ToolType.PICKAXE), Blocks.NETHERRACK, BYGFeatureConfigs.SpreadableBlockConfigs.SYTHIAN_CONFIG

            );
            setRegistryName(registryName);
        }
    }

    public static class OvergrownCrimsonBlackstone extends CrimsonBlackstoneBlock {
        public OvergrownCrimsonBlackstone(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.NYLIUM)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }

    public static class CrimsonBerryBush extends CrimsonBerryBushBlock {
        public CrimsonBerryBush(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .zeroHardnessAndResistance()
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }

    public static class OvergrownNetherrack extends BYGOvergrownNetherrackBlock {
        public OvergrownNetherrack(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.NYLIUM)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGIvisPlant extends BYGIvisPlantBlock {
        public BYGIvisPlant(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.ROOT)
                    .hardnessAndResistance(0.0f)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGIvisPhylium extends SpreadableBlock {
        public BYGIvisPhylium(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.NYLIUM)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .harvestTool(ToolType.PICKAXE), Blocks.END_STONE, BYGFeatureConfigs.SpreadableBlockConfigs.IVIS_CONFIG

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGWarpedCoralBlock extends Block {
        public BYGWarpedCoralBlock(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.CORAL)
                    .hardnessAndResistance(0.2f)
                    .setLightLevel((state) -> 8)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPollen extends BYGPollenBlock {
        public BYGPollen(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.CORAL)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .notSolid()
                    .doesNotBlockMovement()
                    .setLightLevel((state) -> 9)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGThatch extends HayBlock {
        public BYGThatch(String registryName) {
            super(Block.Properties.create(Material.ORGANIC)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.5f)
            );
            setRegistryName(registryName);
        }
    }

    public static class ThatchCarpet extends CarpetBlock {
        public ThatchCarpet(String registryName) {
            super(DyeColor.BROWN, Block.Properties.create(Material.ORGANIC)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.5f)
            );
            setRegistryName(registryName);
        }
    }

    public static class ThatchStairs extends StairsBlock {
        public ThatchStairs(String registryName) {
            super(BYGBlocks.REED_THATCH.getDefaultState(), Block.Properties.from(BYGBlocks.REED_THATCH)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.5f)
            );
            setRegistryName(registryName);
        }
    }

    public static class ThatchSlab extends SlabBlock {
        public ThatchSlab(String registryName) {
            super(Block.Properties.create(Material.ORGANIC)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.5f)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPoisonIvy extends PoisonIvyBlock {
        public BYGPoisonIvy(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGSkyrisVine extends VineBlock {
        public BYGSkyrisVine(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGHangingVine extends HangingVinesBlock {
        public BYGHangingVine(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.NETHER_VINE)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .doesNotBlockMovement()
                    .setLightLevel((state) -> 14)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGHangingVinePlant extends HangingVinesPlantBlock {
        public BYGHangingVinePlant(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.NETHER_VINE)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGSoulShroomSporeEnd extends SoulShroomSporeEndBlock {
        public BYGSoulShroomSporeEnd(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.FUNGUS)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .doesNotBlockMovement()
                    .setLightLevel((state) -> 14)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGSoulShroomSpore extends SoulShroomSporeBlock {
        public BYGSoulShroomSpore(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.FUNGUS)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGSythianHangingRootsPlant extends HangingSythanRootsPlantBlock {
        public BYGSythianHangingRootsPlant(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.NETHER_VINE)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGSythianHangingRoots extends HangingSythanRootsBlock {
        public BYGSythianHangingRoots(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.NETHER_VINE)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }

    public static class LogBlock extends RotatedPillarBlock {
        public LogBlock(AbstractBlock.Properties properties) {
            super(properties);
        }
    }

    public static class BYGNetherLog extends LogBlock {
        public BYGNetherLog(String registryName) {
            super(Block.Properties.create(Material.NETHER_WOOD)
                            .sound(SoundType.HYPHAE)
                            .hardnessAndResistance(2.0f)
            );
            setRegistryName(registryName);
        }
    }

    public static class BoricCampfire extends CampfireBlock {
        public BoricCampfire(String registryName) {
            super(true, 5, AbstractBlock.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN)
                    .hardnessAndResistance(2.0F)
                    .sound(SoundType.WOOD)
                    .tickRandomly()
                    .notSolid()
                    .setLightLevel(getLightValueLit(14))
            );
            setRegistryName(registryName);
        }
    }

    public static class BoricFire extends BoricFireBlock {
        public BoricFire(String registryName) {
            super(AbstractBlock.Properties.create(Material.FIRE, MaterialColor.GREEN)
                    .sound(SoundType.CLOTH)
                    .doesNotBlockMovement()
                    .zeroHardnessAndResistance()
                    .setLightLevel((state) -> 14)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGNetherWood extends RotatedPillarBlock {
        public BYGNetherWood(String registryName) {
            super(Block.Properties.create(Material.NETHER_WOOD)
                    .sound(SoundType.HYPHAE)
                    .hardnessAndResistance(2.0f)
            );
            setRegistryName(registryName);
        }
    }

    //Saving this for later do not touch
//    @OnlyIn(Dist.CLIENT)
//    public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
//        return adjacentBlockState.getBlock() == this ? true : super.isSideInvisible(state, adjacentBlockState, side);
//    }

    public static class BYGOreAmetrine extends BYGOreBlock {
        public BYGOreAmetrine(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(3.0f, 3.0f)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGOrePendorite extends OreBlock {
        public BYGOrePendorite(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(3.0f, 3.0f)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPervadedNetherrack extends OreBlock {
        public BYGPervadedNetherrack(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(0.4F, 0.4F)
                    .harvestLevel(4)
                    .setLightLevel((state) -> 13)
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }

    public static class AnthraciteOre extends BYGOreBlock {
        public AnthraciteOre(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(0.4F, 0.4F)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGREDGlowCane extends BYGGlowcane {
        public BYGREDGlowCane(String registryName) {
            super(Block.Properties.create(BYGMaterials.RED_GLOWCANE)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f, 0.0f)
                    .doesNotBlockMovement()
                    .setLightLevel((state) -> 10)
                    .tickRandomly()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPINKGlowCane extends BYGGlowcane {
        public BYGPINKGlowCane(String registryName) {
            super(Block.Properties.create(BYGMaterials.PINK_GLOWCANE)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f, 0.0f)
                    .doesNotBlockMovement()
                    .setLightLevel((state) -> 10)
                    .tickRandomly()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPURPLEGlowCane extends BYGGlowcane {
        public BYGPURPLEGlowCane(String registryName) {
            super(Block.Properties.create(BYGMaterials.PURPLE_GLOWCANE)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f, 0.0f)
                    .doesNotBlockMovement()
                    .setLightLevel((state) -> 10)
                    .tickRandomly()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGBLUEGlowCane extends BYGGlowcane {
        public BYGBLUEGlowCane(String registryName) {
            super(Block.Properties.create(BYGMaterials.BLUE_GLOWCANE)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f, 0.0f)
                    .doesNotBlockMovement()
                    .setLightLevel((state) -> 10)
                    .tickRandomly()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGCrop extends CropsBlock {
        public BYGCrop(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(1.5f, 6.0f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BlockCattail extends BYGRiverPlantBlock {
        public BlockCattail(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0F, 0.0F)
                    .notSolid()
                    .doesNotBlockMovement()
                    .tickRandomly()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGBerryBush extends BlueBerryBush {
        public BYGBerryBush(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.SWEET_BERRY_BUSH)
                    .hardnessAndResistance(0.0f, 0.0f)
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }


    public static class BlockHugeMushroom extends HugeMushroomBlock {
        public BlockHugeMushroom(String registryName) {
            super(Block.Properties.create(Material.PLANTS, MaterialColor.DIRT)
                    .sound(SoundType.HYPHAE)
                    .hardnessAndResistance(0.2F)
                    .notSolid()
            );
            setRegistryName(registryName);
            this.setDefaultState(this.stateContainer.getBaseState().with(NORTH, Boolean.valueOf(true)).with(EAST, Boolean.valueOf(true)).with(SOUTH, Boolean.valueOf(true)).with(WEST, Boolean.valueOf(true)).with(UP, Boolean.valueOf(true)).with(DOWN, Boolean.valueOf(true)));
        }
    }

    public static class BlockHugeNetherMushroom extends HugeMushroomBlock {
        public BlockHugeNetherMushroom(String registryName) {
            super(Block.Properties.create(Material.NETHER_WOOD, MaterialColor.DIRT)
                    .sound(SoundType.HYPHAE)
                    .hardnessAndResistance(0.2F)
                    .setLightLevel((state) -> 12)
            );
            setRegistryName(registryName);
            this.setDefaultState(this.stateContainer.getBaseState().with(NORTH, Boolean.valueOf(true)).with(EAST, Boolean.valueOf(true)).with(SOUTH, Boolean.valueOf(true)).with(WEST, Boolean.valueOf(true)).with(UP, Boolean.valueOf(true)).with(DOWN, Boolean.valueOf(true)));
        }

        @OnlyIn(Dist.CLIENT)
        public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
            return adjacentBlockState.getBlock() == this || super.isSideInvisible(state, adjacentBlockState, side);
        }
    }

    public static class BlockHugeNetherMushroomStem extends HugeMushroomBlock {
        public BlockHugeNetherMushroomStem(String registryName) {
            super(Block.Properties.create(Material.NETHER_WOOD, MaterialColor.DIRT)
                    .sound(SoundType.HYPHAE)
                    .hardnessAndResistance(0.2F)
            );
            setRegistryName(registryName);
            this.setDefaultState(this.stateContainer.getBaseState().with(NORTH, Boolean.valueOf(true)).with(EAST, Boolean.valueOf(true)).with(SOUTH, Boolean.valueOf(true)).with(WEST, Boolean.valueOf(true)).with(UP, Boolean.valueOf(true)).with(DOWN, Boolean.valueOf(true)));
        }

        @OnlyIn(Dist.CLIENT)
        public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
            return adjacentBlockState.getBlock() == this || super.isSideInvisible(state, adjacentBlockState, side);
        }
    }

    public static class BlockHugeGlowshroom extends HugeMushroomBlock {
        public BlockHugeGlowshroom(String registryName) {
            super(Block.Properties.create(Material.PLANTS, MaterialColor.DIRT)
                    .sound(SoundType.HYPHAE)
                    .hardnessAndResistance(0.2F)
                    .notSolid()
                    .setLightLevel((state) -> 12)
            );
            setRegistryName(registryName);
            this.setDefaultState(this.stateContainer.getBaseState().with(NORTH, Boolean.valueOf(true)).with(EAST, Boolean.valueOf(true)).with(SOUTH, Boolean.valueOf(true)).with(WEST, Boolean.valueOf(true)).with(UP, Boolean.valueOf(true)).with(DOWN, Boolean.valueOf(true)));
        }

        @OnlyIn(Dist.CLIENT)
        public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
            return adjacentBlockState.getBlock() == this || super.isSideInvisible(state, adjacentBlockState, side);
        }
    }

    public static class BlockHugeGlowshroomStem extends HugeMushroomBlock {
        public BlockHugeGlowshroomStem(String registryName) {
            super(Block.Properties.create(Material.PLANTS, MaterialColor.DIRT)
                    .sound(SoundType.HYPHAE)
                    .hardnessAndResistance(0.2F)
                    .setLightLevel((state) -> 12)
            );
            setRegistryName(registryName);
            this.setDefaultState(this.stateContainer.getBaseState().with(NORTH, Boolean.valueOf(true)).with(EAST, Boolean.valueOf(true)).with(SOUTH, Boolean.valueOf(true)).with(WEST, Boolean.valueOf(true)).with(UP, Boolean.valueOf(true)).with(DOWN, Boolean.valueOf(true)));
        }

        @OnlyIn(Dist.CLIENT)
        public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
            return adjacentBlockState.getBlock() == this || super.isSideInvisible(state, adjacentBlockState, side);
        }
    }

    public static class BYGPlanks extends Block {
        public BYGPlanks(String registryName) {
            super(Block.Properties.create(Material.WOOD, MaterialColor.BROWN)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(2.0f, 3.0f)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGScaffolding extends BYGScaffoldingBlock {
        public BYGScaffolding(String registryName) {
            super(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.SAND)
                    .sound(SoundType.SCAFFOLDING)
                    .hardnessAndResistance(0.0f, 0.0f)
                    .doesNotBlockMovement()
                    .variableOpacity()
                    .setLightLevel((state) -> 12)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGCraftingTable extends BYGCraftingTableBlock {
        public BYGCraftingTable(String registryName) {
            super(Block.Properties.from(Blocks.CRAFTING_TABLE)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGStoneStairs extends StairsBlock {
        public BYGStoneStairs(String registryName) {
            super(Blocks.COBBLESTONE.getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(2.0f, 6.0f)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGGlowCaneBlock extends Block {
        public BYGGlowCaneBlock(String registryName) {
            super(Block.Properties.create(Material.GLASS)
                    .sound(SoundType.GLASS)
                    .hardnessAndResistance(0.3F)
                    .setLightLevel((state) -> 15)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGStone extends Block {
        public BYGStone(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(1.5f, 6.0f)
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGNetherrack extends Block {
        public BYGNetherrack(String registryName) {
            super(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA)
                    .sound(SoundType.NETHERRACK)
                    .hardnessAndResistance(0.4F, 0.4F)
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGBlueNetherrack extends BlueNetherrackBlock {
        public BYGBlueNetherrack(String registryName) {
            super(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA)
                    .sound(SoundType.NETHERRACK)
                    .hardnessAndResistance(0.4F, 0.4F)
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGNetherBricks extends Block {
        public BYGNetherBricks(String registryName) {
            super(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA)
                    .sound(SoundType.NETHER_BRICK)
                    .hardnessAndResistance(0.4F, 0.4F)
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPillar extends RotatedPillarBlock {
        public BYGPillar(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(1.5f, 6.0f)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGStrippedLog extends LogBlock {
        public BYGStrippedLog(String registryName) {
            super(Block.Properties.create(Material.WOOD, MaterialColor.WOOD)
                            .sound(SoundType.WOOD)
                            .hardnessAndResistance(2.0f)
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGLantern extends LanternBlock {
        public BYGLantern(String registryName) {
            super(Block.Properties.create(Material.IRON)
                    .sound(SoundType.LANTERN)
                    .hardnessAndResistance(3.5F)
                    .setLightLevel((state) -> 15)
                    .notSolid()
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }

    private static ToIntFunction<BlockState> getLightValueLit(int lightValue) {
        return (state) -> state.get(BlockStateProperties.LIT) ? lightValue : 0;
    }
}
