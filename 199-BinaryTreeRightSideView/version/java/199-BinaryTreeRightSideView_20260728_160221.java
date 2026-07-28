// Last updated: 7/28/2026, 4:02:21 PM
1import java.util.*;
2
3class Solution {
4    public boolean containsDuplicate(int[] nums) {
5        Set<Integer> set = new HashSet<>();
6
7        for (int num : nums) {
8            if (set.contains(num)) {
9                return true;
10            }
11            set.add(num);
12        }
13
14        return false;
15    }
16}