plugins {
    id("maven-publish")
    kotlin("jvm") version "1.9.22"
    id("org.jetbrains.dokka") version "0.10.1"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.9.10"
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
    maven("https://jitpack.io")
    maven("https://kotlin.bintray.com/ktor")
    maven("https://kotlin.bintray.com/kotlinx")
}

group = "com.jeluchu.anvflix"
version = "1.0.0"

dependencies {
    implementation(libs.bundles.ktor)
    implementation(libs.bundles.kotlinx)
    testImplementation(libs.jupiter.junit.api)
    testRuntimeOnly(libs.jupiter.junit.engine)
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_17.toString()
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_17.toString()
    }

    test {
        useJUnitPlatform()
    }

    dokka {
        outputFormat = "html"
        outputDirectory = "$rootDir/docs"
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.jeluchu"
            artifactId = "anvflix"
            version = "1.0.0"

            from(components["kotlin"])
        }
    }
}