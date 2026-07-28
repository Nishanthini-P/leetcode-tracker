// Last updated: 7/28/2026, 4:05:52 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int index = 0;
4
5        // Move non-zero elements forward
6        for (int num : nums) {
7            if (num != 0) {
8                nums[index++] = num;
9            }
10        }
11
12        // Fill remaining positions with zeros
13        while (index < nums.length) {
14            nums[index++] = 0;
15        }
16    }
17}