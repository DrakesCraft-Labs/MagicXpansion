package me.apeiros.magicxpansion.setup.items.materials;

import com.github.drakescraft_labs.slimefun4.core.attributes.Radioactive;
import com.github.drakescraft_labs.slimefun4.core.attributes.Radioactivity;
import com.github.drakescraft_labs.slimefun4.implementation.items.blocks.UnplaceableBlock;
import com.github.drakescraft_labs.slimefun4.api.recipes.RecipeType;
import com.github.drakescraft_labs.slimefun4.api.items.ItemGroup;
import com.github.drakescraft_labs.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;

public class EnergyCore extends UnplaceableBlock implements Radioactive {

    public EnergyCore(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    public Radioactivity getRadioactivity() {
        return Radioactivity.VERY_HIGH;
    }
}
