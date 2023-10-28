package net.braylon.tutorialmod.datagen;
import net.braylon.tutorialmod.TutorialMod;
import net.braylon.tutorialmod.block.ModBlocks;
import net.braylon.tutorialmod.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> SAPPHIRE_SMELTABLES = List.of(ModItems.RAW_SAPPHIRE.get(),
            ModBlocks.SAPPHIRE_ORE.get(), ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModBlocks.NETHER_SAPPHIRE_ORE.get(),
            ModBlocks.END_STONE_SAPPHIRE_ORE.get());
    private static final List<ItemLike> ZIRCON_SMELTABLES = List.of(ModItems.RAW_ZIRCON.get(),
            ModBlocks.ZIRCON_ORE.get(), ModBlocks.DEEPSLATE_ZIRCON_ORE.get(), ModBlocks.NETHER_ZIRCON_ORE.get(),
            ModBlocks.END_STONE_ZIRCON_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f, 200, "sapphire");
         oreSmelting(pWriter, ZIRCON_SMELTABLES, RecipeCategory.MISC, ModItems.ZIRCON.get(), 0.25f, 200, "zircon");
        oreBlasting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f, 100, "sapphire");
        oreBlasting(pWriter, ZIRCON_SMELTABLES, RecipeCategory.MISC, ModItems.ZIRCON.get(), 0.25f, 100, "zircon");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ZIRCON_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.ZIRCON.get())
                .unlockedBy(getHasName(ModItems.ZIRCON.get()), has(ModItems.ZIRCON.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JAMES.get())
                .pattern("xxx")
                .pattern("SSS")
                .pattern("xxx")
                .define('S', ModItems.ZIRCON.get())
                .define('x', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.ZIRCON.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AIDEN.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModBlocks.JAMES.get())
                .unlockedBy(getHasName(ModBlocks.JAMES.get()), has(ModBlocks.JAMES.get()))
                .save(pWriter);



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PINE_CONE.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.STICK), has( Items.STICK ))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.METAL_DETECTOR.get())
                .pattern("  S")
                .pattern(" S ")
                .pattern("xx ")
                .define('S', Items.STICK)
                .define('x', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.STICK), has( Items.IRON_INGOT ))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SOUND_BLOCK.get())
                .pattern(" x ")
                .pattern("aSd")
                .pattern("   ")
                .define('S', Items.STICK)
                .define('x', Items.HONEYCOMB)
                .define('a', Items.WHITE_DYE)
                .define('d', Items.BLACK_DYE)
                .unlockedBy(getHasName(Items.STICK), has( Items.IRON_INGOT ))
                .save(pWriter);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 9)
                .requires(ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZIRCON.get(), 9)
                .requires(ModBlocks.ZIRCON_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  TutorialMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}