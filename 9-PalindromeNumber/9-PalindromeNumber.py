# Last updated: 7/9/2026, 10:07:21 AM
class Solution:
    def isPalindrome(self, x: int) -> bool:
        # Negative numbers are not palindromes
        if x < 0:
            return False
        
        # Convert number to string and check palindrome
        return str(x) == str(x)[::-1]

        