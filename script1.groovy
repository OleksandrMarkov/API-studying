def caseVar = testRunner.testCase.getPropertyValue("propcase")
log.info caseVar

def suiteVar = testRunner.testCase.testSuite.getPropertyValue("propsuite")
log.info suiteVar

def prjVar = testRunner.testCase.testSuite.project.getPropertyValue("project")
log.info prjVar

testRunner.testCase.setPropertyValue("propcase", "somenew1")
testRunner.testCase.testSuite.setPropertyValue("propsuite", "somenew2")
testRunner.testCase.testSuite.project.setPropertyValue("project", "somenew3")
