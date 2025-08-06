plugins {
    id("blue-hive.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":blue-hive-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :blue-hive-java-example:run` to run `Main`
    // Use `./gradlew :blue-hive-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.bluehive.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
