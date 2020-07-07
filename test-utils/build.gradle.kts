group = "${rootProject.group}.test-utils"

dependencies {
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
}