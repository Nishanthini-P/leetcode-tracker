// Last updated: 7/15/2026, 9:34:41 AM
1import java.util.Arrays;
2class Solution {
3    public int threeSumClosest(int[] nums, int target) {
4        Arrays.sort(nums);
5        int closest = nums[0] + nums[1] + nums[2];
6        for (int i = 0; i < nums.length - 2; i++) {
7            int left = i + 1;
8            int right = nums.length - 1;
9            while (left < right) {
10                int sum = nums[i] + nums[left] + nums[right];
11                if (Math.abs(target - sum) < Math.abs(target - closest)) {
12                    closest = sum;
13                }
14                if (sum < target) {
15                    left++;
16                } else if (sum > target) {
17                    right--;
18                } else {
19                    // Exact match
20                    return sum;
21                }
22            }
23        }
24        return closest;
25    }
26}