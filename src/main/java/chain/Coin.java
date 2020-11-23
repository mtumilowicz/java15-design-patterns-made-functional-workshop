package chain;

public enum Coin {
    _1, _2, _5, ILLEGAL_COIN;

    public int value(int quantity) {
        return switch (this) {
            case _1 -> quantity;
            case _2 -> 2 * quantity;
            case _5 -> 5 * quantity;
            case ILLEGAL_COIN -> 0;
        };
    }
}
