log.info "My First Groovy Test!"

def name1=context.expand('${#Project#AAA}')
log.info ("Project 1st variable: " + name1)

def name2=context.expand('${#Project#BBB}')
log.info ("Project 2nd variable: " + name2)


def name3=context.expand('${#TestSuite#AAA}')
log.info ("Test Suite 1st variable: " + name3)

def name4=context.expand('${#TestSuite#BBB}')
log.info ("Test Suite 2nd variable: " + name4)

def status1 = testRunner.runTestStepByName ("SOAP RequestAdd") 
def status2 = testRunner.runTestStepByName ("SOAP RequestDiv") 
def status3 = testRunner.runTestStepByName ("SOAP RequestMul") 
def status4 = testRunner.runTestStepByName ("SOAP RequestSub") 

def result1 = status1.getStatus().toString()
log.info ("The ADD result is " + result1)

def result2 = status2.getStatus().toString()
log.info ("The DIV result is " + result2)

def result3 = status3.getStatus().toString()
log.info ("The MUL result is " + result3)

def result4 = status4.getStatus().toString()
log.info ("The SUB result is " + result4)

if (result1 && result2 && result3 && result4=="OK")
{log.info ("Great Test PASSED!")}
else{	log.info ("Damn it, Test Failed!")}
