buildscript {
    val kotlinxVersion by rootProject.extra { "1.3.3" }
    val grpcKotlinVersion by rootProject.extra { "0.1.1" }

    val grpcVersion by rootProject.extra { "1.28.0" }
    val googleCommonsProtoVersion by rootProject.extra { "1.16.0" }
    val protobufVersion by rootProject.extra { "3.11.1" }

    val hikariVersion by rootProject.extra { "3.4.2" }
    val mysqlVersion by rootProject.extra { "8.0.19" }
    val h2database by rootProject.extra { "1.4.200" }
    val exposedVersion by rootProject.extra { "0.21.1" }
}

extra["services"] = listOf(
    project(":billing-service"),
    project(":order-service"),
    project(":client-service"),
    project(":cart-service")
)

plugins {
    kotlin("jvm") version "1.3.70" apply false
    id("org.asciidoctor.convert") version "1.5.6" apply false
    id("com.google.protobuf") version "0.8.11" apply false
    id("org.flywaydb.flyway") version "6.3.3" apply false
    application
}

allprojects {
    apply(plugin = "kotlin")

    group = "io.adetalhouet.order.system"
    version = "1.0.0"

    repositories {
        jcenter()
    }

    dependencies {
        implementation(platform(kotlin("bom")))
        implementation(kotlin("stdlib-jdk8"))

        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${rootProject.extra.get("kotlinxVersion")}")

        implementation("com.google.protobuf:protobuf-java-util:${rootProject.extra.get("protobufVersion")}")
        implementation("io.grpc:grpc-kotlin-stub:${rootProject.extra.get("grpcKotlinVersion")}")
        implementation("io.grpc:grpc-netty-shaded:${rootProject.extra.get("grpcVersion")}")

        testImplementation(kotlin("test"))
        testImplementation(kotlin("test-junit"))
    }
}

configure(extra.get("services") as List<Project>) {
    apply(plugin = "application")

    dependencies {
        implementation(project(":api"))
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.distZip {
    from(project(":docs").tasks["asciidoctor"]) {
        into(project.name)
    }
}
tasks.distTar {
    from(project(":docs").tasks["asciidoctor"]) {
        into(project.name)
    }
}