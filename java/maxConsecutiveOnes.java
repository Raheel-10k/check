class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==1){
                if(nums[i]==nums[i+1]) {
                    count++;
                }
                else {
                    count=0;
                }
            }
        }
        return count;
    }
}