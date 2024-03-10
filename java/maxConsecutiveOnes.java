public class maxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int current = 0;

        for (int x : nums) {
            current = (x == 1) ? current + 1 : 0;
            maxCount = Math.max(maxCount, current);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        maxConsecutiveOnes solution = new maxConsecutiveOnes();
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        System.out.println("Example 1: " + solution.findMaxConsecutiveOnes(nums1));
        int[] nums2 = {1, 0, 1, 1, 0, 1};
        System.out.println("Example 2: " + solution.findMaxConsecutiveOnes(nums2));
    }
}
