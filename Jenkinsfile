pipeline {
  agent {
    docker {
      image 'diffblue/cover-cli:2024.08.02-jdk17'
    }    
  }

  environment {
    DIFFBLUE_LICENSE_KEY = credentials('diffblue-cover-license-key')
  }

  stages {
    stage('Write tests') {
      steps {
        sh '''
          dcover ci activate build validate create
        '''
      }
    }
  }
}