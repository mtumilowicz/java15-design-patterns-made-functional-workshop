package decorator.lambda

import spock.lang.Specification

class DecoratorLambdaTest extends Specification {

    def subject = DecoratorLambda

    def 'calculate'() {
        expect:
        subject.calculate(300_000) == 18800.0d
    }
}
