import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent

/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java project to get you started.
 * For more details take a look at the Java Quickstart chapter in the Gradle
 * User Manual available at https://docs.gradle.org/5.2.1/userguide/tutorial_java_projects.html
 */

plugins {
    // Apply the java plugin to add support for Java
    java

    // Apply the application plugin to add support for building an application
    application
}

repositories {
    // Use jcenter for resolving your dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {
    // Use JUnit test framework
    testImplementation("junit:junit:4.12")
    // Property Based Test framework
    val junitQuickcheck = "0.8.2"
    testImplementation("com.pholser", "junit-quickcheck-core", junitQuickcheck)
    testImplementation("com.pholser", "junit-quickcheck-generators", junitQuickcheck)
    // Fluent test assertion framework
    testCompile("org.assertj", "assertj-core", "3.11.1")
}

application {
    // Define the main class for the application
    mainClassName = "com.github.sir4ur0n.App"
}

/**
 * Configure all tasks of type Test to use JUnit 5 platform, and test logging
 */
tasks.withType(Test::class) {
    // Fine tune how tests logs in the console
    testLogging {
        displayGranularity = 2
        events(TestLogEvent.FAILED, TestLogEvent.SKIPPED, TestLogEvent.STANDARD_ERROR)
        showExceptions = true
        showCauses = true
        exceptionFormat = TestExceptionFormat.FULL
    }
}