import java.util.*;

public class SortCharactersByFrequency {

    public static String frequencySort(String s) {
        HashMap<Character, Integer> freqence=new HashMap<>();
        PriorityQueue<Map.Entry<Character, Integer>> pq=new PriorityQueue<>(s.length(), Comparator.<Map.Entry<Character, Integer>>comparingInt(Map.Entry::getValue).reversed().thenComparing(Map.Entry::getKey));

        for(char c : s.toCharArray()) {
            freqence.put(c, freqence.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqence.entrySet()) {
            pq.add(entry);  //adds the parameter 'entry' to the pq. pq=priority queue
        }

        StringBuilder strbuild=new StringBuilder();

        while(!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry=pq.poll(); //poll is used to retrieve or fetch and remove the first element of the pq 
            for (int i = 0; i < entry.getValue(); i++) {
                strbuild.append(entry.getKey());
            }
        }

        return strbuild.toString(); //convert stringbuilder to raw string.
    }

    public static void main(String[] args) {
        // Example usage:
        String s1 = "tree";
        String s2 = "cccaaa";
        String s3 = "Aabb";

        System.out.println(frequencySort(s1));
        System.out.println(frequencySort(s2));
        System.out.println(frequencySort(s3));
    }
}
