package visitor.gof;

class Square implements Element {
    final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}