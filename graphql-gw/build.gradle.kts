group = "${rootProject.group}.graphql.gw"

application {
    mainClassName = "io.adetalhouet.order.system.graphql.gw.GraphqlGwAppKt"
}

dependencies {
    implementation("com.google.api.graphql:rejoiner:${rootProject.extra.get("graphqlRejoinerVersion")}")
    implementation("org.eclipse.jetty:jetty-server:9.4.28.v20200408")
    implementation(kotlin("reflect"))
}