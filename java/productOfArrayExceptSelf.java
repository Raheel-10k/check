import java.util.Arrays;

public class productOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        int prefixProduct=1;
        int suffixProduct=1;

        for(int i=0;i<nums.length;i++) {
            result[i]=prefixProduct;
            prefixProduct*=nums[i];
        }

        for(int i=nums.length-1;i>=0;i--) {
            result[i]*=suffixProduct;
            suffixProduct*=nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {-1, 1, 0, -3, 3};

        System.out.println(Arrays.toString(productExceptSelf(nums1)));
        System.out.println(Arrays.toString(productExceptSelf(nums2)));
    }

}
