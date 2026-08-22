// Last updated: 8/22/2026, 10:08:39 AM
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3
4        int rows = matrix.length;
5        int cols = matrix[0].length;
6
7        int[] heights = new int[cols];
8
9        int maxArea = 0;
10
11        for (int i = 0; i < rows; i++) {
12
13            // Build histogram
14            for (int j = 0; j < cols; j++) {
15
16                if (matrix[i][j] == '1') {
17                    heights[j]++;
18                } else {
19                    heights[j] = 0;
20                }
21            }
22
23            // Find largest rectangle
24            // in this histogram
25            maxArea = Math.max(maxArea,
26                               largestRectangle(heights));
27        }
28
29        return maxArea;
30    }
31
32    private int largestRectangle(int[] heights) {
33
34        Stack<Integer> stack = new Stack<>();
35
36        int maxArea = 0;
37
38        for (int i = 0; i <= heights.length; i++) {
39
40            int current = (i == heights.length)
41                    ? 0
42                    : heights[i];
43
44            while (!stack.isEmpty() &&
45                   heights[stack.peek()] > current) {
46
47                int h = heights[stack.pop()];
48
49                int width;
50
51                if (stack.isEmpty()) {
52                    width = i;
53                } else {
54                    width = i - stack.peek() - 1;
55                }
56
57                maxArea = Math.max(maxArea, h * width);
58            }
59
60            if (i < heights.length) {
61                stack.push(i);
62            }
63        }
64
65        return maxArea;
66    }
67}