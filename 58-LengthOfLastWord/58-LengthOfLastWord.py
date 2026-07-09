# Last updated: 7/9/2026, 10:06:53 AM
class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        return len(s.strip().split()[-1])
