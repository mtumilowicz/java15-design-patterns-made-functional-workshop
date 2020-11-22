package visitor

import spock.lang.Specification

import static visitor.VisitorLambda.*

class VisitorLambdaTest extends Specification {

    def shapes = [new Circle( 4 ), new Square(5 ), new Rectangle(6, 7 )]

    def 'TotalArea'() {
        expect:
        totalArea(shapes).round(2) == 117.27d
    }

    def 'TotalPerimeter'() {
        expect:
        totalPerimeter(shapes).round(2) == 71.13d
    }
}
