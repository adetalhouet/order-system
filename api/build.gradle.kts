import com.google.protobuf.gradle.generateProtoTasks
import com.google.protobuf.gradle.id
import com.google.protobuf.gradle.plugins
import com.google.protobuf.gradle.protobuf
import com.google.protobuf.gradle.protoc

apply(plugin = "com.google.protobuf")

group = "${rootProject.group}.api"

dependencies {
    implementation("com.google.api.grpc:proto-google-common-protos:${rootProject.extra.get("googleCommonsProtoVersion")}")
    implementation("com.google.api.grpc:grpc-google-common-protos:${rootProject.extra.get("googleCommonsProtoVersion")}")
    implementation("com.google.protobuf:protobuf-java:${rootProject.extra.get("protobufVersion")}")
    implementation("io.grpc:grpc-netty-shaded:${rootProject.extra.get("grpcVersion")}")
    implementation("io.grpc:grpc-protobuf:${rootProject.extra.get("grpcVersion")}")

    implementation("javax.annotation:javax.annotation-api:1.3.2")
}

protobuf {
    protoc { artifact = "com.google.protobuf:protoc:${rootProject.extra.get("protobufVersion")}" }
    generatedFilesBaseDir = "${project.rootDir}/api/src/"

    plugins {
        id("grpc") { artifact = "io.grpc:protoc-gen-grpc-java:${rootProject.extra.get("grpcVersion")}" }
        id("grpckt") { artifact = "io.grpc:protoc-gen-grpc-kotlin:${rootProject.extra.get("grpcKotlinVersion")}" }
    }

    generateProtoTasks {
        all().forEach { task ->
            task.plugins {
                id("grpc") { outputSubDir = "java" }
                id("grpckt") { outputSubDir = "kotlin" }
            }
        }
    }
}