group = "${rootProject.group}.nats-lib"

dependencies {
    testImplementation(project(":db-model"))
    testImplementation("np.com.madanpokharel.embed:nats-embedded:1.1.0")
}