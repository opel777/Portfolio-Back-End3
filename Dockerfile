FROM amazoncorretto:8-alpine-jdk
MAINTAINER Gustavo
COPY target/Portfolio_1-0.0.1-SNAPSHOT.jar Portfolio_1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Portfolio_1-0.0.1-SNAPSHOT.jar"]