FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/Learning-1.0.0.jar Learning-1.0.0.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "Learning-1.0.0.jar"]
