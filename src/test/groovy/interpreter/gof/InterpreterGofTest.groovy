package interpreter.gof

import spock.lang.Specification

class InterpreterGofTest extends Specification {

    def subject = InterpreterGof

    def 'calculate'() {
        expect:
        subject.evaluate('7 3 - 2 1 + *') == 12
    }
}
