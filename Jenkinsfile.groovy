pipeline{
	agent any
	stages{
		stage('Build'){
			steps{
				echo 'Building...'
				checkout scm
				when{
					branch 'dev'
				}
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
				when{
					branch 'master'
					}
				}
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

