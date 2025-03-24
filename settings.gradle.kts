pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }

    plugins {
        id("com.gradle.enterprise") version "3.15.1"
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    versionCatalogs { 

    }
    repositories {
        google()
        mavenCentral()
    }
    dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    versionCatalogs {

    }
    repositories {
        google()
        mavenCentral()
    }
}
    configurations.all {
    resolutionStrategy {
        force("com.google.guava:guava:32.1.2-jre")
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    versionCatalogs {

    }
    repositories {
        google()
        mavenCentral()
    }dependencies {
    configurations.all {
        resolutionStrategy {
            force("com.google.guava:guava:32.1.2-jre")
        }dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    versionCatalogs {

    }
    repositories {
        google()
        mavenCentral()
    }
}dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    versionCatalogs {

    }
    repositories {
        google()
        mavenCentral()
    }
    configurations.all {
        resolutionStrategy {
            force("com.google.guava:guava:32.1.2-jre")
        }
    }
}dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    versionCatalogs {

    }
    repositories {
        google()
        mavenCentral()
    }
    configurations.all {
        resolutionStrategy {
            force("com.google.guava:guava:32.1.2-jre")
        }
    }
    configurations.all {
    resolutionStrategy {
        force("com.google.guava:guava:32.1.2-jre")
    }
    gradleEnterprise {
    buildScan {
        publishAlways()
        server = "https://ge.infinum.co"
    }
}dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    versionCatalogs {

    }
    repositories {
        google()
        mavenCentral()
    }
}

configurations.all {
    resolutionStrategy {
        force("com.google.guava:guava:32.1.2-jre")
    }
}

gradleEnterprise {
    buildScan {
        publishAlways()
        server = "https://ge.infinum.co"
    }
}resolutionStrategy {
        force("com.google.guava:guava:32.1.2-jre")
    }
}

gradleEnterprise {
    buildScan {
        publishAlways()
        server = "https://ge.infinum.co"
    }
}

include(":app")

rootProject.name = "My Application"