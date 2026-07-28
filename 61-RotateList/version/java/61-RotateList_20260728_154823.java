// Last updated: 7/28/2026, 3:48:23 PM
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int i = nums.length - 2;
4
5        // Find first decreasing element from the end
6        while (i >= 0 && nums[i] >= nums[i + 1]) {
7            i--;
8        }
9
10        // Find element just greater than nums[i]
11        if (i >= 0) {
12            int j = nums.length - 1;
13            while (nums[j] <= nums[i]) {
14                j--;
15            }
16            swap(nums, i, j);
17        }
18
19        // Reverse the remaining part
20        reverse(nums, i + 1, nums.length - 1);
21    }
22
23    private void swap(int[] nums, int i, int j) {
24        int temp = nums[i];
25        nums[i] = nums[j];
26        nums[j] = temp;
27    }
28
29    private void reverse(int[] nums, int left, int right) {
30        while (left < right) {
31            swap(nums, left, right);
32            left++;
33            right--;
34        }
35    }
36}