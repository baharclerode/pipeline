def call() {
    sh(returnStdout: true, script: 'git remote show origin').trim()
}
