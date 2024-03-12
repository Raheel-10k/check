import java.util.HashMap;
import java.util.Map;

public class maxNumberOfKPairs {
    public int maxop(int[] nums, int k) {
        Map<Integer, Integer> count=new HashMap<>();
        int op=0;
        for(int num : nums) {
            int temps=k-num;

            if(count.containsKey(temps) && count.get(temps)>0) {
                op++;
                count.put(temps, (count.get(temps)-1));
            } else {
                count.put(num, (count.getOrDefault(num, 0) + 1));
            }
        }

        return op;
    }

    public static void main(String[] args) {
        maxNumberOfKPairs  s=new maxNumberOfKPairs();
        int[] nums1 = {1, 2, 3, 4};
        int k1 = 5;
        System.out.println("Example 1: " + s.maxop(nums1, k1));
        int[] nums2 = {3, 1, 3, 4, 3};
        int k2 = 6;
        System.out.println("Example 2: " + s.maxop(nums2, k2));
    }//leetcode Examples
}
