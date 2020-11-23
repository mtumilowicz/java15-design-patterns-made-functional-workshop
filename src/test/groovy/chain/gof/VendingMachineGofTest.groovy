package chain.gof

import chain.Coin
import spock.lang.Specification

class VendingMachineGofTest extends Specification {

    def "CountAssets"() {
        given:
        def c0 = new RejectedCoinHandler()
        def c1 = new _1CoinCasetter(c0)
        def c2 = new _2CoinCasetter(c1)
        def c5 = new _5CoinCasetter(c2)
        def machine = new VendingMachineGof(c5)

        when:
        machine.insert(Coin._1)
                .insert(Coin._1)
                .insert(Coin._1)
                .insert(Coin._2)
                .insert(Coin._5)
                .insert(Coin.ILLEGAL_COIN)
                .insert(Coin._5)

        then:
        machine.countAssets() == 15
    }
}
