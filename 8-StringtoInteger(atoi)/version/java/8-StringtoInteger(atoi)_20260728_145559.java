// Last updated: 7/28/2026, 2:55:59 PM
1class Solution {
2    public int myAtoi(String s) {
3        int i = 0, n = s.length();
4        int sign = 1;
5        long result = 0;
6
7        // Skip leading spaces
8        while (i < n && s.charAt(i) == ' ') {
9            i++;
10        }
11
12        // Check sign
13        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
14            if (s.charAt(i) == '-') {
15                sign = -1;
16            }
17            i++;
18        }
19
20        // Convert digits
21        while (i < n && Character.isDigit(s.charAt(i))) {
22            result = result * 10 + (s.charAt(i) - '0');
23
24            // Check overflow
25            if (sign * result > Integer.MAX_VALUE) {
26                return Integer.MAX_VALUE;
27            }
28            if (sign * result < Integer.MIN_VALUE) {
29                return Integer.MIN_VALUE;
30            }
31
32            i++;
33        }
34
35        return (int)(sign * result);
36    }
37}