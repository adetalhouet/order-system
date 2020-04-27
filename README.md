Order System
=

Combine Kotlin, gRPC, and graphql.

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
docker run -d --name order-system-db -e POSTGRES_PASSWORD=Password123 -e POSTGRES_DB=order-system -e POSTGRES_USER=order-system -d postgres
```

### TODO
- fix graphql server
- implement gRPC server
- add DB
- add NATS for inter-service update
- ...


### Test graphql server

https://github.com/prisma-labs/graphql-playground

##### Product Query
```
query {
  getProducts {
    products {
      name
      price
      quantity
      id
    }
  }
}
```

```
query {
  getProductById(input: { id: 2 }) {
    name
    quantity
    price
  }
}
```

##### Add Client
```
query {
  addClient(input: {
    address: "8 blv Markloand, H2R 2D0"
    password: "1234"
    email: "a@bob.jr"
    date_created :{
      seconds: 2353255325
    }
  }) {
    _
  }
}
```