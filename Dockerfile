FROM openjdk:11
LABEL maintainer="rasahu"
COPY target/my-project-1.0.0-SNAPSHOT.jar  my-project-1.0.0-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar", "my-project-1.0.0-SNAPSHOT.jar"]
