// Last updated: 9/29/2026, 4:08:51 PM
1class Solution {
2    public List<String> letterCombinations(String digits) {
3
4        List<String> result = new ArrayList<>();
5
6        if (digits.length() == 0) {
7            return result;
8        }
9
10        String[] map = {
11            "", "", "abc", "def", "ghi",
12            "jkl", "mno", "pqrs", "tuv", "wxyz"
13        };
14
15        backtrack(digits, 0, "", result, map);
16
17        return result;
18    }
19
20    public void backtrack(String digits, int index,
21                           String current, List<String> result,
22                           String[] map) {
23
24        if (index == digits.length()) {
25            result.add(current);
26            return;
27        }
28
29        String letters = map[digits.charAt(index) - '0'];
30
31        for (char ch : letters.toCharArray()) {
32
33            backtrack(
34                digits,
35                index + 1,
36                current + ch,
37                result,
38                map
39            );
40        }
41    }
42}