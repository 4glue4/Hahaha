package karlmc.karlmcmod.core.init;

import karlmc.karlmcmod.ChildAbuseMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> items = DeferredRegister.create(ForgeRegistries.ITEMS,
            ChildAbuseMod.modid);

    public static final RegistryObject<Item> shit_item = items.register("shit_item",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
}
