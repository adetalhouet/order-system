group = "${rootProject.group}.integTest"

dependencies {
    implementation(project(":product-service"))
    implementation(project(":cart-service"))
}