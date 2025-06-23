# Multi City Sync Service

This project is a simple **learning and practice exercise** designed to demonstrate **synchronous (blocking)** communication between microservices using Spring Boot. It's intentionally kept **minimal and straightforward** to help beginners understand how services can interact with each other via HTTP.

---
## Features

- REST endpoint: `GET /tehran/{id}`
- Synchronously calls two external services:
  - `GET http://localhost:8383/tabriz/{id}`
  - `GET http://localhost:8282/karaj/{id}`
- Combines the responses from both services
- Returns a single JSON message with all three cities' responses
---

## Tech Stack & Dependencies

- **Java 24**
- **Spring Boot 3.5.3**
- **Maven** – for project build and dependency management
- `RestTemplate` (synchronous HTTP client)
  
### Dependencies Overview

| Dependency                                 | Purpose / Description                                                                 |
|--------------------------------------------|----------------------------------------------------------------------------------------|
| `spring-boot-starter-web`                  | Main web starter – includes `RestTemplate`, embedded Tomcat, Spring MVC, etc.         |
| `RestTemplate` *(via `starter-web`)*       | Synchronous HTTP client to call other services like Tabriz and Karaj                  |
| `spring-boot-devtools`                     | Enables hot reloading and developer-friendly tools during development                 |
| `lombok`                                    | Reduces boilerplate code using annotations (e.g., `@Getter`, `@Setter`, etc.)         |
| `springdoc-openapi-starter-webmvc-ui`      | Generates interactive API documentation using Swagger UI (OpenAPI 3)                  |

> SpringDoc OpenAPI version: `2.1.0`
---

## Swagger UI

The API documentation is automatically generated and accessible at:  
``` http://localhost:8181/swagger-ui.html ```  

---
## Project Structure

```text
multi-city-sync-service/
├── src/
│   └── main/
│       └── java/
│           └── demo/
│               ├── config/
│               ├── controller/
│               └── dto/
├── src/main/resources/
│   └── application.properties
├── pom.xml
└── README.md
```
## Running the Application
1- Make sure Tabriz and Karaj and Tehran services are running on the expected ports:  
- Tehran: http://localhost:8181/tehran/1
- Karaj: http://localhost:8282/karaj/1
- Tabriz: http://localhost:8383/tabriz/1

2- Start the Tehran service using
```./mvnw spring-boot:run ```  

## Sample Request
``` curl -X GET http://localhost:8181/tehran/1 ```

## Sample Response
```
{
  "message": "I am Tehran. {\"message\":\"I am tabriz\"} {\"message\":\"I am karaj\"}"
}
```

## License
This project is licensed under the MIT License.


