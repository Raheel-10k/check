import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class uniqueNumberOfOccurence {
    boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        Set<Integer> countSet = new HashSet<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int count : countMap.values()) {
            if (countSet.contains(count)) {
                return false;
            }
            countSet.add(count);
        }
        return true;
    }
}