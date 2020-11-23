package strategy.lambda

import spock.lang.Specification
import strategy.Index
import strategy.SearchStrategy

class ArraySearcherLambdaTest extends Specification {

    def subject = ArraySearcherLambda

    def 'contains - linear search'() {
        given:
        def unsorted = ['3', '1', '2'] as String[]
        def strategy = { arr, element -> new Index(arr.findIndexOf { it == element }) }

        expect:
        !subject.contains(unsorted, '4', strategy as SearchStrategy)
        subject.contains(unsorted, '1', strategy as SearchStrategy)
    }

    def 'contains - binary search'() {
        given:
        def sorted = ['1', '2', '3'] as String[]
        def strategy = { String[] arr, String elem -> new Index(Arrays.binarySearch(arr, elem)) }

        println Arrays.binarySearch(sorted, '1')

        expect:
        !subject.contains(sorted, '4', strategy as SearchStrategy)
        subject.contains(sorted, '1', strategy as SearchStrategy)
    }
}
