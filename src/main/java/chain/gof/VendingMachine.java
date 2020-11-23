package chain.gof;

public class VendingMachine {

    private final CoinCasetter casetter;

    public VendingMachine(CoinCasetter casetter) {
        this.casetter = casetter;
    }

    VendingMachine insert(Coin coin) {
        casetter.insert(coin);
        return this;
    }

    int countAssets() {
        return casetter.sum();
    }
}
