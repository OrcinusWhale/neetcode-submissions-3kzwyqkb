class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        appeared = set()
        for n in nums:
            if n not in appeared:
                appeared.add(n)
            else:
                return True
        return False
