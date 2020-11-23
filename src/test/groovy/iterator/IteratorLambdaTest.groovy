package iterator

import spock.lang.Specification

class IteratorLambdaTest extends Specification {

    def subject = IteratorLambda

    def 'sum'() {
        expect:
        subject.sum() == 28
    }

}
