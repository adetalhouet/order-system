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


### TODO
- fix graphql server
- implement gRPC server
- add DB
- add NATS for inter-service update
- ...


### Test graphql server

https://github.com/prisma-labs/graphql-playground

##### Get Products
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

##### Add bill
```
query {
  addBill(
    input: {
      id: 1244
      date_created: { seconds: 1587433346 }
      client_id: 1
      product_ids: [432, 432523]
    }
  ) {
    status
  }
}
```