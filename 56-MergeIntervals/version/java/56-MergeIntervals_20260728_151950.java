// Last updated: 7/28/2026, 3:19:50 PM
1import java.util.*;
2
3class Solution {
4    public int[][] merge(int[][] intervals) {
5        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
6
7        List<int[]> result = new ArrayList<>();
8
9        int[] current = intervals[0];
10
11        for (int i = 1; i < intervals.length; i++) {
12            if (intervals[i][0] <= current[1]) {
13                current[1] = Math.max(current[1], intervals[i][1]);
14            } else {
15                result.add(current);
16                current = intervals[i];
17            }
18        }
19
20        result.add(current);
21
22        return result.toArray(new int[result.size()][]);
23    }
24}