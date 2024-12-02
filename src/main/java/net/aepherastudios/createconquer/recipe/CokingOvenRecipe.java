package net.aepherastudios.createconquer.recipe;

import com.mojang.datafixers.schemas.Schema;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.datafix.fixes.FurnaceRecipeFix;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SmeltingRecipe;

public class CokingOvenRecipe extends SmeltingRecipe {

    public CokingOvenRecipe(ResourceLocation pId, String pGroup, CookingBookCategory pCategory, Ingredient pIngredient, ItemStack pResult, float pExperience, int pCookingTime) {
        super(pId, pGroup, pCategory, pIngredient, pResult, pExperience, pCookingTime);
    }


}
