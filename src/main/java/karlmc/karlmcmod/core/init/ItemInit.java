package karlmc.karlmcmod.core.init;

import karlmc.karlmcmod.ChildAbuseMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> items = DeferredRegister.create(ForgeRegistries.ITEMS,
            ChildAbuseMod.modid);

    // Food
    public static final RegistryObject<Item> shit_item = items.register("shit_item",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)
                    .food(new Food.Builder().hunger(4).saturation(0.3f).setAlwaysEdible().fastToEat().build())));

    // Block Items
    public static final RegistryObject<BlockItem> shit_block = items.register("shit_block",
            () -> new BlockItem(BlockInit.shit_block.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

}
