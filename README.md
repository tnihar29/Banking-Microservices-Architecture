Banking Microservices Architecture 🏦

A demo cloud-native banking application built with Spring Boot & Spring Cloud to explore microservices architecture and distributed system design.

🚀 Features

Microservices: Independent services for accounts, loans, and cards with CRUD operations.

Centralized Configuration: Spring Cloud Config Server with GitHub repo storage and real-time updates via Spring Cloud Bus (Kafka).

Service Discovery: Netflix Eureka for registration and discovery of services.

API Gateway: Spring Cloud Gateway (WebFlux) for routing, load balancing, and custom request/response filters.

Inter-service Communication: Spring Cloud OpenFeign with client-side load balancing.

Validation & Documentation: Request validation and API documentation with Spring Boot Validation + OpenAPI (Swagger).

Observability: Spring Boot Actuator for monitoring health and metrics.

Containerization: All services containerized with Docker and orchestrated using Docker Compose across multiple environments (default, QA, prod).

🛠️ Tech Stack

Backend: Java 21, Spring Boot, Spring Cloud

Messaging: Kafka

Service Discovery: Netflix Eureka

API Gateway: Spring Cloud Gateway

Database: H2 (local), MySQL

Config Management: Spring Cloud Config Server, GitHub, Spring Cloud Bus

Documentation: Springdoc OpenAPI (Swagger)

Containerization: Docker, Docker Compose

🎯 Objective

This project is aimed at demonstrating microservices best practices including configuration management, service discovery, fault tolerance, API gateway patterns, observability, and containerized deployment.