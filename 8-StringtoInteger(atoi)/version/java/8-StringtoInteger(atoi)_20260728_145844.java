// Last updated: 7/28/2026, 2:58:44 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> permute(int[] nums) {
5        List<List<Integer>> result = new ArrayList<>();
6        backtrack(nums, new ArrayList<>(), result);
7        return result;
8    }
9
10    private void backtrack(int[] nums, List<Integer> temp, List<List<Integer>> result) {
11        if (temp.size() == nums.length) {
12            result.add(new ArrayList<>(temp));
13            return;
14        }
15
16        for (int num : nums) {
17            if (temp.contains(num)) {
18                continue;
19            }
20
21            temp.add(num);
22            backtrack(nums, temp, result);
23            temp.remove(temp.size() - 1);
24        }
25    }
26}