import java.util.*;

public class TopKFrequentElement {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap=new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq=new PriorityQueue<>(k, (a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (pq.size()<k) {
                pq.add(entry);
            } 
            else if (pq.peek().getValue()<entry.getValue()) {
                pq.poll();
                pq.add(entry);
            }
        }
        int[] result=new int[k];
        for (int i=0;i<k;i++) {
            result[i]=pq.poll().getKey();
        }
        return result;
    }
}
