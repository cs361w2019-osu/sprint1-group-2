pipeline {
  agent any

  stages {
    stage('Test') {
      steps {
        sh 'export JAVA_HOME=/usr/lib/jvm/java-11-openjdk && /usr/local/src/apache-maven/bin/mvn clean test'
      }
    }
  }
}
