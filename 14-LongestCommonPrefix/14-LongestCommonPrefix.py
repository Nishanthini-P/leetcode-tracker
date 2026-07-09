# Last updated: 7/9/2026, 10:07:16 AM
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs:
            return ""
        
        # Start with the first string as the prefix
        prefix = strs[0]
        
        for word in strs[1:]:
            while not word.startswith(prefix):
                # Shorten the prefix by one character
                prefix = prefix[:-1]
                if not prefix:
                    return ""
        
        return prefix

        