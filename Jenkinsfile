pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                echo 'Building...'          
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
                echo 'Activate Theme'
		sh '''composer update;
		wp theme update --all;'''
            }
        }
    }
}
