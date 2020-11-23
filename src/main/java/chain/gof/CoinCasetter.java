package chain.gof;

import chain.Coin;

abstract class CoinCasetter {

    private final CoinCasetter next;
    private final Coin valueHandled;
    private int content;

    protected CoinCasetter(CoinCasetter next, Coin valueHandled) {
        this.next = next;
        this.valueHandled = valueHandled;
    }

    boolean canHandle(Coin coin) {
        return valueHandled == coin;
    }

    void insert(Coin coin) {
        if (canHandle(coin)) {
            content++;
        } else {
            next.insert(coin);
        }
    }

    int sum() {
        return valueHandled.value(content) + next.sum();
    }
}
