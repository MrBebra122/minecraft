package net.Лев.minecraftgnomimod;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.Лев.minecraftgnomimod.block.ModBlocks;
import net.Лев.minecraftgnomimod.item.Moditems;
import org.slf4j.Logger;


@Mod(minecraftgnomimod.MOD_ID)
public class minecraftgnomimod
{

    public static final String MOD_ID = "minecraftgnomimod";

    private static final Logger LOGGER = LogUtils.getLogger();

    public minecraftgnomimod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


        Moditems.register(modEventBus);

        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
