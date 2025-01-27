package lab11.prob5;

import java.util.List;

public class SecondSmallest {


    public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
        if (list == null || list.size() < 2) {
            throw new IllegalArgumentException("List must have at least two elements.");
        }

        T smallest = null;
        T secondSmallest = null;

        for (T element : list) {
            if (smallest == null || element.compareTo(smallest) < 0) {
                secondSmallest = smallest;
                smallest = element;
            } else if (secondSmallest == null || element.compareTo(secondSmallest) < 0) {
                if (!element.equals(smallest)) {
                    secondSmallest = element;
                }
            }
        }

        if (secondSmallest == null) {
            throw new IllegalArgumentException("List must contain at least two distinct elements.");
        }
        return secondSmallest;
    }
}
