group = "${rootProject.group}.db-model"

buildscript {
    val flywayVersion by rootProject.extra { "6.3.3" }
}

dependencies {
    implementation(project(":api"))
    implementation(project(":db-lib"))
    implementation("org.flywaydb:flyway-core:${rootProject.extra.get("flywayVersion")}")
}