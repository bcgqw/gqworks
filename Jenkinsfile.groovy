pipeline{
	agent any
	stages{
		stage('Build'){
			steps{
				echo 'Building...'
				checkout scm
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
	post{
		success{
			echo 'Success...'
		}
		failure{
			echo 'Failure...'
			}
		always{
			echo 'Always...'
		}
}

