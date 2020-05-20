group = "${rootProject.group}.nats-lib"

buildscript {
    val natsVersion by rootProject.extra { "2.6.7" }
}

dependencies {
    implementation("io.nats:jnats:${rootProject.extra.get("natsVersion")}")

}