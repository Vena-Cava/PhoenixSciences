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
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

public class PSResources{

    public static SlimefunItem cybDus;
    public static SlimefunItem cybIng;
    public static SlimefunItem cybSteIng;
    public static SlimefunItem synthRub;
    public static SlimefunItem synthTop;
    public static SlimefunItem synthAme;
    public static SlimefunItem synthAmb;
    public static SlimefunItem synthQua;
    public static SlimefunItem synthOny;
    public static SlimefunItem synthPar;
    public static SlimefunItem liqAir;
    public static SlimefunItem neoGas;
    public static SlimefunItem neoCrysWhi;
    public static SlimefunItem neoCrysRed;
    public static SlimefunItem neoCrysGre;
    public static SlimefunItem neoCrysBro;
    public static SlimefunItem neoCrysBlu;
    public static SlimefunItem neoCrysPur;
    public static SlimefunItem neoCrysCya;
    public static SlimefunItem neoCrysLiGra;
    public static SlimefunItem neoCrysGra;
    public static SlimefunItem neoCrysPin;
    public static SlimefunItem neoCrysLim;
    public static SlimefunItem neoCrysYel;
    public static SlimefunItem neoCrysLiBlu;
    public static SlimefunItem neoCrysMag;
    public static SlimefunItem neoCrysOra;
    public static SlimefunItem neoCrysBla;



