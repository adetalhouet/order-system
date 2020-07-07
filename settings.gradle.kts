rootProject.name = "order-system"

include("db-lib",
    "nats-lib",
    "db-model",
    "graphql-gw",
    "api",
    "client-service",
    "cart-service",
    "order-service",
    "product-service",
    "test-utils",
    "integTest")
