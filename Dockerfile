FROM openjdk:17
LABEL maintainer="rasahu"
COPY target/my-project-1.0.0-SNAPSHOT.jar  app/camunda7.jar
ENTRYPOINT [ "java","-jar", "app/camunda7.jar"]
