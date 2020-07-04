group = "${rootProject.group}.graphql.gw"

application {
    mainClassName = "io.adetalhouet.order.system.graphql.app.ServerKt"
}

dependencies {
    implementation("com.google.api.graphql:rejoiner:${rootProject.extra.get("graphqlRejoinerVersion")}")
    implementation("org.eclipse.jetty:jetty-server:9.4.28.v20200408")

    implementation(project(":order-service"))
    implementation(project(":client-service"))
    implementation(project(":cart-service"))
    implementation(project(":product-service"))
}