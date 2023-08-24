package top.tksmly;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import top.tksmly.init.*;
@Mod(cute_baka_engine.MOD_ID)
public class cute_baka_engine {
    public static final String MOD_ID = "cute_baka_engine";
    

    public cute_baka_engine(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        // ItemRegistry.ITEMS.register(bus);
        
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeTabInit.TABS.register(bus);
    }
}
