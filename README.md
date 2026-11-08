# Infinity With Mending — Modern Port for Minecraft 1.21.1 (Fabric)

![Mod loader: Fabric](https://img.shields.io/badge/modloader-Fabric-1976d2?style=for-the-badge)
![Minecraft: 1.21.1](https://img.shields.io/badge/Minecraft-26.3-green?style=for-the-badge)
![GitHub license](https://img.shields.io/github/license/Sekai0NI0itamio/Infinity263?style=for-the-badge)

**Lets Infinity and Mending coexist on the same bow.**

Vanilla forbids putting Infinity and Mending together. This mod removes
that boundary — have Infinity and Mending together!

Now with a **modern port for Minecraft 1.21.1 (Fabric)**. In 1.21.1,
enchantments are data-driven records and compatibility is decided by
`Enchantment.areCompatible`, so the port hooks that check for the
Infinity/Mending pair instead of the old `canApplyTogether` overwrite.

### What it does

- Infinity + Mending can be applied to the same item
- No other enchantment rules changed

### Modern port notes (26.3)

- Java 21 · Fabric Loader 0.16.14+ · Fabric API 0.116.15+1.21.1
- Built and verified in CI via GitHub Actions, including a headless
  runtime test that launches the client, joins a world, and quits cleanly

### Installation

1. Install Fabric Loader for Minecraft 1.21.1
2. Install Fabric API
3. Drop `infinity263-*.jar` into your `mods` folder

### Original mod & credit

This is an unofficial modern port by **Itamio** of **Infinity With
Mending** by **GoForceX** — the original (1.2M downloads on Modrinth,
last updated for 1.21) has not been updated to 1.21.1.

- Original mod: https://modrinth.com/mod/infinity-with-mending
- Original source: https://github.com/GoForceX/InfinityWithMending
- License: MIT — see `LICENSE`

All credit for the original concept, design, and logic goes to
GoForceX. This port exists to bring it to Minecraft 26.3. See `NOTICE`.
