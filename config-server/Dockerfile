FROM amazoncorretto:11.0.22

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} config-server.jar

ENTRYPOINT ["java", "-jar", "/config-server.jar"]

EXPOSE 9296