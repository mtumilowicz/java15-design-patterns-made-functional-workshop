package visitor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class VisitorLambda {

    public static class LambdaVisitor<A> implements Function<Object, A> {
        private final Map<Class<?>, Function<Object, A>> fMap = new HashMap<>();

        @SuppressWarnings(value = "unchecked")
        public <B> LambdaVisitor<A> addHandler(Class<B> clazz, Function<B, A> handler) {
            fMap.put(clazz, (Function<Object, A>) handler);
            return this;
        }

        @Override
        public A apply( Object o ) {
            return fMap.get(o.getClass()).apply( o );
        }

    }

    public static class Square {
        final double side;

        public Square(double side) {
            this.side = side;
        }
    }

    public static class Circle {
        final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }
    }

    public static class Rectangle {
        final double width;
        final double height;

        public Rectangle(double width, double height ) {
            this.width = width;
            this.height = height;
        }
    }

    static Function<Object, Double> areaVisitor = new LambdaVisitor<Double>()
            .addHandler(Square.class, (Square s) -> s.side * s.side )
            .addHandler(Circle.class, c -> Math.PI * c.radius * c.radius )
            .addHandler(Rectangle.class, r -> r.height * r.width);

    static Function<Object, Double> perimeterVisitor = new LambdaVisitor<Double>()
            .addHandler(Square.class, s -> 4 * s.side )
            .addHandler(Circle.class, c -> 2 * Math.PI * c.radius )
            .addHandler(Rectangle.class, r -> 2 * r.height + 2 * r.width);

    public static void main( String[] args ) {
        List<Object> figures = Arrays.asList( new Circle( 4 ), new Square( 5 ), new Rectangle( 6, 7 ) );

        double totalArea = figures.stream().map( areaVisitor ).reduce( 0.0, Double::sum);
        System.out.println("Total area = " + totalArea);

        double totalPerimeter = figures.stream().map( perimeterVisitor ).reduce( 0.0, Double::sum);
        System.out.println("Total perimeter = " + totalPerimeter);
    }
}