pipeline {
    agent any
    tools{
        maven 'apache-maven-3.6.3'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Rocky-Saini/devops-assignment']]])
                bat 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t rockysaini/devops-assignment .'
                }
            }
        }
        stage('Push image to Hub'){
            steps{
                script{
                   bat 'docker login -u rockysaini -p "Docker@9027"'
                   bat 'docker push rockysaini/devops-assignment'
                }
            }
        }
    }
    
}