def call() {
    gitUrl = sh(returnStdout: true, script: 'git remote show origin').trim()
    gitSha1 = sh(returnStdout: true, script: 'git rev-parse HEAD').trim()
    gitAuthor = "${env.CHANGE_AUTHOR ? env.CHANGE_AUTHOR : sh(returnStdout: true, script: 'git log -1 --format="%aN" HEAD').trim()}"
    gitAuthorEmail = "${env.CHANGE_AUTHOR_EMAIL ? env.CHANGE_AUTHOR_EMAIL : sh(returnStdout: true, script: 'git log -1 --format="%aE" HEAD').trim()}"
    def gitInfo = (gitUrl =~ '.*/([^/]+)/([^/]+).git')[0]
    gitOrg = gitInfo[1]
    gitRepo = gitInfo[2]
}
