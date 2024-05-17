package net.Лев.minecraftgnomimod.item;


import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTiers {
    public static final ForgeTier BARK = new ForgeTier(2, 1400, 1.5f,2f,
            22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Moditems.Bark.get()));
}