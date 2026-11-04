group = "app.orangetree.ytmaitag"

patches {
    about {
        name = "OrangeTree YT Music AI Tag Patches"
        description = "Shows AI-use tags on YouTube Music songs"
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
