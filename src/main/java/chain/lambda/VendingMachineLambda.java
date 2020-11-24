package chain.lambda;

import chain.Coin;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;

class VendingMachineLambda {

    private final CoinCasetter casetter;
    private final List<BiFunction<Coin, CoinCasetter, Optional<CoinCasetter>>> handlers;

    public VendingMachineLambda(CoinCasetter casetter, List<BiFunction<Coin, CoinCasetter, Optional<CoinCasetter>>> handlers) {
        this.casetter = casetter;
        this.handlers = handlers;
    }

    VendingMachineLambda withNewCasetter(CoinCasetter casetter) {
        return new VendingMachineLambda(casetter, this.handlers);
    }

    VendingMachineLambda insert(Coin coin) {
        return handlers.stream()
                .map(handler -> handler.apply(coin, this.casetter))
                .flatMap(Optional::stream)
                .findAny()
                .map(this::withNewCasetter)
                .orElseThrow(() -> new RuntimeException("Unknown coin: " + coin));
    }

    int countAssets() {
        return casetter.sum;
    }
}
