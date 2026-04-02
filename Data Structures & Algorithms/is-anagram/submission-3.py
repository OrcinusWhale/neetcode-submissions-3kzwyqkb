class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        letters = [0]*26
        for char in s:
            letters[ord(char)-ord('a')] += 1
        for char in t:
            letters[ord(char)-ord('a')] -= 1
        for count in letters:
            if count != 0:
                return False
        return True