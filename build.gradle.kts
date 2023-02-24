plugins {
    kotlin("jvm") version "1.8.10"
    kotlin("plugin.serialization") version "1.8.10"
    id("org.jlleitschuh.gradle.ktlint").version("11.2.0")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}
