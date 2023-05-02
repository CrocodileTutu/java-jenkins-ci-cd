FROM openjdk:11.0-jdk
EXPOSE 8080
ADD target/java-jenkins-ci-cd.jar java-jenkins-ci-cd.jar
ENTRYPOINT ["java","-jar","/java-jenkins-ci-cd.jar"]
