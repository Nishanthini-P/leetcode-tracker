// Last updated: 8/22/2026, 9:42:01 AM
1class Solution {
2    public List<Integer> findSubstring(String s, String[] words) {
3
4        List<Integer> ans = new ArrayList<>();
5
6        int len = words[0].length();
7        int total = words.length;
8
9        HashMap<String, Integer> map = new HashMap<>();
10
11        // Count words
12        for (String word : words) {
13            map.put(word, map.getOrDefault(word, 0) + 1);
14        }
15
16        // Try each starting position
17        for (int i = 0; i < len; i++) {
18
19            int left = i;
20            int count = 0;
21
22            HashMap<String, Integer> seen = new HashMap<>();
23
24            for (int right = i; right + len <= s.length(); right += len) {
25
26                String word = s.substring(right, right + len);
27
28                // Word is not required
29                if (!map.containsKey(word)) {
30                    seen.clear();
31                    count = 0;
32                    left = right + len;
33                    continue;
34                }
35
36                // Add word
37                seen.put(word, seen.getOrDefault(word, 0) + 1);
38                count++;
39
40                // Too many same words
41                while (seen.get(word) > map.get(word)) {
42                    String remove = s.substring(left, left + len);
43                    seen.put(remove, seen.get(remove) - 1);
44                    left += len;
45                    count--;
46                }
47
48                // All words found
49                if (count == total) {
50                    ans.add(left);
51
52                    String remove = s.substring(left, left + len);
53                    seen.put(remove, seen.get(remove) - 1);
54                    left += len;
55                    count--;
56                }
57            }
58        }
59
60        return ans;
61    }
62}