pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/pranjalwagh/assignment4.git'
            }
        }
        stage('Build') {
            steps {
                sh 'start mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'start mvn clean test'
            }
        }
    }
}
