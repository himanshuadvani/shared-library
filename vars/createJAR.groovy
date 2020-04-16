def call(){

	println("Shared library for creating JAR...")
	sh 'mvn -Dmaven.test.failure.ignore=true install' 

}

