/************PROJECT PROPERTY****************/
log.info "Hello World!"
def name=context.expand ('${#Project#Name}')
log.info  ("Project property name is " + name)

/************LOCATION OF SoapUI at the OS***************/

def soapLocation=context.expand ('${#System#user.home}')
log.info  ("Location of the SoapUI program is " + soapLocation)

/************TEST SUIT PROPERTY****************/

def variable = testRunner.testCase.testSuite.getPropertyValue ("TSProperty")
log.info  ("TestSuite Property is " + variable)

/******************ASSERTION********************/

def status = testRunner.runTestStepByName ("NumberToDollars - Request 1")
log.info  ("Status of the test step is " + status)
def result = status.getStatus().toString()
log.info ("The result is " + result)
if (result=="OK") 
{log.info  ("Congrats! Yr test passed!")}
else 
{log.info  ("Damn it! This is weird")	}