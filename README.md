![Build CI](https://github.com/adetalhouet/order-system/workflows/Build%20CI/badge.svg?branch=master)
[![codecov](https://codecov.io/gh/adetalhouet/order-system/branch/master/graph/badge.svg)](https://codecov.io/gh/adetalhouet/order-system)
[![CodeFactor](https://www.codefactor.io/repository/github/adetalhouet/order-system/badge)](https://www.codefactor.io/repository/github/adetalhouet/order-system)

Order System
=
Kotlin, gRPC, Graphql, Exposed

APIs are defined in [proto](https://github.com/adetalhouet/order-system/raw/master/api/src/main/proto) and this is use as main model all across the application.

To interact with the application, use the GraphQL API GW, which is directly integrated with the gRPC servers using [Rejoiner](https://github.com/google/rejoiner)

### TODO
- Add Kong API GW integration w/ GraphQL
  - Secure endpoints - HTTPS / TLS
  - Metrics / Monitoring

### Installation
[Operator](https://github.com/adetalhouet/order-system-operator)

### High level architecture
![architecture](https://github.com/adetalhouet/order-system/raw/master/docs/src/docs/resources/high-level-arch.png)

### Model
![architecture](https://github.com/adetalhouet/order-system/raw/master/docs/src/docs/resources/model.png)

### Services port

| Service | Port |
|---------|:----:|
| cart    | 9090 |
| client  | 9091 |
| order   | 9092 |
| product | 9093 |

### Postgres Database
```
docker run -d --name order-system-db -p 5432:5432 -e POSTGRES_PASSWORD=Password123 -e POSTGRES_DB=order-system -e POSTGRES_USER=order-system -d postgres
```

### Test graphql server
Use [postman collection](https://github.com/adetalhouet/order-system/raw/master/Order-System.postman_collection.json)
