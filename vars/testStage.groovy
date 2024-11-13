def call(String name) {
    stage('Test stage') {
        def testObj = new net.gen64.jenkins.Test()
        String txt = testObj.test(name)
        echo "${txt}"
    }
}