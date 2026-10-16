FROM eclipse-temurin:25-jdk-jammy AS build
WORKDIR /workspace
COPY .mvn .mvn
COPY mvnw pom.xml ./
RUN chmod +x mvnw && ./mvnw -B dependency:go-offline
COPY src src
RUN ./mvnw -B clean package -DskipTests

FROM eclipse-temurin:25-jre-jammy
WORKDIR /app
RUN useradd --system --uid 10001 --user-group --create-home spring
COPY --from=build /workspace/target/appointment-service.jar app.jar
USER 10001:10001
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
