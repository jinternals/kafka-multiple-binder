FROM openjdk:11-jre-slim

MAINTAINER Mradul Pandey <pandeymradul@gmail.com>

ADD ./@project.build.finalName@.jar /app/
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/@project.build.finalName@.jar"]

EXPOSE 8080
