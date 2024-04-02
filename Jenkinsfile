pipeline {
    agent any
    
     environment {
     PATH = "${env.PATH};C:\\Windows\\System32;C:\\Program Files\\apache-maven-3.9.6\\bin"
 }
    
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/pranjalwagh/assignment4.git'
            }
        }
        stage('Build') {
            steps {
                bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }
        stage('Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}
