import org.gradle.api.initialization.resolve.RepositoriesMode

pluginManagement {
    val flutterSdkPath =
        run {
            val properties = java.util.Properties()

            file("local.properties")
                .inputStream()
                .use { properties.load(it) }

            properties.getProperty("flutter.sdk")
                ?: error("flutter.sdk not set in local.properties")
        }

    includeBuild(
        "$flutterSdkPath/packages/flutter_tools/gradle"
    )

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("dev.flutter.flutter-plugin-loader") version "1.0.0"
    id("com.android.application") version "9.0.0" apply false
    id("org.jetbrains.kotlin.android") version "2.2.20" apply false
}

dependencyResolutionManagement {
    repositoriesMode.set(
        RepositoriesMode.PREFER_SETTINGS
    )

    repositories {
        google()
        mavenCentral()

        maven {
            url = uri("https://jitpack.io")
        }
    }
}

rootProject.name = "stream_v19"

include(":app")
