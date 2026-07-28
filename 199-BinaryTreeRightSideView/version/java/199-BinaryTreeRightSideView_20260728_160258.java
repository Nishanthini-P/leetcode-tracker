// Last updated: 7/28/2026, 4:02:58 PM
1import java.util.*;
2
3class Solution {
4    public boolean containsNearbyDuplicate(int[] nums, int k) {
5        Map<Integer, Integer> map = new HashMap<>();
6
7        for (int i = 0; i < nums.length; i++) {
8            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
9                return true;
10            }
11            map.put(nums[i], i);
12        }
13
14        return false;
15    }
16}