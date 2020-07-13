group = "${rootProject.group}.integTest"

dependencies {
    implementation("com.google.api.graphql:rejoiner:${rootProject.extra.get("graphqlRejoinerVersion")}")
    implementation(project(":graphql-gw"))

    implementation(project(":product-service"))
    implementation(project(":cart-service"))
    implementation(project(":client-service"))
    implementation(project(":order-service"))

    implementation(project(":api"))
    implementation(project(":db-lib"))
    implementation(project(":db-model"))
    implementation(project(":nats-lib"))

    testImplementation("np.com.madanpokharel.embed:nats-embedded:1.1.0")
    testImplementation("org.codehaus.groovy.modules.http-builder:http-builder:0.7.1")
}
tasks.test {
    filter {
        includeTestsMatching("*OrderSystemITSpec")
    }
}