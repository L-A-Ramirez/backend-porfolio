FROM amazoncorretto:11-alpine-jdk
MAINTAINER ralu
COPY target/porfolio-0.0.1-SNAPSHOT.jar porfolio.jar
ENTRYPOINT ["java","-jar","/porfolio.jar"]