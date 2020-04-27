group = "${rootProject.group}.utils"

buildscript {
    val hikariVersion by rootProject.extra { "3.4.2" }
    val postgresqlVersion by rootProject.extra { "42.1.4" }
    val h2database by rootProject.extra { "1.4.200" }
    val exposedVersion by rootProject.extra { "0.21.1" }
}

dependencies {
    implementation("org.jetbrains.exposed:exposed-core:${rootProject.extra.get("exposedVersion")}")
    implementation("org.jetbrains.exposed:exposed-jdbc:${rootProject.extra.get("exposedVersion")}")
    implementation("org.jetbrains.exposed:exposed-dao:${rootProject.extra.get("exposedVersion")}")

    implementation("com.zaxxer:HikariCP:${rootProject.extra.get("hikariVersion")}")
    implementation("mysql:mysql-connector-java:${rootProject.extra.get("mysqlVersion")}")
    implementation("org.postgresql:postgresql:${rootProject.extra.get("postgresqlVersion")}")

    testImplementation("com.h2database", "h2", "1.4.200")
}