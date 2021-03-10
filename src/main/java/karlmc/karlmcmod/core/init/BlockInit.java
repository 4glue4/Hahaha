package karlmc.karlmcmod.core.init;

import karlmc.karlmcmod.ChildAbuseMod;
import karlmc.karlmcmod.common.Blocks.BasicBlocks;
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

    public static final DeferredRegister<Block> blocks = DeferredRegister.create(ForgeRegistries.BLOCKS, ChildAbuseMod.modid);

    public static final RegistryObject<Block> shit_block = blocks.register("shit_block", () -> BasicBlocks.shit_block);
    public static final RegistryObject<Block> cum_block = blocks.register("cum_block", () -> BasicBlocks.cum_block);
    public static final RegistryObject<Block> cum_ore_block = blocks.register("cum_ore", () -> BasicBlocks.cum_ore_block);

}
