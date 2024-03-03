import java.util.Arrays;

public class moveZeros {
    public static void moveZerosToEnd(int[] nums) {
        int nonZeroIndex=0;

        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0){
                nums[nonZeroIndex]=nums[i]+nums[nonZeroIndex];
                nums[i]=nums[nonZeroIndex]-nums[i];
                nums[nonZeroIndex]=nums[nonZeroIndex]-nums[i];
                nonZeroIndex++;
            }//Leetcode gives some sort of error when using this, thus use temp for swapping.
        }
    }

    public static void main(String[] args) {
        int[] nums1={0, 1, 0, 3, 12};
        int[] nums2={0};
        int[] nums3={1, 0, 2, 0, 3};

        moveZerosToEnd(nums1);
        moveZerosToEnd(nums2);
        moveZerosToEnd(nums3);

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
    }
}