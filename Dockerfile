# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="basiljereh@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8181

# The application's jar file
ARG JAR_FILE=target/common-openshift-handler-0.0.1.jar

# Add the application's jar to the container
ADD ${JAR_FILE} common-openshift-handler.jar

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/common-openshift-handler.jar"]