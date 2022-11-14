package task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedArray {

    public List<Integer> sort(int[] array) {
        List<Integer> list = new ArrayList<>();
        if (array.length == 0) {
            throw new IllegalArgumentException("The length of array cannot be 0");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 0) {
                    list.add(array[i]);
                }
            }


            return list.stream()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());
        }
    }
}
