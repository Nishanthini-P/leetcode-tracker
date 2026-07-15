// Last updated: 7/15/2026, 9:38:48 AM
1import java.util.*;
2
3class Solution {
4
5    public List<List<Integer>> fourSum(int[] nums, int target) {
6
7        List<List<Integer>> result = new ArrayList<>();
8
9        Arrays.sort(nums);
10
11        int n = nums.length;
12
13        for (int i = 0; i < n - 3; i++) {
14
15            if (i > 0 && nums[i] == nums[i - 1])
16                continue;
17
18            for (int j = i + 1; j < n - 2; j++) {
19
20                if (j > i + 1 && nums[j] == nums[j - 1])
21                    continue;
22
23                int left = j + 1;
24                int right = n - 1;
25
26                while (left < right) {
27
28                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
29
30                    if (sum == target) {
31
32                        result.add(Arrays.asList(
33                                nums[i],
34                                nums[j],
35                                nums[left],
36                                nums[right]
37                        ));
38
39                        left++;
40                        right--;
41
42                        while (left < right && nums[left] == nums[left - 1])
43                            left++;
44
45                        while (left < right && nums[right] == nums[right + 1])
46                            right--;
47
48                    } else if (sum < target) {
49                        left++;
50                    } else {
51                        right--;
52                    }
53                }
54            }
55        }
56
57        return result;
58    }
59}