// Last updated: 7/28/2026, 3:49:18 PM
1import java.util.*;
2
3class Solution {
4    public int longestValidParentheses(String s) {
5        Stack<Integer> stack = new Stack<>();
6        stack.push(-1);
7
8        int maxLength = 0;
9
10        for (int i = 0; i < s.length(); i++) {
11            if (s.charAt(i) == '(') {
12                stack.push(i);
13            } else {
14                stack.pop();
15
16                if (stack.isEmpty()) {
17                    stack.push(i);
18                } else {
19                    maxLength = Math.max(maxLength, i - stack.peek());
20                }
21            }
22        }
23
24        return maxLength;
25    }
26}