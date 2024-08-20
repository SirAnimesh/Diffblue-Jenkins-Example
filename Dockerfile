FROM maven:3.9.9-eclipse-temurin-17-focal

RUN apt-get update -y && apt-get upgrade -y && apt-get install unzip -y