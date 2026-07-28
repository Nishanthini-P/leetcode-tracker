// Last updated: 7/28/2026, 3:55:23 PM
1class Solution {
2    public int rob(int[] nums) {
3        int prev1 = 0;
4        int prev2 = 0;
5
6        for (int num : nums) {
7            int temp = Math.max(prev1, prev2 + num);
8            prev2 = prev1;
9            prev1 = temp;
10        }
11
12        return prev1;
13    }
14}