    public static void setup(PhoenixSciences plugin) {
        ItemStack phoSciItem = new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTVhNzUzZjE3ZGUxMzhmY2EzOTUyM2VjMjhlZWY1Y2QzNDZkOTJkMWI3OWVlNTllYzNmODA5MjgxMjM2ZGI1MyJ9fX0=")), "&4Phoenix Sciences", "", "&a> Click to open");

        // Give your Category a unique id.
        NamespacedKey phoSciId = new NamespacedKey(plugin, "phoenix_sciences");
        NestedItemGroup phoSciGroup = new NestedItemGroup(phoSciId, phoSciItem);

        /*
         * Resources Sub-Category
         */
        ItemStack phoSciResoItem = new CustomItemStack(Material.REDSTONE_BLOCK, "&4Phoenix Sciences - Resources", "", "&a> Click to open");

        // Give your Category a unique id.
        NamespacedKey phoSciResoId = new NamespacedKey(plugin, "phoenix_sciences_resources");
        SubItemGroup phoSciResoGroup = new SubItemGroup(phoSciResoId, phoSciGroup, phoSciResoItem);

        /*
         * Cybium Dust
         */
        SlimefunItemStack cybiumDust = new SlimefunItemStack("PHOENIXSCIENCES_CYBIUM_DUST",
                Material.GUNPOWDER,
                "&fCybium Dust",
                "&c+20% Coolness"
        );

        ItemStack[] cybiumDustRecipe = {
                SlimefunItems.SIFTED_ORE, null, null,
                null, null, null,
                null, null, null
        };

        cybDus = new SlimefunItem(
                phoSciResoGroup,
                cybiumDust,
                RecipeType.ORE_WASHER,
                cybiumDustRecipe
        );
        cybDus.register(plugin);

        /*
         * Cybium Ingot
         */
        SlimefunItemStack cybiumIngot = new SlimefunItemStack("PHOENIXSCIENCES_CYBIUM_INGOT",
                Material.NETHER_BRICK,
                "&fCybium Ingot"
        );

        ItemStack[] cybiumIngotRecipe = {
                cybDus.getItem(), null, null,
                null, null, null,
                null, null, null
        };

        cybIng = new SlimefunItem(
                phoSciResoGroup,
                cybiumIngot,
                RecipeType.SMELTERY,
                cybiumIngotRecipe
        );
        cybIng.register(plugin);

        /*
         * Cybersteel Ingot
         */
        SlimefunItemStack cybersteelIngot = new SlimefunItemStack("PHOENIXSCIENCES_CYBERSTEEL_INGOT",
                Material.NETHERITE_INGOT,
                "&fCybersteel Ingot"
        );

        ItemStack[] cybersteelIngotRecipe = {
                cybDus.getItem(), SlimefunItems.DAMASCUS_STEEL_INGOT, cybIng.getItem(),
                null, null, null,
                null, null, null
        };

        cybSteIng = new SlimefunItem(
                phoSciResoGroup,
                cybersteelIngot,
                RecipeType.SMELTERY,
                cybersteelIngotRecipe
        );
        cybSteIng.register(plugin);

        /*
         * Synthetic Ruby
         */
        SlimefunItemStack syntheticRuby = new SlimefunItemStack("PHOENIXSCIENCES_SYNTHETIC_RUBY",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzIwZWYwNmRkNjA0OTk3NjZhYzhjZTE1ZDJiZWE0MWQyODEzZmU1NTcxODg2NGI1MmRjNDFjYmFhZTFlYTkxMyJ9fX0=")),
                "&4Synthetic Ruby",
                "&c+20% Coolness"
        );

        ItemStack[] syntheticRubyRecipe = {
                SlimefunItems.ALUMINUM_DUST, new ItemStack(Material.GLASS), new ItemStack(Material.GLASS_PANE),
                SlimefunItems.ALUMINUM_INGOT, new ItemStack(Material.REDSTONE), null,
                null, null, null
        };

        synthRub = new SlimefunItem(
                phoSciResoGroup,
                syntheticRuby,
                RecipeType.SMELTERY,
                syntheticRubyRecipe
        );
        synthRub.register(plugin);

        /*
         * Synthetic Topaz
         */
        SlimefunItemStack syntheticTopaz = new SlimefunItemStack("PHOENIXSCIENCES_SYNTHETIC_TOPAZ",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmM3NjY3ZGJlMjZmNjA3YjY5OWM5MzAzZTc0Zjg5NTEwZGFjNzU0M2UwYzkyY2VmOTliMzM0NTQ5YzU3YzQ4YSJ9fX0=")),
                "&eSynthetic Topaz",
                "&c+20% Coolness"
        );

        ItemStack[] syntheticTopazRecipe = {
                SlimefunItems.ALUMINUM_DUST, new ItemStack(Material.GLASS), new ItemStack(Material.GLASS_PANE),
                SlimefunItems.ALUMINUM_INGOT, new ItemStack(Material.YELLOW_DYE), null,
                null, null, null
        };

        synthTop = new SlimefunItem(
                phoSciResoGroup,
                syntheticTopaz,
                RecipeType.SMELTERY,
                syntheticTopazRecipe
        );
        synthTop.register(plugin);

        /*
         * Synthetic Amethyst
         */
        SlimefunItemStack syntheticAmethyst = new SlimefunItemStack("PHOENIXSCIENCES_SYNTHETIC_AMETHYST",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2FkOGNjOTgyNzg2ZmI0ZDQwYjBiNmU2NGE0MWYwZDk3MzZmOWMyNmFmZmI4OThmNGE3ZmFlYTg4Y2NmODk5NyJ9fX0=")),
                "&dSynthetic Amethyst",
                "&c+20% Coolness"
        );

        ItemStack[] syntheticAmethystRecipe = {
                SlimefunItems.ALUMINUM_DUST,    new ItemStack(Material.GLASS),      new ItemStack(Material.GLASS_PANE),
                SlimefunItems.ALUMINUM_INGOT,   SlimefunItems.SYNTHETIC_SAPPHIRE,   synthRub.getItem(),
                null,                           null,                               null
        };

        synthAme = new SlimefunItem(
                phoSciResoGroup,
                syntheticAmethyst,
                RecipeType.SMELTERY,
                syntheticAmethystRecipe
        );
        synthAme.register(plugin);

        /*
         * Synthetic Amber
         */
        SlimefunItemStack syntheticAmber = new SlimefunItemStack("PHOENIXSCIENCES_SYNTHETIC_AMBER",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWFjZTZiYjNhYTRjY2FjMDMxMTY4MjAyZjZkNDUzMjU5N2JjYWM2MzUxMDU5YWJkOWQxMGIyODYxMDQ5M2FlYiJ9fX0=")),
                "&6Synthetic Amber",
                "&c+20% Coolness"
        );

        ItemStack[] syntheticAmberRecipe = {
                SlimefunItems.ALUMINUM_DUST, new ItemStack(Material.GLASS), new ItemStack(Material.GLASS_PANE),
                SlimefunItems.ALUMINUM_INGOT, synthTop.getItem(), synthRub.getItem(),
                null, null, null
        };

        synthAmb = new SlimefunItem(
                phoSciResoGroup,
                syntheticAmber,
                RecipeType.SMELTERY,
                syntheticAmberRecipe
        );
        synthAmb.register(plugin);

        /*
         * Synthetic Quartz
         */
        SlimefunItemStack syntheticQuartz = new SlimefunItemStack("PHOENIXSCIENCES_SYNTHETIC_QUARTZ",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZThjZGU2NzAwMzcyMmRiODE4Mjk5YmNiZWM4ODMyODlkMThkYzkzMzJkZTgwOTgzNDAwYTg3ZjIwNTQ0MzkyYSJ9fX0=")),
                "&fSynthetic Quartz",
                "&c+20% Coolness"
        );

        ItemStack[] syntheticQuartzRecipe = {
                SlimefunItems.ALUMINUM_DUST, new ItemStack(Material.GLASS), new ItemStack(Material.GLASS_PANE),
                SlimefunItems.ALUMINUM_INGOT, new ItemStack(Material.BONE_MEAL), null,
                null, null, null
        };

        synthQua = new SlimefunItem(
                phoSciResoGroup,
                syntheticQuartz,
                RecipeType.SMELTERY,
                syntheticQuartzRecipe
        );
        synthQua.register(plugin);

        /*
         * Synthetic Onyx
         */
        SlimefunItemStack syntheticOnyx = new SlimefunItemStack("PHOENIXSCIENCES_SYNTHETIC_ONYX",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzY5ZWM3MjJkOWNiNmVkOWJhZTkzYzI2NmJkMDk4ZjBhMzA2YzVlOGMwMzg0OWMyN2NkY2YxOGM2MGQ2Y2IzZSJ9fX0=")),
                "&0Synthetic Onyx",
                "&c+20% Coolness"
        );

        ItemStack[] syntheticOnyxRecipe = {
                SlimefunItems.ALUMINUM_DUST, new ItemStack(Material.GLASS), new ItemStack(Material.GLASS_PANE),
                SlimefunItems.ALUMINUM_INGOT, new ItemStack(Material.BLACK_DYE), null,
                null, null, null
        };

        synthOny = new SlimefunItem(
                phoSciResoGroup,
                syntheticOnyx,
                RecipeType.SMELTERY,
                syntheticOnyxRecipe
        );
        synthOny.register(plugin);

        /*
         * Synthetic Paragon
         */
        SlimefunItemStack syntheticParagon = new SlimefunItemStack("PHOENIXSCIENCES_SYNTHETIC_PARAGON",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDlhZTg4YTdkMDNmNDc0NTU4YTA1NjkyZTVmNWMzYWRlMzEyZGRmMTA3MjE2NmFkMDQyNjMzNGVmNTE3NGI4NyJ9fX0=")),
                "&f&lSynthetic Paragon",
                "&fThe Perfect Gemstone. 100% Purity."
        );

        ItemStack[] syntheticParagonRecipe = {
                synthAme.getItem(), SlimefunItems.SYNTHETIC_SAPPHIRE, SlimefunItems.SYNTHETIC_EMERALD,
                synthQua.getItem(), SlimefunItems.SYNTHETIC_DIAMOND, synthOny.getItem(),
                synthRub.getItem(), synthAmb.getItem(), synthTop.getItem()
        };

        synthPar = new SlimefunItem(
                phoSciResoGroup,
                syntheticParagon,
                RecipeType.COMPRESSOR,
                syntheticParagonRecipe
        );
        synthPar.register(plugin);

        /*
         * Liquid Air
         */
        SlimefunItemStack liquidAir = new SlimefunItemStack("PHOENIXSCIENCES_LIQUID_AIR",
                Material.POTION,
                "&fLiquid Air",
                "&7Supercold Air, so cold that it condensed into a liquid."
        );

        PotionMeta meta = (PotionMeta) liquidAir.getItemMeta();
        meta.setBasePotionData(new PotionData(PotionType.WATER));
        meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        liquidAir.setItemMeta(meta);

        ItemStack[] liquidAirRecipe = {
                new ItemStack(Material.GLASS_BOTTLE), null, null,
                null, null, null,
                null, null, null
        };

        liqAir = new SlimefunItem(
                phoSciResoGroup,
                liquidAir,
                RecipeType.FREEZER,
                liquidAirRecipe
        );
        liqAir.register(plugin);

        /*
         * Neon Gas
         */
        SlimefunItemStack neonGas = new SlimefunItemStack("PHOENIXSCIENCES_NEON_GAS",
                Material.DRAGON_BREATH,
                "&fNeon Gas",
                "&7Neon Gas in a Bottle."
        );

        ItemStack[] neonGasRecipe = {
                liqAir.getItem(), null, null,
                null, null, null,
                null, null, null
        };

        neoGas = new SlimefunItem(
                phoSciResoGroup,
                neonGas,
                RecipeType.SMELTERY,
                neonGasRecipe
        );
        neoGas.register(plugin);

        /*
         * White Neonite Crystal
         */
        SlimefunItemStack neoniteWhite = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_WHITE",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTFmY2E1ZGU0ZDRhYjhjMGU5YzUwMWIxOTIzYWY5NDUxZDgxNDcxOGZiZGU3MGZlOWQyYTg3Mjg4OTc1MzAwNCJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &f&lWhite"
        );

