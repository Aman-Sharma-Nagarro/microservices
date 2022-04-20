FROM openjdk:11

MAINTAINER aman.sharma@nagarro.com
EXPOSE 9003
WORKDIR /
COPY target/*.jar .
ENTRYPOINT ["java","-jar","/admin-0.0.1-SNAPSHOT.jar"]