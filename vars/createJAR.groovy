def call(){

	println('Shared library for craeting JAR...')
 sh 'mvn -Dmaven.test.failure.ignore=true install' 

}

