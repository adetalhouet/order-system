buildscript {
    val kotlinxVersion by rootProject.extra { "1.3.3" }
    val grpcKotlinVersion by rootProject.extra { "0.1.1" }

    val grpcVersion by rootProject.extra { "1.28.0" }
    val googleCommonsProtoVersion by rootProject.extra { "1.16.0" }
    val protobufVersion by rootProject.extra { "3.11.1" }

    val hikariVersion by rootProject.extra { "3.4.2" }
    val postgresqlVersion by rootProject.extra { "42.1.4" }
    val h2database by rootProject.extra { "1.4.200" }
    val exposedVersion by rootProject.extra { "0.21.1" }

    val logbackVersion by rootProject.extra { "1.2.1" }

    val guiceVersion by rootProject.extra { "4.2.3" }

    val graphqlRejoinerVersion by rootProject.extra { "0.0.4" }

}

extra["services"] = listOf(
    project(":order-service"),
    project(":client-service"),
    project(":cart-service"),
    project(":product-service"),
    project(":graphql-gw")
)

plugins {
    groovy
    kotlin("jvm") version "1.3.70" apply false
    id("org.asciidoctor.convert") version "1.5.6" apply false
    id("com.google.protobuf") version "0.8.11" apply false
//    id("com.github.ksoichiro.console.reporter") version "0.6.2"
    application
}

application {
    mainClassName = "io.adetalhouet.order.system.order.OrderAppKt"
}

allprojects {
    apply(plugin = "kotlin")
    apply(plugin = "groovy")

    group = "io.adetalhouet.order.system"
    version = "1.0.0"

    repositories {
        jcenter()
    }

    dependencies {
        implementation(platform(kotlin("bom")))
        implementation(kotlin("stdlib-jdk8"))

        implementation("ch.qos.logback:logback-classic:${rootProject.extra.get("logbackVersion")}")

        implementation("com.google.guava:guava:29.0-jre")

        implementation("com.google.inject:guice:${rootProject.extra.get("guiceVersion")}")

        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${rootProject.extra.get("kotlinxVersion")}")

        implementation("com.google.protobuf:protobuf-java-util:${rootProject.extra.get("protobufVersion")}")
        implementation("io.grpc:grpc-stub:${rootProject.extra.get("grpcVersion")}")
        implementation("io.grpc:grpc-kotlin-stub:${rootProject.extra.get("grpcKotlinVersion")}")
        implementation("io.grpc:grpc-netty-shaded:${rootProject.extra.get("grpcVersion")}")

        implementation("org.jetbrains.exposed:exposed-core:${rootProject.extra.get("exposedVersion")}")
        implementation("org.jetbrains.exposed:exposed-jdbc:${rootProject.extra.get("exposedVersion")}")
        implementation("org.jetbrains.exposed:exposed-dao:${rootProject.extra.get("exposedVersion")}")
        implementation("org.postgresql:postgresql:${rootProject.extra.get("postgresqlVersion")}")

        implementation("com.typesafe:config:1.4.0")

        testImplementation(kotlin("test"))
        testImplementation(kotlin("test-junit"))
    }
}

configure(extra.get("services") as List<Project>) {
    apply(plugin = "application")

    dependencies {
        implementation(project(":api"))
        implementation(project(":db-lib"))
        implementation(project(":db-model"))
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