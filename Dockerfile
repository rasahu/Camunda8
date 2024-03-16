FROM openjdk:11
LABEL maintainer="rasahu"
COPY target/my-project-1.0.0-SNAPSHOT.jar  camunda7.jar
ENTRYPOINT [ "java","-jar", "camunda7"]
