pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                echo 'Building...'
                checkout GitSCM
            
            }
        }

        stage('Test'){
            steps{
                echo 'Testing...'
            }
        }

        stage('Deploy'){
            steps{
                echo 'Deploying...'
            }
        }
    }
}
