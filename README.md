# java-spring
Spring Java Framework

# Java 1.8 installation on Ubuntu

$ sudo apt-add-repository ppa:webupd8team/java

$ sudo apt-get update

$ sudo apt-get install oracle-java8-installer

$ java -version

# Result

java version "1.8.0_45"

Java(TM) SE Runtime Environment (build 1.8.0_45-b14)

Java HotSpot(TM) 64-Bit Server VM (build 25.45-b02, mixed mode)


# Gradle Installation

$ curl -s https://get.sdkman.io | bash

$ sdk install gradle 3.3


# Git Clone

$ git clone git@github.com:hjm0520/java-spring.git

$ cd java-spring


# Configure the database connection

$ vi src/main/resources/application.properties


# Build the Application using Gradle

$ gradle build

# Run the application
$ java -jar build/libs/springboot-0.0.1.jar
