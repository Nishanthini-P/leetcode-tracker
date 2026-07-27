// Last updated: 7/27/2026, 3:01:09 PM
1class Solution {
2    public int climbStairs(int n) {
3
4        if (n <= 2)
5            return n;
6
7        int first = 1;
8        int second = 2;
9
10        for (int i = 3; i <= n; i++) {
11            int current = first + second;
12            first = second;
13            second = current;
14        }
15
16        return second;
17    }
18}