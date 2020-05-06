Order System
=

Combine Kotlin, gRPC, and graphql.

### High level architecture
![architecture](https://github.com/adetalhouet/order-system/raw/master/docs/src/docs/resources/high-level-arch.png)

### Model
![architecture](https://github.com/adetalhouet/order-system/raw/master/docs/src/docs/resources/model.png)


    id: '{{index()}}',
    email: '{{email()}}',
    address: '{{integer(100, 999)}} {{street()}}, {{city()}}, {{state()}}, {{integer(100, 10000)}}',
    password: '{{objectId()}}',
    date_created: '{{date(new Date(2014, 0, 1), new Date()).getTime()}}'

    id: '{{index()}}',
    price: '{{floating(10, 200, 1)}}',
    quantity: '{{integer(10, 100)}}',
    name: function (tags) {
      return 'Product #' + this.id;
    },
    last_updated: '{{date(new Date(2014, 0, 1), new Date()).getTime()}}'


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