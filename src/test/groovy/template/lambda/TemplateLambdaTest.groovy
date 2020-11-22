package template.lambda

import spock.lang.Specification

class TemplateLambdaTest extends Specification {

    def subject = TemplateLambda

    def 'get all lines'() {
        when:
        def lines = subject.withResource { it.getAllLines() }

        then:
        lines == ["1", "2", "3"]
    }
}
