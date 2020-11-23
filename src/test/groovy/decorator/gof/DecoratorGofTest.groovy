package decorator.gof


import spock.lang.Specification

class DecoratorGofTest extends Specification {

    def subject = DecoratorGof

    def 'calculate'() {
        expect:
        subject.calculate(300000) == 18800.0d
    }
}
