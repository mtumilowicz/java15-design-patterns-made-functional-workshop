package template.gof

import spock.lang.Specification

class ResourceGetAllLinesTest extends Specification {

    def subject = new ResourceGetAllLines()

    def 'get all lines'() {
        when:
        def lines = subject.execute()

        then:
        lines == ["1", "2", "3"]
    }

}
