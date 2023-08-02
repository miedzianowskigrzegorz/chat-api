
FROM openjdk:17-jdk

LABEL maintainer="pl.gm"

ARG JAR_FILE=*.jar

COPY ${JAR_FILE} application.jar

ENTRYPOINT ["java", "-jar", "application.jar"]