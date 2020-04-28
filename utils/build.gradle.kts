group = "${rootProject.group}.utils"

buildscript {
    val hikariVersion by rootProject.extra { "3.4.2" }
    val h2database by rootProject.extra { "1.4.200" }
    val flywayVersion by rootProject.extra { "6.3.3" }
}

dependencies {
    implementation("com.zaxxer:HikariCP:${rootProject.extra.get("hikariVersion")}")
    implementation("org.flywaydb:flyway-core:${rootProject.extra.get("flywayVersion")}")

    testImplementation("com.h2database", "h2", "1.4.200")
}