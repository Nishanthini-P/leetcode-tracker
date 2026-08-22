// Last updated: 8/22/2026, 9:49:51 AM
1class Solution {
2    public boolean isMatch(String s, String p) {
3
4        int i = 0;
5        int j = 0;
6
7        int star = -1;
8        int match = 0;
9
10        while (i < s.length()) {
11
12            // Normal character or ?
13            if (j < p.length() &&
14                (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
15
16                i++;
17                j++;
18            }
19
20            // Found *
21            else if (j < p.length() && p.charAt(j) == '*') {
22
23                star = j;
24                match = i;
25                j++;
26            }
27
28            // Mismatch, but we have seen *
29            else if (star != -1) {
30
31                j = star + 1;
32                match++;
33                i = match;
34            }
35
36            // No match possible
37            else {
38                return false;
39            }
40        }
41
42        // Ignore remaining *
43        while (j < p.length() && p.charAt(j) == '*') {
44            j++;
45        }
46
47        return j == p.length();
48    }
49}