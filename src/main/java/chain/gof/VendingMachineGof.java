package chain.gof;

import chain.Coin;

class VendingMachineGof {

    private final CoinCasetter casetter;

    public VendingMachineGof(CoinCasetter casetter) {
        this.casetter = casetter;
    }

    VendingMachineGof insert(Coin coin) {
        casetter.insert(coin);
        return this;
    }

    int countAssets() {
        return casetter.sum();
    }
}
