FROM openjdk:8-jdk-alpine
EXPOSE 8083
ADD /target/conges-microservice-0.0.1-SNAPSHOT.jar conges-microservice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "conges-microservice-0.0.1-SNAPSHOT.jar"]