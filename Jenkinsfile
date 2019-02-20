pipeline {
  agent any

  stages {
    stage('Test') {
      steps {
        sh 'export JAVA_HOME=/usr/lib/jvm/java-11-openjdk && /usr/local/src/apache-maven/bin/mvn clean test'
      }
    }
    post {
      unsuccessful {
        githubNotify credentialsId: 'cs361-token', description: 'Jenkins build failed', status: 'FAILURE', targetUrl 'http://jenkins.hunterlannon.net'
      }
      successful {
        githubNotify credentialsId: 'cs361-token', description: 'Jenkins build passed', status: 'SUCCESS', targetUrl 'http://jenkins.hunterlannon.net'
      }
    }
  }
}
