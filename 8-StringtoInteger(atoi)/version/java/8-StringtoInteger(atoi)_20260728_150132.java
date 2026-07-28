// Last updated: 7/28/2026, 3:01:32 PM
1import java.util.*;
2
3class Solution {
4    public List<List<String>> groupAnagrams(String[] strs) {
5        Map<String, List<String>> map = new HashMap<>();
6
7        for (String s : strs) {
8            char[] arr = s.toCharArray();
9            Arrays.sort(arr);
10            String key = new String(arr);
11
12            map.putIfAbsent(key, new ArrayList<>());
13            map.get(key).add(s);
14        }
15
16        return new ArrayList<>(map.values());
17    }
18}