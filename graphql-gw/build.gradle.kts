group = "${rootProject.group}.graphql.gw"

plugins {
    id("com.google.cloud.tools.jib")
}

application {
    mainClassName = "io.adetalhouet.order.system.graphql.app.GraphQLAppKt"
}

dependencies {
    implementation("com.google.api.graphql:rejoiner:${rootProject.extra.get("graphqlRejoinerVersion")}")
    implementation("org.eclipse.jetty:jetty-server:9.4.28.v20200408")

    implementation(project(":order-service"))
    implementation(project(":client-service"))
    implementation(project(":cart-service"))
    implementation(project(":product-service"))
}

jib {
    from {
        image = "openjdk:8-jre-alpine"
    }
    to {
        val tag_version = version.toString().substringBefore('-')
        image = "adetalhouet/order-system-api-gw-service:$tag_version"
    }
    container {
        mainClass = application.mainClassName
    }
}