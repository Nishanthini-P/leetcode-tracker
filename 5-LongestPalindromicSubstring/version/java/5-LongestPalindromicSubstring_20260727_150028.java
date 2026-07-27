// Last updated: 7/27/2026, 3:00:28 PM
1class Solution {
2
3    public String longestPalindrome(String s) {
4
5        if (s == null || s.length() < 2)
6            return s;
7
8        int start = 0;
9        int end = 0;
10
11        for (int i = 0; i < s.length(); i++) {
12
13            int len1 = expand(s, i, i);       // Odd length
14            int len2 = expand(s, i, i + 1);   // Even length
15
16            int len = Math.max(len1, len2);
17
18            if (len > end - start) {
19                start = i - (len - 1) / 2;
20                end = i + len / 2;
21            }
22        }
23
24        return s.substring(start, end + 1);
25    }
26
27    private int expand(String s, int left, int right) {
28
29        while (left >= 0 &&
30               right < s.length() &&
31               s.charAt(left) == s.charAt(right)) {
32
33            left--;
34            right++;
35        }
36
37        return right - left - 1;
38    }
39}