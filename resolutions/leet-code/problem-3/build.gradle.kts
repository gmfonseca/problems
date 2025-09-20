plugins {
    kotlinJvm
}

dependencies {
    implementation(project(Modules.Core))

    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
}
