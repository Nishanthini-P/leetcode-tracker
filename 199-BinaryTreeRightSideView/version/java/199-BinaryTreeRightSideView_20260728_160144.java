// Last updated: 7/28/2026, 4:01:44 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> combinationSum3(int k, int n) {
5        List<List<Integer>> result = new ArrayList<>();
6        backtrack(result, new ArrayList<>(), k, n, 1);
7        return result;
8    }
9
10    private void backtrack(List<List<Integer>> result, List<Integer> temp,
11                           int k, int remain, int start) {
12
13        if (temp.size() == k && remain == 0) {
14            result.add(new ArrayList<>(temp));
15            return;
16        }
17
18        if (temp.size() > k || remain < 0) {
19            return;
20        }
21
22        for (int i = start; i <= 9; i++) {
23            temp.add(i);
24            backtrack(result, temp, k, remain - i, i + 1);
25            temp.remove(temp.size() - 1);
26        }
27    }
28}