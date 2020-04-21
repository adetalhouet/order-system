Order System
=

Combine Kotlin, gRPC, and graphql.

### High level architecture
![architecture](https://github.com/adetalhouet/order-system/raw/master/docs/src/docs/resources/k.png)



TODO
- fix graphql server
- implement gRPC server
- add DB
- add NATS for inter-service update
- ...


### Test graphql server

https://github.com/prisma-labs/graphql-playground

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