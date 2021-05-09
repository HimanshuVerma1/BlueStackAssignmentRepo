pipeline {
	agent any
		
		stages {
			
			stage('Compile stage') {
				steps{
					withMaven(maven : 'Maven') {
						sh 'mvn clean compile'
					}
				}
			}
			
			stage('Test Stage') {
				steps{
					withMaven(maven : 'Maven') {
						sh 'mvn test'
					}
				}
			}
			
			stage('Deployment stage') {
				steps{
					withMaven(maven : 'Maven') {
						sh 'mvn deploy'
					}
				}
			}
		}
}