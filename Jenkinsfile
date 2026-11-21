
pipeline {
    agent any

    tools {
        jdk 'JDK21'
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Source code checkout successful'
            }
        }

        stage('Build and Test') {
            steps {
                bat 'gradlew.bat clean test bootJar'
            }
        }

        stage('Archive JAR') {
            steps {
                archiveArtifacts artifacts: 'build/libs/*.jar',
                                 fingerprint: true
            }
        }
    }
}
