package strategy.gof;

import strategy.Index;
import strategy.SearchStrategy;

import java.util.Arrays;

class BinarySearchStrategyImpl implements SearchStrategy {
    @Override
    public Index search(String[] in, String element) {
        return new Index(Arrays.binarySearch(in, element));
    }
}
