// Last updated: 7/28/2026, 4:00:02 PM
1import java.util.*;
2
3class Solution {
4    public boolean isIsomorphic(String s, String t) {
5        Map<Character, Character> map1 = new HashMap<>();
6        Map<Character, Character> map2 = new HashMap<>();
7
8        for (int i = 0; i < s.length(); i++) {
9            char c1 = s.charAt(i);
10            char c2 = t.charAt(i);
11
12            if (map1.containsKey(c1) && map1.get(c1) != c2) {
13                return false;
14            }
15
16            if (map2.containsKey(c2) && map2.get(c2) != c1) {
17                return false;
18            }
19
20            map1.put(c1, c2);
21            map2.put(c2, c1);
22        }
23
24        return true;
25    }
26}