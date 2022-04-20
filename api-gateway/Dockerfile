FROM openjdk:11

MAINTAINER aman.sharma@nagarro.com
WORKDIR /
COPY target/*.jar .
ENTRYPOINT ["java","-jar","/api-gateway-0.0.1-SNAPSHOT.jar"]