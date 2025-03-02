FROM amazoncorretto:11.0.22

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} hystrix-dashboard.jar

ENTRYPOINT ["java", "-jar", "/hystrix-dashboard.jar"]

EXPOSE 8000