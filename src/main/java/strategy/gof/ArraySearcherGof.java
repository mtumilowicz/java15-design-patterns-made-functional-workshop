package strategy.gof;

import strategy.SearchStrategy;

public class ArraySearcherGof {
    public static boolean contains(String[] array, String element, SearchStrategy strategy) {
        return strategy.search(array, element).isPositive();
    }
}
