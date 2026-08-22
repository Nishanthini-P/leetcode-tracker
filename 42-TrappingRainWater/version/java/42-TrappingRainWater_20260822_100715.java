// Last updated: 8/22/2026, 10:07:15 AM
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3
4        Stack<Integer> stack = new Stack<>();
5        int maxArea = 0;
6
7        for (int i = 0; i <= heights.length; i++) {
8
9            int current;
10
11            if (i == heights.length) {
12                current = 0;
13            } else {
14                current = heights[i];
15            }
16
17            while (!stack.isEmpty() &&
18                   heights[stack.peek()] > current) {
19
20                int h = heights[stack.pop()];
21
22                int width;
23
24                if (stack.isEmpty()) {
25                    width = i;
26                } else {
27                    width = i - stack.peek() - 1;
28                }
29
30                int area = h * width;
31
32                maxArea = Math.max(maxArea, area);
33            }
34
35            stack.push(i);
36        }
37
38        return maxArea;
39    }
40}