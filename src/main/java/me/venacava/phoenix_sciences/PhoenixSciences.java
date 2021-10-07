package me.venacava.phoenix_sciences;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

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
        ItemStack PhoSciItem = new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTVhNzUzZjE3ZGUxMzhmY2EzOTUyM2VjMjhlZWY1Y2QzNDZkOTJkMWI3OWVlNTllYzNmODA5MjgxMjM2ZGI1MyJ9fX0=")), "&4Phoenix Sciences", "", "&a> Click to open");

        // Give your Category a unique id.
        NamespacedKey PhoSciId = new NamespacedKey(this, "phoenix_sciences");
        NestedItemGroup PhoSciGroup = new NestedItemGroup(PhoSciId, PhoSciItem);

        /*
         * Resources Sub-Category
         */
        ItemStack PhoSciResoItem = new CustomItemStack(Material.REDSTONE_BLOCK, "&4Phoenix Sciences - Resources", "", "&a> Click to open");

        // Give your Category a unique id.
        NamespacedKey PhoSciResoID = new NamespacedKey(this, "phoenix_sciences_resources");
        ItemGroup PhoSciResoGroup = new ItemGroup(PhoSciResoID, PhoSciResoItem);

        /*
         * Synthetic Ruby
         */
        SlimefunItemStack SyntheticRuby = new SlimefunItemStack("PHOENIXSCIENCES_SYNTHETIC_RUBY", PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzIwZWYwNmRkNjA0OTk3NjZhYzhjZTE1ZDJiZWE0MWQyODEzZmU1NTcxODg2NGI1MmRjNDFjYmFhZTFlYTkxMyJ9fX0=")), "&4Synthetic Ruby", "&c+20% Coolness");

        ItemStack[] SyntheticRubyRecipe = {
                SlimefunItems.ALUMINUM_DUST, new ItemStack(Material.GLASS), new ItemStack(Material.GLASS_PANE),
                SlimefunItems.ALUMINUM_INGOT, new ItemStack(Material.REDSTONE), null,
                null, null, null
        };

        SlimefunItem SynthRub = new SlimefunItem(
                PhoSciResoGroup,
                SyntheticRuby,
                RecipeType.SMELTERY,
                SyntheticRubyRecipe
        );
        SynthRub.register(this);

        /*
         * Synthetic Topaz
         */
        SlimefunItemStack SyntheticTopaz = new SlimefunItemStack("PHOENIXSCIENCES_SYNTHETIC_TOPAZ", PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmM3NjY3ZGJlMjZmNjA3YjY5OWM5MzAzZTc0Zjg5NTEwZGFjNzU0M2UwYzkyY2VmOTliMzM0NTQ5YzU3YzQ4YSJ9fX0=")), "&eSynthetic Topaz", "&c+20% Coolness");

        ItemStack[] SyntheticTopazRecipe = {
                SlimefunItems.ALUMINUM_DUST, new ItemStack(Material.GLASS), new ItemStack(Material.GLASS_PANE),
                SlimefunItems.ALUMINUM_INGOT, new ItemStack(Material.YELLOW_DYE), null,
                null, null, null
        };

        SlimefunItem SynthTop = new SlimefunItem(
                PhoSciResoGroup,
                SyntheticTopaz,
                RecipeType.SMELTERY,
                SyntheticTopazRecipe
        );
        SynthTop.register(this);

        /*
         * Synthetic Amethyst
         */
        SlimefunItemStack SyntheticAmethyst = new SlimefunItemStack("PHOENIXSCIENCES_SYNTHETIC_AMETHYST", PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2FkOGNjOTgyNzg2ZmI0ZDQwYjBiNmU2NGE0MWYwZDk3MzZmOWMyNmFmZmI4OThmNGE3ZmFlYTg4Y2NmODk5NyJ9fX0=")), "&dSynthetic Amethyst", "&c+20% Coolness");

        ItemStack[] SyntheticAmethystRecipe = {
                SlimefunItems.ALUMINUM_DUST,    new ItemStack(Material.GLASS),      new ItemStack(Material.GLASS_PANE),
                SlimefunItems.ALUMINUM_INGOT,   SlimefunItems.SYNTHETIC_SAPPHIRE,   SynthRub.getItem(),
                null,                           null,                               null
        };

        SlimefunItem SynthAme = new SlimefunItem(
                PhoSciResoGroup,
                SyntheticAmethyst,
                RecipeType.SMELTERY,
                SyntheticAmethystRecipe
        );
        SynthAme.register(this);

        /*
         * Synthetic Amber
         */
        SlimefunItemStack SyntheticAmber = new SlimefunItemStack("PHOENIXSCIENCES_SYNTHETIC_AMBER", PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWFjZTZiYjNhYTRjY2FjMDMxMTY4MjAyZjZkNDUzMjU5N2JjYWM2MzUxMDU5YWJkOWQxMGIyODYxMDQ5M2FlYiJ9fX0=")), "&6Synthetic Amber", "&c+20% Coolness");

        ItemStack[] SyntheticAmberRecipe = {
                SlimefunItems.ALUMINUM_DUST, new ItemStack(Material.GLASS), new ItemStack(Material.GLASS_PANE),
                SlimefunItems.ALUMINUM_INGOT, SynthTop.getItem(), SynthRub.getItem(),
                null, null, null
        };

        SlimefunItem SynthAmb = new SlimefunItem(
                PhoSciResoGroup,
                SyntheticAmber,
                RecipeType.SMELTERY,
                SyntheticAmberRecipe
        );
        SynthAmb.register(this);

        /*
         * Synthetic Quartz
         */
        SlimefunItemStack SyntheticQuartz = new SlimefunItemStack("PHOENIXSCIENCES_SYNTHETIC_QUARTZ", PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZThjZGU2NzAwMzcyMmRiODE4Mjk5YmNiZWM4ODMyODlkMThkYzkzMzJkZTgwOTgzNDAwYTg3ZjIwNTQ0MzkyYSJ9fX0=")), "&fSynthetic Quartz", "&c+20% Coolness");

        ItemStack[] SyntheticQuartzRecipe = {
                SlimefunItems.ALUMINUM_DUST, new ItemStack(Material.GLASS), new ItemStack(Material.GLASS_PANE),
                SlimefunItems.ALUMINUM_INGOT, new ItemStack(Material.BONE_MEAL), null,
                null, null, null
        };

        SlimefunItem SynthQua = new SlimefunItem(
                PhoSciResoGroup,
                SyntheticQuartz,
                RecipeType.SMELTERY,
                SyntheticQuartzRecipe
        );
        SynthQua.register(this);

        /*
         * Synthetic Onyx
         */
        SlimefunItemStack SyntheticOnyx = new SlimefunItemStack("PHOENIXSCIENCES_SYNTHETIC_ONYX", PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzY5ZWM3MjJkOWNiNmVkOWJhZTkzYzI2NmJkMDk4ZjBhMzA2YzVlOGMwMzg0OWMyN2NkY2YxOGM2MGQ2Y2IzZSJ9fX0=")), "&0Synthetic Onyx", "&c+20% Coolness");

        ItemStack[] SyntheticOnyxRecipe = {
                SlimefunItems.ALUMINUM_DUST, new ItemStack(Material.GLASS), new ItemStack(Material.GLASS_PANE),
                SlimefunItems.ALUMINUM_INGOT, new ItemStack(Material.BLACK_DYE), null,
                null, null, null
        };

        SlimefunItem SynthOny = new SlimefunItem(
                PhoSciResoGroup,
                SyntheticOnyx,
                RecipeType.SMELTERY,
                SyntheticOnyxRecipe
        );
        SynthOny.register(this);

        /*
         * Synthetic Paragon
         */
        SlimefunItemStack SyntheticParagon = new SlimefunItemStack("PHOENIXSCIENCES_SYNTHETIC_PARAGON", PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDlhZTg4YTdkMDNmNDc0NTU4YTA1NjkyZTVmNWMzYWRlMzEyZGRmMTA3MjE2NmFkMDQyNjMzNGVmNTE3NGI4NyJ9fX0=")), "&f&lSynthetic Paragon", "&fThe Perfect Gemstone. 100% Purity.");

        ItemStack[] SyntheticParagonRecipe = {
                SynthAme.getItem(), SlimefunItems.SYNTHETIC_SAPPHIRE, SlimefunItems.SYNTHETIC_EMERALD,
                SynthQua.getItem(), SlimefunItems.SYNTHETIC_DIAMOND, SynthOny.getItem(),
                SynthRub.getItem(), SynthAmb.getItem(), SynthTop.getItem()
        };

        SlimefunItem SynthPar = new SlimefunItem(
                PhoSciResoGroup,
                SyntheticParagon,
                RecipeType.COMPRESSOR,
                SyntheticParagonRecipe
        );
        SynthPar.register(this);

        /*
         * Liquid Air
         */
        SlimefunItemStack LiquidAir = new SlimefunItemStack("PHOENIXSCIENCES_LIQUID_AIR", Material.POTION, "&fLiquid Air", "&7Supercold Air, so cold that it condensed into a liquid.");

        PotionMeta meta = (PotionMeta) LiquidAir.getItemMeta();
        meta.setBasePotionData(new PotionData(PotionType.WATER));
        meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        LiquidAir.setItemMeta(meta);

        ItemStack[] LiquidAirRecipe = {
                new ItemStack(Material.GLASS_BOTTLE), null, null,
                null, null, null,
                null, null, null
        };

        SlimefunItem LiqAir = new SlimefunItem(
                PhoSciResoGroup,
                LiquidAir,
                RecipeType.FREEZER,
                LiquidAirRecipe
        );
        LiqAir.register(this);

        /*
         * Neon Gas
         */
        SlimefunItemStack NeonGas = new SlimefunItemStack("PHOENIXSCIENCES_NEON_GAS", Material.DRAGON_BREATH, "&fNeon Gas", "&7Neon Gas in a Bottle.");

        ItemStack[] NeonGasRecipe = {
                LiqAir.getItem(), null, null,
                null, null, null,
                null, null, null
        };

        SlimefunItem NeoGas = new SlimefunItem(
                PhoSciResoGroup,
                NeonGas,
                RecipeType.SMELTERY,
                NeonGasRecipe
        );
        NeoGas.register(this);

        /*
         * White Neonite Crystal
         */
        SlimefunItemStack NeoniteWhite = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_WHITE",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTFmY2E1ZGU0ZDRhYjhjMGU5YzUwMWIxOTIzYWY5NDUxZDgxNDcxOGZiZGU3MGZlOWQyYTg3Mjg4OTc1MzAwNCJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &f&lWhite"
        );

        ItemStack[] NeoniteWhiteRecipe = {
                NeoGas.getItem(),       new ItemStack(Material.WHITE_DYE),  NeoGas.getItem(),
                SynthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,        SynthPar.getItem(),
                NeoGas.getItem(),       new ItemStack(Material.WHITE_DYE),  NeoGas.getItem()
        };

        SlimefunItem NeoCrysWhi = new SlimefunItem(
                PhoSciResoGroup,
                NeoniteWhite,
                RecipeType.SMELTERY,
                NeoniteWhiteRecipe
        );
        NeoCrysWhi.register(this);

        /*
         * Red Neonite Crystal
         */
        SlimefunItemStack NeoniteRed = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_RED",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTg1ZWMyZTA4YTE4NjBjNTViODYxZTdkYjIwODU1NjQwMzVlOTQxMDdiMjYwZmFlMmZhZGQ0NWE4YTFhOTZkOCJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &4&lRed"
        );

        ItemStack[] NeoniteRedRecipe = {
                NeoGas.getItem(),       new ItemStack(Material.RED_DYE),    NeoGas.getItem(),
                SynthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,        SynthPar.getItem(),
                NeoGas.getItem(),       new ItemStack(Material.RED_DYE),    NeoGas.getItem()
        };

        SlimefunItem NeoCrysRed = new SlimefunItem(
                PhoSciResoGroup,
                NeoniteRed,
                RecipeType.SMELTERY,
                NeoniteRedRecipe
        );
        NeoCrysRed.register(this);

        /*
         * Green Neonite Crystal
         */
        SlimefunItemStack NeoniteGreen = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_GREEN",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODBlMzNiM2ExODA4MjI1MzgxMWY1NTcxMzJlYjc0ODcyYzBjY2QzYzlkMGI3OGUzYThiYzYxODFiNGQ0NjRiIn19fQ==")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &2&lGreen"
        );

        ItemStack[] NeoniteGreenRecipe = {
                NeoGas.getItem(),       new ItemStack(Material.GREEN_DYE),    NeoGas.getItem(),
                SynthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,          SynthPar.getItem(),
                NeoGas.getItem(),       new ItemStack(Material.GREEN_DYE),    NeoGas.getItem()
        };

        SlimefunItem NeoCrysGre = new SlimefunItem(
                PhoSciResoGroup,
                NeoniteGreen,
                RecipeType.SMELTERY,
                NeoniteGreenRecipe
        );
        NeoCrysGre.register(this);

        /*
         * Brown Neonite Crystal
         */
        SlimefunItemStack NeoniteBrown = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_BROWN",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzMxY2RhNWIwYmYwZWNhMWFmMjkwZmNhN2EwY2YyZjIxZGJlM2I5OTk0YTgzYWZiNWIzNTRmMDU3ODkyNTliNSJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &6&lBrown"
        );

        ItemStack[] NeoniteBrownRecipe = {
                NeoGas.getItem(),       new ItemStack(Material.BROWN_DYE),    NeoGas.getItem(),
                SynthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,          SynthPar.getItem(),
                NeoGas.getItem(),       new ItemStack(Material.BROWN_DYE),    NeoGas.getItem()
        };

        SlimefunItem NeoCrysBro = new SlimefunItem(
                PhoSciResoGroup,
                NeoniteBrown,
                RecipeType.SMELTERY,
                NeoniteBrownRecipe
        );
        NeoCrysBro.register(this);

        /*
         * Blue Neonite Crystal
         */
        SlimefunItemStack NeoniteBlue = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_BLUE",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTI2NzhjNGRiNTQ4OTM1OTg2YzgxNjQ1ZDRjYjhlZmJlNjllZjQwOWRmYzc2NWNkMWIyMWFiMTMwMmE5N2ExNyJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &1&lBlue"
        );

        ItemStack[] NeoniteBlueRecipe = {
                NeoGas.getItem(),       new ItemStack(Material.BLUE_DYE),    NeoGas.getItem(),
                SynthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,         SynthPar.getItem(),
                NeoGas.getItem(),       new ItemStack(Material.BLUE_DYE),    NeoGas.getItem()
        };

        SlimefunItem NeoCrysBlu = new SlimefunItem(
                PhoSciResoGroup,
                NeoniteBlue,
                RecipeType.SMELTERY,
                NeoniteBlueRecipe
        );
        NeoCrysBlu.register(this);

        /*
         * Purple Neonite Crystal
         */
        SlimefunItemStack NeonitePurple = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_PURPLE",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDRkNDMzNTU1MGFiNDE4MTdhZWEyMGI0NzFlMDZiZjFkNGVlZWEwMGY1YmYzYjU5NTg4NzM3MTA3NDU0OWMzYiJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &5&lPurple"
        );

        ItemStack[] NeonitePurpleRecipe = {
                NeoGas.getItem(),       new ItemStack(Material.PURPLE_DYE),    NeoGas.getItem(),
                SynthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,           SynthPar.getItem(),
                NeoGas.getItem(),       new ItemStack(Material.PURPLE_DYE),    NeoGas.getItem()
        };

        SlimefunItem NeoCrysPur = new SlimefunItem(
                PhoSciResoGroup,
                NeonitePurple,
                RecipeType.SMELTERY,
                NeonitePurpleRecipe
        );
        NeoCrysPur.register(this);

        /*
         * Cyan Neonite Crystal
         */
        SlimefunItemStack NeoniteCyan = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_CYAN",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODUzODMwNDU5OGRhNjgxOTMyMjYwY2M3MTQ1NmM0YTdjZDBiNDlhZDZmZWIyMzE1OWRhNGEwNjRkM2I4NDVmZSJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &3&lCyan"
        );

        ItemStack[] NeoniteCyanRecipe = {
                NeoGas.getItem(),       new ItemStack(Material.CYAN_DYE),    NeoGas.getItem(),
                SynthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,         SynthPar.getItem(),
                NeoGas.getItem(),       new ItemStack(Material.CYAN_DYE),    NeoGas.getItem()
        };

        SlimefunItem NeoCrysCya = new SlimefunItem(
                PhoSciResoGroup,
                NeoniteCyan,
                RecipeType.SMELTERY,
                NeoniteCyanRecipe
        );
        NeoCrysCya.register(this);

        /*
         * Light Gray Neonite Crystal
         */
        SlimefunItemStack NeoniteLightGray = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_LIGHT_GRAY",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjU0ZjE4Y2NkMjM4ODE3YWM0MjZlN2ZkZmUzMjA3ZDJkYjhhYTlkODQ0ZWYwODQwYTE1NjA0MWEwZThlMzdiZCJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &7&lLight Gray"
        );

        ItemStack[] NeoniteLightGrayRecipe = {
                NeoGas.getItem(),       new ItemStack(Material.LIGHT_GRAY_DYE),    NeoGas.getItem(),
                SynthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,               SynthPar.getItem(),
                NeoGas.getItem(),       new ItemStack(Material.LIGHT_GRAY_DYE),    NeoGas.getItem()
        };

        SlimefunItem NeoCrysLiGra = new SlimefunItem(
                PhoSciResoGroup,
                NeoniteLightGray,
                RecipeType.SMELTERY,
                NeoniteLightGrayRecipe
        );
        NeoCrysLiGra.register(this);

        /*
         * Gray Neonite Crystal
         */
        SlimefunItemStack NeoniteGray = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_PURPLE",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjY4ZWNjZTBmMmVmM2IxZWRkMDMwNzZhMDNiMmFjMTIyMGMzNThlZmQ0M2NiYzkwY2FlOWQxMmQwZjdlMGQ2YyJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &8&lGray"
        );

        ItemStack[] NeoniteGrayRecipe = {
                NeoGas.getItem(),       new ItemStack(Material.GRAY_DYE),    NeoGas.getItem(),
                SynthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,         SynthPar.getItem(),
                NeoGas.getItem(),       new ItemStack(Material.GRAY_DYE),    NeoGas.getItem()
        };

        SlimefunItem NeoCrysGra = new SlimefunItem(
                PhoSciResoGroup,
                NeoniteGray,
                RecipeType.SMELTERY,
                NeoniteGrayRecipe
        );
        NeoCrysGra.register(this);

        /*
         * Pink Neonite Crystal
         */
        SlimefunItemStack NeonitePink = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_PINK",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjdiMjJjZDlmMzg5NzJkMzg0M2Y3N2I2YmYyODJmMDQ2M2RhZTYwOTVhMjQ2MThmNzgzMWY3Y2VkNmU3NGUxNCJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &c&lPink"
        );

        ItemStack[] NeonitePinkRecipe = {
                NeoGas.getItem(),       new ItemStack(Material.PINK_DYE),    NeoGas.getItem(),
                SynthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,         SynthPar.getItem(),
                NeoGas.getItem(),       new ItemStack(Material.PINK_DYE),    NeoGas.getItem()
        };

        SlimefunItem NeoCrysPin = new SlimefunItem(
                PhoSciResoGroup,
                NeonitePink,
                RecipeType.SMELTERY,
                NeonitePinkRecipe
        );
        NeoCrysPin.register(this);

        /*
         * Lime Neonite Crystal
         */
        SlimefunItemStack NeoniteLime = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_LIME",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTk4MWYxMjI1MjZiNjIwMDM2ZWNjNGE1ODQwM2VjZGQ0NmYwMzdhMjRiMjgyM2Q3ZTRjYTRmZWI2ZTkyODM5NyJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &a&lLime"
        );

        ItemStack[] NeoniteLimeRecipe = {
                NeoGas.getItem(),       new ItemStack(Material.LIME_DYE),    NeoGas.getItem(),
                SynthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,         SynthPar.getItem(),
                NeoGas.getItem(),       new ItemStack(Material.LIME_DYE),    NeoGas.getItem()
        };

        SlimefunItem NeoCrysLim = new SlimefunItem(
                PhoSciResoGroup,
                NeoniteLime,
                RecipeType.SMELTERY,
                NeoniteLimeRecipe
        );
        NeoCrysLim.register(this);

        /*
         * Yellow Neonite Crystal
         */
        SlimefunItemStack NeoniteYellow = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_YELLOW",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTRkZTFhNGM0MDQ5MmNmZTY5YmQwMTg4YjFhMTc4YjUyY2ZmN2UxYThiYjE0NWZjNTczOTIyOTc4YTA1NDIwYyJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &e&lYellow"
        );

        ItemStack[] NeoniteYellowRecipe = {
                NeoGas.getItem(),       new ItemStack(Material.YELLOW_DYE),    NeoGas.getItem(),
                SynthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,           SynthPar.getItem(),
                NeoGas.getItem(),       new ItemStack(Material.YELLOW_DYE),    NeoGas.getItem()
        };

        SlimefunItem NeoCrysYel = new SlimefunItem(
                PhoSciResoGroup,
                NeoniteYellow,
                RecipeType.SMELTERY,
                NeoniteYellowRecipe
        );
        NeoCrysYel.register(this);

        /*
         * Light Blue Neonite Crystal
         */
        SlimefunItemStack NeoniteLightBlue = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_LIGHT_BLUE",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDVkOTJlOTFiMWVkZjNjY2UwMThiMGQ5MjQzZjJkYjIwMjRkYTMxMGNmYTY2YmIzOGRlYjhkYzA4ODkxOTU2ZSJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &b&lLight Blue"
        );

        ItemStack[] NeoniteLightBlueRecipe = {
                NeoGas.getItem(),       new ItemStack(Material.LIGHT_BLUE_DYE),    NeoGas.getItem(),
                SynthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,               SynthPar.getItem(),
                NeoGas.getItem(),       new ItemStack(Material.LIGHT_BLUE_DYE),    NeoGas.getItem()
        };

        SlimefunItem NeoCrysLiBlu = new SlimefunItem(
                PhoSciResoGroup,
                NeoniteLightBlue,
                RecipeType.SMELTERY,
                NeoniteLightBlueRecipe
        );
        NeoCrysLiBlu.register(this);

        /*
         * Magenta Neonite Crystal
         */
        SlimefunItemStack NeoniteMagenta = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_MAGENTA",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTUyYmNhMjUzNGE5M2I1NDgyNTljOGM2YjJmNjg0YmNlZTEzNGVlZDcwZDcyNWI0YzkwMDg5MmY3OTI0ZGEzNiJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &d&lMagenta"
        );

        ItemStack[] NeoniteMagentaRecipe = {
                NeoGas.getItem(),       new ItemStack(Material.MAGENTA_DYE),    NeoGas.getItem(),
                SynthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,            SynthPar.getItem(),
                NeoGas.getItem(),       new ItemStack(Material.MAGENTA_DYE),    NeoGas.getItem()
        };

        SlimefunItem NeoCrysMag = new SlimefunItem(
                PhoSciResoGroup,
                NeoniteMagenta,
                RecipeType.SMELTERY,
                NeoniteMagentaRecipe
        );
        NeoCrysMag.register(this);

        /*
         * Orange Neonite Crystal
         */
        SlimefunItemStack NeoniteOrange = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_ORANGE",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOThiMjliYzI0NDg3NjQ2OTAxMTg4NDkxNjk1NzAzMjFiMDE4MWFkY2I2Nzc1YmRmNDM2YWUyMzc3NWU1NmQ4NSJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &6&lOrange"
        );

        ItemStack[] NeoniteOrangeRecipe = {
                NeoGas.getItem(),       new ItemStack(Material.ORANGE_DYE),    NeoGas.getItem(),
                SynthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,           SynthPar.getItem(),
                NeoGas.getItem(),       new ItemStack(Material.ORANGE_DYE),    NeoGas.getItem()
        };

        SlimefunItem NeoCrysOra = new SlimefunItem(
                PhoSciResoGroup,
                NeoniteOrange,
                RecipeType.SMELTERY,
                NeoniteOrangeRecipe
        );
        NeoCrysOra.register(this);

        /*
         * Black Neonite Crystal
         */
        SlimefunItemStack NeoniteBlack = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_BLACK",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzFlY2VhY2IxZTNmZmU3ZmMyOWY2ZjIzYjRmZmY2ZmRiNTNlMGIwOWVhMzQ0M2FkMjllMTg2OWZiNDBhOTc2OCJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &0&lBlack"
        );

        ItemStack[] NeoniteBlackRecipe = {
                NeoGas.getItem(),       new ItemStack(Material.BLACK_DYE),    NeoGas.getItem(),
                SynthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,          SynthPar.getItem(),
                NeoGas.getItem(),       new ItemStack(Material.BLACK_DYE),    NeoGas.getItem()
        };

        SlimefunItem NeoCrysBla = new SlimefunItem(
                PhoSciResoGroup,
                NeoniteBlack,
                RecipeType.SMELTERY,
                NeoniteBlackRecipe
        );
        NeoCrysBla.register(this);

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
