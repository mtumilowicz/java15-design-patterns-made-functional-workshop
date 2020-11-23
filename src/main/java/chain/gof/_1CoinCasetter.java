package chain.gof;

public class _1CoinCasetter extends CoinCasetter {
    protected _1CoinCasetter(CoinCasetter next) {
        super(next, Coin._1);
    }
}
