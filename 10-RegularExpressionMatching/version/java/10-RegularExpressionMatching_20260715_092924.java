// Last updated: 7/15/2026, 9:29:24 AM
1class Solution {
2
3    private Boolean[][] memo;
4
5    public boolean isMatch(String s, String p) {
6        memo = new Boolean[s.length() + 1][p.length() + 1];
7        return dp(0, 0, s, p);
8    }
9
10    private boolean dp(int i, int j, String s, String p) {
11
12        if (memo[i][j] != null) {
13            return memo[i][j];
14        }
15
16        if (j == p.length()) {
17            return memo[i][j] = (i == s.length());
18        }
19
20        boolean firstMatch =
21                (i < s.length()) &&
22                (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');
23
24        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
25
26            memo[i][j] =
27                    dp(i, j + 2, s, p) ||           // Skip x*
28                    (firstMatch && dp(i + 1, j, s, p)); // Use x*
29
30        } else {
31
32            memo[i][j] =
33                    firstMatch && dp(i + 1, j + 1, s, p);
34        }
35
36        return memo[i][j];
37    }
38}