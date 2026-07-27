// Last updated: 7/27/2026, 2:58:09 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length - 1;
5
6        while (left <= right) {
7
8            int mid = left + (right - left) / 2;
9
10            if (nums[mid] == target)
11                return mid;
12
13            // Left half is sorted
14            if (nums[left] <= nums[mid]) {
15
16                if (target >= nums[left] && target < nums[mid]) {
17                    right = mid - 1;
18                } else {
19                    left = mid + 1;
20                }
21
22            }
23            // Right half is sorted
24            else {
25
26                if (target > nums[mid] && target <= nums[right]) {
27                    left = mid + 1;
28                } else {
29                    right = mid - 1;
30                }
31
32            }
33        }
34
35        return -1;
36    }
37}