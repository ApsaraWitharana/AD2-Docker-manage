# Docker Setup and Management Guide

## Introduction
Docker is a tool used for managing containers, allowing applications to run in isolated environments. This guide covers the fundamental Docker commands to build, run, and manage containers for Java and Spring Boot applications.

## Prerequisites
- Install Docker on your system.
- Verify the installation using:
  
  ```sh
  docker --version
Building and Running a Java Application with Docker

1. Prepare the Java Application
Navigate to your project directory.

Clean and package the application using Maven:

```sh
mvn clean
mvn package
```
The JAR file will be created inside the target folder.

2. Create a Dockerfile
Create a Dockerfile in the project root and specify the instructions for building the image. Example:

dockerfile
```
FROM openjdk:17
COPY target/your-app.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
```
3. Build the Docker Image
Run the following command to build the Docker image:

```sh
docker build -t your-image-name .
```
4. Verify the Docker Image
To check the available Docker images, use:

```sh
docker images
```
5. Run the Docker Container
To run the application in a container, use:

```sh
docker run -p 8090:8085 your-image-name
```
Run the container in detached mode (background execution):

```sh
docker run -d -p 8090:8085 your-image-name
```
6. Manage Running Containers
Check running containers:

```sh
docker ps
```
Check all containers (including stopped ones):

```sh
docker ps -a
```
7. View Logs
To view application logs in real time:

```sh
docker logs -f <container-id>
```
8. Stop and Remove Containers
Stop a running container:

```sh
docker stop <container-id>
```
Remove a container:

```sh
docker rm <container-id>
```
9. Remove Docker Images
To remove an image:

```sh
docker rmi your-image-name
```
Force remove an image:

```sh
docker rmi -f your-image-name
```
Docker Hub (Optional)
Docker Hub is used to share Docker images but does not provide version control. To pull a Java 17 image from Docker Hub, use:

```sh
docker pull openjdk:17
```
This guide covers the essential Docker commands to build and manage your Java/Spring Boot applications efficiently.
