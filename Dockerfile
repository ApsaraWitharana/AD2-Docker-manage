# use open jdk base image
FROM openjdk:17-jdk-slim

#add applicatoin
# (1)
ADD target/AD2-Loggers-0.0.1-SNAPSHOT.jar app.jar

# =================================

# (2)
# WORKDIR /app
# COPY target/hello.jar /app/app.jar

#====================================

#expose the docker run port

EXPOSE 8085

#

ENTRYPOINT ["java","-jar","app.jar"]