group = "app.orangetree.ytmaitag"

patches {
    about {
        name = "YouTube Music AI Tagger"
        description = "Tags songs by AI artists in YouTube Music"
        source = "git@github.com:OrangeTree-Dev/Morphe-Patches.git"
        author = "OrangeTree"
        contact = "https://github.com/OrangeTree-Dev/Morphe-Patches/issues"
        website = "https://github.com/OrangeTree-Dev/Morphe-Patches"
        license = "GPLv3"
    }
}

// Separate configuration so gson is available at runtime for the
// generatePatchesList task but never bundled into the APK.
val patchListGeneratorClasspath = configurations.create("patchListGeneratorClasspath")

dependencies {
    compileOnly(libs.gson)
    patchListGeneratorClasspath(libs.gson)
}

tasks {
    register<JavaExec>("generatePatchesList") {
        description = "Build patch with patch list"

        dependsOn(build)

        classpath = sourceSets["main"].runtimeClasspath + patchListGeneratorClasspath
        mainClass.set("util.PatchListGeneratorKt")
    }

    // Used by gradle-semantic-release-plugin.
    publish {
        dependsOn("generatePatchesList")
    }
}
