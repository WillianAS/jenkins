pipeline {
    agent {
        label 'windows'
    }
    
    stages {
        stage('Job Test') {
            steps {
                hellowExempleWindows()
            }
        }
    }
}