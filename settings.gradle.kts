rootProject.name = "otusJavaHW"
include("hw01-gradle")

pluginManagement {
    val dependencyManagement: String by settings
    val shadowJar: String by settings
    val protobuf: String by settings
    val sonarlint: String by settings
    val spotless: String by settings
    plugins {
        id("io.spring.dependency-management") version dependencyManagement
        id("com.github.johnrengelman.shadow") version shadowJar
        id("com.google.protobuf") version protobuf
        id("name.remal.sonarlint") version sonarlint
        id("com.diffplug.spotless") version spotless
    }
}
include("hw01-gradle")
