pipeline {
	agent any
		
		stages {
			
			stage('Compile stage') {
				steps{
					withMaven(maven : 'Maven') {
						bat 'mvn clean'
					}
				}
			}
			
			stage('Test Stage') {
				steps{
					withMaven(maven : 'Maven') {
						bat 'mvn package'
					}
				}
			}
			
		}
}