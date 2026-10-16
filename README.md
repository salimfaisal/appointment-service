# Appointment Service

Spring Boot service scaffold using the same core stack as Patient Service:
Java 25, Spring Boot 4.2.0-M1, Maven, PostgreSQL with Flyway, Kafka, Redis,
Actuator, Prometheus metrics, and Resilience4j for Spring Boot 4. The appointment
domain API and persistence model are intentionally not defined yet.

## Run locally with Docker Compose

1. Copy `.env.example` to `.env` and set local database credentials.
2. Start the service and its development dependencies:

   ```powershell
   docker compose up --build
   ```

3. Check `http://localhost:8081/actuator/health`.
4. Stop with `Ctrl+C`; use `docker compose down` to remove containers. The
   PostgreSQL volume is retained unless you also remove volumes.

Build the image without Compose:

```powershell
docker build -t appointment-service:dev .
```

## Configuration

Database credentials are provided by `DB_USERNAME` and `DB_PASSWORD`. The
datasource, Kafka, and Redis addresses can be configured through
`SPRING_DATASOURCE_URL`, `SPRING_KAFKA_BOOTSTRAP_SERVERS`,
`SPRING_DATA_REDIS_HOST`, and `SPRING_DATA_REDIS_PORT`.

Do not commit `.env` or production credentials.
