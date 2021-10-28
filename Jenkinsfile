pipeline{
    agent any
    stages{
        stage('Build'){
            echo 'Building...'
            checkout GitSCM
            when{
                branch 'dev'
            }

        }

        stage('Test'){
            steps{
                echo 'Testing...'
            }
        }

        stage('Deploy'){
            echo 'Deploying...'
            when{
                branch 'master'
            }
        }
    }

    post{
        succes{
            echo 'Success...'
        }
        failure{
            echo 'Failure...'
        }
        always{
            echo 'Always...'
        }
    }
}
