package chain.gof;

import chain.Coin;

class _2CoinCasetter extends CoinCasetter {
    protected _2CoinCasetter(CoinCasetter next) {
        super(next, Coin._2);
    }
}
