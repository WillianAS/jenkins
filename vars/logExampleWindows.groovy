#!groovy
def call(body) {
    println(body)

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