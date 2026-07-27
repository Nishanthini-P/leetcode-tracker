// Last updated: 7/27/2026, 2:59:35 PM
1import java.util.*;
2
3class Solution {
4    public int[][] insert(int[][] intervals, int[] newInterval) {
5
6        List<int[]> result = new ArrayList<>();
7        int i = 0;
8        int n = intervals.length;
9
10        // Step 1: Add all intervals before newInterval
11        while (i < n && intervals[i][1] < newInterval[0]) {
12            result.add(intervals[i]);
13            i++;
14        }
15
16        // Step 2: Merge overlapping intervals
17        while (i < n && intervals[i][0] <= newInterval[1]) {
18            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
19            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
20            i++;
21        }
22
23        result.add(newInterval);
24
25        // Step 3: Add remaining intervals
26        while (i < n) {
27            result.add(intervals[i]);
28            i++;
29        }
30
31        return result.toArray(new int[result.size()][]);
32    }
33}