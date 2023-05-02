pipeline {
    agent {
        docker { image 'openjdk:11.0-jdk' }
    }
    stages {
        stage("Build Maven")
        {
            steps
            {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/CrocodileTutu/java-jenkins-ci-cd']])
                sh 'mvn clean install'
            }
        }
        stage("Build Docker")
        {
            steps
            {
                script {
                    sh 'docker build -t CrocodileTutu/java-jenkins-ci-cd .'
                }
            }
        }
    }
}

