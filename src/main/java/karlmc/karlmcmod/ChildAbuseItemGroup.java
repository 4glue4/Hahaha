package karlmc.karlmcmod;

import karlmc.karlmcmod.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class ChildAbuseItemGroup extends ItemGroup {

    public ChildAbuseItemGroup() {
        super("Big_Pussy");
    }

    @Override
    public @NotNull ItemStack createIcon() {
        return new ItemStack(ItemInit.shit_item.get());
    }
}
