pipeline {

  agent any

    triggers {
        pollSCM('') // Enabling being build on Push
    }

  stage('Test') {
    steps {
      sh 'export JAVA_HOME=/usr/lib/jvm/java-11-openjdk && /usr/local/src/apache-maven/bin/mvn clean test'
      def comment = pullRequest.comment('This is a test :)')
    }
  }
}
