pipeline{
    agent any
    tools {
        maven 'mymaven' 
    }
    stages{
stage ('build and install'){
            steps{
                sh "mvn clean install"
            }
			 }
			   }
			     }
