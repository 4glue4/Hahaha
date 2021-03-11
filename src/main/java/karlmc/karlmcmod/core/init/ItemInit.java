package karlmc.karlmcmod.core.init;

import karlmc.karlmcmod.ChildAbuseMod;
import karlmc.karlmcmod.common.items.BasicItems;
import net.minecraft.entity.EntityType;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> items = DeferredRegister.create(ForgeRegistries.ITEMS, ChildAbuseMod.modid);

    // Block Items
    public static final RegistryObject<BlockItem> shit_block = items.register("shit_block", () -> BasicItems.shit_block);
    public static final RegistryObject<BlockItem> cum_block = items.register("shit_block", () -> BasicItems.cum_block);
    public static final RegistryObject<BlockItem> cum_ore_block = items.register("cum_ore_block", () -> BasicItems.cum_ore_block);

    // Materials
    public static final RegistryObject<Item> shit_item = items.register("shit_item", () -> BasicItems.shit_item);
    public static final RegistryObject<Item> cum_item = items.register("cum_item", () -> BasicItems.cum_item);

    // Spawn Eggs
    //public static final RegistryObject<SpawnEggItem> spawn_child = items.register("spawn_child", () -> BasicItems.spawn_child);

}
