class Solution {
    public int missingNumber(int[] nums) {
        int sum_i=0;
        int sum=0;
        for(int i=0; i<nums.length;i++){
            sum_i+=nums[i];
            sum+=i+1;
        }
        return sum-sum_i;
    }
}