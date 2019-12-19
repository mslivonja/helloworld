def gitUrl = "https://github.com/mslivonja/helloworld.git"

job("HelloWorld-Project-Build") {
    description "Builds My HellWorld project from master branch."
    parameters {
        stringParam('COMMIT', 'HEAD', 'Commit to build')
    }
    scm {
        git {
            remote {
                url gitUrl
                branch "origin/master"
            }
            extensions {
                wipeOutWorkspace()
                localBranch "master"
            }
        }
    }
    steps {
        maven{
            goals('clean')
            goals('package')
            mavenInstallation('Maven 3.6.3')
        }
    }
}