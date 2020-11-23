package chain.gof;

public class _2CoinCasetter extends CoinCasetter  {
    protected _2CoinCasetter(CoinCasetter next) {
        super(next, Coin._2);
    }
}
