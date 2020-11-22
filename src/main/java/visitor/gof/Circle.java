package visitor.gof;

class Circle implements Element {
    final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}