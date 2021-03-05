package karlmc.karlmcmod.core.init;

import karlmc.karlmcmod.ChildAbuseMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> blocks = DeferredRegister.create(ForgeRegistries.BLOCKS,
            ChildAbuseMod.modid);

    public static final RegistryObject<Block> shit_block = blocks.register("shit_block",
            () -> new Block(AbstractBlock.Properties.create(Material.SNOW_BLOCK, MaterialColor.SNOW)
                    .hardnessAndResistance(0.2f)
                    .harvestLevel(-1)
                    .sound(SoundType.SLIME)
                    ));

}
