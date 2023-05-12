# devops-assignment
This script is a Jenkins pipeline that automates the process of building and deploying a Maven Java project to a Docker container, followed by pushing the container image to Docker Hub and performing static code analysis using SonarQube.

Here is a brief explanation of the pipeline stages:

agent any: This specifies that the pipeline can be run on any available agent node.
tools maven: This specifies the version of Maven to be used for building the Java project.
stage Build Maven: This stage checks out the project from the Git repository, and builds the project using Maven with the 'clean install' command.
stage Build docker image: This stage builds a Docker image for the project using the Dockerfile in the project directory.
stage Push image to Hub: This stage pushes the Docker image to Docker Hub after logging in to Docker Hub with the specified credentials.
stage Static code analysis: This stage performs static code analysis on the Java project using SonarQube. The 'withSonarQubeEnv' block sets up the environment for running SonarQube, and the 'mvn clean package sonar:sonar' command runs the SonarQube scanner to analyze the code and generate a report.
Note that this pipeline assumes that the necessary plugins for Git, Maven, Docker, and SonarQube are installed on the Jenkins server. Also, the credentials for Docker Hub and SonarQube need to be configured in Jenkins, and the credentials IDs need to be specified in the script.

Overall, this pipeline automates the entire process of building, testing, packaging, and deploying a Java project to a Docker container, and provides valuable insights into the code quality and security through static code analysis using SonarQube.
