FROM openjdk:11
WORKDIR /app
COPY ./ ./
CMD ["java", "-jar", "target/SPE-0.0.1-SNAPSHOT.jar"]
