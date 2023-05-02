pipeline {
    agent {
        docker {
            image 'openjdk:11.0-jdk'
            args '-v $HOME/.m2:/root/.m2'
        }
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

