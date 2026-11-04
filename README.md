# 🏷️ YouTube Music AI Tagger

Unofficial Morphe patches for YouTube Music that tag songs by artists on the community AI-artist list
([CennoxX/spotify-ai-blocker](https://github.com/CennoxX/spotify-ai-blocker)) with a blue
**COMMUNITY NOTED AI USE** tag. Not affiliated with Morphe or YouTube.

The tag shows next to the artist name in song rows, cards, the mini player and the Now Playing screen.
The list is downloaded on first launch and refreshed every 24 hours.

### How to use these patches

Tap the button below on your phone, or add this repo url in Morphe Manager under Sources > +: https://github.com/OrangeTree-Dev/Morphe-Patches

<a href="https://morphe.software/add-source?github=OrangeTree-Dev/Morphe-Patches">
  <img src=".github/assets/add-to-morphe.svg" alt="Add to Morphe" height="48">
</a>

Apply it together with the official Morphe YouTube Music patches (for sign-in support) on YouTube Music 9.30.53.

## 🩹 Patches list

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

### 🛠️ Building locally

- Run `./gradlew buildAndroid`
- The built patches .mpp file is found in `patches/build/libs/patches-*.mpp`
- Patch the mpp file using [Morphe-Desktop](https://github.com/MorpheApp/morphe-desktop)
  like any other patch bundle.

See the [Morphe documentation](https://github.com/MorpheApp/morphe-documentation) for more information.

## 📜 License

UserXYZ Patches are licensed under the [GNU General Public License v3.0](LICENSE)
