package me.venacava.phoenix_sciences.categories;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
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
    public static void setup(PhoenixSciences plugin) {
        ItemStack PhoSciResoItem = new CustomItemStack(Material.REDSTONE_BLOCK, "&4Phoenix Sciences - Resources", "", "&a> Click to open");

        // Give your Category a unique id.
        NamespacedKey PhoSciResoID = new NamespacedKey(plugin, "phoenix_sciences_resources");
        SubItemGroup PhoSciResoGroup = (SubItemGroup) new ItemGroup(PhoSciResoID, PhoSciResoItem);

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
            SynthRub.register(plugin);

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
            SynthTop.register(plugin);

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
            SynthAme.register(plugin);

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
            SynthAmb.register(plugin);

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
            SynthQua.register(plugin);

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
            SynthOny.register(plugin);

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
            SynthPar.register(plugin);

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
            LiqAir.register(plugin);

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
            NeoGas.register(plugin);
        }
    }

