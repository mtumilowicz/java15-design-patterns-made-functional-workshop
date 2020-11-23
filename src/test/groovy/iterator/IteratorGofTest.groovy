package iterator

import spock.lang.Specification

class IteratorGofTest extends Specification {

    def subject = IteratorGof

    def 'sum'() {
        expect:
        subject.sum() == 28
    }

}
