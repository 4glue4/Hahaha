package karlmc.karlmcmod.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class BasicBlocks {

    // what
    public static Block shit_block = new Block(
            AbstractBlock.Properties.create(Material.SNOW_BLOCK, MaterialColor.SNOW)
            .hardnessAndResistance(0.2f)
            .harvestLevel(-1)
            .sound(SoundType.SLIME)
    );

    public static Block cum_block = new Block(
            AbstractBlock.Properties.create(Material.IRON, MaterialColor.IRON)
                    .hardnessAndResistance(50f)
                    .harvestLevel(1)
                    .sound(SoundType.HONEY)
    );

    public static Block cum_ore_block = new Block(
            AbstractBlock.Properties.create(Material.IRON, MaterialColor.IRON)
                    .hardnessAndResistance(50f)
                    .harvestLevel(4)
                    .sound(SoundType.STONE)
    );
}
