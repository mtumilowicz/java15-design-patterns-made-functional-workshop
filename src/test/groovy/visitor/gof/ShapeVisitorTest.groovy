package visitor.gof

import spock.lang.Specification

class ShapeVisitorTest extends Specification {

    def shapes = [new Circle(4), new Square(5), new Rectangle(6, 7)]
    def subject = ShapeVisitor

    def 'TotalArea'() {
        expect:
        subject.totalArea(shapes).round(2) == 117.27d
    }

    def 'TotalPerimeter'() {
        expect:
        subject.totalPerimeter(shapes).round(2) == 71.13d
    }
}
