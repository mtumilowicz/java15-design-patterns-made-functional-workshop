package visitor.lambda;

import java.util.List;
import java.util.function.Function;

class ShapeVisitor {

    private static final Function<Object, Double> areaVisitor = new LambdaVisitor<Double>()
            .addHandler(Square.class, (Square s) -> s.side * s.side)
            .addHandler(Circle.class, c -> Math.PI * c.radius * c.radius)
            .addHandler(Rectangle.class, r -> r.height * r.width);

    private static final Function<Object, Double> perimeterVisitor = new LambdaVisitor<Double>()
            .addHandler(Square.class, s -> 4 * s.side)
            .addHandler(Circle.class, c -> 2 * Math.PI * c.radius)
            .addHandler(Rectangle.class, r -> 2 * r.height + 2 * r.width);

    static double totalArea(List<Object> figures) {
        return figures.stream()
                .map(areaVisitor)
                .reduce(0.0, Double::sum);
    }

    static double totalPerimeter(List<Object> figures) {
        return figures.stream()
                .map(perimeterVisitor)
                .reduce(0.0, Double::sum);
    }

}
