class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int w=nums[nums.length-1];
        int x=nums[nums.length-2];
        int y=nums[0];
        int z=nums[1];
     return (x*w)-(y*z);   
    }
}