        ItemStack[] neoniteWhiteRecipe = {
                neoGas.getItem(),       new ItemStack(Material.WHITE_DYE),  neoGas.getItem(),
                synthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,        synthPar.getItem(),
                neoGas.getItem(),       new ItemStack(Material.WHITE_DYE),  neoGas.getItem()
        };

        neoCrysWhi = new SlimefunItem(
                phoSciResoGroup,
                neoniteWhite,
                RecipeType.SMELTERY,
                neoniteWhiteRecipe
        );
        neoCrysWhi.register(plugin);

        /*
         * Red Neonite Crystal
         */
        SlimefunItemStack neoniteRed = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_RED",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTg1ZWMyZTA4YTE4NjBjNTViODYxZTdkYjIwODU1NjQwMzVlOTQxMDdiMjYwZmFlMmZhZGQ0NWE4YTFhOTZkOCJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &4&lRed"
        );

        ItemStack[] neoniteRedRecipe = {
                neoGas.getItem(),       new ItemStack(Material.RED_DYE),    neoGas.getItem(),
                synthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,        synthPar.getItem(),
                neoGas.getItem(),       new ItemStack(Material.RED_DYE),    neoGas.getItem()
        };

        neoCrysRed = new SlimefunItem(
                phoSciResoGroup,
                neoniteRed,
                RecipeType.SMELTERY,
                neoniteRedRecipe
        );
        neoCrysRed.register(plugin);

        /*
         * Green Neonite Crystal
         */
        SlimefunItemStack neoniteGreen = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_GREEN",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODBlMzNiM2ExODA4MjI1MzgxMWY1NTcxMzJlYjc0ODcyYzBjY2QzYzlkMGI3OGUzYThiYzYxODFiNGQ0NjRiIn19fQ==")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &2&lGreen"
        );

        ItemStack[] neoniteGreenRecipe = {
                neoGas.getItem(),       new ItemStack(Material.GREEN_DYE),    neoGas.getItem(),
                synthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,          synthPar.getItem(),
                neoGas.getItem(),       new ItemStack(Material.GREEN_DYE),    neoGas.getItem()
        };

        neoCrysGre = new SlimefunItem(
                phoSciResoGroup,
                neoniteGreen,
                RecipeType.SMELTERY,
                neoniteGreenRecipe
        );
        neoCrysGre.register(plugin);

        /*
         * Brown Neonite Crystal
         */
        SlimefunItemStack neoniteBrown = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_BROWN",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzMxY2RhNWIwYmYwZWNhMWFmMjkwZmNhN2EwY2YyZjIxZGJlM2I5OTk0YTgzYWZiNWIzNTRmMDU3ODkyNTliNSJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &6&lBrown"
        );

        ItemStack[] neoniteBrownRecipe = {
                neoGas.getItem(),       new ItemStack(Material.BROWN_DYE),    neoGas.getItem(),
                synthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,          synthPar.getItem(),
                neoGas.getItem(),       new ItemStack(Material.BROWN_DYE),    neoGas.getItem()
        };

        neoCrysBro = new SlimefunItem(
                phoSciResoGroup,
                neoniteBrown,
                RecipeType.SMELTERY,
                neoniteBrownRecipe
        );
        neoCrysBro.register(plugin);

        /*
         * Blue Neonite Crystal
         */
        SlimefunItemStack neoniteBlue = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_BLUE",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTI2NzhjNGRiNTQ4OTM1OTg2YzgxNjQ1ZDRjYjhlZmJlNjllZjQwOWRmYzc2NWNkMWIyMWFiMTMwMmE5N2ExNyJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &1&lBlue"
        );

        ItemStack[] neoniteBlueRecipe = {
                neoGas.getItem(),       new ItemStack(Material.BLUE_DYE),    neoGas.getItem(),
                synthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,         synthPar.getItem(),
                neoGas.getItem(),       new ItemStack(Material.BLUE_DYE),    neoGas.getItem()
        };

        neoCrysBlu = new SlimefunItem(
                phoSciResoGroup,
                neoniteBlue,
                RecipeType.SMELTERY,
                neoniteBlueRecipe
        );
        neoCrysBlu.register(plugin);

        /*
         * Purple Neonite Crystal
         */
        SlimefunItemStack neonitePurple = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_PURPLE",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDRkNDMzNTU1MGFiNDE4MTdhZWEyMGI0NzFlMDZiZjFkNGVlZWEwMGY1YmYzYjU5NTg4NzM3MTA3NDU0OWMzYiJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &5&lPurple"
        );

        ItemStack[] neonitePurpleRecipe = {
                neoGas.getItem(),       new ItemStack(Material.PURPLE_DYE),    neoGas.getItem(),
                synthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,           synthPar.getItem(),
                neoGas.getItem(),       new ItemStack(Material.PURPLE_DYE),    neoGas.getItem()
        };

        neoCrysPur = new SlimefunItem(
                phoSciResoGroup,
                neonitePurple,
                RecipeType.SMELTERY,
                neonitePurpleRecipe
        );
        neoCrysPur.register(plugin);

        /*
         * Cyan Neonite Crystal
         */
        SlimefunItemStack neoniteCyan = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_CYAN",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODUzODMwNDU5OGRhNjgxOTMyMjYwY2M3MTQ1NmM0YTdjZDBiNDlhZDZmZWIyMzE1OWRhNGEwNjRkM2I4NDVmZSJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &3&lCyan"
        );

        ItemStack[] neoniteCyanRecipe = {
                neoGas.getItem(),       new ItemStack(Material.CYAN_DYE),    neoGas.getItem(),
                synthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,         synthPar.getItem(),
                neoGas.getItem(),       new ItemStack(Material.CYAN_DYE),    neoGas.getItem()
        };

        neoCrysCya = new SlimefunItem(
                phoSciResoGroup,
                neoniteCyan,
                RecipeType.SMELTERY,
                neoniteCyanRecipe
        );
        neoCrysCya.register(plugin);

        /*
         * Light Gray Neonite Crystal
         */
        SlimefunItemStack neoniteLightGray = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_LIGHT_GRAY",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjU0ZjE4Y2NkMjM4ODE3YWM0MjZlN2ZkZmUzMjA3ZDJkYjhhYTlkODQ0ZWYwODQwYTE1NjA0MWEwZThlMzdiZCJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &7&lLight Gray"
        );

        ItemStack[] neoniteLightGrayRecipe = {
                neoGas.getItem(),       new ItemStack(Material.LIGHT_GRAY_DYE),    neoGas.getItem(),
                synthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,               synthPar.getItem(),
                neoGas.getItem(),       new ItemStack(Material.LIGHT_GRAY_DYE),    neoGas.getItem()
        };

        neoCrysLiGra = new SlimefunItem(
                phoSciResoGroup,
                neoniteLightGray,
                RecipeType.SMELTERY,
                neoniteLightGrayRecipe
        );
        neoCrysLiGra.register(plugin);

        /*
         * Gray Neonite Crystal
         */
        SlimefunItemStack neoniteGray = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_PURPLE",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjY4ZWNjZTBmMmVmM2IxZWRkMDMwNzZhMDNiMmFjMTIyMGMzNThlZmQ0M2NiYzkwY2FlOWQxMmQwZjdlMGQ2YyJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &8&lGray"
        );

        ItemStack[] neoniteGrayRecipe = {
                neoGas.getItem(),       new ItemStack(Material.GRAY_DYE),    neoGas.getItem(),
                synthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,         synthPar.getItem(),
                neoGas.getItem(),       new ItemStack(Material.GRAY_DYE),    neoGas.getItem()
        };

        neoCrysGra = new SlimefunItem(
                phoSciResoGroup,
                neoniteGray,
                RecipeType.SMELTERY,
                neoniteGrayRecipe
        );
        neoCrysGra.register(plugin);

        /*
         * Pink Neonite Crystal
         */
        SlimefunItemStack neonitePink = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_PINK",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjdiMjJjZDlmMzg5NzJkMzg0M2Y3N2I2YmYyODJmMDQ2M2RhZTYwOTVhMjQ2MThmNzgzMWY3Y2VkNmU3NGUxNCJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &c&lPink"
        );

        ItemStack[] neonitePinkRecipe = {
                neoGas.getItem(),       new ItemStack(Material.PINK_DYE),    neoGas.getItem(),
                synthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,         synthPar.getItem(),
                neoGas.getItem(),       new ItemStack(Material.PINK_DYE),    neoGas.getItem()
        };

        neoCrysPin = new SlimefunItem(
                phoSciResoGroup,
                neonitePink,
                RecipeType.SMELTERY,
                neonitePinkRecipe
        );
        neoCrysPin.register(plugin);

        /*
         * Lime Neonite Crystal
         */
        SlimefunItemStack neoniteLime = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_LIME",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTk4MWYxMjI1MjZiNjIwMDM2ZWNjNGE1ODQwM2VjZGQ0NmYwMzdhMjRiMjgyM2Q3ZTRjYTRmZWI2ZTkyODM5NyJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &a&lLime"
        );

        ItemStack[] neoniteLimeRecipe = {
                neoGas.getItem(),       new ItemStack(Material.LIME_DYE),    neoGas.getItem(),
                synthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,         synthPar.getItem(),
                neoGas.getItem(),       new ItemStack(Material.LIME_DYE),    neoGas.getItem()
        };

        neoCrysLim = new SlimefunItem(
                phoSciResoGroup,
                neoniteLime,
                RecipeType.SMELTERY,
                neoniteLimeRecipe
        );
        neoCrysLim.register(plugin);

        /*
         * Yellow Neonite Crystal
         */
        SlimefunItemStack neoniteYellow = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_YELLOW",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTRkZTFhNGM0MDQ5MmNmZTY5YmQwMTg4YjFhMTc4YjUyY2ZmN2UxYThiYjE0NWZjNTczOTIyOTc4YTA1NDIwYyJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &e&lYellow"
        );

        ItemStack[] neoniteYellowRecipe = {
                neoGas.getItem(),       new ItemStack(Material.YELLOW_DYE),    neoGas.getItem(),
                synthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,           synthPar.getItem(),
                neoGas.getItem(),       new ItemStack(Material.YELLOW_DYE),    neoGas.getItem()
        };

        neoCrysYel = new SlimefunItem(
                phoSciResoGroup,
                neoniteYellow,
                RecipeType.SMELTERY,
                neoniteYellowRecipe
        );
        neoCrysYel.register(plugin);

        /*
         * Light Blue Neonite Crystal
         */
        SlimefunItemStack neoniteLightBlue = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_LIGHT_BLUE",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDVkOTJlOTFiMWVkZjNjY2UwMThiMGQ5MjQzZjJkYjIwMjRkYTMxMGNmYTY2YmIzOGRlYjhkYzA4ODkxOTU2ZSJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &b&lLight Blue"
        );

        ItemStack[] neoniteLightBlueRecipe = {
                neoGas.getItem(),       new ItemStack(Material.LIGHT_BLUE_DYE),    neoGas.getItem(),
                synthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,               synthPar.getItem(),
                neoGas.getItem(),       new ItemStack(Material.LIGHT_BLUE_DYE),    neoGas.getItem()
        };

        neoCrysLiBlu = new SlimefunItem(
                phoSciResoGroup,
                neoniteLightBlue,
                RecipeType.SMELTERY,
                neoniteLightBlueRecipe
        );
        neoCrysLiBlu.register(plugin);

        /*
         * Magenta Neonite Crystal
         */
        SlimefunItemStack neoniteMagenta = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_MAGENTA",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTUyYmNhMjUzNGE5M2I1NDgyNTljOGM2YjJmNjg0YmNlZTEzNGVlZDcwZDcyNWI0YzkwMDg5MmY3OTI0ZGEzNiJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &d&lMagenta"
        );

        ItemStack[] neoniteMagentaRecipe = {
                neoGas.getItem(),       new ItemStack(Material.MAGENTA_DYE),    neoGas.getItem(),
                synthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,            synthPar.getItem(),
                neoGas.getItem(),       new ItemStack(Material.MAGENTA_DYE),    neoGas.getItem()
        };

        neoCrysMag = new SlimefunItem(
                phoSciResoGroup,
                neoniteMagenta,
                RecipeType.SMELTERY,
                neoniteMagentaRecipe
        );
        neoCrysMag.register(plugin);

        /*
         * Orange Neonite Crystal
         */
        SlimefunItemStack neoniteOrange = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_ORANGE",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOThiMjliYzI0NDg3NjQ2OTAxMTg4NDkxNjk1NzAzMjFiMDE4MWFkY2I2Nzc1YmRmNDM2YWUyMzc3NWU1NmQ4NSJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &6&lOrange"
        );

        ItemStack[] neoniteOrangeRecipe = {
                neoGas.getItem(),       new ItemStack(Material.ORANGE_DYE),    neoGas.getItem(),
                synthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,           synthPar.getItem(),
                neoGas.getItem(),       new ItemStack(Material.ORANGE_DYE),    neoGas.getItem()
        };

        neoCrysOra = new SlimefunItem(
                phoSciResoGroup,
                neoniteOrange,
                RecipeType.SMELTERY,
                neoniteOrangeRecipe
        );
        neoCrysOra.register(plugin);

        /*
         * Black Neonite Crystal
         */
        SlimefunItemStack neoniteBlack = new SlimefunItemStack("PHOENIXSCIENCES_NEONITE_CRYSTAL_BLACK",
                PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzFlY2VhY2IxZTNmZmU3ZmMyOWY2ZjIzYjRmZmY2ZmRiNTNlMGIwOWVhMzQ0M2FkMjllMTg2OWZiNDBhOTc2OCJ9fX0=")),
                "&fNeonite Crystal",
                "&7A Powerful Crystal used to Power Machines.",
                "&7Color: &0&lBlack"
        );

        ItemStack[] neoniteBlackRecipe = {
                neoGas.getItem(),       new ItemStack(Material.BLACK_DYE),    neoGas.getItem(),
                synthPar.getItem(),     SlimefunItems.POWER_CRYSTAL,          synthPar.getItem(),
                neoGas.getItem(),       new ItemStack(Material.BLACK_DYE),    neoGas.getItem()
        };

        neoCrysBla = new SlimefunItem(
                phoSciResoGroup,
                neoniteBlack,
                RecipeType.SMELTERY,
                neoniteBlackRecipe
        );
        neoCrysBla.register(plugin);

        }
    }

