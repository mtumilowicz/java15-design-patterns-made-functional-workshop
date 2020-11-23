package chain.lambda;

import chain.Coin;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

public class VendingMachineLambda {

    private final CoinCasetter casetter;
    private final List<BiFunction<Coin, CoinCasetter, Optional<CoinCasetter>>> handlers;

    public VendingMachineLambda(CoinCasetter casetter, List<BiFunction<Coin, CoinCasetter, Optional<CoinCasetter>>> handlers) {
        this.casetter = casetter;
        this.handlers = handlers;
    }

    VendingMachineLambda insert(Coin coin) {
        var casetter = handlers.stream()
                .flatMap(x -> x.apply(coin, this.casetter).stream())
                .findAny()
                .orElseThrow(() -> new RuntimeException("Unknown coin: " + coin));
        return new VendingMachineLambda(casetter, this.handlers);
    }

    int countAssets() {
        return casetter.sum;
    }
}
