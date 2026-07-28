// Last updated: 7/28/2026, 3:42:45 PM
1import java.util.*;
2
3class Solution {
4    public List<String> generateParenthesis(int n) {
5        List<String> result = new ArrayList<>();
6        backtrack(result, "", 0, 0, n);
7        return result;
8    }
9
10    private void backtrack(List<String> result, String current, int open, int close, int n) {
11        if (current.length() == n * 2) {
12            result.add(current);
13            return;
14        }
15
16        if (open < n) {
17            backtrack(result, current + "(", open + 1, close, n);
18        }
19
20        if (close < open) {
21            backtrack(result, current + ")", open, close + 1, n);
22        }
23    }
24}