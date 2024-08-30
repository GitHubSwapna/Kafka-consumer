FROM eclipse-temurin:17

EXPOSE 8181

COPY target/Kafka-consumer-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]