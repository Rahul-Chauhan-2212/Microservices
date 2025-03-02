FROM amazoncorretto:11.0.22

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} contact-service.jar

ENTRYPOINT ["java", "-jar", "/contact-service.jar"]

EXPOSE 9002