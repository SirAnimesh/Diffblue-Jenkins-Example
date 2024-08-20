pipeline {
  agent {
    docker {
      image 'diffblue/cover-cli:latest-jdk17'
    }    
  }

  environment {
    DCOVER_LICENSE_KEY = credentials('diffblue-cover-license-key')
  }

  stages {
    stage('Write tests') {
      steps {
        sh '''
          dcover activate "$DCOVER_LICENSE_KEY"
          dcover build create --batch
        '''
      }
    }
    stage('Commit tests to branch') {
      steps {
        sh '''#!/bin/bash
          git config user.name Diffblue
          git config user.email diffblue@example.org

          if [ -n "$(git status --short **/*DiffblueTest.java)" ]; then 
            git add **/*DiffblueTest.java
            git commit --message "Update Unit Tests for $(git rev-parse --short HEAD)"
            git push --set-upstream origin
          else
            echo "Nothing to commit"
          fi
        '''
      }
    }
  }
}