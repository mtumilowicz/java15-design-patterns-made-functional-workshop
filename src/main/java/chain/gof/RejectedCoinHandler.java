package chain.gof;

public class RejectedCoinHandler extends CoinCasetter {
    protected RejectedCoinHandler() {
        super(null, null);
    }

    @Override
    void insert(Coin coin) {
        log("Coin rejected: " + coin);
    }

    @Override
    int sum() {
        return 0;
    }

    private void log(String s) {
        System.out.println(s);
    }
}
