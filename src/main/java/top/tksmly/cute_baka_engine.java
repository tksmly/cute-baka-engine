package top.tksmly;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Supplier;

@Mod(cute_baka_engine.MOD_ID)
public class cute_baka_engine {
    public static final String MOD_ID = "cute_baka_engine";

    //批量注册的列表
    public static final List<Supplier<? extends ItemLike>>TAB_ITEMS = new ArrayList<>();
    public cute_baka_engine(){
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final RegistryObject<CreativeModeTab> ETAB = TABS.register("tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("item_group." + MOD_ID + ".example"))
                    .displayItems((params, output) -> {
                        TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get()));
                    })
                    .build());
    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemlike){
        TAB_ITEMS.add(itemlike);
        return itemlike;
    }
}
