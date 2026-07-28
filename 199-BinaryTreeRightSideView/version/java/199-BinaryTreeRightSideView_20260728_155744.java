// Last updated: 7/28/2026, 3:57:44 PM
1class Solution {
2    public int rangeBitwiseAnd(int left, int right) {
3        int shift = 0;
4
5        while (left < right) {
6            left >>= 1;
7            right >>= 1;
8            shift++;
9        }
10
11        return left << shift;
12    }
13}