pipeline {
	agent any
		
		stages {
			
			stage('Compile stage') {
				steps{
					withMaven(maven : 'Maven') {
						bat 'mvn clean compile'
					}
				}
			}
			
			stage('Test Stage') {
				steps{
					withMaven(maven : 'Maven') {
						bat 'mvn test'
					}
				}
			}
			
			stage('Deployment stage') {
				steps{
					withMaven(maven : 'Maven') {
						bat 'mvn deploy'
					}
				}
			}
		}
}