// Last updated: 8/22/2026, 10:02:37 AM
1class Solution {
2    public int trap(int[] height) {
3
4        int left = 0;
5        int right = height.length - 1;
6
7        int leftMax = 0;
8        int rightMax = 0;
9
10        int water = 0;
11
12        while (left < right) {
13
14            if (height[left] <= height[right]) {
15
16                if (height[left] >= leftMax) {
17                    leftMax = height[left];
18                } else {
19                    water += leftMax - height[left];
20                }
21
22                left++;
23
24            } else {
25
26                if (height[right] >= rightMax) {
27                    rightMax = height[right];
28                } else {
29                    water += rightMax - height[right];
30                }
31
32                right--;
33            }
34        }
35
36        return water;
37    }
38}