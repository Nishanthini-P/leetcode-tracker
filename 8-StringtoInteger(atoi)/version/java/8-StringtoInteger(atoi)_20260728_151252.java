// Last updated: 7/28/2026, 3:12:52 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        int left = 0;
4        int right = s.length() - 1;
5
6        while (left < right) {
7            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
8                left++;
9            }
10
11            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
12                right--;
13            }
14
15            if (Character.toLowerCase(s.charAt(left)) !=
16                Character.toLowerCase(s.charAt(right))) {
17                return false;
18            }
19
20            left++;
21            right--;
22        }
23
24        return true;
25    }
26}