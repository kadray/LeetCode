/**
 * @param {number[]} nums
 * @return {number[]}
 */
var rearrangeArray = function(nums) {
    const pos=[];
    const neg=[];
    const result=[];
    for(let i in nums){
        if(nums[i]>=0) pos.push(nums[i]);
        else neg.push(nums[i]);
    }
    for(let i in pos){
        result.push(pos[i]);
        result.push(neg[i]);
    }
    return result;
};