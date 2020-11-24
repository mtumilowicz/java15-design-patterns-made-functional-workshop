package visitor.lambda

import spock.lang.Specification

class LambdaVisitorWorkshopTest extends Specification {

    def shapes = [new Circle(4), new Square(5), new Rectangle(6, 7)]
    def subject = LambdaVisitorWorkshop

    def 'TotalArea'() {
        expect:
        subject.totalArea(shapes).round(2) == 117.27d
    }

    def 'TotalPerimeter'() {
        expect:
        subject.totalPerimeter(shapes).round(2) == 71.13d
    }
}
