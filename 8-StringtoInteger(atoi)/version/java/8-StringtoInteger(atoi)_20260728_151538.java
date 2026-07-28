// Last updated: 7/28/2026, 3:15:38 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int ones = 0, twos = 0;
4
5        for (int num : nums) {
6            ones = (ones ^ num) & ~twos;
7            twos = (twos ^ num) & ~ones;
8        }
9
10        return ones;
11    }
12}