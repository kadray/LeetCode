/**
 * @param {number[]} nums
 * @return {number}
 */
var maxProduct = function(nums) {
    let num1, num2;
    num1=Math.max.apply(null, nums);
    nums.splice(nums.indexOf(num1), 1);
    num2=Math.max.apply(null, nums);
    return (num1-1)*(num2-1);
};