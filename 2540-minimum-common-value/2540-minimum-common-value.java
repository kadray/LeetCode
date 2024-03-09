class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        if(nums1[0]>nums2[nums2.length-1] || nums2[0]>nums1[nums1.length-1])
        return -1;
        for(int a : nums1){
            for(int b : nums2){
                if(a==b)
                return a;
            }
        }
        return -1;
    }
}