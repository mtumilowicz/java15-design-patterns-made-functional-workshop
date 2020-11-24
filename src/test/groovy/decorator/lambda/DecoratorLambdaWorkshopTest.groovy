package decorator.lambda

import spock.lang.Specification

class DecoratorLambdaWorkshopTest extends Specification {

    def subject = DecoratorLambdaWorkshop

    def 'calculate'() {
        expect:
        subject.calculate(300_000) == 18800.0d
    }
}
