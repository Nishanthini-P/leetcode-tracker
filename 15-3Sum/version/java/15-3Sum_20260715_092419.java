// Last updated: 7/15/2026, 9:24:19 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> threeSum(int[] nums) {
5
6        List<List<Integer>> result = new ArrayList<>();
7
8        Arrays.sort(nums);
9
10        for (int i = 0; i < nums.length - 2; i++) {
11
12            // Skip duplicate first elements
13            if (i > 0 && nums[i] == nums[i - 1])
14                continue;
15
16            int left = i + 1;
17            int right = nums.length - 1;
18
19            while (left < right) {
20
21                int sum = nums[i] + nums[left] + nums[right];
22
23                if (sum == 0) {
24
25                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
26
27                    left++;
28                    right--;
29
30                    // Skip duplicate left values
31                    while (left < right && nums[left] == nums[left - 1])
32                        left++;
33
34                    // Skip duplicate right values
35                    while (left < right && nums[right] == nums[right + 1])
36                        right--;
37
38                } else if (sum < 0) {
39                    left++;
40                } else {
41                    right--;
42                }
43            }
44        }
45
46        return result;
47    }
48}