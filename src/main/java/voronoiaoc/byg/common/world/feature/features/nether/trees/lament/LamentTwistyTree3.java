package voronoiaoc.byg.common.world.feature.features.nether.trees.lament;

import com.mojang.serialization.Codec;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import voronoiaoc.byg.common.world.feature.featureconfig.BYGTreeFeatureConfig;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.util.BYGAbstractTreeFeature;

import java.util.Random;
import java.util.Set;

public class LamentTwistyTree3 extends BYGAbstractTreeFeature<BYGTreeFeatureConfig> {

    public LamentTwistyTree3(Codec<BYGTreeFeatureConfig> configIn) {
        super(configIn);
    }

    protected boolean place(Set<BlockPos> changedBlocks, ISeedReader worldIn, Random rand, BlockPos pos, MutableBoundingBox boundsIn, boolean isSapling, BYGTreeFeatureConfig config) {

        int randTreeHeight = config.getMinHeight() + rand.nextInt(config.getMaxPossibleHeight());
        BlockPos.Mutable mainmutable = new BlockPos.Mutable().setPos(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getHeight()) {
            if (!isDesiredGroundwDirtTag(worldIn, pos.down(), Blocks.GRASS_BLOCK)) {
                return false;
            } else if (!this.isAnotherTreeNearby(worldIn, pos, randTreeHeight, 0, isSapling)) {
                return false;
            } else if (!this.doesSaplingHaveSpaceToGrow(worldIn, pos, randTreeHeight, 7, 5, 5, isSapling)) {
                return false;
            } else {
                placeTrunk(config, rand,changedBlocks, worldIn, mainmutable.add(0, 0, 0), boundsIn);
                placeTrunk(config, rand,changedBlocks, worldIn, mainmutable.add(0, 1, 0), boundsIn);
                placeTrunk(config, rand,changedBlocks, worldIn, mainmutable.add(0, 2, 0), boundsIn);
                placeTrunk(config, rand,changedBlocks, worldIn, mainmutable.add(0, 3, 0), boundsIn);
                placeTrunk(config, rand,changedBlocks, worldIn, mainmutable.add(0, 12, 0), boundsIn);
                placeTrunk(config, rand,changedBlocks, worldIn, mainmutable.add(0, 13, 0), boundsIn);
                placeTrunk(config, rand,changedBlocks, worldIn, mainmutable.add(0, 14, 0), boundsIn);
                placeTrunk(config, rand,changedBlocks, worldIn, mainmutable.add(0, 15, 0), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 3, -1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 4, -1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 5, -1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 6, 0), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 6, -1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 7, 0), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 8, 0), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 9, 0), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 9, 1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 10, 1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 11, 1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 12, 1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 15, -1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 16, -1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 17, -1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 18, 0), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 18, -1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 19, 0), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 20, 0), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 20, 1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 21, 1), boundsIn);
                placeBranch(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 22, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 2, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 2, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 2, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 2, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 2, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 2, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 2, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 2, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 2, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 2, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 2, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 2, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 2, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 2, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 2, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 3, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 3, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 3, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 3, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 3, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 3, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 3, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 3, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 3, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 3, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 3, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 3, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 3, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 3, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 3, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 4, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 4, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 4, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 4, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 5, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 5, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 5, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 5, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 5, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 5, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 5, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 5, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 5, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 5, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 5, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 5, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 5, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 5, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 5, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 5, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 6, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 6, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 6, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 6, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 6, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 6, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 6, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 6, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 6, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 6, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 6, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 7, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 7, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 7, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 8, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 8, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 8, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 8, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 8, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 8, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 8, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 8, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 8, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 8, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 8, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 8, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 8, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 8, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 8, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 8, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 8, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 8, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 8, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 8, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 8, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 8, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 8, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 9, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 9, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 9, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 9, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 9, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 9, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 9, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 9, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 9, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 10, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 10, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 10, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 10, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 11, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 11, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 11, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 11, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 11, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 11, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 11, 3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 11, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 11, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 11, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 11, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 11, 3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 11, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 11, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 11, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 11, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 11, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 11, 3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 11, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 11, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 11, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 12, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 12, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 12, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 12, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 12, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 12, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 12, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 12, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 13, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 13, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 14, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 14, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 14, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 14, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 14, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 14, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 14, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 14, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 14, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 14, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 14, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 14, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 14, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 14, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 14, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 14, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 14, 3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 14, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 14, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 14, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 14, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 14, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 14, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 14, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(2, 14, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 15, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 15, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 15, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 15, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 15, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 15, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 15, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 15, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 16, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 17, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 17, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 17, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 17, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 17, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 17, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 17, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 17, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 17, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 17, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 17, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 17, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 17, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 17, -3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 17, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 17, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 17, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 17, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 17, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 17, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 17, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 18, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 18, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 18, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 18, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 19, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-4, 19, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 19, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 19, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 19, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 19, -2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 19, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 19, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 19, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 19, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 19, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 19, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 19, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 19, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 19, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 20, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 20, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 20, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 20, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 20, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 20, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 21, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 22, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-3, 22, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 22, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 22, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 22, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 22, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 22, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 22, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 22, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 22, 3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 22, -1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 22, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 22, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 22, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 22, 3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 22, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 22, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 22, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-2, 23, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 23, 0), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 23, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(-1, 23, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 23, 1), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 23, 2), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(0, 23, 3), boundsIn);
                placeLeaves(config, rand,changedBlocks, worldIn, mainmutable.add(1, 23, 3), boundsIn);
            }
        }
        return true;
    }
}