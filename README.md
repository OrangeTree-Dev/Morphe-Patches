# 🍊 OrangeTree Patches

Custom patches for [Morphe](https://morphe.software).

> Unofficial. Not affiliated with Morphe, YouTube or Google.

## 📲 How to use these patches

Tap the button below on your phone, or open Morphe Manager and add `https://github.com/OrangeTree-Dev/Morphe-Patches` under **Sources > +**.

<a href="https://morphe.software/add-source?github=OrangeTree-Dev/Morphe-Patches">
  <img src=".github/assets/add-to-morphe.svg" alt="Add to Morphe" height="48">
</a>

Pre-release (dev) builds: enable pre-releases for this source in Morphe Manager.

## 🧩 Patches

| Patch | App | What it does |
| --- | --- | --- |
| [YouTube Music AI Tagger](docs/youtube-music-ai-tagger.md) | YouTube Music | Tags songs made by AI artists everywhere they show up. |

## 🎯 Supported app versions

<!-- PATCHES_START EXPANDED -->
> **[v1.0.0-dev.2](https://github.com/OrangeTree-Dev/Morphe-Patches/releases/tag/v1.0.0-dev.2)**&nbsp;&nbsp;•&nbsp;&nbsp;`dev`&nbsp;&nbsp;•&nbsp;&nbsp;1 patches total
<details open>
<summary>📦 YouTube Music&nbsp;&nbsp;•&nbsp;&nbsp;1 patch</summary>
<br>

**Package name:** `com.google.android.apps.youtube.music`

**🎯 Supported versions:**

| 9.30.53 |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [YouTube Music AI Tagger](#youtube-music-ai-tagger) | Adds a "COMMUNITY NOTED AI USE" tag next to artists on the community AI-artist list (github.com/CennoxX/spotify-ai-blocker), in song rows, cards, the mini player and Now Playing. |  |

</details>

<!-- PATCHES_END -->

## 🐛 Issues

Found a bug, or have an idea for a patch? [Open an issue](https://github.com/OrangeTree-Dev/Morphe-Patches/issues).

## 🛠️ Building

Push to the `dev` branch and GitHub Actions builds a pre-release; merge `dev` into `main` for a stable release.
Use [semantic commit](https://kapeli.com/cheat_sheets/Semantic_Commits.docset/Contents/Resources/Documents/index)
messages (`feat:`, `fix:`, `chore:`). Locally, `./gradlew buildAndroid` builds `patches/build/libs/patches-*.mpp`
(needs a GitHub token for Morphe's package registry, see the
[Morphe documentation](https://github.com/MorpheApp/morphe-documentation)).

## 📜 License

Licensed under the [GNU General Public License v3.0](LICENSE), with the additional terms in [NOTICE](NOTICE).
Built from the [Morphe patches template](https://github.com/MorpheApp/morphe-patches-template), and the Litho text
hook is adapted from [Morphe patches](https://github.com/MorpheApp/morphe-patches).
