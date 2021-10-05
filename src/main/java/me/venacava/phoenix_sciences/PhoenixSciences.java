package me.venacava.phoenix_sciences;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;

public class PhoenixSciences extends JavaPlugin implements SlimefunAddon {

    @Override
    public void onEnable() {
        // Read something from your config.yml
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            // You could start an Auto-Updater for example
        }

        /*
         * 1. Creating a new Category
         * This Category will use the following ItemStack
         */
        ItemStack itemGroupItem = new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTVhNzUzZjE3ZGUxMzhmY2EzOTUyM2VjMjhlZWY1Y2QzNDZkOTJkMWI3OWVlNTllYzNmODA5MjgxMjM2ZGI1MyJ9fX0=")), "&4Phoenix Sciences", "", "&a> Click to open");

        // Give your Category a unique id.
        NamespacedKey itemGroupId = new NamespacedKey(this, "phoenix_sciences");
        ItemGroup itemGroup = new ItemGroup(itemGroupId, itemGroupItem);


        /*
         * Synthetic Ruby
         */
        SlimefunItemStack SyntheticRuby = new SlimefunItemStack("SYNTHETIC_RUBY", PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzIwZWYwNmRkNjA0OTk3NjZhYzhjZTE1ZDJiZWE0MWQyODEzZmU1NTcxODg2NGI1MmRjNDFjYmFhZTFlYTkxMyJ9fX0=")), "&4Synthetic Ruby", "&c+20% Coolness");


        ItemStack[] SyntheticRubyRecipe = { SlimefunItems.ALUMINUM_DUST,  new ItemStack(Material.GLASS),    new ItemStack(Material.GLASS_PANE),
                                            SlimefunItems.ALUMINUM_INGOT, new ItemStack(Material.REDSTONE), null,
                                            null,                         null,                             null };

        SlimefunItem SynthRub = new SlimefunItem(itemGroup, SyntheticRuby, RecipeType.SMELTERY, SyntheticRubyRecipe);
        SynthRub.register(this);

        /*
         * Synthetic Topaz
         */
        SlimefunItemStack SyntheticTopaz = new SlimefunItemStack("SYNTHETIC_TOPAZ", PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmM3NjY3ZGJlMjZmNjA3YjY5OWM5MzAzZTc0Zjg5NTEwZGFjNzU0M2UwYzkyY2VmOTliMzM0NTQ5YzU3YzQ4YSJ9fX0=")), "&eSynthetic Topaz", "&c+20% Coolness");

        ItemStack[] SyntheticTopazRecipe = { SlimefunItems.ALUMINUM_DUST,  new ItemStack(Material.GLASS),         new ItemStack(Material.GLASS_PANE),
                                             SlimefunItems.ALUMINUM_INGOT, new ItemStack(Material.YELLOW_DYE),    null,
                                             null,                         null,                                  null };

        SlimefunItem SynthTop = new SlimefunItem(itemGroup, SyntheticTopaz, RecipeType.SMELTERY, SyntheticTopazRecipe);
        SynthTop.register(this);

        /*
         * Synthetic Amethyst
         */
        SlimefunItemStack SyntheticAmethyst = new SlimefunItemStack("SYNTHETIC_AMETHYST", PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2FkOGNjOTgyNzg2ZmI0ZDQwYjBiNmU2NGE0MWYwZDk3MzZmOWMyNmFmZmI4OThmNGE3ZmFlYTg4Y2NmODk5NyJ9fX0=")), "&dSynthetic Amethyst", "&c+20% Coolness");

        ItemStack[] SyntheticAmethystRecipe = { SlimefunItems.ALUMINUM_DUST,  new ItemStack(Material.GLASS),         new ItemStack(Material.GLASS_PANE),
                                                SlimefunItems.ALUMINUM_INGOT, SlimefunItems.SYNTHETIC_SAPPHIRE,      SynthRub.getItem(),
                                                null,                         null,                                  null };

        SlimefunItem SynthAme = new SlimefunItem(itemGroup, SyntheticAmethyst, RecipeType.SMELTERY, SyntheticAmethystRecipe);
        SynthAme.register(this);

        /*
         * Synthetic Amber
         */
        SlimefunItemStack SyntheticAmber = new SlimefunItemStack("SYNTHETIC_AMBER", PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWFjZTZiYjNhYTRjY2FjMDMxMTY4MjAyZjZkNDUzMjU5N2JjYWM2MzUxMDU5YWJkOWQxMGIyODYxMDQ5M2FlYiJ9fX0=")), "&6Synthetic Amber", "&c+20% Coolness");

        ItemStack[] SyntheticAmberRecipe = { SlimefunItems.ALUMINUM_DUST,  new ItemStack(Material.GLASS),         new ItemStack(Material.GLASS_PANE),
                                             SlimefunItems.ALUMINUM_INGOT, SynthTop.getItem(),                    SynthRub.getItem(),
                                             null,                         null,                                  null };

        SlimefunItem SynthAmb = new SlimefunItem(itemGroup, SyntheticAmber, RecipeType.SMELTERY, SyntheticAmberRecipe);
        SynthAmb.register(this);

        /*
         * Synthetic Quartz
         */
        SlimefunItemStack SyntheticQuartz = new SlimefunItemStack("SYNTHETIC_QUARTZ", PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZThjZGU2NzAwMzcyMmRiODE4Mjk5YmNiZWM4ODMyODlkMThkYzkzMzJkZTgwOTgzNDAwYTg3ZjIwNTQ0MzkyYSJ9fX0=")), "&fSynthetic Quartz", "&c+20% Coolness");

        ItemStack[] SyntheticQuartzRecipe = { SlimefunItems.ALUMINUM_DUST,  new ItemStack(Material.GLASS),         new ItemStack(Material.GLASS_PANE),
                                              SlimefunItems.ALUMINUM_INGOT, new ItemStack(Material.BONE_MEAL),     null,
                                              null,                         null,                                  null };

        SlimefunItem SynthQua = new SlimefunItem(itemGroup, SyntheticQuartz, RecipeType.SMELTERY, SyntheticQuartzRecipe);
        SynthQua.register(this);

        /*
         * Synthetic Onyx
         */
        SlimefunItemStack SyntheticOnyx = new SlimefunItemStack("SYNTHETIC_ONYX", PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzY5ZWM3MjJkOWNiNmVkOWJhZTkzYzI2NmJkMDk4ZjBhMzA2YzVlOGMwMzg0OWMyN2NkY2YxOGM2MGQ2Y2IzZSJ9fX0=")), "&0Synthetic Onyx", "&c+20% Coolness");

        ItemStack[] SyntheticOnyxRecipe = { SlimefunItems.ALUMINUM_DUST,  new ItemStack(Material.GLASS),         new ItemStack(Material.GLASS_PANE),
                                            SlimefunItems.ALUMINUM_INGOT, new ItemStack(Material.BLACK_DYE),     null,
                                            null,                         null,                                  null };

        SlimefunItem SynthOny = new SlimefunItem(itemGroup, SyntheticOnyx, RecipeType.SMELTERY, SyntheticOnyxRecipe);
        SynthOny.register(this);

        /*
         * Synthetic Paragon
         */
        SlimefunItemStack SyntheticParagon = new SlimefunItemStack("SYNTHETIC_PARAGON", PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDlhZTg4YTdkMDNmNDc0NTU4YTA1NjkyZTVmNWMzYWRlMzEyZGRmMTA3MjE2NmFkMDQyNjMzNGVmNTE3NGI4NyJ9fX0=")), "&f&lSynthetic Paragon", "&fThe Perfect Gemstone. 100% Purity.");

        ItemStack[] SyntheticParagonRecipe = { SynthAme.getItem(),  SlimefunItems.SYNTHETIC_SAPPHIRE,   SlimefunItems.SYNTHETIC_EMERALD,
                                               SynthQua.getItem(),  SlimefunItems.SYNTHETIC_DIAMOND,    SynthOny.getItem(),
                                               SynthRub.getItem(),  SynthAmb.getItem(),                 SynthTop.getItem() };

        SlimefunItem SynthPar = new SlimefunItem(itemGroup, SyntheticParagon, RecipeType.COMPRESSOR, SyntheticParagonRecipe);
        SynthPar.register(this);
        
        /*
         * Liquid Air
         */
        SlimefunItemStack LiquidAir = new SlimefunItemStack("LIQUID_AIR", Material.WATER_BOTTLE), "Liquid Air", "&7Supercold Air, so cold that it condensed into a liquid.");

        ItemStack[] LiquidAirRecipe = { new ItemStack(Material.GLASS_BOTTLE),   null,              null };
                                        null,                                   null,              null };
                                        null,                                   null,              null };

        SlimefunItem LiquiAir = new SlimefunItem(itemGroup, LiquidAir, RecipeType.FREEZER, LiquidAirRecipe);
        LiquiAir.register(this);
        
        /*
         * Neon Gas
         */
        SlimefunItemStack NeonGas = new SlimefunItemStack("NEON_GAS", Material.DRAGON_BREATH), "Neon Gas", "&7Neon Gas in a Bottle.");

        ItemStack[] NeonGasRecipe = { LiquiAir.getItem(),       null,       null };
                                      null,                     null,       null };
                                      null,                     null,       null };

        SlimefunItem NeoGas = new SlimefunItem(itemGroup, NeonGas, RecipeType.SMELTERY, NeonGasRecipe);
        NeoGas.register(this);

    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        // You can return a link to your Bug Tracker instead of null here
        return null;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        /*
         * You will need to return a reference to your Plugin here.
         * If you are using your main class for this, simply return "this".
         */
        return this;
    }

}
