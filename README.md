# Infinity With Mending — Modern Port for Minecraft 1.20.1 (Forge)

![Mod loader: Forge](https://img.shields.io/badge/modloader-Forge-1976d2?style=for-the-badge)
![Minecraft: 1.20.1](https://img.shields.io/badge/Minecraft-1.20.1-green?style=for-the-badge)
![GitHub license](https://img.shields.io/github/license/Sekai0NI0itamio/Infinity263?style=for-the-badge)

**Lets Infinity and Mending coexist on the same bow.**

Vanilla forbids putting Infinity and Mending together. This mod removes
that boundary — have Infinity and Mending together!

Now with a **modern port for Minecraft 1.20.1 (Forge)**. In 1.20.1,
enchantments are class-based and the Infinity enchantment
(`ArrowInfiniteEnchantment`) vetoes Mending in `checkCompatibility`,
so the port hooks that check for the Infinity/Mending pair instead of
the old `canApplyTogether` overwrite.

### What it does

- Infinity + Mending can be applied to the same item
- No other enchantment rules changed

### Modern port notes

- Java 17 · Forge 47.4.20 · official mappings
- Built and verified in CI via GitHub Actions, including a headless
  runtime test that launches the client, joins a world, and quits cleanly

### Installation

1. Install Forge 47.4.20 for Minecraft 1.20.1
2. Drop `infinity-1.20.1-forge-*.jar` into your `mods` folder

### Original mod & credit

This is an unofficial modern port by **Itamio** of **Infinity With
Mending** by **GoForceX** — the original (1.2M downloads on Modrinth,
last updated for 1.21) has not been updated to 1.20.1.

- Original mod: https://modrinth.com/mod/infinity-with-mending
- Original source: https://github.com/GoForceX/InfinityWithMending
- License: MIT — see `LICENSE`

All credit for the original concept, design, and logic goes to
GoForceX. This port exists to bring it to Minecraft 1.20.1 (Forge). See `NOTICE`.
