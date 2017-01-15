def call() {
    return "${env.CHANGE_AUTHOR ? env.CHANGE_AUTHOR : sh(returnStdout: true, script: 'git log -1 --format="%aN" HEAD').trim()}"
}
