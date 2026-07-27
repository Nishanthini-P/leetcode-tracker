// Last updated: 7/27/2026, 3:16:01 PM
1class Solution {
2    public int numDistinct(String s, String t) {
3
4        int m = s.length();
5        int n = t.length();
6
7        int[][] dp = new int[m + 1][n + 1];
8
9        // Empty target
10        for (int i = 0; i <= m; i++) {
11            dp[i][0] = 1;
12        }
13
14        for (int i = 1; i <= m; i++) {
15
16            for (int j = 1; j <= n; j++) {
17
18                if (s.charAt(i - 1) == t.charAt(j - 1)) {
19
20                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
21
22                } else {
23
24                    dp[i][j] = dp[i - 1][j];
25                }
26            }
27        }
28
29        return dp[m][n];
30    }
31}