def call() {
    pipeline {
        agent {
            label 'windows'
        }
        
        stages {
            stage('Job Test') {
                steps {
                    powershell 'echo Success!!!'
                }
            }
        }
    }
}