FROM openjdk:17-oracle
COPY build/libs/SecurityCloud.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar","--spring.profiles.active=prod"]