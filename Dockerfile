FROM varunkumar12aug/openjdk:v17

WORKDIR /app

COPY build/libs/Learning-1.0.0.jar Learning-1.0.0.jar

EXPOSE 9090

ENTRYPOINT ["java", "-jar", "Learning-1.0.0.jar"]
