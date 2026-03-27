plugins {
    id("com.github.ben-manes.versions") version "0.53.0"
    application
    checkstyle
}

application {
    mainClass = "hexlet.code.App"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}