class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        freq = defaultdict(int)
        for num in nums:
            if num in freq or len(freq) < 3:
                freq[num] += 1
            else:
                toRemove = []
                for i in freq:
                    freq[i] -= 1
                    if freq[i] == 0:
                        toRemove.append(i)
                for i in toRemove:
                    freq[num] = 1
                    freq.pop(i)
        result = []
        for i in freq:
            count = 0
            for num in nums:
                if num == i:
                    count += 1
            if count > len(nums) / 3:
                result.append(i)
        return result