package chain.lambda;

import chain.Coin;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;

class VendingMachineLambdaWorkshop {

    private final CoinCasetter casetter;
    private final List<BiFunction<Coin, CoinCasetter, Optional<CoinCasetter>>> handlers;

    public VendingMachineLambdaWorkshop(CoinCasetter casetter, List<BiFunction<Coin, CoinCasetter, Optional<CoinCasetter>>> handlers) {
        this.casetter = casetter;
        this.handlers = handlers;
    }

    VendingMachineLambdaWorkshop withNewCasetter(CoinCasetter casetter) {
        return new VendingMachineLambdaWorkshop(casetter, this.handlers);
    }

    VendingMachineLambdaWorkshop insert(Coin coin) {
        return null; // use streams, hint: findAny, withNewCasetter, orElseThrow
    }

    int countAssets() {
        return casetter.sum;
    }
}
