package net.Лев.minecraftgnomimod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;


public class ModCreativeModeTab {

    public static final CreativeModeTab minecraftgnomimod_TAB = new CreativeModeTab("GnomiMod") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.Bark.get());
        }
    };
}
