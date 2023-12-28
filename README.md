# Microservices Project

This project demonstrates the implementation of microservices architecture using Spring Boot, Spring Cloud, Eureka for service discovery, and Feign for service communication. The project consists of four microservices: `Quiz`, `Question`, `ApiGateway`, and `ServiceRegistry`. Separate databases are used for the `Question` and `Quiz` services.

## Microservices Overview

- **Quiz Service:** Manages quiz-related operations.
- **Question Service:** Handles questions and answers.
- **ApiGateway:** Routes requests and acts as the entry point for communication.
- **ServiceRegistry:** Registers and discovers microservices.

## Prerequisites

- Java 17
- Gradle
- Docker (optional for database containers)

## Getting Started

Follow these steps to build and run the microservices:

### 1. Build the Projects

```bash
cd quiz-service
./gradlew clean build

cd ../question-service
./gradlew clean build

cd ../api-gateway
./gradlew clean build

cd ../service-registry
./gradlew clean build
```

# Run the Services

## Start the Service Registry:

```bash
cd service-registry
./gradlew bootRun

cd ../quiz-service
./gradlew bootRun

cd ../question-service
./gradlew bootRun

cd ../api-gateway
./gradlew bootRun

```
# Microservices Details

## 1. Quiz Service

- **Endpoint:** `/quiz/**`
- **Description:** Manages quiz-related operations.

## 2. Question Service

- **Endpoint:** `/question/**`
- **Description:** Handles questions and answers.

## 3. ApiGateway

- **Endpoint:** `/8765`
- **Description:** Routes requests and serves as the entry point.

## 4. Service Registry

- **Endpoint:** `[/eureka](http://localhost:8761/)`
- **Description:** Registers and discovers microservices.

# Service Communication

The services communicate with each other using the Eureka service registry and Feign for client-side load balancing. The ApiGateway routes requests to the appropriate microservices based on the specified paths.

