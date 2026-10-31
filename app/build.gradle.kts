plugins {
    id("com.android.application")
}

android {
    namespace = "com.monotype.android.font.ubuntu"
    compileSdk = 35 // Android 15

    defaultConfig {
        applicationId = "com.monotype.android.font.ubuntu"
        minSdk = 26
        targetSdk = 35 // Android 15
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}
