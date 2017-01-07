# wildfly-swarm-loggers-demo

WildFly Swarm Loggers Demo

## Build & Run

``` sh
./mvnw clean package &&\
java -jar target/wildfly-swarm-loggers-demo-swarm.jar
```

## Logging in server.log with each category

### one

``` sh
curl localhost:8080/one
```

``` sh
2017-01-07 13:57:34,827 INFO  [one.OneController] (default task-1) This is INFO  log
2017-01-07 13:57:34,827 WARN  [one.OneController] (default task-1) This is WARN  log
2017-01-07 13:57:34,828 ERROR [one.OneController] (default task-1) This is ERROR log
```

### one.two

``` sh
curl localhost:8080/two
```

``` sh
2017-01-07 13:57:36,734 DEBUG [one.two.TwoController] (default task-2) This is DEBUG log
2017-01-07 13:57:36,734 INFO  [one.two.TwoController] (default task-2) This is INFO  log
2017-01-07 13:57:36,735 WARN  [one.two.TwoController] (default task-2) This is WARN  log
2017-01-07 13:57:36,735 ERROR [one.two.TwoController] (default task-2) This is ERROR log
```

### one.two.three

``` sh
curl localhost:8080/three
```

``` sh
2017-01-07 13:57:38,679 TRACE [one.two.three.ThreeController] (default task-3) This is TRACE log
2017-01-07 13:57:38,680 DEBUG [one.two.three.ThreeController] (default task-3) This is DEBUG log
2017-01-07 13:57:38,680 INFO  [one.two.three.ThreeController] (default task-3) This is INFO  log
2017-01-07 13:57:38,680 WARN  [one.two.three.ThreeController] (default task-3) This is WARN  log
2017-01-07 13:57:38,681 ERROR [one.two.three.ThreeController] (default task-3) This is ERROR log
```