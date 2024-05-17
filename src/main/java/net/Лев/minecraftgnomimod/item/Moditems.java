package net.Лев.minecraftgnomimod.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.Лев.minecraftgnomimod.armor.ModArmors;
import net.Лев.minecraftgnomimod.minecraftgnomimod;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Moditems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, minecraftgnomimod.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


    public static RegistryObject<Item> Bark_CHESTPLATE = ITEMS.register ("bark_chestplate",
            () -> new ArmorItem(ModArmors.Bark, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.minecraftgnomimod_TAB)));

    public static RegistryObject<Item> Bark_HELMET = ITEMS.register ("bark_helmet",
            () -> new ArmorItem(ModArmors.Bark, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.minecraftgnomimod_TAB)));

    public static RegistryObject<Item> Bark_LEGGINGS = ITEMS.register ("bark_leggings",
            () -> new ArmorItem(ModArmors.Bark, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.minecraftgnomimod_TAB)));

    public static RegistryObject<Item> Bark_BOOTS = ITEMS.register ("bark_boots",
            () -> new ArmorItem(ModArmors.Bark, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.minecraftgnomimod_TAB)));





    public static RegistryObject<Item> Bark_SWORD = ITEMS.register ("bark_sword",
            () -> new SwordItem(ModTiers.BARK, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.minecraftgnomimod_TAB)));
    public static RegistryObject<Item> Bark_AXE = ITEMS.register ("bark_axe",
            () -> new AxeItem(ModTiers.BARK, 4, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.minecraftgnomimod_TAB)));

    public static RegistryObject<Item> Bark_PICKAXE = ITEMS.register ("bark_pickaxe",
            () -> new PickaxeItem(ModTiers.BARK, 1, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.minecraftgnomimod_TAB)));
    public static RegistryObject<Item> Bark_HOE = ITEMS.register ("bark_hoe",
            () -> new HoeItem(ModTiers.BARK, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.minecraftgnomimod_TAB)));

    public static RegistryObject<Item> Bark_SHOVEL = ITEMS.register ("bark_shovel",
            () -> new ShovelItem(ModTiers.BARK, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.minecraftgnomimod_TAB)));
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static final RegistryObject<Item> woodchips = ITEMS.register("woodchips",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.minecraftgnomimod_TAB)));



    public static final RegistryObject<Item> Bark = ITEMS.register("bark",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.minecraftgnomimod_TAB)));


}
