plugins {
    java
   `maven-publish`
    id("io.github.gradle-nexus.publish-plugin") version "1.1.0"
    id("org.jetbrains.dokka") version "1.6.21"
    signing    
}

group = "com.roscopeco.jesd3c-parser"
version = "0.8.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
    withSourcesJar()
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.antlr:antlr4:4.13.1")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    testImplementation("org.assertj:assertj-core:3.22.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

val dokkaHtml by tasks.getting(org.jetbrains.dokka.gradle.DokkaTask::class)

val javadocJar: TaskProvider<Jar> by tasks.registering(Jar::class) {
    dependsOn(dokkaHtml)
    archiveClassifier.set("javadoc")
    from(dokkaHtml.outputDirectory)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            artifactId = "jesd3c-parser-java"
            artifact(javadocJar)
            pom {
                name.set("JESD3C-Java")
                description.set("JESD3-C Parser for Java")
                url.set("https://github.com/roscopeco/jesd3c-")
                licenses {
                    license {
                        name.set("MIT")
                        url.set("https://github.com/roscopeco/jesd3c-parser/blob/main/LICENSE.md")
                    }
                }
                developers {
                    developer {
                        id.set("roscopeco")
                        name.set("Ross Bamford")
                        email.set("roscopeco AT gmail DOT com")
                    }
                }
                scm {
                    connection.set("https://github.com/roscopeco/jesd3c-parser/blob/main/LICENSE.md")
                    developerConnection.set("git@github.com:roscopeco/jesd3c-parser.git")
                    url.set("https://github.com/roscopeco/jesd3c-parser")
                }
            }
        }
    }
}

nexusPublishing {
    repositories {
        sonatype()
    }
}

signing {
    sign(publishing.publications)
}