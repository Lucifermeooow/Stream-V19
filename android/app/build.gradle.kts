plugins {
    id("com.android.application")
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.ahmed.streamv19"
    compileSdk = 37

    defaultConfig {
        applicationId = "com.ahmed.streamv19"
        minSdk = 24
        targetSdk = 35
        versionCode = 19
        versionName = "19.0.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

flutter {
    source = "../.."
}
