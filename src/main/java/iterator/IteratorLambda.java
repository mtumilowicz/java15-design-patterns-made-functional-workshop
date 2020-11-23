package iterator;

import java.util.List;

public class IteratorLambda {

    static final List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);

    static int sum() {
        return list.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
