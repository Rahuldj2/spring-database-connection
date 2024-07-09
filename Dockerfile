FROM eclipse-temurin:21
RUN mkdir /opt/app
VOLUME /tmp

COPY target/demo-0.0.1-SNAPSHOT.jar /opt/app
CMD ["java", "-jar", "/opt/app/demo-0.0.1-SNAPSHOT.jar"]
# Expose the port on which the Spring Boot application runs
EXPOSE 8080