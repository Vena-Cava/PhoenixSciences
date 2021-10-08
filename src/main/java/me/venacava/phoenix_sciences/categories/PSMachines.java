package me.venacava.phoenix_sciences.categories;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import me.venacava.phoenix_sciences.PhoenixSciences;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public class PSMachines {
    public static void setup(PhoenixSciences plugin) {
        ItemStack phoSciItem = new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTVhNzUzZjE3ZGUxMzhmY2EzOTUyM2VjMjhlZWY1Y2QzNDZkOTJkMWI3OWVlNTllYzNmODA5MjgxMjM2ZGI1MyJ9fX0=")), "&4Phoenix Sciences", "", "&a> Click to open");

        // Give your Category a unique id.
        NamespacedKey phoSciId = new NamespacedKey(plugin, "phoenix_sciences");
        NestedItemGroup phoSciGroup = new NestedItemGroup(phoSciId, phoSciItem);

        /*
         * Machines Sub-Category
         */
        ItemStack phoSciMachItem = new CustomItemStack(Material.IRON_BLOCK, "&4Phoenix Sciences - Machines", "", "&a> Click to open");

        // Give your Category a unique id.
        NamespacedKey phoSciMachId = new NamespacedKey(plugin, "phoenix_sciences_machines");
        SubItemGroup phoSciMachGroup = new SubItemGroup(phoSciMachId, phoSciGroup, phoSciMachItem);

        /*
         * Hard-Light Bridge Projector
         */
        SlimefunItemStack hardlightBridgeProjector = new SlimefunItemStack("PHOENIXSCIENCES_HARDLIGHT_BRIDGE_PROJECTOR",
                Material.OBSERVER,
                "&fHard-Light Projector",
                "&7When Paired with a Powered Neonic Core, will project Hard-Light until it hits a Stopper."
        );

        ItemStack[] hardlightBridgeProjectorRecipe = {
                cybSteIng.getItem(), new ItemStack(Material.GLASS), cybSteIng.getItem(),
                synthPar.getItem(), new ItemStack(Material.DISPENSER), synthPar.getItem(),
                cybSteIng.getItem(), SlimefunItems.MEDIUM_CAPACITOR, cybSteIng.getItem()
        };

        SlimefunItem harLiBriPro = new SlimefunItem(
                phoSciMachGroup,
                hardlightBridgeProjector,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                hardlightBridgeProjectorRecipe
        );
        harLiBriPro.register(plugin);

        /*
         * White Neonic Power Core
         */
        SlimefunItemStack neonicPowerCoreWhite = new SlimefunItemStack("PHOENIXSCIENCES_NEONIC_POWER_CORE_WHITE",
                Material.WHITE_CONCRETE,
                "&fNeonic Power Core",
                "&7Power Cores that when paired with certain machines, will power them for a while.",
                "&7Color: &f&lWhite"
        );

        ItemStack[] neonicPowerCoreWhiteRecipe = {
                cybSteIng.getItem(), new ItemStack(Material.GLASS), cybSteIng.getItem(),
                neoCrysWhi.getItem(), SlimefunItems.ENERGIZED_CAPACITOR, neoCrysWhi.getItem(),
                cybSteIng.getItem(), neoCrysWhi.getItem(), cybSteIng.getItem()
        };

        SlimefunItem neoCorWhi = new SlimefunItem(
                phoSciMachGroup,
                neonicPowerCoreWhite,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                neonicPowerCoreWhiteRecipe
        );
        neoCorWhi.register(plugin);
    }
}
