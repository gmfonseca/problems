plugins {
    kotlin("jvm") version "1.5.31"
    jacoco
}

allprojects {
    group = "br.com.gmfonseca"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

// Setting jacoco

jacoco {
    toolVersion = "0.8.7"
}

fun Project.containsTest(): Boolean {
    return file("$projectDir/src/test").walkBottomUp().any { it.isFile }
}

tasks.register("codeCoverageReport", JacocoReport::class) {
    subprojects subproject@{
        apply(plugin = "jacoco")

        plugins.withType(JacocoPlugin::class).configureEach {
            tasks.matching { it.extensions.findByType<JacocoTaskExtension>() != null }
                .configureEach {
                    sourceSets(this@subproject.the<SourceSetContainer>()["main"])

                    if (containsTest()) {
                        executionData(this)
                    }
                }
        }

        tasks.withType(Test::class).configureEach {
            finalizedBy(this@register) // TODO not working: report is always generated after tests run
        }
    }

    reports {
        xml.required.set(true)
        html.required.set(true)
    }
}
