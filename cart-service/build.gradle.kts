group = "${rootProject.group}.cart"

application {
    mainClassName = "io.adetalhouet.order.system.cart.CartAppKt"
}

dependencies {
    testImplementation(platform("org.spockframework:spock-bom:1.3-groovy-2.5"))
    testImplementation("org.spockframework", "spock-core", "1.3-groovy-2.5")

    testImplementation("org.spockframework", "spock-core", "1.3-groovy-2.5")
    testImplementation("org.codehaus.groovy.modules.http-builder", "http-builder", "0.7.2") {
        exclude("commons-logging", "commons-logging")
    }
    testRuntime("org.slf4j", "jcl-over-slf4j", "1.7.26")
}