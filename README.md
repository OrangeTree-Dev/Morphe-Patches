# 🍊 OrangeTree Patches

Custom [Morphe](https://morphe.software) patches by OrangeTree.

> Unofficial. Not affiliated with Morphe, YouTube or Google.

## 📲 How to use these patches

Tap the button below on your phone, or open Morphe Manager and add `https://github.com/OrangeTree-Dev/Morphe-Patches` under **Sources > +**.

<a href="https://morphe.software/add-source?github=OrangeTree-Dev/Morphe-Patches">
  <img src=".github/assets/add-to-morphe.svg" alt="Add to Morphe" height="48">
</a>

Pre-release (dev) builds: enable pre-releases for this source in Morphe Manager.

## 🧩 Patches

### 🏷️ YouTube Music AI Tagger

Tags songs made by AI artists in the YouTube Music app, so you can see at a glance what you're listening to.

YouTube Music only shows its own AI label in a few places. This patch adds a clear tag everywhere a song shows up:

| Tag | Meaning |
| --- | --- |
| 🟦 **COMMUNITY NOTED AI USE** | The artist is on the community AI-artist list. |
| 🟥 **YOUTUBE DETECTED AI USE** | YouTube itself labels the song as made with AI. *(coming soon)* |

When both apply, only the YouTube tag is shown.

#### Details

**Where the tag shows:** next to the artist name in song rows, playlists, cards and shelves, the queue, the mini player and the Now Playing screen.

**Where the data comes from:** the community list is
[CennoxX/spotify-ai-blocker](https://github.com/CennoxX/spotify-ai-blocker), matched by artist name.
It's downloaded the first time the app opens and refreshed every 24 hours. Nothing else is sent anywhere.
If an artist is wrongly listed or missing, report it to that project.

#### Setup

1. Patch **YouTube Music 9.30.53** and enable **YouTube Music AI Tagger** together with the official Morphe
   YouTube Music patches (they're needed for signing in).
2. Install and open the app. Tags appear once the artist list has downloaded, which takes a few seconds on first launch.

## 🩹 Full patch list

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
