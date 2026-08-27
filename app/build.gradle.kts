plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.github.danltech.danlbench_v1"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.github.danltech.danlbench_v1"
        minSdk = 8
        targetSdk = 36
        versionCode = 4          // Skip V3 to make it easier because of beta4
        versionName = "1.0-beta4"
        multiDexEnabled = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.0.4")
    implementation("androidx.multidex:multidex:2.0.1")
}
