import org.gradle.api.JavaVersion
import java.util.Properties // Add this import

// Load local.properties file
val localProperties = Properties().apply {
    load(rootProject.file("local.properties").inputStream())
}

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.evexdesignsx.myapplication" // Replace with your actual namespace
    compileSdk = 35

    defaultConfig {
        applicationId = "com.evexdesignsx.myapplication" // Replace with your actual application ID
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
        buildConfigField("String", "API_KEY", "\"${localProperties.getProperty("API_KEY")}\"") // Fixed: Use getProperty

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.4" // Updated to the latest version
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.kotlin.stdlib)
    testImplementation(libs.junit)
    implementation(libs.lifecycle.runtime.ktx)
}
android {
    namespace = "com.evexdesignsx.auraframefx"
}