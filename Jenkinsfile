pipeline {
    agent any
    tools {
        maven 'maven_3_6_3'
    }
    stages {
        stage("Build")
        {
            steps
            {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/CrocodileTutu/java-jenkins-ci-cd']])
                sh 'mvn clean install'
            }
        }
        stage("Test")
        {
            steps
            {
                script {
                        echo "INFO: Test Stage"
                    }
            }
        }
        stage("Push")
        {
            steps
            {
                script {
                            echo "INFO: Push Stage"
                    }
            }
        }
    }
}

