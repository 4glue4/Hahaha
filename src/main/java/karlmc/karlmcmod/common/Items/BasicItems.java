package karlmc.karlmcmod.common.items;


import karlmc.karlmcmod.ChildAbuseMod;
import karlmc.karlmcmod.common.blocks.BasicBlocks;
import karlmc.karlmcmod.core.init.BlockInit;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;

public class BasicItems {

    // Block Items
    public static BlockItem shit_block = new BlockItem(BasicBlocks.shit_block, new Item.Properties().group(ChildAbuseMod.poopy));
    public static BlockItem cum_block = new BlockItem(BasicBlocks.cum_block, new Item.Properties().group(ChildAbuseMod.poopy));
    public static BlockItem cum_ore_block = new BlockItem(BasicBlocks.cum_ore_block, new Item.Properties().group(ChildAbuseMod.poopy));

    // Materials
    public static Item shit_item = new Item(new Item.Properties().group(ChildAbuseMod.poopy).food(new Food.Builder().hunger(4).saturation(0.3f).setAlwaysEdible().fastToEat().build()));
    public static Item cum_item = new Item(new Item.Properties().group(ChildAbuseMod.poopy));

    // Spawn Eggs
    //public static SpawnEggItem spawn_child = new SpawnEggItem(entity, c1, c2, new Item.Properties().group(ChildAbuseMod.poopy));


}
