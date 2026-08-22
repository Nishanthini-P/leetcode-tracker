// Last updated: 8/22/2026, 10:06:07 AM
1class Solution {
2    public String minWindow(String s, String t) {
3
4        int[] need = new int[128];
5        int[] have = new int[128];
6
7        // Count characters needed
8        for (char c : t.toCharArray()) {
9            need[c]++;
10        }
11
12        int left = 0;
13        int count = 0;
14
15        int start = 0;
16        int minLen = Integer.MAX_VALUE;
17
18        for (int right = 0; right < s.length(); right++) {
19
20            char c = s.charAt(right);
21            have[c]++;
22
23            // This character is useful
24            if (have[c] <= need[c]) {
25                count++;
26            }
27
28            // Window contains all characters
29            while (count == t.length()) {
30
31                // Save smallest window
32                if (right - left + 1 < minLen) {
33                    minLen = right - left + 1;
34                    start = left;
35                }
36
37                char leftChar = s.charAt(left);
38                have[leftChar]--;
39
40                if (have[leftChar] < need[leftChar]) {
41                    count--;
42                }
43
44                left++;
45            }
46        }
47
48        if (minLen == Integer.MAX_VALUE) {
49            return "";
50        }
51
52        return s.substring(start, start + minLen);
53    }
54}