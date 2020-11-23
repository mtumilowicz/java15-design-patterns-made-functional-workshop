package interpreter.lambda


import spock.lang.Specification

class InterpreterLambdaTest extends Specification {

    def subject = InterpreterLambda

    def 'calculate'() {
        expect:
        subject.evaluate('7 3 - 2 1 + *') == 12
    }

}
