package net.braylon.tutorialmod.item;

import net.braylon.tutorialmod.TutorialMod;
import net.braylon.tutorialmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(
            new ForgeTier(6, 2500, 15f, 4f, 30,
                    ModTags.Blocks.NEEDS_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
            new ResourceLocation(TutorialMod.MOD_ID, "sapphire"), List.of(Tiers.NETHERITE), List.of());


    public static final Tier ZIRCON = TierSortingRegistry.registerTier(
            new ForgeTier(5, 500, 20f, 4f, 20,
                    ModTags.Blocks.NEEDS_ZIRCON_TOOL, () -> Ingredient.of(ModItems.ZIRCON.get())),
            new ResourceLocation(TutorialMod.MOD_ID, "zircon"), List.of(Tiers.NETHERITE), List.of());
}
// 4 is netherite 5 is above it