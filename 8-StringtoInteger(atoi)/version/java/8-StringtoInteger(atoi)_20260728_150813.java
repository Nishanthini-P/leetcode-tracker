// Last updated: 7/28/2026, 3:08:13 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> getRow(int rowIndex) {
5        List<Integer> row = new ArrayList<>();
6
7        row.add(1);
8
9        for (int i = 1; i <= rowIndex; i++) {
10            for (int j = row.size() - 1; j >= 1; j--) {
11                row.set(j, row.get(j) + row.get(j - 1));
12            }
13            row.add(1);
14        }
15
16        return row;
17    }
18}