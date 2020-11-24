package interpreter.lambda


import spock.lang.Specification

class InterpreterLambdaWorkshopTest extends Specification {

    def subject = InterpreterLambdaWorkshop

    def 'calculate'() {
        expect:
        subject.evaluate('7 3 - 2 1 + *') == 12
    }

}
