package template.lambda

import spock.lang.Specification

class TemplateLambdaWorkshopTest extends Specification {

    def subject = TemplateLambdaWorkshop

    def 'get all lines'() {
        when:
        def lines = subject.withResource { it.getAllLines() }

        then:
        lines == ["1", "2", "3"]
    }
}
