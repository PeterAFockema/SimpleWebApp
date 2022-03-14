node {
   stage('Preparation') {
      git 'https://github.com/PeterAFockema/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}