group = "${rootProject.group}.cart"

application {
    mainClassName = "io.adetalhouet.order.system.cart.CartAppKt"
}

dependencies {
    testImplementation(platform("org.spockframework:spock-bom:1.3-groovy-2.5"))
    testImplementation("org.spockframework", "spock-core", "1.3-groovy-2.5")
    testImplementation("org.spockframework", "spock-guice", "1.3-groovy-2.5")
    testImplementation("com.h2database", "h2", "1.4.200")

    testImplementation("io.grpc:grpc-testing:${rootProject.extra.get("grpcVersion")}")
}