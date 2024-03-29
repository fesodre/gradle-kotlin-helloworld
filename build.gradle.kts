/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * To learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.6/samples
 */

 val kotlinVersion = "1.5.21"

 plugins {
    `java`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.commons:commons-lang3:3.0")
    // Further examples showing string concatenation
    val group = "org.jetbrains.kotlin"
    val artifact = "kotlin-reflect"
    val version = kotlinVersion
    implementation("$group:$artifact:$version")
    implementation("com.konghq:unirest-java:3.13.12")
}