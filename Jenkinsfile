pipeline {
    agent any
    environment {
        PATH = "C:/Program Files/apache-maven-3.9.6/bin/:$PATH"
    }
    
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/pranjalwagh/assignment4.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
}
