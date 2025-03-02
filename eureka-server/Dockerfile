FROM amazoncorretto:11.0.22

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} eureka-server.jar

ENTRYPOINT ["java", "-jar", "/eureka-server.jar"]

EXPOSE 8760