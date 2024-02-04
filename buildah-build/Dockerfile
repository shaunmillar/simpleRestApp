# Build stage
FROM maven:3.9.6-amazoncorretto-17-debian AS build
COPY ./src /home/app/src
COPY ./pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean test package

# Package stage
#FROM eclipse-temurin:17
FROM openjdk:17-alpine
COPY --from=build /home/app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]