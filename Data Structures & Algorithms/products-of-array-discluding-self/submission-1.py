class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [0]*len(nums)
        accumulator = 1
        for i in range(len(nums)):
            result[i] = accumulator
            accumulator *= nums[i]
        accumulator = 1
        for i in range(len(nums)-1, -1, -1):
            result[i] *= accumulator
            accumulator *= nums[i]
        return result