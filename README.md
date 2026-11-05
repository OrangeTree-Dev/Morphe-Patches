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
> **[v1.26.11.05.0000-beta](https://github.com/OrangeTree-Dev/Morphe-Patches/releases/tag/v1.26.11.05.0000-beta)**&nbsp;&nbsp;•&nbsp;&nbsp;`dev`&nbsp;&nbsp;•&nbsp;&nbsp;1 patches total
<details open>
<summary>📦 YouTube Music&nbsp;&nbsp;•&nbsp;&nbsp;1 patch</summary>
<br>

**Package name:** `com.google.android.apps.youtube.music`

**🎯 Supported versions:**

| 9.30.53 |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [YouTube Music AI Tagger](#youtube-music-ai-tagger) | Adds a blue "AI" tag to songs by artists on the community AI-artist list (github.com/CennoxX/spotify-ai-blocker), in song rows, cards, the mini player and Now Playing. |  |

</details>

<!-- PATCHES_END -->

## ☕ Support

If these patches are useful to you, you can leave a tip on [Ko-fi](https://ko-fi.com/orangetreedev).

<a href="https://ko-fi.com/orangetreedev"><img src="https://ko-fi.com/img/githubbutton_sm.svg" alt="Support on Ko-fi" height="36"></a>

## 🐛 Issues

Found a bug, or have an idea for a patch? [Open an issue](https://github.com/OrangeTree-Dev/Morphe-Patches/issues).

## 🛠️ Building

Push to the `dev` branch and GitHub Actions publishes a beta; merge `dev` into `main` (merge commit, no squash) for a stable release.
Only `feat:`, `fix:` and `perf:` commits make a release, `chore:` commits don't.

Versions are dates and times in UTC: stable releases look like `v1.26.11.05.1432`, betas like `v1.26.11.05.1432-beta`.

## 📜 License

Licensed under the [GNU General Public License v3.0](LICENSE), with the additional terms in [NOTICE](NOTICE).
Built from the [Morphe patches template](https://github.com/MorpheApp/morphe-patches-template), and the Litho text
hook is adapted from [Morphe patches](https://github.com/MorpheApp/morphe-patches).
