# Infinity With Mending — Modern Port for Minecraft 26.3 (NeoForge)

![Mod loader: NeoForge](https://img.shields.io/badge/modloader-NeoForge-1976d2?style=for-the-badge)
![Minecraft: 26.3](https://img.shields.io/badge/Minecraft-26.3-green?style=for-the-badge)
![GitHub license](https://img.shields.io/github/license/Sekai0NI0itamio/Infinity263?style=for-the-badge)

**Lets Infinity and Mending coexist on the same bow.**

Vanilla forbids putting Infinity and Mending together. This mod removes
that boundary — have Infinity and Mending together!

Now with a **modern port for Minecraft 26.3 (NeoForge)**. In 26.3,
enchantments are data-driven records and compatibility is decided by
`Enchantment.areCompatible`, so the port hooks that check for the
Infinity/Mending pair instead of the old `canApplyTogether` overwrite.

### What it does

- Infinity + Mending can be applied to the same item
- No other enchantment rules changed

### Modern port notes (26.3)

- Java 25 · NeoForge 26.3.0.101 · NeoGradle 7.1.39
- Built and verified in CI via GitHub Actions, including a headless
  runtime test that launches the client, joins a world, and quits cleanly

### Installation

1. Install NeoForge 26.3.0.101 for Minecraft 26.3
2. Drop `infinity-26.3-neoforge-*.jar` into your `mods` folder

### Original mod & credit

This is an unofficial modern port by **Itamio** of **Infinity With
Mending** by **GoForceX** — the original (1.2M downloads on Modrinth,
last updated for 1.21) has not been updated to 26.3.

- Original mod: https://modrinth.com/mod/infinity-with-mending
- Original source: https://github.com/GoForceX/InfinityWithMending
- License: MIT — see `LICENSE`

All credit for the original concept, design, and logic goes to
GoForceX. This port exists to bring it to Minecraft 26.3 (NeoForge). See `NOTICE`.
