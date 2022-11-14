package task2;

import java.util.List;

public class SortedFigure {
    public List<AbilityToCalculateVolume> sorting(List<AbilityToCalculateVolume> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        } else {
            return list.stream().sorted(
                            (o1, o2) -> {
                                if (o1.getVolume() == o2.getVolume()) {
                                    return 0;
                                } else if (o1.getVolume() < o2.getVolume()) {
                                    return -1;
                                } else {
                                    return 1;
                                }
                            }
                    )
                    .toList();
        }
    }
}
