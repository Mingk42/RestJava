# REST

### Create
```bash
$ curl -X POST -H "Content-Type: application/json" -d '{"firstName":"Sponge", "lastName":"Bob"}' http://localhost:8080/people
```

### Read
```bash
$ curl -X GET http://localhost:8080/people     # 전체 조회
$ curl -X GET http://localhost:8080/people/6   # 특정 조회
```

### Update
```bash
$ curl -X PUT -H "Content-Type: application/json" -d '{"firstName":"Patrick", "lastName":"Star"}' http://localhost:8080/people/6
```

### Delete
```bash
$ curl -X DELETE http://localhost:8080/people/6
```