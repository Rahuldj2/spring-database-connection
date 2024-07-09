# Use the Eclipse Temurin JDK 21 as the base image
FROM eclipse-temurin:21

# Create a directory inside the container to hold the application
RUN mkdir /opt/app

# Copy the JAR file from the target directory in the local filesystem to the /opt/app directory in the container
COPY target/demo-0.0.1-SNAPSHOT.jar /opt/app/

# Specify the /tmp directory as a volume
VOLUME /tmp

# Expose the port on which the Spring Boot application runs
EXPOSE 8080

# Specify the command to run the JAR file when the container starts
CMD ["java", "-jar", "/opt/app/demo-0.0.1-SNAPSHOT.jar"]
