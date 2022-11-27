# syntax=docker/dockerfile:1
FROM openjdk:17
EXPOSE 8761
ADD /target/eureka-server-0.0.1-SNAPSHOT.jar backend.jar
ENTRYPOINT ["java", "-jar", "backend.jar"]
