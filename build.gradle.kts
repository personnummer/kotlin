plugins {
    kotlin("jvm") version "1.7.0"
    kotlin("plugin.serialization") version "1.6.21"
    id("org.jlleitschuh.gradle.ktlint").version("10.2.0")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.3")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}
