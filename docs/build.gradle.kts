plugins {
    id("org.asciidoctor.convert")
}

tasks.asciidoctor {
    sources(delegateClosureOf<PatternSet> {
        include("billing-service.adoc")
    })
}

tasks.build { dependsOn(tasks.asciidoctor) }