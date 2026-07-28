// Last updated: 7/28/2026, 3:47:01 PM
1class Solution {
2    public int divide(int dividend, int divisor) {
3
4        // Handle overflow case
5        if (dividend == Integer.MIN_VALUE && divisor == -1) {
6            return Integer.MAX_VALUE;
7        }
8
9        // Determine sign
10        boolean negative = (dividend < 0) ^ (divisor < 0);
11
12        long dvd = Math.abs((long) dividend);
13        long dvs = Math.abs((long) divisor);
14
15        int result = 0;
16
17        while (dvd >= dvs) {
18            long temp = dvs;
19            int multiple = 1;
20
21            while (dvd >= (temp << 1)) {
22                temp <<= 1;
23                multiple <<= 1;
24            }
25
26            dvd -= temp;
27            result += multiple;
28        }
29
30        return negative ? -result : result;
31    }
32}