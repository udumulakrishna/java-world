# Stage 1: Build the application artifact
FROM maven:3.8.3-openjdk-23 AS build
WORKDIR /home/app
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package -DskipTests=true


# Stage 2:Runtime: Create the final, lightweight runtime image
FROM amazoncorretto:23-alpine-full
#FROM eclipse-temurin:17-jre-alpine


# Copy the jar from the build stage
#COPY --from=build /app/target/*.jar app.jar
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar


# Default Environment Variables (Overridable)
ENV DB_URL=jdbc:mysql://host.docker.internal:3306/ukrishna
ENV DB_USER=root
ENV DB_PASSWORD=root


# Run the app and pass the env vars to Spring Boot
ENTRYPOINT ["java", "-Dspring.datasource.url=${DB_URL}", "-Dspring.datasource.username=${DB_USER}", "-Dspring.datasource.password=${DB_PASSWORD}", "-jar", "app.jar"]
# Set the entry point command to run the application
#ENTRYPOINT ["java", "-jar", "/app.jar"]