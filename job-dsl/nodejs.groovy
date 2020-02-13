job('NodeJS example') {
    scm {
        git('git://github.com/boopathy435/docker-demo.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('admin')
            node / gitConfigEmail('admin@admin.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
