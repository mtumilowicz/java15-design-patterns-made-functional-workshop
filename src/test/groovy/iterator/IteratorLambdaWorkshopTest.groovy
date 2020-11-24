package iterator

import spock.lang.Specification

class IteratorLambdaWorkshopTest extends Specification {

    def subject = IteratorLambdaWorkshop

    def 'sum'() {
        expect:
        subject.sum() == 28
    }

}
