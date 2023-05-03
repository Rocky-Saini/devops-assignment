FROM openjdk:11
EXPOSE 8085
ADD target/devops-assignment.jar devops-assignment.jar
ENTRYPOINT ["java","-jar","/devops-assignment.jar"]