// Buildscript block for configuring build tools and plugins
buildscript {
    repositories {
        google() // Google's Maven repository
        mavenCentral() // Maven Central repository
    }
    dependencies {
        // Android Gradle plugin
        classpath("com.android.tools.build:gradle:8.1.0") // Updated version
        // Kotlin Gradle plugin
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0") // Updated version
    }
}

// All projects block to configure repositories for all modules
allprojects {
    repositories {
        google() // Google's Maven repository
        mavenCentral() // Maven Central repository
    }
}

// Subprojects block to configure common dependencies for all submodules
subprojects {
    afterEvaluate {
        // Check if the subproject is an Android application or library
        if (plugins.hasPlugin("com.android.application") ||
            plugins.hasPlugin("com.android.library")
        ) {
            dependencies {
                // Add common dependencies here
                "implementation"(libs.androidx.appcompat) // Example: AndroidX AppCompat
                "implementation"(libs.androidx.core.ktx) // Example: AndroidX Core KTX
                "implementation"(libs.kotlin.stdlib) // Example: Kotlin Standard Library
            }
        }
    }
}

// Task to clean the build directory
tasks.register("clean", Delete::class) {

}

/*
 * This build script is written in Kotlin and uses the Gradle Kotlin DSL.
 * See the official Gradle documentation for more information:
 * https://docs.gradle.org/current/userguide/kotlin_dsl.html
 */
