class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        seen = set()
        for num in nums:
            seen.add(num)
        checked = set()
        longest = 0
        for num in seen:
            if num in checked:
                continue
            checked.add(num)
            i = num - 1
            count = 1
            while i in seen:
                checked.add(i)
                count += 1
                i -= 1
            i = num + 1
            while i in seen:
                checked.add(i)
                count += 1
                i += 1
            if count > longest:
                longest = count
        return longest
