package top.tksmly;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, cute_baka_engine.MOD_ID);
    public static final RegistryObject<Item> LILY_CORE = ITEMS.register("lily_core", () -> new Item(new Item.Properties()));
}
