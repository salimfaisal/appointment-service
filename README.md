# Appointment Service

Spring Boot service scaffold using Java 25, Spring Boot 4.2.0-M1, Maven, Kafka,
Redis, Actuator, Prometheus metrics, and Resilience4j for Spring Boot 4. Database
support is currently disabled; the appointment domain API and persistence model
are intentionally not defined yet.

## Run locally with Docker Compose

1. Start the service and its development dependencies:

   ```powershell
   docker compose up --build
   ```

2. Check `http://localhost:8081/actuator/health`.
3. Stop with `Ctrl+C`; use `docker compose down` to remove containers.

Build the image without Compose:

```powershell
docker build -t appointment-service:dev .
```

## Configuration

Kafka and Redis addresses can be configured through
`SPRING_KAFKA_BOOTSTRAP_SERVERS`, `SPRING_DATA_REDIS_HOST`, and
`SPRING_DATA_REDIS_PORT`.

Do not commit `.env` or production credentials.
