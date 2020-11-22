package visitor.gof;

interface Element {
    <T> T accept(Visitor<T> visitor);
}