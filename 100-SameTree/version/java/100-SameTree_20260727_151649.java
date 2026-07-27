// Last updated: 7/27/2026, 3:16:49 PM
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3
4        List<List<Integer>> result = new ArrayList<>();
5
6        for (int i = 0; i < numRows; i++) {
7
8            List<Integer> row = new ArrayList<>();
9
10            for (int j = 0; j <= i; j++) {
11
12                // First or last element
13                if (j == 0 || j == i) {
14                    row.add(1);
15                } else {
16                    row.add(result.get(i - 1).get(j - 1)
17                          + result.get(i - 1).get(j));
18                }
19            }
20
21            result.add(row);
22        }
23
24        return result;
25    }
26}