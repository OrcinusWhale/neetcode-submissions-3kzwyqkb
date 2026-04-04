class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums = set(nums)
        longest = 0
        for num in nums:
            if num - 1 in nums:
                continue
            count = 1
            i = num + 1
            while i in nums:
                count += 1
                i += 1
            if count > longest:
                longest = count
        return longest