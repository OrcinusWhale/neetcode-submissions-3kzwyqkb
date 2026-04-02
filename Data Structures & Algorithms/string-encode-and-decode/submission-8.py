class Solution:

    def encode(self, strs: List[str]) -> str:
        encoded = ""
        for s in strs:
            encoded += f"{len(s)}#{s}"
        return encoded

    def decode(self, s: str) -> List[str]:
        decoded = []
        i = 0
        while i < len(s):
            strLen = 0
            while s[i] != '#':
                strLen *= 10
                strLen += int(s[i])
                i += 1
            decoded.append(s[i+1:i+1+strLen]) 
            i += strLen+1
        return decoded