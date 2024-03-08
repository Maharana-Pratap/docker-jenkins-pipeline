FROM openjdk:17
VOLUME /temp
COPY target/*.jar jenkins-docker.jar
ENTRYPOINT "java","-jar","jenkins-docker.jar"


