package visitor.lambda;

class Rectangle implements Element {
    final double width;
    final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
}