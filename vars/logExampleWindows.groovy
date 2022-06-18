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

            stage('Body content') {
                steps {
                    println('Teste')
                    println(body)
                }
            }
        }
    }
}