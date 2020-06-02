group = "${rootProject.group}.db-lib"

buildscript {

    val flywayVersion by rootProject.extra { "6.3.3" }
}

dependencies {
    implementation("org.flywaydb:flyway-core:${rootProject.extra.get("flywayVersion")}")
}