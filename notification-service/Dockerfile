FROM openjdk:11

MAINTAINER aman.sharma@nagarro.com
WORKDIR /
COPY target/*.jar .
ENTRYPOINT ["java","-jar","/notification-service-0.0.1-SNAPSHOT.jar"]