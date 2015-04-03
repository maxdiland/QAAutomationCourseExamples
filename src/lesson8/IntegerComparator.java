package lesson8;

import java.util.Comparator;

/**
 * author Maksim Diland
 */
public class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
