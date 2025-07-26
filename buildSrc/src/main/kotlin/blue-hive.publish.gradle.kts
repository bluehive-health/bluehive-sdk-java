plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("BlueHive API")
                description.set("Core API server that powers everything BlueHive — from BlueHive AI and our\nemployer/provider portals to bluehive.com itself")
                url.set("https://docs.bluehive.com/")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("BlueHive")
                        email.set("wreiske@bluehive.com")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/stainless-sdks/bluehive-java.git")
                    developerConnection.set("scm:git:git://github.com/stainless-sdks/bluehive-java.git")
                    url.set("https://github.com/stainless-sdks/bluehive-java")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
