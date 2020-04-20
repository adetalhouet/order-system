group = "${rootProject.group}.utils"

buildscript {
    val hikariVersion by rootProject.extra { "3.4.2" }
    val mysqlVersion by rootProject.extra { "8.0.19" }
    val h2database by rootProject.extra { "1.4.200" }
    val exposedVersion by rootProject.extra { "0.21.1" }
}

plugins {
    id("org.flywaydb.flyway")
}

dependencies {
    implementation("org.jetbrains.exposed:exposed-core:${rootProject.extra.get("exposedVersion")}")
    implementation("org.jetbrains.exposed:exposed-jdbc:${rootProject.extra.get("exposedVersion")}")
    implementation("org.jetbrains.exposed:exposed-dao:${rootProject.extra.get("exposedVersion")}")

    implementation("com.h2database", "h2", "1.4.200")
    implementation("com.zaxxer:HikariCP:${rootProject.extra.get("hikariVersion")}")
    implementation("mysql:mysql-connector-java:${rootProject.extra.get("mysqlVersion")}")
}


flyway {
    url = System.getenv("DB_HOST") // jdbc:postgresql://localhost/postgres
    user = System.getenv("DB_USER") // postgresql
    password = System.getenv("DB_PASSWORD") // postgresql
}