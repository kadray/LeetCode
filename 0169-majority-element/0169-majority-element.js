/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    nums.sort();
    return nums[Math.ceil(nums.length/2)-1];
};