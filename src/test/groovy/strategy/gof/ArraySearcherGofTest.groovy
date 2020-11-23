package strategy.gof

import spock.lang.Specification

class ArraySearcherGofTest extends Specification {

    def subject = ArraySearcherGof

    def 'contains - linear search'() {
        given:
        def unsorted = ['3', '1', '2'] as String[]
        def strategy = new LinearSearchStrategyImpl()

        expect:
        !subject.contains(unsorted, '4', strategy)
        subject.contains(unsorted, '1', strategy)
    }

    def 'contains - binary search'() {
        given:
        def sorted = ['1', '2', '3'] as String[]
        def strategy = new BinarySearchStrategyImpl()

        expect:
        !subject.contains(sorted, '4', strategy)
        subject.contains(sorted, '1', strategy)
    }

}
