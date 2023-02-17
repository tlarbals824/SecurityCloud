FROM openjdk:17-oracle
ARG JAR_FILE=build/libs/SecurityCloud.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar","--spring.profiles.active=prod"]