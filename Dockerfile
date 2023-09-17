##
## Build stage
##
#FROM maven:3.8.2-jdk-17 AS build
#COPY . .
#RUN mvn clean package -Pprod -DskipTests
#
##
## Package stage
##
#FROM openjdk:1-jdk-slim
#COPY --from=build /target/demo-0.0.1-SNAPSHOT.jar demo.jar
## ENV PORT=8080
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","demo.jar"]


#FROM eclipse-temurin:17-jdk-alpine
#VOLUME /tmp
#COPY target/*.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
#EXPOSE 8080


FROM openjdk:17-jdk-alpine AS build
COPY . .
#RUN mvn clean package -DskipTests

RUN chmod +x ./mvnw
RUN ./mvnw clean package

FROM openjdk:17-jdk-alpine
COPY --from=build /target/TransportApp-0.0.1-SNAPSHOT.jar demo.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"]