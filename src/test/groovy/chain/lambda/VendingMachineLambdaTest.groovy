package chain.lambda

import chain.Coin
import chain.gof.RejectedCoinHandler
import chain.gof.VendingMachineGof
import chain.gof._1CoinCasetter
import chain.gof._2CoinCasetter
import chain.gof._5CoinCasetter
import spock.lang.Specification

import java.util.function.BiFunction

class VendingMachineLambdaTest extends Specification {

    def "CountAssets"() {
        given:
        BiFunction<Coin, CoinCasetter, CoinCasetter> c1 = { Coin coin, CoinCasetter casetter ->
            Optional.ofNullable(coin)
                    .filter { c -> c == Coin._1 }
                    .map { c -> casetter.increment(Coin._1.value(1)) }
        }
        BiFunction<Coin, CoinCasetter, CoinCasetter> c2 = { Coin coin, CoinCasetter casetter ->
            Optional.ofNullable(coin)
                    .filter { c -> c == Coin._2 }
                    .map { c -> casetter.increment(Coin._2.value(1)) }
        }
        BiFunction<Coin, CoinCasetter, CoinCasetter> c5 = { Coin coin, CoinCasetter casetter ->
            Optional.ofNullable(coin)
                    .filter { c -> c == Coin._5 }
                    .map { c -> casetter.increment(Coin._5.value(1)) }
        }
        def machine = new VendingMachineLambda(new CoinCasetter(0), [c1, c2, c5])

        when:
        machine = machine.insert(Coin._1)
                .insert(Coin._1)
                .insert(Coin._1)
                .insert(Coin._2)
                .insert(Coin._5)
                .insert(Coin._5)

        then:
        machine.countAssets() == 15
    }

}
