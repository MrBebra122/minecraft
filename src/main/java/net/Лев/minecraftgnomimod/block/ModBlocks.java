package net.Лев.minecraftgnomimod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SupportType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.Лев.minecraftgnomimod.item.ModCreativeModeTab;
import net.Лев.minecraftgnomimod.item.Moditems;
import net.Лев.minecraftgnomimod.minecraftgnomimod;

import java.util.function.Supplier;

import static net.minecraftforge.network.ConnectionData.ModMismatchData.registry;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, minecraftgnomimod.MOD_ID);





    //блок деревянной коры
    public static final RegistryObject<Block> BARK_BLOCK = registryBlock("bark_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.minecraftgnomimod_TAB);







    public static <T extends Block>RegistryObject<T> registryBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturns = BLOCKS.register(name, block);
        registryBlockItem(name, toReturns, tab);
        return toReturns;

    }

    public static <T extends Block>RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return Moditems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
