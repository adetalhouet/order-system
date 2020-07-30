group = "${rootProject.group}.client"

plugins {
    id("com.google.cloud.tools.jib")
}

application {
    mainClassName = "io.adetalhouet.order.system.client.ClientAppKt"
}

jib {
    from {
        image = "openjdk:8-jre-alpine"
    }
    to {
        val tag_version = version.toString().substringBefore('-')
        val app_name = group.toString().replace("${rootProject.group}.", "").plus("-service")
        image = "adetalhouet/order-system-${app_name}:$tag_version"
    }
    container {
        mainClass = application.mainClassName
    }
}