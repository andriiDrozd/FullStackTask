package task3;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

import static java.util.Map.Entry;

public class Top5HashTag {

    public String find(List<String> list) {

        Map<String, Integer> map = new HashMap<>();

        for (String a : list) {

            Set<String> set = new TreeSet<>();

            String[] array = a.split(" ");
            for (String x : array) {
                if (x.startsWith("#")) {
                    set.add(x);
                }
            }
            for (String z : set) {
                if (map.containsKey(z)) {
                    map.put(z, map.get(z) + 1);
                } else {
                    map.put(z, 1);
                }
            }
        }

        List<Entry<String, Integer>> result = map.entrySet().stream()
                .sorted(Entry.<String, Integer>comparingByValue().reversed())
                .limit(5).toList();

        return result.toString();
    }
}
