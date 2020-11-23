package chain.gof;

import chain.Coin;

class _5CoinCasetter extends CoinCasetter {
    protected _5CoinCasetter(CoinCasetter next) {
        super(next, Coin._5);
    }
}
