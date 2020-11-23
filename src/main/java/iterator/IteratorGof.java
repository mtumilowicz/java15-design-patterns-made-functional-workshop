package iterator;

import java.util.Iterator;
import java.util.List;

public class IteratorGof {

    static final List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);

    static int sum() {
        int sum = 0;

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }

        return sum;
    }
}
