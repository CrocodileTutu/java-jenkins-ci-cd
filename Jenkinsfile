pipeline {
    agent any
    stages {
        stage('SCM Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/CrocodileTutu/java-jenkins-ci-cd.git'
            }
        }
        stage('Build Maven') {
            steps {
                echo 'under construction'
            }
        }
    }
}