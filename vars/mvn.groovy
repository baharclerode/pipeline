def call(arguments) {
    sh "mvn ${mavenArgs} -Darguments=\"${mavenArgs}\" ${arguments}"
}
