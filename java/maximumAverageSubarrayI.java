public class maximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        // Calculate the sum of the first k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        maximumAverageSubarrayI solution = new maximumAverageSubarrayI();

        int[] nums1 = {1, 12, -5, -6, 50, 3};
        int k1 = 4;
        System.out.println("Example 1: " + solution.findMaxAverage(nums1, k1)); // Output: 12.75

        int[] nums2 = {5};
        int k2 = 1;
        System.out.println("Example 2: " + solution.findMaxAverage(nums2, k2)); // Output: 5.0
    }
}
