class Solution(object):
    def maxFrequencyElements(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        numbers=[]
        freq=[]
        for i in range(len(nums)):
            if nums[i] not in numbers:
                numbers.append(nums[i])
                freq.append(nums.count(nums[i]))
        return max(freq)*freq.count(max(freq))




            
        