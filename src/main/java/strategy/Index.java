package strategy;

public class Index {
    public final int raw;

    public Index(int raw) {
        this.raw = raw;
    }

    public boolean isPositive() {
        return raw >= 0;
    }
}
