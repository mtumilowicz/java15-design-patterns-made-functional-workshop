package visitor.gof;

interface Visitor<T> {
        T visit(Square element);
        T visit(Circle element);
        T visit(Rectangle element);
    }