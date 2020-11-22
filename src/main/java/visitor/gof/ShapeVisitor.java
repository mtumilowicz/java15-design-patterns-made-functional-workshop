package visitor.gof;

import java.util.List;

class ShapeVisitor {

    static Visitor<Double> areaVisitor = new Visitor<>() {
        public Double visit(Square element) {
            return element.side * element.side;
        }

        public Double visit(Circle element) {
            return Math.PI * element.radius * element.radius;
        }

        public Double visit(Rectangle element) {
            return element.height * element.width;
        }
    };

    static Visitor<Double> perimeterVisitor = new Visitor<>() {
        public Double visit(Square element) {
            return 4 * element.side;
        }

        public Double visit(Circle element) {
            return 2 * Math.PI * element.radius;
        }

        public Double visit(Rectangle element) {
            return (2 * element.height + 2 * element.width);
        }
    };

    static double totalArea(List<Element> figures) {
        double totalArea = 0.0;
        for (Element figure : figures) {
            totalArea += figure.accept(areaVisitor);
        }
        return totalArea;
    }

    static double totalPerimeter(List<Element> figures) {
        double totalPerimeter = 0.0;
        for (Element figure : figures) {
            totalPerimeter += figure.accept(perimeterVisitor);
        }
        return totalPerimeter;
    }
}
