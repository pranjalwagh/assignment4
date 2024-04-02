pipeline {
    agent any

    tools
    {
        maven "MAVEN_HOME"
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
                sh 'mvn clean test'
            }
        }
    }
}
