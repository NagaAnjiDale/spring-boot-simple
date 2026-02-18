# Spring Boot Application

A simple Spring Boot REST API application.

## Prerequisites

- Java 11+
- Maven 3.6+

## Build

```bash
mvn clean package
```

## Run

```bash
java -jar target/spring-boot-app-1.0.0.jar
```

Or

```bash
mvn spring-boot:run
```

## Test Endpoints

- GET http://localhost:8080/ → Welcome message
- GET http://localhost:8080/hello → Hello message
- GET http://localhost:8080/api/users → User data
- POST http://localhost:8080/api/echo → Echo back your data

## Example Commands

```bash
# Home endpoint
curl http://localhost:8080/

# Hello endpoint
curl http://localhost:8080/hello

# Get users
curl http://localhost:8080/api/users

# Echo with POST
curl -X POST http://localhost:8080/api/echo \
  -H "Content-Type: application/json" \
  -d '{"name": "John", "age": 30}'
```
